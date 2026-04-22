// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`DOMException`** interface represents an abnormal event (called an **exception**) that occurs as a result of calling a method or accessing a property of a web API.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException)
 */
external class DOMException : js.errors.JsError {
    constructor (message: String = definedExternally, name: String = definedExternally)

/**
     * The **`message`** read-only property of the a message or description associated with the given error name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException/message)
     */
    val message: String

/**
     * The **`name`** read-only property of the one of the strings associated with an error name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException/name)
     */
    val name: String

/**
     * The **`code`** read-only property of the DOMException interface returns one of the legacy error code constants, or `0` if none match.
     * @deprecated
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException/code)
     */
    val code: Double
    var stack: Any?

    companion object {
        val INDEX_SIZE_ERR: Double
        val DOMSTRING_SIZE_ERR: Double
        val HIERARCHY_REQUEST_ERR: Double
        val WRONG_DOCUMENT_ERR: Double
        val INVALID_CHARACTER_ERR: Double
        val NO_DATA_ALLOWED_ERR: Double
        val NO_MODIFICATION_ALLOWED_ERR: Double
        val NOT_FOUND_ERR: Double
        val NOT_SUPPORTED_ERR: Double
        val INUSE_ATTRIBUTE_ERR: Double
        val INVALID_STATE_ERR: Double
        val SYNTAX_ERR: Double
        val INVALID_MODIFICATION_ERR: Double
        val NAMESPACE_ERR: Double
        val INVALID_ACCESS_ERR: Double
        val VALIDATION_ERR: Double
        val TYPE_MISMATCH_ERR: Double
        val SECURITY_ERR: Double
        val NETWORK_ERR: Double
        val ABORT_ERR: Double
        val URL_MISMATCH_ERR: Double
        val QUOTA_EXCEEDED_ERR: Double
        val TIMEOUT_ERR: Double
        val INVALID_NODE_TYPE_ERR: Double
        val DATA_CLONE_ERR: Double
    }
}
