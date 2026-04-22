// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * Handle for operations scoped to a single Stream video.
 */
external interface StreamVideoHandle {
/**
     * The unique identifier for the video.
     */
    var id: String

/**
     * Get a full videos details
     * @returns The full video details.
     * @throws {NotFoundError} if the video is not found
     * @throws {InternalError} if an unexpected error occurs
     */
    fun details(): js.promise.Promise<StreamVideo>

/**
     * Update details for a single video.
     * @param params The fields to update for the video.
     * @returns The updated video details.
     * @throws {NotFoundError} if the video is not found
     * @throws {BadRequestError} if the parameters are invalid
     * @throws {InternalError} if an unexpected error occurs
     */
    fun update(params: StreamUpdateVideoParams): js.promise.Promise<StreamVideo>

/**
     * Deletes a video and its copies from Cloudflare Stream.
     * @returns A promise that resolves when deletion completes.
     * @throws {NotFoundError} if the video is not found
     * @throws {InternalError} if an unexpected error occurs
     */
    fun delete(): js.promise.Promise<js.core.Void>

/**
     * Creates a signed URL token for a video.
     * @returns The signed token that was created.
     * @throws {InternalError} if the signing key cannot be retrieved or the token cannot be signed
     */
    fun generateToken(): js.promise.Promise<String>

    var downloads: StreamScopedDownloads
    var captions: StreamScopedCaptions
}
