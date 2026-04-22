// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

external class HTMLRewriter {
    constructor ()

    fun on(
        selector: String,
        handlers: HTMLRewriterElementContentHandlers,
    ): HTMLRewriter

    fun onDocument(handlers: HTMLRewriterDocumentContentHandlers): HTMLRewriter

    fun transform(response: web.http.Response): web.http.Response
}
