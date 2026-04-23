// Minimal Cloudflare Worker written in Kotlin.
//
// Build:
//   ./gradlew :examples:hello-worker:snapshotGeneratedJs
// This compiles the Kotlin source and copies the resulting .mjs files into
// examples/hello-worker/generated-js/ so they can be inspected alongside
// the Kotlin source.
//
// Deploy (not wired up here; illustrative only):
//   wrangler deploy generated-js/hello-worker.mjs
@file:OptIn(ExperimentalJsExport::class, ExperimentalJsStatic::class)

package example

import cloudflare.workers.types.index.ExecutionContext
import cloudflare.workers.types.index.ExportedHandler
import cloudflare.workers.types.index.Request
import cloudflare.workers.types.index.Response
import cloudflare.workers.types.index.ResponseInit
import kotlin.js.ExperimentalJsStatic
import kotlin.js.JsStatic

@JsModule("@cloudflare/workers-types")
external fun Response(body: String, init: ResponseInit = definedExternally): Response

// Class + @JsExport.Default emits `export default Worker;`. The companion
// implements ExportedHandler so `fetch` is type-checked as a suspend
// function override. Kotlin 2.3's `-Xenable-suspend-function-exporting`
// flag lets us export the suspend `fetch` directly — Kotlin/JS compiles
// it into a Promise-returning JS function, matching the Workers
// fetch-handler contract that `default.fetch(...)` returns a Promise.
@JsExport
@JsExport.Default
class Worker {
    companion object : ExportedHandler<Any?, Any?, Any?, Any?> {
        @JsStatic
        override suspend fun fetch(
            request: Request<Any?, Any?>,
            env: Any?,
            ctx: ExecutionContext<Any?>,
        ): Response = Response("Hello from Kotlin/JS! You hit ${request.url}")
    }
}
