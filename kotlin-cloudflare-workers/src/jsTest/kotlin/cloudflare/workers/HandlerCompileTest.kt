package cloudflare.workers

import cloudflare.workers.types.index.ExecutionContext
import cloudflare.workers.types.index.ExportedHandler
import cloudflare.workers.types.index.ExportedHandlerFetchHandler
import cloudflare.workers.types.index.Request
import cloudflare.workers.types.index.Response
import js.promise.Promise
import kotlin.test.Test

// Smoke test: verifies the Phase 2 fetch-handler surface compiles and an
// ExportedHandler can be instantiated and its fetch invoked.
class HandlerCompileTest {
    @Test
    fun handlerCompiles() {
        val handler = object : ExportedHandler<Any?, Any?, Any?, Any?> {
            override var fetch: ExportedHandlerFetchHandler<Any?, Any?, Any?>? =
                { _: Request<Any?, Any?>, _: Any?, _: ExecutionContext<Any?> ->
                    Promise.resolve(js("null").unsafeCast<Response>())
                }
        }

        check(handler.fetch != null)
    }
}
