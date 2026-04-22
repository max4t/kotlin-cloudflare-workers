// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ResponseInputMessageItem {
    var id: String
    var content: ResponseInputMessageContentList
    var role: ResponseInputMessageItemRole
    var status: (ResponseInputMessageItemStatus)?
    var type: String /* "message" */?
}
