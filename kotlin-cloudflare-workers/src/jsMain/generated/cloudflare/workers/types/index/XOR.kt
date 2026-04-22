// Automatically generated - do not modify!

package cloudflare.workers.types.index

/** Either T or U, but not both (mutually exclusive) */
typealias XOR<T, U> = Any // (T & Without<U, T>) | (U & Without<T, U>)
