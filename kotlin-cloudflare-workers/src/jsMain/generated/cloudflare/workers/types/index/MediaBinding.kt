// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * Media binding for transforming media streams.
 * Provides the entry point for media transformation operations.
 */
external interface MediaBinding {
/**
     * Creates a media transformer from an input stream.
     * @param media - The input media bytes
     * @returns A MediaTransformer instance for applying transformations
     */
    fun input(media: web.streams.ReadableStream<js.typedarrays.Uint8Array>): MediaTransformer
}
