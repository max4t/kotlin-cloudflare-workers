// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface StreamWatermarks {
/**
     * Generate a new watermark profile
     * @param input The image stream to upload
     * @param params The watermark creation parameters.
     * @returns The created watermark profile.
     * @throws {BadRequestError} if the parameters are invalid
     * @throws {InvalidURLError} if the URL is invalid
     * @throws {TooManyWatermarksError} if the number of allowed watermarks is reached
     * @throws {InternalError} if an unexpected error occurs
     */
    fun generate(
        input: web.streams.ReadableStream,
        params: StreamWatermarkCreateParams,
    ): js.promise.Promise<StreamWatermark>

/**
     * Generate a new watermark profile
     * @param url The image url to upload
     * @param params The watermark creation parameters.
     * @returns The created watermark profile.
     * @throws {BadRequestError} if the parameters are invalid
     * @throws {InvalidURLError} if the URL is invalid
     * @throws {TooManyWatermarksError} if the number of allowed watermarks is reached
     * @throws {InternalError} if an unexpected error occurs
     */
    fun generate(
        url: String,
        params: StreamWatermarkCreateParams,
    ): js.promise.Promise<StreamWatermark>

/**
     * Lists all watermark profiles for an account.
     * @returns The list of watermark profiles.
     * @throws {InternalError} if an unexpected error occurs
     */
    fun list(): js.promise.Promise<js.array.ReadonlyArray<StreamWatermark>>

/**
     * Retrieves details for a single watermark profile.
     * @param watermarkId The watermark profile identifier.
     * @returns The watermark profile details.
     * @throws {NotFoundError} if the watermark is not found
     * @throws {InternalError} if an unexpected error occurs
     */
    fun get(watermarkId: String): js.promise.Promise<StreamWatermark>

/**
     * Deletes a watermark profile.
     * @param watermarkId The watermark profile identifier.
     * @returns A promise that resolves when deletion completes.
     * @throws {NotFoundError} if the watermark is not found
     * @throws {InternalError} if an unexpected error occurs
     */
    fun delete(watermarkId: String): js.promise.Promise<js.core.Void>
}
