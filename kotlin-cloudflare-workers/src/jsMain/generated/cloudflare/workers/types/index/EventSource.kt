// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`EventSource`** interface is web content's interface to server-sent events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource)
 */
external class EventSource : web.events.EventTarget {
    constructor (url: String, init: EventSourceEventSourceInit = definedExternally)

/**
     * The **`close()`** method of the EventSource interface closes the connection, if one is made, and sets the ```js-nolint close() ``` None.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/close)
     */
    fun close(): Unit

/**
     * The **`url`** read-only property of the URL of the source.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/url)
     */
    val url: String

/**
     * The **`withCredentials`** read-only property of the the `EventSource` object was instantiated with CORS credentials set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/withCredentials)
     */
    val withCredentials: Boolean

/**
     * The **`readyState`** read-only property of the connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/readyState)
     */
    val readyState: Double

// [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/open_event)
    var onopen: Any?

// [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/message_event)
    var onmessage: Any?

// [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/error_event)
    var onerror: Any?

    companion object {
        val CONNECTING: Double
        val OPEN: Double
        val CLOSED: Double

        fun from(stream: web.streams.ReadableStream): web.sse.EventSource
    }
}
