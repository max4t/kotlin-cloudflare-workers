package cloudflare.workers

import cloudflare.workers.types.index.ExecutionContext
import cloudflare.workers.types.index.ExportedHandler
import cloudflare.workers.types.index.Request
import cloudflare.workers.types.index.Response
import kotlin.test.Test

// Smoke test: verifies the Phase 2 fetch-handler surface compiles and an
// ExportedHandler with a suspend `fetch` can be instantiated.
class HandlerCompileTest {
    @Test
    fun handlerCompiles() {
        val handler = object : ExportedHandler<Any?, Any?, Any?, Any?> {
            override suspend fun fetch(
                request: Request<Any?, Any?>,
                env: Any?,
                ctx: ExecutionContext<Any?>,
            ): Response = js("null").unsafeCast<Response>()
        }

        val typed: ExportedHandler<Any?, Any?, Any?, Any?> = handler
        check(typed === handler)
    }
}
