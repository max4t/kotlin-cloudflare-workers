// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface StreamDownloadStatus {
    companion object
}

inline val StreamDownloadStatus.Companion.ready: StreamDownloadStatus
    get() = js.reflect.unsafeCast("ready")

inline val StreamDownloadStatus.Companion.inprogress: StreamDownloadStatus
    get() = js.reflect.unsafeCast("inprogress")

inline val StreamDownloadStatus.Companion.error: StreamDownloadStatus
    get() = js.reflect.unsafeCast("error")
