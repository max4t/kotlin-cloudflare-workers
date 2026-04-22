// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

abstract external class SqlStorageCursor<T : js.objects.ReadonlyRecord<String, SqlStorageValue>> {
    fun next(): Any /* {
    done?: false;
    value: T;
} | {
    done: true;
    value?: never;
} */

    fun toArray(): js.array.ReadonlyArray<T>

    fun one(): T

    fun <U : js.array.ReadonlyArray<SqlStorageValue>> raw(): IterableIterator<U>

    var columnNames: js.array.ReadonlyArray<String>
    val rowsRead: Double
    val rowsWritten: Double
}
