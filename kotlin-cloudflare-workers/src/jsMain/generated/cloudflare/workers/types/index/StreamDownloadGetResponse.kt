// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * An object with download type keys. Each key is optional and only present if that
 * download type has been created.
 */
external interface StreamDownloadGetResponse {
/**
     * The audio-only download. Only present if this download type has been created.
     */
    var audio: StreamDownload?

/**
     * The default video download. Only present if this download type has been created.
     */
    var default: StreamDownload?
}
