// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

external var Request: Request

/**
 * The **`Request`** interface of the Fetch API represents a resource request.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request)
 */
external interface Request<CfHostMetadata /* default is Any? */, Cf /* default is CfProperties<CfHostMetadata> */> :
    web.http.Body,
    web.http.Body {
/**
     * The **`cache`** read-only property of the Request interface contains the cache mode of the request. It controls how the request will interact with the browser's HTTP cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/cache)
     */
    val cache: web.http.RequestCache

/**
     * The **`credentials`** read-only property of the Request interface reflects the value given to the Request() constructor in the credentials option. It determines whether or not the browser sends credentials with the request, as well as whether any Set-Cookie response headers are respected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/credentials)
     */
    val credentials: web.http.RequestCredentials

/**
     * The **`destination`** read-only property of the Request interface returns a string describing the type of content being requested.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/destination)
     */
    val destination: web.http.RequestDestination

/**
     * The **`headers`** read-only property of the Request interface contains the Headers object associated with the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/headers)
     */
    val headers: web.http.Headers

/**
     * The **`integrity`** read-only property of the Request interface contains the subresource integrity value of the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/integrity)
     */
    val integrity: String

/**
     * The **`keepalive`** read-only property of the Request interface contains the request's keepalive setting (true or false), which indicates whether the browser will keep the associated request alive if the page that initiated it is unloaded before the request is complete.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/keepalive)
     */
    val keepalive: Boolean

/**
     * The **`method`** read-only property of the Request interface contains the request's method (GET, POST, etc.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/method)
     */
    val method: String

/**
     * The **`mode`** read-only property of the Request interface contains the mode of the request (e.g., cors, no-cors, same-origin, or navigate.) This is used to determine if cross-origin requests lead to valid responses, and which properties of the response are readable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/mode)
     */
    val mode: web.http.RequestMode

/**
     * The **`redirect`** read-only property of the Request interface contains the mode for how redirects are handled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/redirect)
     */
    val redirect: web.http.RequestRedirect

/**
     * The **`referrer`** read-only property of the Request interface is set by the user agent to be the referrer of the Request. (e.g., client, no-referrer, or a URL.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/referrer)
     */
    val referrer: String

/**
     * The **`referrerPolicy`** read-only property of the Request interface returns the referrer policy, which governs what referrer information, sent in the Referer header, should be included with the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/referrerPolicy)
     */
    val referrerPolicy: web.http.ReferrerPolicy

/**
     * The read-only **`signal`** property of the Request interface returns the AbortSignal associated with the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/signal)
     */
    val signal: web.abort.AbortSignal

/**
     * The **`url`** read-only property of the Request interface contains the URL of the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/url)
     */
    val url: String

/**
     * The **`clone()`** method of the Request interface creates a copy of the current `Request` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/clone)
     */
    fun clone(): web.http.Request<CfHostMetadata, Cf>

    val fetcher: Fetcher?
    val cf: Cf?
}

external interface Request {
    var prototype: web.http.Request
// new <CfHostMetadata = unknown, Cf = CfProperties<CfHostMetadata>>(input: RequestInfo<CfProperties> | URL, init?: RequestInit<Cf>): Request<CfHostMetadata, Cf>;
}
