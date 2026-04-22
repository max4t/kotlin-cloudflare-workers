// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface DispatchNamespace {
/**
     * @param name Name of the Worker script.
     * @param args Arguments to Worker script.
     * @param options Options for Dynamic Dispatch invocation.
     * @returns A Fetcher object that allows you to send requests to the Worker script.
     * @throws If the Worker script does not exist in this dispatch namespace, an error will be thrown.
     */
    fun get(
        name: String,
        args: js.objects.ReadonlyRecord<String, Any?> = definedExternally,
        options: DynamicDispatchOptions = definedExternally,
    ): Fetcher
}
