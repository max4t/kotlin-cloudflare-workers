// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`Headers`** interface of the Fetch API allows you to perform various actions on HTTP request and response headers.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers)
 */
external class Headers {
    constructor (init: web.http.HeadersInit = definedExternally)

/**
     * The **`get()`** method of the Headers interface returns a byte string of all the values of a header within a `Headers` object with a given name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/get)
     */
    fun get(name: String): String?

    fun getAll(name: String): js.array.ReadonlyArray<String>

/**
     * The **`has()`** method of the Headers interface returns a boolean stating whether a `Headers` object contains a certain header.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/has)
     */
    fun has(name: String): Boolean

/**
     * The **`set()`** method of the Headers interface sets a new value for an existing header inside a `Headers` object, or adds the header if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/set)
     */
    fun set(
        name: String,
        value: String,
    ): Unit

/**
     * The **`append()`** method of the Headers interface appends a new value onto an existing header inside a `Headers` object, or adds the header if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/append)
     */
    fun append(
        name: String,
        value: String,
    ): Unit

/**
     * The **`delete()`** method of the Headers interface deletes a header from the current `Headers` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/delete)
     */
    fun delete(name: String): Unit

    fun <This /* default is Any? */> forEach(callback: (/* this: This, */ value: String, key: String, parent: web.http.Headers) -> Unit, thisArg: This = definedExternally): Unit

// Returns an iterator allowing to go through all key/value pairs contained in this object.
    fun entries(): IterableIterator<js.array.Tuple2</* key: */ String, /* value: */ String>>

// Returns an iterator allowing to go through all keys of the key/value pairs contained in this object.
    fun keys(): IterableIterator<String>

// Returns an iterator allowing to go through all values of the key/value pairs contained in this object.
    fun values(): IterableIterator<String>
}
