// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`MessageEvent`** interface represents a message received by a target object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent)
 */
external class MessageEvent : web.events.Event {
    constructor (type: String, initializer: web.messaging.MessageEventInit)

/**
     * The **`data`** read-only property of the The data sent by the message emitter; this can be any data type, depending on what originated this event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/data)
     */
    val data: Any?

/**
     * The **`origin`** read-only property of the origin of the message emitter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/origin)
     */
    val origin: String?

/**
     * The **`lastEventId`** read-only property of the unique ID for the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/lastEventId)
     */
    val lastEventId: String

/**
     * The **`source`** read-only property of the a WindowProxy, MessagePort, or a `MessageEventSource` (which can be a WindowProxy, message emitter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/source)
     */
    val source: web.messaging.MessagePort?

/**
     * The **`ports`** read-only property of the containing all MessagePort objects sent with the message, in order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/ports)
     */
    val ports: js.array.ReadonlyArray<web.messaging.MessagePort>
}
