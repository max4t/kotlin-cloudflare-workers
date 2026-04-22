// Automatically generated - do not modify!

package cloudflare.workers.types.index

/** Possible outcomes of TLS verification */
sealed external interface CertVerificationStatus {
    companion object
}

inline val CertVerificationStatus.Companion.SUCCESS: CertVerificationStatus
    get() = js.reflect.unsafeCast("SUCCESS")

inline val CertVerificationStatus.Companion.NONE: CertVerificationStatus
    get() = js.reflect.unsafeCast("NONE")

inline val CertVerificationStatus.Companion.`FAILED:self signed certificate`: CertVerificationStatus
    get() = js.reflect.unsafeCast("FAILED:self signed certificate")

inline val CertVerificationStatus.Companion.`FAILED:unable to verify the first certificate`: CertVerificationStatus
    get() = js.reflect.unsafeCast("FAILED:unable to verify the first certificate")

inline val CertVerificationStatus.Companion.`FAILED:certificate is not yet valid`: CertVerificationStatus
    get() = js.reflect.unsafeCast("FAILED:certificate is not yet valid")

inline val CertVerificationStatus.Companion.`FAILED:certificate has expired`: CertVerificationStatus
    get() = js.reflect.unsafeCast("FAILED:certificate has expired")

inline val CertVerificationStatus.Companion.FAILED: CertVerificationStatus
    get() = js.reflect.unsafeCast("FAILED")
