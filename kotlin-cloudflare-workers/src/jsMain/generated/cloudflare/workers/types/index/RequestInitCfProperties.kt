// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * In addition to the properties you can set in the RequestInit dict
 * that you pass as an argument to the Request constructor, you can
 * set certain properties of a `cf` object to control how Cloudflare
 * features are applied to that new Request.
 *
 * Note: Currently, these properties cannot be tested in the
 * playground.
 */
external interface RequestInitCfProperties : js.objects.ReadonlyRecord<String, Any?> {
    var cacheEverything: Boolean?

/**
     * A request's cache key is what determines if two requests are
     * "the same" for caching purposes. If a request has the same cache key
     * as some previous request, then we can serve the same cached response for
     * both. (e.g. 'some-key')
     *
     * Only available for Enterprise customers.
     */
    var cacheKey: String?

/**
     * This allows you to append additional Cache-Tag response headers
     * to the origin response without modifications to the origin server.
     * This will allow for greater control over the Purge by Cache Tag feature
     * utilizing changes only in the Workers process.
     *
     * Only available for Enterprise customers.
     */
    var cacheTags: js.array.ReadonlyArray<String>?

/**
     * Force response to be cached for a given number of seconds. (e.g. 300)
     */
    var cacheTtl: Double?

/**
     * Force response to be cached for a given number of seconds based on the Origin status code.
     * (e.g. { '200-299': 86400, '404': 1, '500-599': 0 })
     */
    var cacheTtlByStatus: js.objects.ReadonlyRecord<String, Double>?

/**
     * Explicit Cache-Control header value to set on the response stored in cache.
     * This gives full control over cache directives (e.g. 'public, max-age=3600, s-maxage=86400').
     *
     * Cannot be used together with `cacheTtl` or the `cache` request option (`no-store`/`no-cache`),
     * as these are mutually exclusive cache control mechanisms. Setting both will throw a TypeError.
     *
     * Can be used together with `cacheTtlByStatus`.
     */
    var cacheControl: String?

/**
     * Whether the response should be eligible for Cache Reserve storage.
     */
    var cacheReserveEligible: Boolean?

/**
     * Whether to respect strong ETags (as opposed to weak ETags) from the origin.
     */
    var respectStrongEtag: Boolean?

/**
     * Whether to strip ETag headers from the origin response before caching.
     */
    var stripEtags: Boolean?

/**
     * Whether to strip Last-Modified headers from the origin response before caching.
     */
    var stripLastModified: Boolean?

/**
     * Whether to enable Cache Deception Armor, which protects against web cache
     * deception attacks by verifying the Content-Type matches the URL extension.
     */
    var cacheDeceptionArmor: Boolean?

/**
     * Minimum file size in bytes for a response to be eligible for Cache Reserve storage.
     */
    var cacheReserveMinimumFileSize: Double?
    var scrapeShield: Boolean?
    var apps: Boolean?
    var image: RequestInitCfPropertiesImage?
    var minify: RequestInitCfPropertiesImageMinify?
    var mirage: Boolean?
    var polish: (RequestInitCfPropertiesPolish)?
    var r2: RequestInitCfPropertiesR2?

/**
     * Redirects the request to an alternate origin server. You can use this,
     * for example, to implement load balancing across several origins.
     * (e.g.us-east.example.com)
     *
     * Note - For security reasons, the hostname set in resolveOverride must
     * be proxied on the same Cloudflare zone of the incoming request.
     * Otherwise, the setting is ignored. CNAME hosts are allowed, so to
     * resolve to a host under a different domain or a DNS only domain first
     * declare a CNAME record within your own zone’s DNS mapping to the
     * external hostname, set proxy on Cloudflare, then set resolveOverride
     * to point to that CNAME record.
     */
    var resolveOverride: String?
}
