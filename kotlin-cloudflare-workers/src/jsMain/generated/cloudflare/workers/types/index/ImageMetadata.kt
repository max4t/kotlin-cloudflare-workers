// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ImageMetadata {
    var id: String
    var filename: String?
    var uploaded: String?
    var requireSignedURLs: Boolean
    var meta: js.objects.ReadonlyRecord<String, Any?>?
    var variants: js.array.ReadonlyArray<String>
    var draft: Boolean?
    var creator: String?
}
