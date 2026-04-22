// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface Text :
    web.dom.CharacterData,
    web.components.Slottable {
/**
     * The read-only **`wholeText`** property of the Text interface returns the full text of all Text nodes logically adjacent to the node. The text is concatenated in document order. This allows specifying any text node and obtaining all adjacent text as a single string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text/wholeText)
     */
    val wholeText: String

/**
     * The **`splitText()`** method of the Text interface breaks the Text node into two nodes at the specified offset, keeping both nodes in the tree as siblings.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text/splitText)
     */
    fun splitText(offset: Double): web.dom.Text

    val text: String
    val lastInTextNode: Boolean
    val removed: Boolean

    fun before(
        content: String,
        options: ContentOptions = definedExternally,
    ): web.dom.Text

    fun before(
        content: web.streams.ReadableStream,
        options: ContentOptions = definedExternally,
    ): web.dom.Text

    fun before(
        content: web.http.Response,
        options: ContentOptions = definedExternally,
    ): web.dom.Text

    fun after(
        content: String,
        options: ContentOptions = definedExternally,
    ): web.dom.Text

    fun after(
        content: web.streams.ReadableStream,
        options: ContentOptions = definedExternally,
    ): web.dom.Text

    fun after(
        content: web.http.Response,
        options: ContentOptions = definedExternally,
    ): web.dom.Text

    fun replace(
        content: String,
        options: ContentOptions = definedExternally,
    ): web.dom.Text

    fun replace(
        content: web.streams.ReadableStream,
        options: ContentOptions = definedExternally,
    ): web.dom.Text

    fun replace(
        content: web.http.Response,
        options: ContentOptions = definedExternally,
    ): web.dom.Text

    fun remove(): web.dom.Text
}
