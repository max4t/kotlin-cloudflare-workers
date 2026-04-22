// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface ResponseFunctionToolCallOutputItemStatus {
    companion object
}

inline val ResponseFunctionToolCallOutputItemStatus.Companion.in_progress: ResponseFunctionToolCallOutputItemStatus
    get() = js.reflect.unsafeCast("in_progress")

inline val ResponseFunctionToolCallOutputItemStatus.Companion.completed: ResponseFunctionToolCallOutputItemStatus
    get() = js.reflect.unsafeCast("completed")

inline val ResponseFunctionToolCallOutputItemStatus.Companion.incomplete: ResponseFunctionToolCallOutputItemStatus
    get() = js.reflect.unsafeCast("incomplete")
