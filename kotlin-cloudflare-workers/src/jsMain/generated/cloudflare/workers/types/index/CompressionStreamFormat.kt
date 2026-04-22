// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface CompressionStreamFormat {
    companion object
}

inline val CompressionStreamFormat.Companion.gzip: CompressionStreamFormat
    get() = js.reflect.unsafeCast("gzip")

inline val CompressionStreamFormat.Companion.deflate: CompressionStreamFormat
    get() = js.reflect.unsafeCast("deflate")

inline val CompressionStreamFormat.Companion.deflateRaw: CompressionStreamFormat
    get() = js.reflect.unsafeCast("deflate-raw")
