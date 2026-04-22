# hello-worker

Minimal Cloudflare Worker written in Kotlin that uses the Phase 2
fetch-handler surface from `:kotlin-cloudflare-workers`.

## Files

- `src/jsMain/kotlin/example/Worker.kt` — the Kotlin source.
- `generated-js/kotlin-cloudflare-workers-examples-hello-worker.mjs` — a
  committed snapshot of the compiled ES-module output produced by the
  Kotlin/JS compiler with `whole-program` granularity. Committed so readers
  can see the artifact without running a build.
- `wrangler.toml` — illustrative deploy config.

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
