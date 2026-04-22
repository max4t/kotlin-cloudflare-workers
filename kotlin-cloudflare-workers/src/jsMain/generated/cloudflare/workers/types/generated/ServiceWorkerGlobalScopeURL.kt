// Automatically generated - do not modify!

package cloudflare.workers.types.generated

external interface ServiceWorkerGlobalScopeURL {
// new (url: string | URL, base?: string | URL | undefined): URL;
    var prototype: URL

    fun canParse(url: String): Boolean

    fun canParse(
        url: String,
        base: String? = definedExternally,
    ): Boolean

    fun canParse(
        url: String,
        base: URL? = definedExternally,
    ): Boolean

    fun canParse(url: URL): Boolean

    fun canParse(
        url: URL,
        base: String? = definedExternally,
    ): Boolean

    fun canParse(
        url: URL,
        base: URL? = definedExternally,
    ): Boolean

    fun createObjectURL(obj: Blob): String

    fun createObjectURL(obj: MediaSource): String

    fun parse(url: String): URL?

    fun parse(
        url: String,
        base: String? = definedExternally,
    ): URL?

    fun parse(
        url: String,
        base: URL? = definedExternally,
    ): URL?

    fun parse(url: URL): URL?

    fun parse(
        url: URL,
        base: String? = definedExternally,
    ): URL?

    fun parse(
        url: URL,
        base: URL? = definedExternally,
    ): URL?

    fun revokeObjectURL(url: String): Unit
}
