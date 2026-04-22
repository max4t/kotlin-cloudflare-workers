// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The Web Crypto API provides a set of low-level functions for common cryptographic tasks.
 * The Workers runtime implements the full surface of this API, but with some differences in
 * the [supported algorithms](https://developers.cloudflare.com/workers/runtime-apis/web-crypto/#supported-algorithms)
 * compared to those implemented in most browsers.
 *
 * [Cloudflare Docs Reference](https://developers.cloudflare.com/workers/runtime-apis/web-crypto/)
 */
abstract external class Crypto {
/**
     * The **`Crypto.subtle`** read-only property returns a cryptographic operations.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/subtle)
     */
    val subtle: web.crypto.SubtleCrypto

/**
     * The **`Crypto.getRandomValues()`** method lets you get cryptographically strong random values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/getRandomValues)
     */
    fun <T : Any /* Int8Array | Uint8Array | Int16Array | Uint16Array | Int32Array | Uint32Array | BigInt64Array | BigUint64Array */> getRandomValues(
        buffer: T,
    ): T

/**
     * The **`randomUUID()`** method of the Crypto interface is used to generate a v4 UUID using a cryptographically secure random number generator.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/randomUUID)
     */
    fun randomUUID(): String

    var DigestStream: Any // typeof DigestStream
}
