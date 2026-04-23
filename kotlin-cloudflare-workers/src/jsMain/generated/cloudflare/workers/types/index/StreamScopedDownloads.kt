// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface StreamScopedDownloads {
/**
     * Generates a download for a video when a video is ready to view. Available
     * types are `default` and `audio`. Defaults to `default` when omitted.
     * @param downloadType The download type to create.
     * @returns The current downloads for the video.
     * @throws {NotFoundError} if the video is not found
     * @throws {BadRequestError} if the download type is invalid
     * @throws {StreamError} if the video duration is too long to generate a download
     * @throws {StreamError} if the video is not ready to stream
     * @throws {InternalError} if an unexpected error occurs
     */
    @JsName("generate")
    fun generateAsync(downloadType: StreamDownloadType = definedExternally): js.promise.Promise<StreamDownloadGetResponse>

    @seskar.js.JsAsync
    suspend fun generate(downloadType: StreamDownloadType = definedExternally): StreamDownloadGetResponse

/**
     * Lists the downloads created for a video.
     * @returns The current downloads for the video.
     * @throws {NotFoundError} if the video or downloads are not found
     * @throws {InternalError} if an unexpected error occurs
     */
    @JsName("get")
    fun getAsync(): js.promise.Promise<StreamDownloadGetResponse>

    @seskar.js.JsAsync
    suspend fun get(): StreamDownloadGetResponse

/**
     * Delete the downloads for a video. Available types are `default` and `audio`.
     * Defaults to `default` when omitted.
     * @param downloadType The download type to delete.
     * @returns A promise that resolves when deletion completes.
     * @throws {NotFoundError} if the video or downloads are not found
     * @throws {InternalError} if an unexpected error occurs
     */
    @JsName("delete")
    fun deleteAsync(downloadType: StreamDownloadType = definedExternally): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun delete(downloadType: StreamDownloadType = definedExternally): js.core.Void
}
