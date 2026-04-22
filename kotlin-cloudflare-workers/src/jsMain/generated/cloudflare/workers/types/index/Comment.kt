// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface Comment : web.dom.CharacterData {
    var text: String
    val removed: Boolean

    fun before(
        content: String,
        options: ContentOptions = definedExternally,
    ): web.dom.Comment

    fun after(
        content: String,
        options: ContentOptions = definedExternally,
    ): web.dom.Comment

    fun replace(
        content: String,
        options: ContentOptions = definedExternally,
    ): web.dom.Comment

    fun remove(): web.dom.Comment
}
