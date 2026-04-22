// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface DecompressionStreamFormat {
    companion object
}

inline val DecompressionStreamFormat.Companion.gzip: DecompressionStreamFormat
    get() = js.reflect.unsafeCast("gzip")

inline val DecompressionStreamFormat.Companion.deflate: DecompressionStreamFormat
    get() = js.reflect.unsafeCast("deflate")

inline val DecompressionStreamFormat.Companion.deflateRaw: DecompressionStreamFormat
    get() = js.reflect.unsafeCast("deflate-raw")
