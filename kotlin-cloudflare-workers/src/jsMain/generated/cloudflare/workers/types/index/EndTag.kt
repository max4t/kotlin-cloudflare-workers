// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface EndTag {
    var name: String

    fun before(
        content: String,
        options: ContentOptions = definedExternally,
    ): EndTag

    fun before(
        content: web.streams.ReadableStream,
        options: ContentOptions = definedExternally,
    ): EndTag

    fun before(
        content: web.http.Response,
        options: ContentOptions = definedExternally,
    ): EndTag

    fun after(
        content: String,
        options: ContentOptions = definedExternally,
    ): EndTag

    fun after(
        content: web.streams.ReadableStream,
        options: ContentOptions = definedExternally,
    ): EndTag

    fun after(
        content: web.http.Response,
        options: ContentOptions = definedExternally,
    ): EndTag

    fun remove(): EndTag
}
