// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ExecutionContext<Props /* default is Any? */> {
    fun waitUntil(promise: js.promise.Promise<Any?>): Unit

    fun passThroughOnException(): Unit

    val props: Props
    var cache: CacheContext?
}
