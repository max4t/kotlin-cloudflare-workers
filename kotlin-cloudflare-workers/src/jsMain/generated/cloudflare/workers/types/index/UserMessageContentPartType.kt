// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface UserMessageContentPartType {
    companion object
}

inline val UserMessageContentPartType.Companion.text: UserMessageContentPartType
    get() = js.reflect.unsafeCast("text")

inline val UserMessageContentPartType.Companion.image_url: UserMessageContentPartType
    get() = js.reflect.unsafeCast("image_url")

inline val UserMessageContentPartType.Companion.input_audio: UserMessageContentPartType
    get() = js.reflect.unsafeCast("input_audio")

inline val UserMessageContentPartType.Companion.file: UserMessageContentPartType
    get() = js.reflect.unsafeCast("file")
