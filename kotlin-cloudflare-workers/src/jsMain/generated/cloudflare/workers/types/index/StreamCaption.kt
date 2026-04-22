// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface StreamCaption {
/**
     * Whether the caption was generated via AI.
     */
    var generated: Boolean?

/**
     * The language label displayed in the native language to users.
     */
    var label: String

/**
     * The language tag in BCP 47 format.
     */
    var language: String

/**
     * The status of a generated caption.
     */
    var status: (StreamCaptionStatus)?
}
