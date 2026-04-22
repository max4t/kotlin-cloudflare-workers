// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`FormData`** interface provides a way to construct a set of key/value pairs representing form fields and their values, which can be sent using the Window/fetch, XMLHttpRequest.send() or navigator.sendBeacon() methods.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData)
 */
external class FormData {
    constructor ()

/**
     * The **`append()`** method of the FormData interface appends a new value onto an existing key inside a `FormData` object, or adds the key if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/append)
     */
    fun append(
        name: String,
        value: String,
    ): Unit

/**
     * The **`append()`** method of the FormData interface appends a new value onto an existing key inside a `FormData` object, or adds the key if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/append)
     */
    fun append(
        name: String,
        value: web.blob.Blob,
    ): Unit

/**
     * The **`append()`** method of the FormData interface appends a new value onto an existing key inside a `FormData` object, or adds the key if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/append)
     */
    fun append(
        name: String,
        value: String,
    ): Unit

/**
     * The **`append()`** method of the FormData interface appends a new value onto an existing key inside a `FormData` object, or adds the key if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/append)
     */
    fun append(
        name: String,
        value: web.blob.Blob,
        filename: String = definedExternally,
    ): Unit

/**
     * The **`delete()`** method of the FormData interface deletes a key and its value(s) from a `FormData` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/delete)
     */
    fun delete(name: String): Unit

/**
     * The **`get()`** method of the FormData interface returns the first value associated with a given key from within a `FormData` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/get)
     */
    fun get(name: String): String?

/**
     * The **`getAll()`** method of the FormData interface returns all the values associated with a given key from within a `FormData` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/getAll)
     */
    fun getAll(name: String): js.array.ReadonlyArray<String>

/**
     * The **`has()`** method of the FormData interface returns whether a `FormData` object contains a certain key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/has)
     */
    fun has(name: String): Boolean

/**
     * The **`set()`** method of the FormData interface sets a new value for an existing key inside a `FormData` object, or adds the key/value if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/set)
     */
    fun set(
        name: String,
        value: String,
    ): Unit

/**
     * The **`set()`** method of the FormData interface sets a new value for an existing key inside a `FormData` object, or adds the key/value if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/set)
     */
    fun set(
        name: String,
        value: web.blob.Blob,
    ): Unit

/**
     * The **`set()`** method of the FormData interface sets a new value for an existing key inside a `FormData` object, or adds the key/value if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/set)
     */
    fun set(
        name: String,
        value: String,
    ): Unit

/**
     * The **`set()`** method of the FormData interface sets a new value for an existing key inside a `FormData` object, or adds the key/value if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/set)
     */
    fun set(
        name: String,
        value: web.blob.Blob,
        filename: String = definedExternally,
    ): Unit

// Returns an array of key, value pairs for every entry in the list.
    fun entries(): IterableIterator<js.array.Tuple2</* key: */ String, /* value: */ String>>

// Returns a list of keys in the list.
    fun keys(): IterableIterator<String>

// Returns a list of values in the list.
    fun values(): IterableIterator<Any /* File | string */>

    fun <This /* default is Any? */> forEach(callback: (/* this: This, */ value: String, key: String, parent: web.form.FormData) -> Unit, thisArg: This = definedExternally): Unit
}
