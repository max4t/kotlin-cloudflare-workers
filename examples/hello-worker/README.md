# hello-worker

Minimal Cloudflare Worker written in Kotlin, deployable directly — the
compiled `.mjs` is a valid Workers module with no shim or bundler step.

## Files

- `src/jsMain/kotlin/example/Worker.kt` — the Kotlin source: a class with
  a `@JsStatic` `fetch` property on its companion object.
- `generated-js/kotlin-cloudflare-workers-examples-hello-worker.mjs` — a
  committed snapshot of the compiled ES module produced by Kotlin/JS with
  `whole-program` granularity.
- `wrangler.toml` — deploy config, `main` points at the Kotlin output
  directly.

## Build

```
./gradlew :examples:hello-worker:snapshotGeneratedJs
```

Compiles Kotlin to JS (`compileProductionExecutableKotlinJs`) and copies
the resulting `.mjs` into `generated-js/`.

## Why class + @JsStatic (not `val` or `object`)

Kotlin 2.3 [added][2.3] `@JsExport.Default` to emit a JavaScript default
export — but the shape depends on what it's applied to:

| Kotlin | Emitted JS | CF-usable? |
|---|---|---|
| `val worker = …` | `var worker_0 = {get: get_worker}; export default worker_0;` | No — `default.fetch` is undefined |
| `object Worker : …` | `var Worker_0 = {getInstance: Worker_getInstance}; export default Worker_0;` | No — same |
| `class Worker` with instance `val fetch` | `export default Worker;` | No — `fetch` is instance-level |
| **`class Worker` + `companion { @JsStatic val fetch }`** | `defineProp(Worker, 'fetch', get_fetch, …); export default Worker;` | **Yes** |

Kotlin 2.3 also [added][2.3-jsstatic] `@JsStatic` support for interface
companions; the same mechanism promotes a companion `val` to a static
property on the class. CF's `default.fetch(request, env, ctx)` hits the
getter installed by `defineProp`, which returns the lambda, which runs.

[2.3]: https://kotlinlang.org/docs/whatsnew23.html#support-for-javascript-default-exports
[2.3-jsstatic]: https://kotlinlang.org/docs/whatsnew23.html#support-for-jsstatic-annotations-in-interfaces-with-companion-objects

## Caveat

The generated JS imports `Response` from `@cloudflare/workers-types`
because of how the example's binding is declared. At runtime the real
Workers isolate exposes `Response` as a global; deploying will need a
small binding tweak or a fetch-handler surface that binds to the global
rather than the module.
