// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface Transformer<I /* default is Any? */, O /* default is Any? */> {
    var flush: web.streams.TransformerFlushCallback<O>?
    var readableType: Nothing?
    var start: web.streams.TransformerStartCallback<O>?
    var transform: web.streams.TransformerTransformCallback<I, O>?
    var writableType: Nothing?
    var cancel: ((reason: Any?) -> js.promise.PromiseResult<js.core.Void>)?
    var expectedLength: Double?
}
