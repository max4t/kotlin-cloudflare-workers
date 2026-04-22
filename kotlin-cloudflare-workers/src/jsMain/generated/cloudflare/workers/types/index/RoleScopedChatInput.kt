// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface RoleScopedChatInput {
    var role: Any // "user" | "assistant" | "system" | "tool" | (string & NonNullable<unknown>)
    var content: String
    var name: String?
}
