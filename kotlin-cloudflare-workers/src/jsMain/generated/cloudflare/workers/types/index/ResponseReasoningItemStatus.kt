// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface ResponseReasoningItemStatus {
    companion object
}

inline val ResponseReasoningItemStatus.Companion.in_progress: ResponseReasoningItemStatus
    get() = js.reflect.unsafeCast("in_progress")

inline val ResponseReasoningItemStatus.Companion.completed: ResponseReasoningItemStatus
    get() = js.reflect.unsafeCast("completed")

inline val ResponseReasoningItemStatus.Companion.incomplete: ResponseReasoningItemStatus
    get() = js.reflect.unsafeCast("incomplete")
