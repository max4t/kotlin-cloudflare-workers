// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface StreamScopedCaptions {
/**
     * Uploads the caption or subtitle file to the endpoint for a specific BCP47 language.
     * One caption or subtitle file per language is allowed.
     * @param language The BCP 47 language tag for the caption or subtitle.
     * @param input The caption or subtitle stream to upload.
     * @returns The created caption entry.
     * @throws {NotFoundError} if the video is not found
     * @throws {BadRequestError} if the language or file is invalid
     * @throws {InternalError} if an unexpected error occurs
     */
    fun upload(
        language: String,
        input: web.streams.ReadableStream,
    ): js.promise.Promise<StreamCaption>

/**
     * Generate captions or subtitles for the provided language via AI.
     * @param language The BCP 47 language tag to generate.
     * @returns The generated caption entry.
     * @throws {NotFoundError} if the video is not found
     * @throws {BadRequestError} if the language is invalid
     * @throws {StreamError} if a generated caption already exists
     * @throws {StreamError} if the video duration is too long
     * @throws {StreamError} if the video is missing audio
     * @throws {StreamError} if the requested language is not supported
     * @throws {InternalError} if an unexpected error occurs
     */
    fun generate(language: String): js.promise.Promise<StreamCaption>

/**
     * Lists the captions or subtitles.
     * Use the language parameter to filter by a specific language.
     * @param language The optional BCP 47 language tag to filter by.
     * @returns The list of captions or subtitles.
     * @throws {NotFoundError} if the video or caption is not found
     * @throws {InternalError} if an unexpected error occurs
     */
    fun list(language: String = definedExternally): js.promise.Promise<js.array.ReadonlyArray<StreamCaption>>

/**
     * Removes the captions or subtitles from a video.
     * @param language The BCP 47 language tag to remove.
     * @returns A promise that resolves when deletion completes.
     * @throws {NotFoundError} if the video or caption is not found
     * @throws {InternalError} if an unexpected error occurs
     */
    fun delete(language: String): js.promise.Promise<js.core.Void>
}
