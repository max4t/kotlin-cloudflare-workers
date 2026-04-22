// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface StreamDownload {
/**
     * Indicates the progress as a percentage between 0 and 100.
     */
    var percentComplete: Double

/**
     * The status of a generated download.
     */
    var status: StreamDownloadStatus

/**
     * The URL to access the generated download.
     */
    var url: String?
}
