// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * Binding entrypoint for Cloudflare Stream.
 *
 * Usage:
 * - Binding-level operations:
 *   `await env.STREAM.videos.upload`
 *   `await env.STREAM.videos.createDirectUpload`
 *   `await env.STREAM.videos.*`
 *   `await env.STREAM.watermarks.*`
 * - Per-video operations:
 *   `await env.STREAM.video(id).downloads.*`
 *   `await env.STREAM.video(id).captions.*`
 *
 * Example usage:
 * ```ts
 * await env.STREAM.video(id).downloads.generate();
 *
 * const video = env.STREAM.video(id)
 * const captions = video.captions.list();
 * const videoDetails = video.details()
 * ```
 */
external interface StreamBinding {
/**
     * Returns a handle scoped to a single video for per-video operations.
     * @param id The unique identifier for the video.
     * @returns A handle for per-video operations.
     */
    fun video(id: String): StreamVideoHandle

/**
     * Uploads a new video from a provided URL.
     * @param url The URL to upload from.
     * @param params Optional upload parameters.
     * @returns The uploaded video details.
     * @throws {BadRequestError} if the upload parameter is invalid or the URL is invalid
     * @throws {QuotaReachedError} if the account storage capacity is exceeded
     * @throws {MaxFileSizeError} if the file size is too large
     * @throws {RateLimitedError} if the server received too many requests
     * @throws {AlreadyUploadedError} if a video was already uploaded to this URL
     * @throws {InternalError} if an unexpected error occurs
     */
    fun upload(
        url: String,
        params: StreamUrlUploadParams = definedExternally,
    ): js.promise.Promise<StreamVideo>

/**
     * Creates a direct upload that allows video uploads without an API key.
     * @param params Parameters for the direct upload
     * @returns The direct upload details.
     * @throws {BadRequestError} if the parameters are invalid
     * @throws {RateLimitedError} if the server received too many requests
     * @throws {InternalError} if an unexpected error occurs
     */
    fun createDirectUpload(params: StreamDirectUploadCreateParams): js.promise.Promise<StreamDirectUpload>

    var videos: StreamVideos
    var watermarks: StreamWatermarks
}
