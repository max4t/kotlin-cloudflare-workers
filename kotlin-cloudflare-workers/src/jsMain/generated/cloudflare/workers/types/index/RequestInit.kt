// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface RequestInit<Cf /* default is CfProperties */> {
/** A BodyInit object or null to set request's body. */
    var body: web.http.BodyInit?

/** A string indicating how the request will interact with the browser's cache to set request's cache. */
    var cache: web.http.RequestCache?

/** A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials. */
    var credentials: web.http.RequestCredentials?

/** A Headers object, an object literal, or an array of two-item arrays to set request's headers. */
    var headers: web.http.HeadersInit?

/** A cryptographic hash of the resource to be fetched by request. Sets request's integrity. */
    var integrity: String?

/** A boolean to set request's keepalive. */
    var keepalive: Boolean?

/** A string to set request's method. */
    var method: String?

/** A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode. */
    var mode: web.http.RequestMode?
    var priority: web.http.RequestPriority?

/** A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect. */
    var redirect: web.http.RequestRedirect?

/** A string whose value is a same-origin URL, "about:client", or the empty string, to set request's referrer. */
    var referrer: String?

/** A referrer policy to set request's referrerPolicy. */
    var referrerPolicy: web.http.ReferrerPolicy?

/** An AbortSignal to set request's signal. */
    var signal: web.abort.AbortSignal?

/** Can only be null. Used to disassociate request from any Window. */
    var window: Nothing?
    var fetcher: Fetcher?
    var cf: Cf?
    var encodeResponseBody: (RequestInitEncodeResponseBody)?
}
