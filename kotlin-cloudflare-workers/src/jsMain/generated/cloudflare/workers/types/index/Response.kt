// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

external var Response: Response

/**
 * The **`Response`** interface of the Fetch API represents the response to a request.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response)
 */
external interface Response :
    web.http.Body,
    web.http.Body {
/**
     * The **`headers`** read-only property of the Response interface contains the Headers object associated with the response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/headers)
     */
    val headers: web.http.Headers

/**
     * The **`ok`** read-only property of the Response interface contains a Boolean stating whether the response was successful (status in the range 200-299) or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/ok)
     */
    val ok: Boolean

/**
     * The **`redirected`** read-only property of the Response interface indicates whether or not the response is the result of a request you made which was redirected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/redirected)
     */
    val redirected: Boolean

/**
     * The **`status`** read-only property of the Response interface contains the HTTP status codes of the response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/status)
     */
    val status: Double

/**
     * The **`statusText`** read-only property of the Response interface contains the status message corresponding to the HTTP status code in Response.status.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/statusText)
     */
    val statusText: String

/**
     * The **`type`** read-only property of the Response interface contains the type of the response. The type determines whether scripts are able to access the response body and headers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/type)
     */
    val type: web.http.ResponseType

/**
     * The **`url`** read-only property of the Response interface contains the URL of the response. The value of the url property will be the final URL obtained after any redirects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/url)
     */
    val url: String

/**
     * The **`clone()`** method of the Response interface creates a clone of a response object, identical in every way, but stored in a different variable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/clone)
     */
    fun clone(): web.http.Response

    val webSocket: web.sockets.WebSocket?
    val cf: Any?
}

external interface Response {
    var prototype: web.http.Response

// new (body?: BodyInit | null, init?: ResponseInit): Response;
    fun error(): web.http.Response

    fun redirect(
        url: String,
        status: Double = definedExternally,
    ): web.http.Response

    fun json(any: Any?): web.http.Response

    fun json(
        any: Any?,
        maybeInit: web.http.ResponseInit = definedExternally,
    ): web.http.Response

    fun json(
        any: Any?,
        maybeInit: web.http.Response = definedExternally,
    ): web.http.Response
}
