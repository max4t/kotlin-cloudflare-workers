// Automatically generated - do not modify!

package cloudflare.workers.types.index

// PubSubMessage represents an incoming PubSub message.
// The message includes metadata about the broker, the client, and the payload
// itself.
// https://developers.cloudflare.com/pub-sub/
external interface PubSubMessage {
// Message ID
    val mid: Double

// MQTT broker FQDN in the form mqtts://BROKER.NAMESPACE.cloudflarepubsub.com:PORT
    val broker: String

// The MQTT topic the message was sent on.
    val topic: String

// The client ID of the client that published this message.
    val clientId: String

// The unique identifier (JWT ID) used by the client to authenticate, if token
// auth was used.
    val jti: String?

// A Unix timestamp (seconds from Jan 1, 1970), set when the Pub/Sub Broker
// received the message from the client.
    val receivedAt: Double

// An (optional) string with the MIME type of the payload, if set by the
// client.
    val contentType: String

// Set to 1 when the payload is a UTF-8 string
// https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901063
    val payloadFormatIndicator: Double

// Pub/Sub (MQTT) payloads can be UTF-8 strings, or byte arrays.
// You can use payloadFormatIndicator to inspect this before decoding.
    var payload: Any // string | Uint8Array
}
