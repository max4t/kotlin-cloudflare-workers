// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ImagesBinding {
/**
     * Get image metadata (type, width and height)
     * @throws {@link ImagesError} with code 9412 if input is not an image
     * @param stream The image bytes
     */
    fun info(
        stream: web.streams.ReadableStream<js.typedarrays.Uint8Array>,
        options: ImageInputOptions = definedExternally,
    ): js.promise.Promise<ImageInfoResponse>

/**
     * Begin applying a series of transformations to an image
     * @param stream The image bytes
     * @returns A transform handle
     */
    fun input(
        stream: web.streams.ReadableStream<js.typedarrays.Uint8Array>,
        options: ImageInputOptions = definedExternally,
    ): ImageTransformer

/**
     * Access hosted images CRUD operations
     */
    val hosted: HostedImagesBinding
}
