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
@file:OptIn(ExperimentalJsExport::class)

package example

import cloudflare.workers.types.index.ExecutionContext
import cloudflare.workers.types.index.ExportedHandler
import cloudflare.workers.types.index.ExportedHandlerFetchHandler
import cloudflare.workers.types.index.Request
import cloudflare.workers.types.index.Response
import cloudflare.workers.types.index.ResponseInit
import js.promise.Promise

// The Worker runtime expects the module's `default` export to be an object
// implementing the ExportedHandler shape. We bind it to an external JS
// constructor that is shimmed in the runtime.
@JsModule("@cloudflare/workers-types")
external fun Response(body: String, init: ResponseInit = definedExternally): Response

@JsExport
@JsExport.Default
object Worker : ExportedHandler<Any?, Any?, Any?, Any?> {
    override var fetch: ExportedHandlerFetchHandler<Any?, Any?, Any?>? =
        { request: Request<Any?, Any?>, _: Any?, _: ExecutionContext<Any?> ->
            Promise.resolve(Response("Hello from Kotlin/JS! You hit ${request.url}"))
        }
}
