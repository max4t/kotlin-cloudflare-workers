// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface Message<Body /* default is Any? */> {
    val id: String
    val timestamp: js.date.Date
    val body: Body
    val attempts: Double

    fun retry(options: QueueRetryOptions = definedExternally): Unit

    fun ack(): Unit
}
