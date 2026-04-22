// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`SubtleCrypto`** interface of the Web Crypto API provides a number of low-level cryptographic functions.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto)
 */
abstract external class SubtleCrypto {
/**
     * The **`encrypt()`** method of the SubtleCrypto interface encrypts data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/encrypt)
     */
    fun encrypt(
        algorithm: String,
        key: web.crypto.CryptoKey,
        plainText: js.buffer.ArrayBuffer,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`encrypt()`** method of the SubtleCrypto interface encrypts data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/encrypt)
     */
    fun encrypt(
        algorithm: String,
        key: web.crypto.CryptoKey,
        plainText: js.buffer.ArrayBufferView,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`encrypt()`** method of the SubtleCrypto interface encrypts data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/encrypt)
     */
    fun encrypt(
        algorithm: SubtleCryptoEncryptAlgorithm,
        key: web.crypto.CryptoKey,
        plainText: js.buffer.ArrayBuffer,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`encrypt()`** method of the SubtleCrypto interface encrypts data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/encrypt)
     */
    fun encrypt(
        algorithm: SubtleCryptoEncryptAlgorithm,
        key: web.crypto.CryptoKey,
        plainText: js.buffer.ArrayBufferView,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`decrypt()`** method of the SubtleCrypto interface decrypts some encrypted data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/decrypt)
     */
    fun decrypt(
        algorithm: String,
        key: web.crypto.CryptoKey,
        cipherText: js.buffer.ArrayBuffer,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`decrypt()`** method of the SubtleCrypto interface decrypts some encrypted data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/decrypt)
     */
    fun decrypt(
        algorithm: String,
        key: web.crypto.CryptoKey,
        cipherText: js.buffer.ArrayBufferView,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`decrypt()`** method of the SubtleCrypto interface decrypts some encrypted data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/decrypt)
     */
    fun decrypt(
        algorithm: SubtleCryptoEncryptAlgorithm,
        key: web.crypto.CryptoKey,
        cipherText: js.buffer.ArrayBuffer,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`decrypt()`** method of the SubtleCrypto interface decrypts some encrypted data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/decrypt)
     */
    fun decrypt(
        algorithm: SubtleCryptoEncryptAlgorithm,
        key: web.crypto.CryptoKey,
        cipherText: js.buffer.ArrayBufferView,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`sign()`** method of the SubtleCrypto interface generates a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/sign)
     */
    fun sign(
        algorithm: String,
        key: web.crypto.CryptoKey,
        data: js.buffer.ArrayBuffer,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`sign()`** method of the SubtleCrypto interface generates a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/sign)
     */
    fun sign(
        algorithm: String,
        key: web.crypto.CryptoKey,
        data: js.buffer.ArrayBufferView,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`sign()`** method of the SubtleCrypto interface generates a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/sign)
     */
    fun sign(
        algorithm: SubtleCryptoSignAlgorithm,
        key: web.crypto.CryptoKey,
        data: js.buffer.ArrayBuffer,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`sign()`** method of the SubtleCrypto interface generates a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/sign)
     */
    fun sign(
        algorithm: SubtleCryptoSignAlgorithm,
        key: web.crypto.CryptoKey,
        data: js.buffer.ArrayBufferView,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`verify()`** method of the SubtleCrypto interface verifies a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/verify)
     */
    fun verify(
        algorithm: String,
        key: web.crypto.CryptoKey,
        signature: js.buffer.ArrayBuffer,
        data: js.buffer.ArrayBuffer,
    ): js.promise.Promise<Boolean>

/**
     * The **`verify()`** method of the SubtleCrypto interface verifies a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/verify)
     */
    fun verify(
        algorithm: String,
        key: web.crypto.CryptoKey,
        signature: js.buffer.ArrayBuffer,
        data: js.buffer.ArrayBufferView,
    ): js.promise.Promise<Boolean>

/**
     * The **`verify()`** method of the SubtleCrypto interface verifies a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/verify)
     */
    fun verify(
        algorithm: String,
        key: web.crypto.CryptoKey,
        signature: js.buffer.ArrayBufferView,
        data: js.buffer.ArrayBuffer,
    ): js.promise.Promise<Boolean>

/**
     * The **`verify()`** method of the SubtleCrypto interface verifies a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/verify)
     */
    fun verify(
        algorithm: String,
        key: web.crypto.CryptoKey,
        signature: js.buffer.ArrayBufferView,
        data: js.buffer.ArrayBufferView,
    ): js.promise.Promise<Boolean>

/**
     * The **`verify()`** method of the SubtleCrypto interface verifies a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/verify)
     */
    fun verify(
        algorithm: SubtleCryptoSignAlgorithm,
        key: web.crypto.CryptoKey,
        signature: js.buffer.ArrayBuffer,
        data: js.buffer.ArrayBuffer,
    ): js.promise.Promise<Boolean>

/**
     * The **`verify()`** method of the SubtleCrypto interface verifies a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/verify)
     */
    fun verify(
        algorithm: SubtleCryptoSignAlgorithm,
        key: web.crypto.CryptoKey,
        signature: js.buffer.ArrayBuffer,
        data: js.buffer.ArrayBufferView,
    ): js.promise.Promise<Boolean>

/**
     * The **`verify()`** method of the SubtleCrypto interface verifies a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/verify)
     */
    fun verify(
        algorithm: SubtleCryptoSignAlgorithm,
        key: web.crypto.CryptoKey,
        signature: js.buffer.ArrayBufferView,
        data: js.buffer.ArrayBuffer,
    ): js.promise.Promise<Boolean>

/**
     * The **`verify()`** method of the SubtleCrypto interface verifies a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/verify)
     */
    fun verify(
        algorithm: SubtleCryptoSignAlgorithm,
        key: web.crypto.CryptoKey,
        signature: js.buffer.ArrayBufferView,
        data: js.buffer.ArrayBufferView,
    ): js.promise.Promise<Boolean>

/**
     * The **`digest()`** method of the SubtleCrypto interface generates a _digest_ of the given data, using the specified hash function.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/digest)
     */
    fun digest(
        algorithm: String,
        data: js.buffer.ArrayBuffer,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`digest()`** method of the SubtleCrypto interface generates a _digest_ of the given data, using the specified hash function.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/digest)
     */
    fun digest(
        algorithm: String,
        data: js.buffer.ArrayBufferView,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`digest()`** method of the SubtleCrypto interface generates a _digest_ of the given data, using the specified hash function.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/digest)
     */
    fun digest(
        algorithm: SubtleCryptoHashAlgorithm,
        data: js.buffer.ArrayBuffer,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`digest()`** method of the SubtleCrypto interface generates a _digest_ of the given data, using the specified hash function.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/digest)
     */
    fun digest(
        algorithm: SubtleCryptoHashAlgorithm,
        data: js.buffer.ArrayBufferView,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`generateKey()`** method of the SubtleCrypto interface is used to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/generateKey)
     */
    fun generateKey(
        algorithm: String,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<Any /* CryptoKey | CryptoKeyPair */>

/**
     * The **`generateKey()`** method of the SubtleCrypto interface is used to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/generateKey)
     */
    fun generateKey(
        algorithm: SubtleCryptoGenerateKeyAlgorithm,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<Any /* CryptoKey | CryptoKeyPair */>

/**
     * The **`deriveKey()`** method of the SubtleCrypto interface can be used to derive a secret key from a master key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveKey)
     */
    fun deriveKey(
        algorithm: String,
        baseKey: web.crypto.CryptoKey,
        derivedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`deriveKey()`** method of the SubtleCrypto interface can be used to derive a secret key from a master key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveKey)
     */
    fun deriveKey(
        algorithm: String,
        baseKey: web.crypto.CryptoKey,
        derivedKeyAlgorithm: SubtleCryptoImportKeyAlgorithm,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`deriveKey()`** method of the SubtleCrypto interface can be used to derive a secret key from a master key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveKey)
     */
    fun deriveKey(
        algorithm: SubtleCryptoDeriveKeyAlgorithm,
        baseKey: web.crypto.CryptoKey,
        derivedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`deriveKey()`** method of the SubtleCrypto interface can be used to derive a secret key from a master key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveKey)
     */
    fun deriveKey(
        algorithm: SubtleCryptoDeriveKeyAlgorithm,
        baseKey: web.crypto.CryptoKey,
        derivedKeyAlgorithm: SubtleCryptoImportKeyAlgorithm,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`deriveBits()`** method of the key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveBits)
     */
    fun deriveBits(
        algorithm: String,
        baseKey: web.crypto.CryptoKey,
        length: Double? = definedExternally,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`deriveBits()`** method of the key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveBits)
     */
    fun deriveBits(
        algorithm: SubtleCryptoDeriveKeyAlgorithm,
        baseKey: web.crypto.CryptoKey,
        length: Double? = definedExternally,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`importKey()`** method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/importKey)
     */
    fun importKey(
        format: String,
        keyData: js.buffer.ArrayBuffer,
        algorithm: String,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`importKey()`** method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/importKey)
     */
    fun importKey(
        format: String,
        keyData: js.buffer.ArrayBuffer,
        algorithm: SubtleCryptoImportKeyAlgorithm,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`importKey()`** method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/importKey)
     */
    fun importKey(
        format: String,
        keyData: js.buffer.ArrayBufferView,
        algorithm: String,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`importKey()`** method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/importKey)
     */
    fun importKey(
        format: String,
        keyData: js.buffer.ArrayBufferView,
        algorithm: SubtleCryptoImportKeyAlgorithm,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`importKey()`** method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/importKey)
     */
    fun importKey(
        format: String,
        keyData: web.crypto.JsonWebKey,
        algorithm: String,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`importKey()`** method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/importKey)
     */
    fun importKey(
        format: String,
        keyData: web.crypto.JsonWebKey,
        algorithm: SubtleCryptoImportKeyAlgorithm,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`exportKey()`** method of the SubtleCrypto interface exports a key: that is, it takes as input a CryptoKey object and gives you the key in an external, portable format.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/exportKey)
     */
    fun exportKey(format: String, key: web.crypto.CryptoKey): js.promise.Promise<Any /* ArrayBuffer | JsonWebKey */>

/**
     * The **`wrapKey()`** method of the SubtleCrypto interface 'wraps' a key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/wrapKey)
     */
    fun wrapKey(
        format: String,
        key: web.crypto.CryptoKey,
        wrappingKey: web.crypto.CryptoKey,
        wrapAlgorithm: String,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`wrapKey()`** method of the SubtleCrypto interface 'wraps' a key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/wrapKey)
     */
    fun wrapKey(
        format: String,
        key: web.crypto.CryptoKey,
        wrappingKey: web.crypto.CryptoKey,
        wrapAlgorithm: SubtleCryptoEncryptAlgorithm,
    ): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`unwrapKey()`** method of the SubtleCrypto interface 'unwraps' a key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/unwrapKey)
     */
    fun unwrapKey(
        format: String,
        wrappedKey: js.buffer.ArrayBuffer,
        unwrappingKey: web.crypto.CryptoKey,
        unwrapAlgorithm: String,
        unwrappedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`unwrapKey()`** method of the SubtleCrypto interface 'unwraps' a key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/unwrapKey)
     */
    fun unwrapKey(
        format: String,
        wrappedKey: js.buffer.ArrayBuffer,
        unwrappingKey: web.crypto.CryptoKey,
        unwrapAlgorithm: String,
        unwrappedKeyAlgorithm: SubtleCryptoImportKeyAlgorithm,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`unwrapKey()`** method of the SubtleCrypto interface 'unwraps' a key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/unwrapKey)
     */
    fun unwrapKey(
        format: String,
        wrappedKey: js.buffer.ArrayBuffer,
        unwrappingKey: web.crypto.CryptoKey,
        unwrapAlgorithm: SubtleCryptoEncryptAlgorithm,
        unwrappedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`unwrapKey()`** method of the SubtleCrypto interface 'unwraps' a key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/unwrapKey)
     */
    fun unwrapKey(
        format: String,
        wrappedKey: js.buffer.ArrayBuffer,
        unwrappingKey: web.crypto.CryptoKey,
        unwrapAlgorithm: SubtleCryptoEncryptAlgorithm,
        unwrappedKeyAlgorithm: SubtleCryptoImportKeyAlgorithm,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`unwrapKey()`** method of the SubtleCrypto interface 'unwraps' a key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/unwrapKey)
     */
    fun unwrapKey(
        format: String,
        wrappedKey: js.buffer.ArrayBufferView,
        unwrappingKey: web.crypto.CryptoKey,
        unwrapAlgorithm: String,
        unwrappedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`unwrapKey()`** method of the SubtleCrypto interface 'unwraps' a key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/unwrapKey)
     */
    fun unwrapKey(
        format: String,
        wrappedKey: js.buffer.ArrayBufferView,
        unwrappingKey: web.crypto.CryptoKey,
        unwrapAlgorithm: String,
        unwrappedKeyAlgorithm: SubtleCryptoImportKeyAlgorithm,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`unwrapKey()`** method of the SubtleCrypto interface 'unwraps' a key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/unwrapKey)
     */
    fun unwrapKey(
        format: String,
        wrappedKey: js.buffer.ArrayBufferView,
        unwrappingKey: web.crypto.CryptoKey,
        unwrapAlgorithm: SubtleCryptoEncryptAlgorithm,
        unwrappedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

/**
     * The **`unwrapKey()`** method of the SubtleCrypto interface 'unwraps' a key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/unwrapKey)
     */
    fun unwrapKey(
        format: String,
        wrappedKey: js.buffer.ArrayBufferView,
        unwrappingKey: web.crypto.CryptoKey,
        unwrapAlgorithm: SubtleCryptoEncryptAlgorithm,
        unwrappedKeyAlgorithm: SubtleCryptoImportKeyAlgorithm,
        extractable: Boolean,
        keyUsages: js.array.ReadonlyArray<String>,
    ): js.promise.Promise<web.crypto.CryptoKey>

    fun timingSafeEqual(
        a: js.buffer.ArrayBuffer,
        b: js.buffer.ArrayBuffer,
    ): Boolean

    fun timingSafeEqual(
        a: js.buffer.ArrayBuffer,
        b: js.buffer.ArrayBufferView,
    ): Boolean

    fun timingSafeEqual(
        a: js.buffer.ArrayBufferView,
        b: js.buffer.ArrayBuffer,
    ): Boolean

    fun timingSafeEqual(
        a: js.buffer.ArrayBufferView,
        b: js.buffer.ArrayBufferView,
    ): Boolean
}
