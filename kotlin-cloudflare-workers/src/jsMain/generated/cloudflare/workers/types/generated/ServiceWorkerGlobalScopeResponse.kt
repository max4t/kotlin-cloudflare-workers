// Automatically generated - do not modify!

package cloudflare.workers.types.generated

external interface ServiceWorkerGlobalScopeResponse {
// new (body?: BodyInit | null | undefined, init?: ResponseInit | undefined): Response;
    var prototype: Response

    fun error(): Response

    fun json(
        data: Any?,
        init: ResponseInit? = definedExternally,
    ): Response

    fun redirect(
        url: String,
        status: Double? = definedExternally,
    ): Response

    fun redirect(
        url: URL,
        status: Double? = definedExternally,
    ): Response
}
