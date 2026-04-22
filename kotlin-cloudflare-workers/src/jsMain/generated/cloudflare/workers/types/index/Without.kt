// Automatically generated - do not modify!

package cloudflare.workers.types.index

/** Marks keys from T that aren't in U as optional never */
external interface Without<T, U> {
operator fun <P : Exclude</* keyof T */, /* keyof U */>> get(key: P): Nothing?

operator fun <P : Exclude</* keyof T */, /* keyof U */>> set(key: P, value: Nothing?)
}
