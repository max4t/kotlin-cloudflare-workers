// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * The interface for "version_metadata" binding
 * providing metadata about the Worker Version using this binding.
 */
external interface WorkerVersionMetadata {
/** The ID of the Worker Version using this binding */
    var id: String

/** The tag of the Worker Version using this binding */
    var tag: String

/** The timestamp of when the Worker Version was uploaded */
    var timestamp: String
}
