// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface ResponseStatus {
    companion object
}

inline val ResponseStatus.Companion.completed: ResponseStatus
    get() = js.reflect.unsafeCast("completed")

inline val ResponseStatus.Companion.failed: ResponseStatus
    get() = js.reflect.unsafeCast("failed")

inline val ResponseStatus.Companion.in_progress: ResponseStatus
    get() = js.reflect.unsafeCast("in_progress")

inline val ResponseStatus.Companion.cancelled: ResponseStatus
    get() = js.reflect.unsafeCast("cancelled")

inline val ResponseStatus.Companion.queued: ResponseStatus
    get() = js.reflect.unsafeCast("queued")

inline val ResponseStatus.Companion.incomplete: ResponseStatus
    get() = js.reflect.unsafeCast("incomplete")
