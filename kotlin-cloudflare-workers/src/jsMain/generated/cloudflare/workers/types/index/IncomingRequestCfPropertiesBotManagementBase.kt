// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface IncomingRequestCfPropertiesBotManagementBase {
/**
     * Cloudflare’s [level of certainty](https://developers.cloudflare.com/bots/concepts/bot-score/) that a request comes from a bot,
     * represented as an integer percentage between `1` (almost certainly a bot) and `99` (almost certainly human).
     *
     * @example 54
     */
    var score: Double

/**
     * A boolean value that is true if the request comes from a good bot, like Google or Bing.
     * Most customers choose to allow this traffic. For more details, see [Traffic from known bots](https://developers.cloudflare.com/firewall/known-issues-and-faq/#how-does-firewall-rules-handle-traffic-from-known-bots).
     */
    var verifiedBot: Boolean

/**
     * A boolean value that is true if the request originates from a
     * Cloudflare-verified proxy service.
     */
    var corporateProxy: Boolean

/**
     * A boolean value that's true if the request matches [file extensions](https://developers.cloudflare.com/bots/reference/static-resources/) for many types of static resources.
     */
    var staticResource: Boolean

/**
     * List of IDs that correlate to the Bot Management heuristic detections made on a request (you can have multiple heuristic detections on the same request).
     */
    var detectionIds: js.array.ReadonlyArray<Double>
}
