// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface EventListenerObject<EventType : web.events.Event /* default is web.events.Event */> {
    fun handleEvent(`object`: web.events.Event): Unit

    fun handleEvent(event: EventType): Unit
}
