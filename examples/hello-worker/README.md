# hello-worker

Minimal Cloudflare Worker written in Kotlin that uses the Phase 2
fetch-handler surface from `:kotlin-cloudflare-workers`.

## Files

- `src/jsMain/kotlin/example/Worker.kt` — the Kotlin source.
- `generated-js/kotlin-cloudflare-workers-examples-hello-worker.mjs` — a
  committed snapshot of the compiled ES-module output produced by the
  Kotlin/JS compiler with `whole-program` granularity. Committed so readers
  can see the artifact without running a build.
- `generated-js/worker-entry.mjs` — hand-written shim; see *Default-export
  caveat* below.
- `wrangler.toml` — illustrative deploy config, pointed at the shim.

## Two emission concerns: value shape vs export wrapper

The example uses `@JsPlainObject` (`org.jetbrains.kotlin.plugin.js-plain-objects`)
on a `SimpleHandler` interface and constructs the worker via the generated
factory. That makes the underlying value a real plain JS object literal:

```js
worker = { fetch: worker$lambda };
```

— no Kotlin class, no `protoOf()` plumbing, no metadata. Without the
plugin, `object Worker : ExportedHandler<…>` produces a Kotlin singleton
class that adds ~30 lines of init/proto plumbing.

But the **export side** is a separate concern. Kotlin/JS 2.3 wraps every
top-level `@JsExport` property or `object` in an accessor at the ES
module boundary, regardless of how clean the value itself is:

```js
// val worker + @JsExport.Default + @JsPlainObject
var worker_0 = { get: get_worker };
export default worker_0;

// object Worker + @JsExport.Default
var Worker_0 = { getInstance: Worker_getInstance };
export default Worker_0;
```

`export default X` and `export { X as default }` are equivalent JS —
the issue isn't the export syntax, it's that `X` is the accessor object,
not the value. Confirmed empirically that `@EagerInitialization`,
`JsAny` supertypes, `@JsName("default")` and `@JsPlainObject` all leave
the wrapper in place; the wrapping decision is made by the IR backend
at the export-emission step, downstream of types and annotations.

Until that changes upstream, deploying needs one of:

- A one-line re-export shim (what `worker-entry.mjs` here does):
  ```js
  import compiled from './kotlin-cloudflare-workers-examples-hello-worker.mjs';
  export default compiled.get();
  ```
- Or a bundler step (webpack/rollup/esbuild) that inlines the accessor.

`wrangler.toml`'s `main` points at `worker-entry.mjs` for that reason.

## Build

```
./gradlew :examples:hello-worker:snapshotGeneratedJs
```

The task compiles Kotlin to JS (`compileProductionExecutableKotlinJs`) and
copies the resulting `.mjs` into `generated-js/`.

## Caveats

This example is illustrative, not deployment-ready:

- It imports `Response` from `@cloudflare/workers-types`; at runtime the
  real Workers isolate exposes `Response` as a global, not as a module
  export. Deploying will need a small shim or `external val Response`
  binding to the global.
- The Phase 2 surface is intentionally minimal. `RequestInit.cf`, streaming
  bodies, WebSocket upgrades, bindings (KV, R2, D1, DO), etc. are not yet
  available — they land in Phase 3.
