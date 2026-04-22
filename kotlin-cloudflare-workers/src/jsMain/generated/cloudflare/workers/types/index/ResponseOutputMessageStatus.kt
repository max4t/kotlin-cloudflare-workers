// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface ResponseOutputMessageStatus {
    companion object
}

inline val ResponseOutputMessageStatus.Companion.in_progress: ResponseOutputMessageStatus
    get() = js.reflect.unsafeCast("in_progress")

inline val ResponseOutputMessageStatus.Companion.completed: ResponseOutputMessageStatus
    get() = js.reflect.unsafeCast("completed")

inline val ResponseOutputMessageStatus.Companion.incomplete: ResponseOutputMessageStatus
    get() = js.reflect.unsafeCast("incomplete")
