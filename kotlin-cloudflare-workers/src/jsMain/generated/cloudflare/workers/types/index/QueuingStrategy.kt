// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface QueuingStrategy<T /* default is Any? */> {
    var highWaterMark: Double?
    var size: web.streams.QueuingStrategySize<T>?
}
