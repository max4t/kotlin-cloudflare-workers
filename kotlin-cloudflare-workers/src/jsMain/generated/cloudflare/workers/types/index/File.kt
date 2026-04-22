// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`File`** interface provides information about files and allows JavaScript in a web page to access their content.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File)
 */
external class File : web.blob.Blob {
    constructor (
        bits: js.array.ReadonlyArray<(Any /* (ArrayBuffer | ArrayBufferView) | string | Blob */)>?,
        name: String,
        options: FileOptions = definedExternally,
    )

/**
     * The **`name`** read-only property of the File interface returns the name of the file represented by a File object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/name)
     */
    val name: String

/**
     * The **`lastModified`** read-only property of the File interface provides the last modified date of the file as the number of milliseconds since the Unix epoch (January 1, 1970 at midnight).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/lastModified)
     */
    val lastModified: Double
}
