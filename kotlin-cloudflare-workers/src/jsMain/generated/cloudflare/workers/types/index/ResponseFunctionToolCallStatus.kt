// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface ResponseFunctionToolCallStatus {
    companion object
}

inline val ResponseFunctionToolCallStatus.Companion.in_progress: ResponseFunctionToolCallStatus
    get() = js.reflect.unsafeCast("in_progress")

inline val ResponseFunctionToolCallStatus.Companion.completed: ResponseFunctionToolCallStatus
    get() = js.reflect.unsafeCast("completed")

inline val ResponseFunctionToolCallStatus.Companion.incomplete: ResponseFunctionToolCallStatus
    get() = js.reflect.unsafeCast("incomplete")
