// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface SyncKvStorage {
    fun <T /* default is Any? */> get(key: String): T?

    fun <T /* default is Any? */> list(options: SyncKvListOptions = definedExternally): js.iterable.JsIterable<js.array.Tuple2<String, T>>

    fun <T> put(
        key: String,
        value: T,
    ): Unit

    fun delete(key: String): Boolean
}
