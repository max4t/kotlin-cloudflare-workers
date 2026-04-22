// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ImageTransformer {
/**
     * Apply transform next, returning a transform handle.
     * You can then apply more transformations, draw, or retrieve the output.
     * @param transform
     */
    fun transform(transform: ImageTransform): ImageTransformer

/**
     * Draw an image on this transformer, returning a transform handle.
     * You can then apply more transformations, draw, or retrieve the output.
     * @param image The image (or transformer that will give the image) to draw
     * @param options The options configuring how to draw the image
     */
    fun draw(
        image: web.streams.ReadableStream<js.typedarrays.Uint8Array>,
        options: ImageDrawOptions = definedExternally,
    ): ImageTransformer

/**
     * Draw an image on this transformer, returning a transform handle.
     * You can then apply more transformations, draw, or retrieve the output.
     * @param image The image (or transformer that will give the image) to draw
     * @param options The options configuring how to draw the image
     */
    fun draw(
        image: ImageTransformer,
        options: ImageDrawOptions = definedExternally,
    ): ImageTransformer

/**
     * Retrieve the image that results from applying the transforms to the
     * provided input
     * @param options Options that apply to the output e.g. output format
     */
    fun output(options: ImageOutputOptions): js.promise.Promise<ImageTransformationResult>
}
