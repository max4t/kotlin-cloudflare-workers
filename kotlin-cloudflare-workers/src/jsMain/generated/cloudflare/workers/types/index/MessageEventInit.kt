// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface MessageEventInit<T /* default is Any? */> : web.events.EventInit {
    var data: T?
    var lastEventId: String?
    var origin: String?
    var ports: js.array.ReadonlyArray<web.messaging.MessagePort>?
    var source: web.messaging.MessageEventSource?
}
