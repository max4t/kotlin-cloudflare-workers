// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface HostedImagesBinding {
/**
     * Get a handle for a hosted image
     * @param imageId The ID of the image (UUID or custom ID)
     * @returns A handle for per-image operations
     */
    fun image(imageId: String): ImageHandle

/**
     * Upload a new hosted image
     * @param image The image file to upload
     * @param options Upload configuration
     * @returns Metadata for the uploaded image
     * @throws {@link ImagesError} if upload fails
     */
    fun upload(
        image: web.streams.ReadableStream<js.typedarrays.Uint8Array>,
        options: ImageUploadOptions = definedExternally,
    ): js.promise.Promise<ImageMetadata>

/**
     * Upload a new hosted image
     * @param image The image file to upload
     * @param options Upload configuration
     * @returns Metadata for the uploaded image
     * @throws {@link ImagesError} if upload fails
     */
    fun upload(
        image: js.buffer.ArrayBuffer,
        options: ImageUploadOptions = definedExternally,
    ): js.promise.Promise<ImageMetadata>

/**
     * List hosted images with pagination
     * @param options List configuration
     * @returns List of images with pagination info
     * @throws {@link ImagesError} if list fails
     */
    fun list(options: ImageListOptions = definedExternally): js.promise.Promise<ImageList>
}
