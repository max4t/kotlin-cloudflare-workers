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
@file:OptIn(ExperimentalJsExport::class, ExperimentalJsStatic::class, DelicateCoroutinesApi::class)

package example

import cloudflare.workers.types.index.ExecutionContext
import cloudflare.workers.types.index.ExportedHandler
import cloudflare.workers.types.index.Request
import cloudflare.workers.types.index.Response
import cloudflare.workers.types.index.ResponseInit
import js.coroutines.promise
import js.promise.Promise
import kotlin.js.ExperimentalJsStatic
import kotlin.js.JsStatic
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope

@JsModule("@cloudflare/workers-types")
external fun Response(body: String, init: ResponseInit = definedExternally): Response

// Class + @JsExport.Default emits `export default Worker;`. The companion
// implements ExportedHandler; `@JsStatic` copies `fetch` to `Worker.fetch`,
// matching Cloudflare's `defaultExport.fetch(req, env, ctx)` contract.
// `fetch` returns `Promise<Response>` directly (see ExportedHandler's
// comment for why suspend export isn't used). `GlobalScope.promise { ... }`
// bridges a suspending body into the Promise the runtime expects.
@JsExport
@JsExport.Default
class Worker {
    companion object : ExportedHandler<Any?, Any?, Any?, Any?> {
        @JsStatic
        override fun fetch(
            request: Request<Any?, Any?>,
            env: Any?,
            ctx: ExecutionContext<Any?>,
        ): Promise<Response> = GlobalScope.promise {
            Response("Hello from Kotlin/JS! You hit ${request.url}")
        }
    }
}
