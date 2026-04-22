// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * Feature flags binding for evaluating feature flags from a Cloudflare Workers script.
 *
 * @example
 * ```typescript
 * // Get a boolean flag value with a default
 * const enabled = await env.FLAGS.getBooleanValue('my-feature', false);
 *
 * // Get a flag value with evaluation context for targeting
 * const variant = await env.FLAGS.getStringValue('experiment', 'control', {
 *   userId: 'user-123',
 *   country: 'US',
 * });
 *
 * // Get full evaluation details including variant and reason
 * const details = await env.FLAGS.getBooleanDetails('my-feature', false);
 * console.log(details.variant, details.reason);
 * ```
 */
abstract external class Flagship {
/**
     * Get a flag value without type checking.
     * @param flagKey The key of the flag to evaluate.
     * @param defaultValue Optional default value returned when evaluation fails.
     * @param context Optional evaluation context for targeting rules.
     */
    fun get(
        flagKey: String,
        defaultValue: Any? = definedExternally,
        context: FlagshipEvaluationContext = definedExternally,
    ): js.promise.Promise<Any?>

/**
     * Get a boolean flag value.
     * @param flagKey The key of the flag to evaluate.
     * @param defaultValue Default value returned when evaluation fails or the flag type does not match.
     * @param context Optional evaluation context for targeting rules.
     */
    fun getBooleanValue(
        flagKey: String,
        defaultValue: Boolean,
        context: FlagshipEvaluationContext = definedExternally,
    ): js.promise.Promise<Boolean>

/**
     * Get a string flag value.
     * @param flagKey The key of the flag to evaluate.
     * @param defaultValue Default value returned when evaluation fails or the flag type does not match.
     * @param context Optional evaluation context for targeting rules.
     */
    fun getStringValue(
        flagKey: String,
        defaultValue: String,
        context: FlagshipEvaluationContext = definedExternally,
    ): js.promise.Promise<String>

/**
     * Get a number flag value.
     * @param flagKey The key of the flag to evaluate.
     * @param defaultValue Default value returned when evaluation fails or the flag type does not match.
     * @param context Optional evaluation context for targeting rules.
     */
    fun getNumberValue(
        flagKey: String,
        defaultValue: Double,
        context: FlagshipEvaluationContext = definedExternally,
    ): js.promise.Promise<Double>

/**
     * Get an object flag value.
     * @param flagKey The key of the flag to evaluate.
     * @param defaultValue Default value returned when evaluation fails or the flag type does not match.
     * @param context Optional evaluation context for targeting rules.
     */
    fun <T : Any> getObjectValue(
        flagKey: String,
        defaultValue: T,
        context: FlagshipEvaluationContext = definedExternally,
    ): js.promise.Promise<T>

/**
     * Get a boolean flag value with full evaluation details.
     * @param flagKey The key of the flag to evaluate.
     * @param defaultValue Default value returned when evaluation fails or the flag type does not match.
     * @param context Optional evaluation context for targeting rules.
     */
    fun getBooleanDetails(
        flagKey: String,
        defaultValue: Boolean,
        context: FlagshipEvaluationContext = definedExternally,
    ): js.promise.Promise<FlagshipEvaluationDetails<Boolean>>

/**
     * Get a string flag value with full evaluation details.
     * @param flagKey The key of the flag to evaluate.
     * @param defaultValue Default value returned when evaluation fails or the flag type does not match.
     * @param context Optional evaluation context for targeting rules.
     */
    fun getStringDetails(
        flagKey: String,
        defaultValue: String,
        context: FlagshipEvaluationContext = definedExternally,
    ): js.promise.Promise<FlagshipEvaluationDetails<String>>

/**
     * Get a number flag value with full evaluation details.
     * @param flagKey The key of the flag to evaluate.
     * @param defaultValue Default value returned when evaluation fails or the flag type does not match.
     * @param context Optional evaluation context for targeting rules.
     */
    fun getNumberDetails(
        flagKey: String,
        defaultValue: Double,
        context: FlagshipEvaluationContext = definedExternally,
    ): js.promise.Promise<FlagshipEvaluationDetails<Double>>

/**
     * Get an object flag value with full evaluation details.
     * @param flagKey The key of the flag to evaluate.
     * @param defaultValue Default value returned when evaluation fails or the flag type does not match.
     * @param context Optional evaluation context for targeting rules.
     */
    fun <T : Any> getObjectDetails(
        flagKey: String,
        defaultValue: T,
        context: FlagshipEvaluationContext = definedExternally,
    ): js.promise.Promise<FlagshipEvaluationDetails<T>>
}
