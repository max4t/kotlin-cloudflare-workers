// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface HTMLRewriterDocumentContentHandlers {
    val doctype: ((doctype: Doctype) -> js.promise.PromiseResult<js.core.Void>)?
    val comments: ((comment: web.dom.Comment) -> js.promise.PromiseResult<js.core.Void>)?
    val text: ((text: web.dom.Text) -> js.promise.PromiseResult<js.core.Void>)?
    val end: ((end: DocumentEnd) -> js.promise.PromiseResult<js.core.Void>)?
}
