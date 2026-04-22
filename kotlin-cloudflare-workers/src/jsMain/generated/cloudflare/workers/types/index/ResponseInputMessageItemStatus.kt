// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface ResponseInputMessageItemStatus {
    companion object
}

inline val ResponseInputMessageItemStatus.Companion.in_progress: ResponseInputMessageItemStatus
    get() = js.reflect.unsafeCast("in_progress")

inline val ResponseInputMessageItemStatus.Companion.completed: ResponseInputMessageItemStatus
    get() = js.reflect.unsafeCast("completed")

inline val ResponseInputMessageItemStatus.Companion.incomplete: ResponseInputMessageItemStatus
    get() = js.reflect.unsafeCast("incomplete")
