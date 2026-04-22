// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * A `CloseEvent` is sent to clients using WebSockets when the connection is closed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent)
 */
external class CloseEvent : web.events.Event {
    constructor (type: String, initializer: web.sockets.CloseEventInit = definedExternally)

/**
     * The **`code`** read-only property of the CloseEvent interface returns a WebSocket connection close code indicating the reason the connection was closed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/code)
     */
    val code: Double

/**
     * The **`reason`** read-only property of the CloseEvent interface returns the WebSocket connection close reason the server gave for closing the connection; that is, a concise human-readable prose explanation for the closure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/reason)
     */
    val reason: String

/**
     * The **`wasClean`** read-only property of the CloseEvent interface returns `true` if the connection closed cleanly.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/wasClean)
     */
    val wasClean: Boolean
}
