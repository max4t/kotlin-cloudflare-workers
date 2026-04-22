// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * Hello World binding to serve as an explanatory example. DO NOT USE
 */
external interface HelloWorldBinding {
/**
     * Retrieve the current stored value
     */
    fun get(): js.promise.Promise<Temp123>

/**
     * Set a new stored value
     */
    fun set(value: String): js.promise.Promise<js.core.Void>
}
