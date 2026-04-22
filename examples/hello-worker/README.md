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

`@JsExport.Default` on an `object` declaration produces:

```js
var Worker_0 = { getInstance: Worker_getInstance };
export default Worker_0;
```

That's Kotlin/JS's singleton-accessor emission — `default` is the accessor
object, not the handler itself, so the Workers runtime looking up
`default.fetch` gets `undefined`. Using a `val` property instead emits
`{ get: get_worker }` — same problem, different accessor name. Kotlin/JS
2.3 does not currently emit a bare value as `export default` for
properties or objects.

The one-line shim in `worker-entry.mjs` unwraps it:

```js
import compiled from './kotlin-cloudflare-workers-examples-hello-worker.mjs';
export default compiled.getInstance();
```

`wrangler.toml`'s `main` points at the shim, not the Kotlin output.

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
