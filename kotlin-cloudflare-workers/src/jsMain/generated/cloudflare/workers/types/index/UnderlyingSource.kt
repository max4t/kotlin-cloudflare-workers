// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface UnderlyingSource<R /* default is Any? */> {
    var autoAllocateChunkSize: Double?
    var cancel: web.streams.UnderlyingSourceCancelCallback?
    var pull: web.streams.UnderlyingSourcePullCallback<R>?
    var start: web.streams.UnderlyingSourceStartCallback<R>?
    var type: web.streams.ReadableStreamType?
    var expectedLength: (Any /* number | bigint */)?
}
