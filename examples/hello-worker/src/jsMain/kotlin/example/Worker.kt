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
import cloudflare.workers.types.index.ExportedHandlerFetchHandler
import cloudflare.workers.types.index.Request
import cloudflare.workers.types.index.Response
import cloudflare.workers.types.index.ResponseInit
import js.promise.Promise
import kotlin.js.ExperimentalJsStatic
import kotlin.js.JsStatic

@JsModule("@cloudflare/workers-types")
external fun Response(body: String, init: ResponseInit = definedExternally): Response

// Class + @JsExport.Default emits `export default Worker;` (no accessor
// wrapper). The companion implements ExportedHandler so the compiler
// type-checks the signature; @JsStatic promotes the overridden `fetch`
// to a static property on Worker so CF's `default.fetch(...)` resolves.
@JsExport
@JsExport.Default
class Worker {
    companion object : ExportedHandler<Any?, Any?, Any?, Any?> {
        @JsStatic
        override var fetch: ExportedHandlerFetchHandler<Any?, Any?, Any?>? =
            { request: Request<Any?, Any?>, _: Any?, _: ExecutionContext<Any?> ->
                Promise.resolve(Response("Hello from Kotlin/JS! You hit ${request.url}"))
            }
    }
}
