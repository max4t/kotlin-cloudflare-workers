// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface SqlStorage {
    fun <T : js.objects.ReadonlyRecord<String, SqlStorageValue>> exec(
        query: String,
        vararg bindings: Any?,
    ): SqlStorageCursor<T>

    val databaseSize: Double
    var Cursor: Any // typeof SqlStorageCursor
    var Statement: Any // typeof SqlStorageStatement
}
