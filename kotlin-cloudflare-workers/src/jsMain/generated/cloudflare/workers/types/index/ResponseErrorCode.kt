// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface ResponseErrorCode {
    companion object
}

inline val ResponseErrorCode.Companion.server_error: ResponseErrorCode
    get() = js.reflect.unsafeCast("server_error")

inline val ResponseErrorCode.Companion.rate_limit_exceeded: ResponseErrorCode
    get() = js.reflect.unsafeCast("rate_limit_exceeded")

inline val ResponseErrorCode.Companion.invalid_prompt: ResponseErrorCode
    get() = js.reflect.unsafeCast("invalid_prompt")

inline val ResponseErrorCode.Companion.vector_store_timeout: ResponseErrorCode
    get() = js.reflect.unsafeCast("vector_store_timeout")

inline val ResponseErrorCode.Companion.invalid_image: ResponseErrorCode
    get() = js.reflect.unsafeCast("invalid_image")

inline val ResponseErrorCode.Companion.invalid_image_format: ResponseErrorCode
    get() = js.reflect.unsafeCast("invalid_image_format")

inline val ResponseErrorCode.Companion.invalid_base64_image: ResponseErrorCode
    get() = js.reflect.unsafeCast("invalid_base64_image")

inline val ResponseErrorCode.Companion.invalid_image_url: ResponseErrorCode
    get() = js.reflect.unsafeCast("invalid_image_url")

inline val ResponseErrorCode.Companion.image_too_large: ResponseErrorCode
    get() = js.reflect.unsafeCast("image_too_large")

inline val ResponseErrorCode.Companion.image_too_small: ResponseErrorCode
    get() = js.reflect.unsafeCast("image_too_small")

inline val ResponseErrorCode.Companion.image_parse_error: ResponseErrorCode
    get() = js.reflect.unsafeCast("image_parse_error")

inline val ResponseErrorCode.Companion.image_content_policy_violation: ResponseErrorCode
    get() = js.reflect.unsafeCast("image_content_policy_violation")

inline val ResponseErrorCode.Companion.invalid_image_mode: ResponseErrorCode
    get() = js.reflect.unsafeCast("invalid_image_mode")

inline val ResponseErrorCode.Companion.image_file_too_large: ResponseErrorCode
    get() = js.reflect.unsafeCast("image_file_too_large")

inline val ResponseErrorCode.Companion.unsupported_image_media_type: ResponseErrorCode
    get() = js.reflect.unsafeCast("unsupported_image_media_type")

inline val ResponseErrorCode.Companion.empty_image_file: ResponseErrorCode
    get() = js.reflect.unsafeCast("empty_image_file")

inline val ResponseErrorCode.Companion.failed_to_download_image: ResponseErrorCode
    get() = js.reflect.unsafeCast("failed_to_download_image")

inline val ResponseErrorCode.Companion.image_file_not_found: ResponseErrorCode
    get() = js.reflect.unsafeCast("image_file_not_found")
