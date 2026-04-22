// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ResponseCompletedEvent {
    var response: web.http.Response
    var sequence_number: Double
    var type: String // "response.completed"
}
