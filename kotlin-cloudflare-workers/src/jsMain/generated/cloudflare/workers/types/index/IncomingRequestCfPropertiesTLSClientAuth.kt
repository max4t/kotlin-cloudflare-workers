// Automatically generated - do not modify!

package cloudflare.workers.types.index

/** Data about the incoming request's TLS certificate */
external interface IncomingRequestCfPropertiesTLSClientAuth {
/** Always `"1"`, indicating that the certificate was presented */
    var certPresented: String // "1"

/**
     * Result of certificate verification.
     *
     * @example "FAILED:self signed certificate"
     */
    var certVerified: Exclude<CertVerificationStatus, String /* "NONE" */>

/** The presented certificate's revokation status.
     *
     * - A value of `"1"` indicates the certificate has been revoked
     * - A value of `"0"` indicates the certificate has not been revoked
     */
    var certRevoked: IncomingRequestCfPropertiesTLSClientAuthCertRevoked

/**
     * The certificate issuer's [distinguished name](https://knowledge.digicert.com/generalinformation/INFO1745.html)
     *
     * @example "CN=cloudflareaccess.com, C=US, ST=Texas, L=Austin, O=Cloudflare"
     */
    var certIssuerDN: String

/**
     * The certificate subject's [distinguished name](https://knowledge.digicert.com/generalinformation/INFO1745.html)
     *
     * @example "CN=*.cloudflareaccess.com, C=US, ST=Texas, L=Austin, O=Cloudflare"
     */
    var certSubjectDN: String

/**
     * The certificate issuer's [distinguished name](https://knowledge.digicert.com/generalinformation/INFO1745.html) ([RFC 2253](https://www.rfc-editor.org/rfc/rfc2253.html) formatted)
     *
     * @example "CN=cloudflareaccess.com, C=US, ST=Texas, L=Austin, O=Cloudflare"
     */
    var certIssuerDNRFC2253: String

/**
     * The certificate subject's [distinguished name](https://knowledge.digicert.com/generalinformation/INFO1745.html) ([RFC 2253](https://www.rfc-editor.org/rfc/rfc2253.html) formatted)
     *
     * @example "CN=*.cloudflareaccess.com, C=US, ST=Texas, L=Austin, O=Cloudflare"
     */
    var certSubjectDNRFC2253: String

/** The certificate issuer's distinguished name (legacy policies) */
    var certIssuerDNLegacy: String

/** The certificate subject's distinguished name (legacy policies) */
    var certSubjectDNLegacy: String

/**
     * The certificate's serial number
     *
     * @example "00936EACBE07F201DF"
     */
    var certSerial: String

/**
     * The certificate issuer's serial number
     *
     * @example "2489002934BDFEA34"
     */
    var certIssuerSerial: String

/**
     * The certificate's Subject Key Identifier
     *
     * @example "BB:AF:7E:02:3D:FA:A6:F1:3C:84:8E:AD:EE:38:98:EC:D9:32:32:D4"
     */
    var certSKI: String

/**
     * The certificate issuer's Subject Key Identifier
     *
     * @example "BB:AF:7E:02:3D:FA:A6:F1:3C:84:8E:AD:EE:38:98:EC:D9:32:32:D4"
     */
    var certIssuerSKI: String

/**
     * The certificate's SHA-1 fingerprint
     *
     * @example "6b9109f323999e52259cda7373ff0b4d26bd232e"
     */
    var certFingerprintSHA1: String

/**
     * The certificate's SHA-256 fingerprint
     *
     * @example "acf77cf37b4156a2708e34c4eb755f9b5dbbe5ebb55adfec8f11493438d19e6ad3f157f81fa3b98278453d5652b0c1fd1d71e5695ae4d709803a4d3f39de9dea"
     */
    var certFingerprintSHA256: String

/**
     * The effective starting date of the certificate
     *
     * @example "Dec 22 19:39:00 2018 GMT"
     */
    var certNotBefore: String

/**
     * The effective expiration date of the certificate
     *
     * @example "Dec 22 19:39:00 2018 GMT"
     */
    var certNotAfter: String
}
