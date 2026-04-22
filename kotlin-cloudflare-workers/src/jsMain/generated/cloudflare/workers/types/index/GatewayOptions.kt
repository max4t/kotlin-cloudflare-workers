// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface GatewayOptions {
    var id: String
    var cacheKey: String?
    var cacheTtl: Double?
    var skipCache: Boolean?
    var metadata: js.objects.ReadonlyRecord<String, Any? /* number | string | boolean | null | bigint */>?
    var collectLog: Boolean?
    var eventId: String?
    var requestTimeoutMs: Double?
    var retries: GatewayRetries?
}
