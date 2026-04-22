// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

external class URLPattern {
    constructor ()

    constructor (input: String = definedExternally, baseURL: String = definedExternally, patternOptions: web.url.URLPatternOptions = definedExternally)

    constructor (input: String = definedExternally, baseURL: web.url.URLPatternOptions = definedExternally, patternOptions: web.url.URLPatternOptions = definedExternally)

    constructor (input: web.url.URLPatternInit = definedExternally, baseURL: String = definedExternally, patternOptions: web.url.URLPatternOptions = definedExternally)

    constructor (input: web.url.URLPatternInit = definedExternally, baseURL: web.url.URLPatternOptions = definedExternally, patternOptions: web.url.URLPatternOptions = definedExternally)

    val protocol: String
    val username: String
    val password: String
    val hostname: String
    val port: String
    val pathname: String
    val search: String
    val hash: String

    fun test(): Boolean

    fun test(
        input: String = definedExternally,
        baseURL: String = definedExternally,
    ): Boolean

    fun test(
        input: web.url.URLPatternInit = definedExternally,
        baseURL: String = definedExternally,
    ): Boolean

    fun exec(): web.url.URLPatternResult?

    fun exec(
        input: String = definedExternally,
        baseURL: String = definedExternally,
    ): web.url.URLPatternResult?

    fun exec(
        input: web.url.URLPatternInit = definedExternally,
        baseURL: String = definedExternally,
    ): web.url.URLPatternResult?
}
