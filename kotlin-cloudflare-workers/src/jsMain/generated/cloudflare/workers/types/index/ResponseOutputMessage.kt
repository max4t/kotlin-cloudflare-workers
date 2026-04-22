// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ResponseOutputMessage {
    var id: String
    var content: js.array.ReadonlyArray<Any /* ResponseOutputText | ResponseOutputRefusal */>
    var role: String // "assistant"
    var status: ResponseOutputMessageStatus
    var type: String // "message"
}
