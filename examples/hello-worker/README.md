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

## Default-export caveat

The Workers runtime reads `default.fetch(request, env, ctx)` off the
module. But Kotlin/JS 2.3 wraps every top-level `@JsExport` property or
`object` in an accessor object at the ES module boundary:

```js
// object Worker + @JsExport.Default
export default { getInstance: Worker_getInstance };

// val worker + @JsExport.Default
export default { get: get_worker };
```

`export default X` and `export { X as default }` are equivalent JS —
the issue isn't the export syntax, it's that `X` is an accessor wrapper
rather than the singleton itself. `@EagerInitialization` changes
**when** the value is computed (adds an `// eager init` block at module
load) but not **what** is exported: the `{get: …}` wrapper is still
emitted. There is currently no Kotlin/JS 2.3 annotation that unwraps
this.

Until that changes upstream, deploying needs one of:

- A one-line re-export shim (what `worker-entry.mjs` here does):
  ```js
  import compiled from './kotlin-cloudflare-workers-examples-hello-worker.mjs';
  export default compiled.getInstance();
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
