// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`URLSearchParams`** interface defines utility methods to work with the query string of a URL.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams)
 */
external class URLSearchParams {
    constructor ()

    constructor (init: web.url.URLSearchParams = definedExternally)

    constructor (init: String = definedExternally)

    constructor (init: js.objects.ReadonlyRecord<String, String> = definedExternally)

    constructor (init: js.array.ReadonlyArray<js.array.Tuple2</* key: */ String, /* value: */ String>> = definedExternally)

/**
     * The **`size`** read-only property of the URLSearchParams interface indicates the total number of search parameter entries.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/size)
     */
    val size: Double

/**
     * The **`append()`** method of the URLSearchParams interface appends a specified key/value pair as a new search parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/append)
     */
    fun append(
        name: String,
        value: String,
    ): Unit

/**
     * The **`delete()`** method of the URLSearchParams interface deletes specified parameters and their associated value(s) from the list of all search parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/delete)
     */
    fun delete(name: String): Unit

/**
     * The **`get()`** method of the URLSearchParams interface returns the first value associated to the given search parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/get)
     */
    fun get(name: String): String?

/**
     * The **`getAll()`** method of the URLSearchParams interface returns all the values associated with a given search parameter as an array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/getAll)
     */
    fun getAll(name: String): js.array.ReadonlyArray<String>

/**
     * The **`has()`** method of the URLSearchParams interface returns a boolean value that indicates whether the specified parameter is in the search parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/has)
     */
    fun has(name: String): Boolean

/**
     * The **`set()`** method of the URLSearchParams interface sets the value associated with a given search parameter to the given value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/set)
     */
    fun set(
        name: String,
        value: String,
    ): Unit

/**
     * The **`URLSearchParams.sort()`** method sorts all key/value pairs contained in this object in place and returns `undefined`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/sort)
     */
    fun sort(): Unit

// Returns an array of key, value pairs for every entry in the search params.
    fun entries(): IterableIterator<js.array.Tuple2</* key: */ String, /* value: */ String>>

// Returns a list of keys in the search params.
    fun keys(): IterableIterator<String>

// Returns a list of values in the search params.
    fun values(): IterableIterator<String>

    fun <This /* default is Any? */> forEach(callback: (/* this: This, */ value: String, key: String, parent: web.url.URLSearchParams) -> Unit, thisArg: This = definedExternally): Unit

// function toString() { [native code] }
    fun toString(): String
}
