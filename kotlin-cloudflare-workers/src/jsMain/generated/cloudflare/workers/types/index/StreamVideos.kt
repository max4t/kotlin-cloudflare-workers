// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface StreamVideos {
/**
     * Lists all videos in a users account.
     * @returns The list of videos.
     * @throws {BadRequestError} if the parameters are invalid
     * @throws {InternalError} if an unexpected error occurs
     */
    fun list(params: StreamVideosListParams = definedExternally): js.promise.Promise<js.array.ReadonlyArray<StreamVideo>>
}
