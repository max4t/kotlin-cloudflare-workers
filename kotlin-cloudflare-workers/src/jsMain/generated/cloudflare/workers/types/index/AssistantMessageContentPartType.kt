// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface AssistantMessageContentPartType {
    companion object
}

inline val AssistantMessageContentPartType.Companion.text: AssistantMessageContentPartType
    get() = js.reflect.unsafeCast("text")

inline val AssistantMessageContentPartType.Companion.refusal: AssistantMessageContentPartType
    get() = js.reflect.unsafeCast("refusal")
