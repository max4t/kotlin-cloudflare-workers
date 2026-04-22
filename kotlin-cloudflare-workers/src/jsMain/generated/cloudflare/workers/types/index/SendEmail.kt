// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * A binding that allows a Worker to send email messages.
 */
external interface SendEmail {
    fun send(message: EmailMessage): js.promise.Promise<EmailSendResult>

    fun send(builder: SendEmailSendBuilder): js.promise.Promise<EmailSendResult>
}
