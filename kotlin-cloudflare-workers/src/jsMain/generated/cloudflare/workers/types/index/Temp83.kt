// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface Temp83 {
/**
     * The role of the message sender (e.g., 'user', 'assistant', 'system', 'tool').
     */
    var role: String?

/**
     * The tool call id. If you don't know what to put here you can fall back to 000000001
     */
    var tool_call_id: String?
    var content:
        (
            Any /* string | {
    type?: string;
    text?: string;
    image_url?: {
        url?: string;
    };
}[] | {
    type?: string;
    text?: string;
    image_url?: {
        url?: string;
    };
} */
        )?
}
