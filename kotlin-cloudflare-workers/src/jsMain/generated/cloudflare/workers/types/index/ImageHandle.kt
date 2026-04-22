// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ImageHandle {
/**
     * Get metadata for a hosted image
     * @returns Image metadata, or null if not found
     */
    fun details(): js.promise.Promise<ImageMetadata?>

/**
     * Get the raw image data for a hosted image
     * @returns ReadableStream of image bytes, or null if not found
     */
    fun bytes(): js.promise.Promise<web.streams.ReadableStream<js.typedarrays.Uint8Array>?>

/**
     * Update hosted image metadata
     * @param options Properties to update
     * @returns Updated image metadata
     * @throws {@link ImagesError} if update fails
     */
    fun update(options: ImageUpdateOptions): js.promise.Promise<ImageMetadata>

/**
     * Delete a hosted image
     * @returns True if deleted, false if not found
     */
    fun delete(): js.promise.Promise<Boolean>
}
