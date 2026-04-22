// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

external class DigestStream : web.streams.WritableStream<Any /* ArrayBuffer | ArrayBufferView */> {
    constructor (algorithm: String)

    constructor (algorithm: SubtleCryptoHashAlgorithm)

    val digest: js.promise.Promise<js.buffer.ArrayBuffer>
    val bytesWritten: Any // number | bigint
}
