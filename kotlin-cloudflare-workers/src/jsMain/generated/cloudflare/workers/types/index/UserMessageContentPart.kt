// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * Permissive merged content part used inside UserMessage arrays.
 *
 * Cabidela has a limitation where anyOf/oneOf with enum-based discrimination
 * inside nested array items does not correctly match different branches for
 * different array elements, so the schema uses a single merged object.
 */
external interface UserMessageContentPart {
    var type: UserMessageContentPartType
    var text: String?
    var image_url: (UserMessageContentPartImage_url)?
    var input_audio: (UserMessageContentPartInput_audio)?
    var file: (UserMessageContentPartFile)?
}
