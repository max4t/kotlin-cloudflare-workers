// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ToolMessage {
    var role: String // "tool"
    var content: Any /* string | Array<{
    type: "text";
    text: string;
}> */
    var tool_call_id: String
}
