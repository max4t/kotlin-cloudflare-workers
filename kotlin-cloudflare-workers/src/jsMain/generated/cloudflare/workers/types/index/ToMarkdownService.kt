// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

abstract external class ToMarkdownService {
    fun transform(
        files: js.array.ReadonlyArray<MarkdownDocument>,
        options: ConversionRequestOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<ConversionResponse>>

    fun transform(
        files: MarkdownDocument,
        options: ConversionRequestOptions = definedExternally,
    ): js.promise.Promise<ConversionResponse>

    fun supported(): js.promise.Promise<js.array.ReadonlyArray<SupportedFileFormat>>
}
