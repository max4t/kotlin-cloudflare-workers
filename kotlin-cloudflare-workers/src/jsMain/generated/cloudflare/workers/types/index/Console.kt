// Automatically generated - do not modify!

package cloudflare.workers.types.index

/* The **`console`** object provides access to the debugging console (e.g., the Web console in Firefox). *
 * The **`console`** object provides access to the debugging console (e.g., the Web console in Firefox).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console)
 */
external interface Console {
    fun assert(
        condition: Boolean = definedExternally,
        vararg data: Any?,
    ): Unit

/**
     * The **`console.clear()`** static method clears the console if possible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/clear_static)
     */
    fun clear(): Unit

/**
     * The **`console.count()`** static method logs the number of times that this particular call to `count()` has been called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/count_static)
     */
    fun count(label: String = definedExternally): Unit

/**
     * The **`console.countReset()`** static method resets counter used with console/count_static.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/countReset_static)
     */
    fun countReset(label: String = definedExternally): Unit

/**
     * The **`console.debug()`** static method outputs a message to the console at the 'debug' log level.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/debug_static)
     */
    fun debug(vararg data: Any?): Unit

/**
     * The **`console.dir()`** static method displays a list of the properties of the specified JavaScript object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/dir_static)
     */
    fun dir(
        item: Any? = definedExternally,
        options: Any? = definedExternally,
    ): Unit

/**
     * The **`console.dirxml()`** static method displays an interactive tree of the descendant elements of the specified XML/HTML element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/dirxml_static)
     */
    fun dirxml(vararg data: Any?): Unit

/**
     * The **`console.error()`** static method outputs a message to the console at the 'error' log level.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/error_static)
     */
    fun error(vararg data: Any?): Unit

/**
     * The **`console.group()`** static method creates a new inline group in the Web console log, causing any subsequent console messages to be indented by an additional level, until console/groupEnd_static is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/group_static)
     */
    fun group(vararg data: Any?): Unit

/**
     * The **`console.groupCollapsed()`** static method creates a new inline group in the console.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/groupCollapsed_static)
     */
    fun groupCollapsed(vararg data: Any?): Unit

/**
     * The **`console.groupEnd()`** static method exits the current inline group in the console.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/groupEnd_static)
     */
    fun groupEnd(): Unit

/**
     * The **`console.info()`** static method outputs a message to the console at the 'info' log level.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/info_static)
     */
    fun info(vararg data: Any?): Unit

/**
     * The **`console.log()`** static method outputs a message to the console.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/log_static)
     */
    fun log(vararg data: Any?): Unit

/**
     * The **`console.table()`** static method displays tabular data as a table.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/table_static)
     */
    fun table(
        tabularData: Any? = definedExternally,
        properties: js.array.ReadonlyArray<String> = definedExternally,
    ): Unit

/**
     * The **`console.time()`** static method starts a timer you can use to track how long an operation takes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/time_static)
     */
    fun time(label: String = definedExternally): Unit

/**
     * The **`console.timeEnd()`** static method stops a timer that was previously started by calling console/time_static.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/timeEnd_static)
     */
    fun timeEnd(label: String = definedExternally): Unit

/**
     * The **`console.timeLog()`** static method logs the current value of a timer that was previously started by calling console/time_static.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/timeLog_static)
     */
    fun timeLog(
        label: String = definedExternally,
        vararg data: Any?,
    ): Unit

    fun timeStamp(label: String = definedExternally): Unit

/**
     * The **`console.trace()`** static method outputs a stack trace to the console.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/trace_static)
     */
    fun trace(vararg data: Any?): Unit

/**
     * The **`console.warn()`** static method outputs a warning message to the console at the 'warning' log level.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/console/warn_static)
     */
    fun warn(vararg data: Any?): Unit
}
