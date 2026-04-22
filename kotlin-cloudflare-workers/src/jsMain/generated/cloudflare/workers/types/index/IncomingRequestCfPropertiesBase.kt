// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface IncomingRequestCfPropertiesBase : js.objects.ReadonlyRecord<String, Any?> {
/**
     * [ASN](https://www.iana.org/assignments/as-numbers/as-numbers.xhtml) of the incoming request.
     *
     * @example 395747
     */
    var asn: Double?

/**
     * The organization which owns the ASN of the incoming request.
     *
     * @example "Google Cloud"
     */
    var asOrganization: String?

/**
     * The original value of the `Accept-Encoding` header if Cloudflare modified it.
     *
     * @example "gzip, deflate, br"
     */
    var clientAcceptEncoding: String?

/**
     * The number of milliseconds it took for the request to reach your worker.
     *
     * @example 22
     */
    var clientTcpRtt: Double?

/**
     * The three-letter [IATA](https://en.wikipedia.org/wiki/IATA_airport_code)
     * airport code of the data center that the request hit.
     *
     * @example "DFW"
     */
    var colo: String

/**
     * Represents the upstream's response to a
     * [TCP `keepalive` message](https://tldp.org/HOWTO/TCP-Keepalive-HOWTO/overview.html)
     * from cloudflare.
     *
     * For workers with no upstream, this will always be `1`.
     *
     * @example 3
     */
    var edgeRequestKeepAliveStatus: IncomingRequestCfPropertiesEdgeRequestKeepAliveStatus

/**
     * The HTTP Protocol the request used.
     *
     * @example "HTTP/2"
     */
    var httpProtocol: String

/**
     * The browser-requested prioritization information in the request object.
     *
     * If no information was set, defaults to the empty string `""`
     *
     * @example "weight=192;exclusive=0;group=3;group-weight=127"
     * @default ""
     */
    var requestPriority: String

/**
     * The TLS version of the connection to Cloudflare.
     * In requests served over plaintext (without TLS), this property is the empty string `""`.
     *
     * @example "TLSv1.3"
     */
    var tlsVersion: String

/**
     * The cipher for the connection to Cloudflare.
     * In requests served over plaintext (without TLS), this property is the empty string `""`.
     *
     * @example "AEAD-AES128-GCM-SHA256"
     */
    var tlsCipher: String

/**
     * Metadata containing the [`HELLO`](https://www.rfc-editor.org/rfc/rfc5246#section-7.4.1.2) and [`FINISHED`](https://www.rfc-editor.org/rfc/rfc5246#section-7.4.9) messages from this request's TLS handshake.
     *
     * If the incoming request was served over plaintext (without TLS) this field is undefined.
     */
    var tlsExportedAuthenticator: IncomingRequestCfPropertiesExportedAuthenticatorMetadata?
}
