// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`EventTarget`** interface is implemented by objects that can receive events and may have listeners for them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget)
 */
external class EventTarget<EventMap : js.objects.ReadonlyRecord<String, web.events.Event> /* default is js.objects.ReadonlyRecord<String, web.events.Event> */> {
constructor ()
/**
   * The **`addEventListener()`** method of the EventTarget interface sets up a function that will be called whenever the specified event is delivered to the target.
   *
   * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
   */
fun <Type : /* keyof EventMap */> addEventListener(type: Type, handler: EventListenerOrEventListenerObject<Any?>): Unit

/**
   * The **`addEventListener()`** method of the EventTarget interface sets up a function that will be called whenever the specified event is delivered to the target.
   *
   * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
   */
fun <Type : /* keyof EventMap */> addEventListener(type: Type, handler: EventListenerOrEventListenerObject<Any?>, options: EventTargetAddEventListenerOptions = definedExternally): Unit

/**
   * The **`addEventListener()`** method of the EventTarget interface sets up a function that will be called whenever the specified event is delivered to the target.
   *
   * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
   */
fun <Type : /* keyof EventMap */> addEventListener(type: Type, handler: EventListenerOrEventListenerObject<Any?>, options: Boolean = definedExternally): Unit
/**
   * The **`removeEventListener()`** method of the EventTarget interface removes an event listener previously registered with EventTarget.addEventListener() from the target.
   *
   * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
   */
fun <Type : /* keyof EventMap */> removeEventListener(type: Type, handler: EventListenerOrEventListenerObject<Any?>): Unit

/**
   * The **`removeEventListener()`** method of the EventTarget interface removes an event listener previously registered with EventTarget.addEventListener() from the target.
   *
   * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
   */
fun <Type : /* keyof EventMap */> removeEventListener(type: Type, handler: EventListenerOrEventListenerObject<Any?>, options: EventTargetEventListenerOptions = definedExternally): Unit

/**
   * The **`removeEventListener()`** method of the EventTarget interface removes an event listener previously registered with EventTarget.addEventListener() from the target.
   *
   * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
   */
fun <Type : /* keyof EventMap */> removeEventListener(type: Type, handler: EventListenerOrEventListenerObject<Any?>, options: Boolean = definedExternally): Unit
/**
   * The **`dispatchEvent()`** method of the EventTarget sends an Event to the object, (synchronously) invoking the affected event listeners in the appropriate order.
   *
   * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/dispatchEvent)
   */
fun dispatchEvent(event: Any?): Boolean
}
