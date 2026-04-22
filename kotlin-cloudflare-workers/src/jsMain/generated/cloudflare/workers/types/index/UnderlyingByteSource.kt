// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface UnderlyingByteSource {
    var autoAllocateChunkSize: Double?
    var cancel: web.streams.UnderlyingSourceCancelCallback?
    var pull: ((controller: web.streams.ReadableByteStreamController) -> Any /* void | PromiseLike<void> */)?
    var start: ((controller: web.streams.ReadableByteStreamController) -> Any?)?
    var type: String // "bytes"
}
