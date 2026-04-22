// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`URL`** interface is used to parse, construct, normalize, and encode URL.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL)
 */
external class URL {
    constructor (url: String)

    constructor (url: String, base: String = definedExternally)

    constructor (url: String, base: web.url.URL = definedExternally)

    constructor (url: web.url.URL)

    constructor (url: web.url.URL, base: String = definedExternally)

    constructor (url: web.url.URL, base: web.url.URL = definedExternally)

/**
     * The **`href`** property of the URL interface is a string containing the whole URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/href)
     */
    var href: String

/**
     * The **`origin`** read-only property of the URL interface returns a string containing the Unicode serialization of the origin of the represented URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/origin)
     */
    val origin: String

/**
     * The **`protocol`** property of the URL interface is a string containing the protocol or scheme of the URL, including the final `':'`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/protocol)
     */
    var protocol: String

/**
     * The **`username`** property of the URL interface is a string containing the username component of the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/username)
     */
    var username: String

/**
     * The **`password`** property of the URL interface is a string containing the password component of the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/password)
     */
    var password: String

/**
     * The **`host`** property of the URL interface is a string containing the host, which is the URL.hostname, and then, if the port of the URL is nonempty, a `':'`, followed by the URL.port of the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/host)
     */
    var host: String

/**
     * The **`hostname`** property of the URL interface is a string containing either the domain name or IP address of the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/hostname)
     */
    var hostname: String

/**
     * The **`port`** property of the URL interface is a string containing the port number of the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/port)
     */
    var port: String

/**
     * The **`pathname`** property of the URL interface represents a location in a hierarchical structure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/pathname)
     */
    var pathname: String

/**
     * The **`search`** property of the URL interface is a search string, also called a _query string_, that is a string containing a `'?'` followed by the parameters of the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/search)
     */
    var search: String

/**
     * The **`searchParams`** read-only property of the access to the [MISSING: httpmethod('GET')] decoded query arguments contained in the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/searchParams)
     */
    val searchParams: web.url.URLSearchParams

/**
     * The **`hash`** property of the URL interface is a string containing a `'#'` followed by the fragment identifier of the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/hash)
     */
    var hash: String

// function toString() { [native code] }
    fun toString(): String

/**
     * The **`toJSON()`** method of the URL interface returns a string containing a serialized version of the URL, although in practice it seems to have the same effect as ```js-nolint toJSON() ``` None.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/toJSON)
     */
    fun toJSON(): String
}
