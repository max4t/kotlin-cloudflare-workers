// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * An email message that is sent to a consumer Worker and can be rejected/forwarded.
 */
external interface ForwardableEmailMessage : EmailMessage {
/**
     * Stream of the email message content.
     */
    val raw: web.streams.ReadableStream<js.typedarrays.Uint8Array>

/**
     * An [Headers object](https://developer.mozilla.org/en-US/docs/Web/API/Headers).
     */
    val headers: web.http.Headers

/**
     * Size of the email message content.
     */
    val rawSize: Double

/**
     * Reject this email message by returning a permanent SMTP error back to the connecting client including the given reason.
     * @param reason The reject reason.
     * @returns void
     */
    fun setReject(reason: String): Unit

/**
     * Forward this email message to a verified destination address of the account.
     * @param rcptTo Verified destination address.
     * @param headers A [Headers object](https://developer.mozilla.org/en-US/docs/Web/API/Headers).
     * @returns A promise that resolves when the email message is forwarded.
     */
    fun forward(
        rcptTo: String,
        headers: web.http.Headers = definedExternally,
    ): js.promise.Promise<EmailSendResult>

/**
     * Reply to the sender of this email message with a new EmailMessage object.
     * @param message The reply message.
     * @returns A promise that resolves when the email message is replied.
     */
    fun reply(message: EmailMessage): js.promise.Promise<EmailSendResult>
}
