// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * Geographic data about the request's origin.
 */
external interface IncomingRequestCfPropertiesGeographicInformation {
/**
     * The [ISO 3166-1 Alpha 2](https://www.iso.org/iso-3166-country-codes.html) country code the request originated from.
     *
     * If your worker is [configured to accept TOR connections](https://support.cloudflare.com/hc/en-us/articles/203306930-Understanding-Cloudflare-Tor-support-and-Onion-Routing), this may also be `"T1"`, indicating a request that originated over TOR.
     *
     * If Cloudflare is unable to determine where the request originated this property is omitted.
     *
     * The country code `"T1"` is used for requests originating on TOR.
     *
     * @example "GB"
     */
    var country: (Any /* Iso3166Alpha2Code | "T1" */)?

/**
     * If present, this property indicates that the request originated in the EU
     *
     * @example "1"
     */
    var isEUCountry: String /* "1" */?

/**
     * A two-letter code indicating the continent the request originated from.
     *
     * @example "AN"
     */
    var continent: ContinentCode?

/**
     * The city the request originated from
     *
     * @example "Austin"
     */
    var city: String?

/**
     * Postal code of the incoming request
     *
     * @example "78701"
     */
    var postalCode: String?

/**
     * Latitude of the incoming request
     *
     * @example "30.27130"
     */
    var latitude: String?

/**
     * Longitude of the incoming request
     *
     * @example "-97.74260"
     */
    var longitude: String?

/**
     * Timezone of the incoming request
     *
     * @example "America/Chicago"
     */
    var timezone: String?

/**
     * If known, the ISO 3166-2 name for the first level region associated with
     * the IP address of the incoming request
     *
     * @example "Texas"
     */
    var region: String?

/**
     * If known, the ISO 3166-2 code for the first-level region associated with
     * the IP address of the incoming request
     *
     * @example "TX"
     */
    var regionCode: String?

/**
     * Metro code (DMA) of the incoming request
     *
     * @example "635"
     */
    var metroCode: String?
}
