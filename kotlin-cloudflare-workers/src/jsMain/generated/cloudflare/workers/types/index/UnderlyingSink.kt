// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface UnderlyingSink<W /* default is Any? */> {
    var abort: web.streams.UnderlyingSinkAbortCallback?
    var close: web.streams.UnderlyingSinkCloseCallback?
    var start: web.streams.UnderlyingSinkStartCallback?
    var type: Nothing?
    var write: web.streams.UnderlyingSinkWriteCallback<W>?
}
