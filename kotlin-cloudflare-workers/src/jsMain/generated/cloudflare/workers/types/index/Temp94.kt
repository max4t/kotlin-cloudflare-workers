// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface Temp94 {
/**
     * Role of the message author
     */
    var role: String

/**
     * The content of the message
     */
    var content: String

/**
     * Internal reasoning content (if available)
     */
    var reasoning_content: String?

/**
     * Tool calls made by the assistant
     */
    var tool_calls: js.array.ReadonlyArray<Temp95>?
}
