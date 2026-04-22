// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`MessagePort`** interface of the Channel Messaging API represents one of the two ports of a MessageChannel, allowing messages to be sent from one port and listening out for them arriving at the other.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort)
 */
abstract external class MessagePort : web.events.EventTarget {
/**
     * The **`postMessage()`** method of the transfers ownership of objects to other browsing contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/postMessage)
     */
    fun postMessage(
        data: Any? = definedExternally,
        options: js.array.ReadonlyArray<Any?> = definedExternally,
    ): Unit

/**
     * The **`postMessage()`** method of the transfers ownership of objects to other browsing contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/postMessage)
     */
    fun postMessage(
        data: Any? = definedExternally,
        options: MessagePortPostMessageOptions = definedExternally,
    ): Unit

/**
     * The **`close()`** method of the MessagePort interface disconnects the port, so it is no longer active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/close)
     */
    fun close(): Unit

/**
     * The **`start()`** method of the MessagePort interface starts the sending of messages queued on the port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/start)
     */
    fun start(): Unit

    var onmessage: Any?
}
