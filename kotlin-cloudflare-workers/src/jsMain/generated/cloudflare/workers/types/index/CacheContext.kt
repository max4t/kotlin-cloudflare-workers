// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface CacheContext {
    @JsName("purge")
    fun purgeAsync(options: CachePurgeOptions): js.promise.Promise<CachePurgeResult>

    @seskar.js.JsAsync
    suspend fun purge(options: CachePurgeOptions): CachePurgeResult
}
