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
import cloudflare.workers.types.index.ExportedHandlerFetchHandler
import cloudflare.workers.types.index.Request
import cloudflare.workers.types.index.Response
import cloudflare.workers.types.index.ResponseInit
import js.promise.Promise
import kotlinx.js.JsPlainObject

@JsModule("@cloudflare/workers-types")
external fun Response(body: String, init: ResponseInit = definedExternally): Response

// @JsPlainObject makes implementations a literal `{ fetch: ... }` JS object
// at runtime instead of a Kotlin class instance with metadata.
@JsPlainObject
external interface SimpleHandler {
    val fetch: ExportedHandlerFetchHandler<Any?, Any?, Any?>
}

@JsExport
@JsExport.Default
val worker: SimpleHandler = SimpleHandler(
    fetch = { request: Request<Any?, Any?>, _: Any?, _: ExecutionContext<Any?> ->
        Promise.resolve(Response("Hello from Kotlin/JS! You hit ${request.url}"))
    },
)
