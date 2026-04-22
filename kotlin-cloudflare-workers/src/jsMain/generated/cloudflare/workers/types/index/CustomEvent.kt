// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`CustomEvent`** interface represents events initialized by an application for any purpose.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent)
 */
external class CustomEvent<T /* default is Any? */> : web.events.Event {
    constructor (type: String, init: CustomEventCustomEventInit = definedExternally)

/**
     * The read-only **`detail`** property of the CustomEvent interface returns any data passed when initializing the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent/detail)
     */
    val detail: T
}
