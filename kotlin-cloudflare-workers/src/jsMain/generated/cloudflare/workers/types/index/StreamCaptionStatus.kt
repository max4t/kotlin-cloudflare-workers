// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface StreamCaptionStatus {
    companion object
}

inline val StreamCaptionStatus.Companion.ready: StreamCaptionStatus
    get() = js.reflect.unsafeCast("ready")

inline val StreamCaptionStatus.Companion.inprogress: StreamCaptionStatus
    get() = js.reflect.unsafeCast("inprogress")

inline val StreamCaptionStatus.Companion.error: StreamCaptionStatus
    get() = js.reflect.unsafeCast("error")
