// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface SendEmailSendBuilder {
    var from: Any // string | EmailAddress
    var to: Any // string | string[]
    var subject: String
    var replyTo: (Any /* string | EmailAddress */)?
    var cc: (Any /* string | string[] */)?
    var bcc: (Any /* string | string[] */)?
    var headers: js.objects.ReadonlyRecord<String, String>?
    var text: String?
    var html: String?
    var attachments: js.array.ReadonlyArray<EmailAttachment>?
}
