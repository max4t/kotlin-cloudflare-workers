// Automatically generated - do not modify!

package cloudflare.workers.types.index

// Copyright (c) 2022-2025 Cloudflare, Inc.
// Licensed under the Apache 2.0 license found in the LICENSE file or at:
//     https://opensource.org/licenses/Apache-2.0
/**
 * Artifacts — Git-compatible file storage on Cloudflare Workers.
 *
 * Provides programmatic access to create, manage, and fork repositories,
 * and to issue and revoke scoped access tokens.
 */

/** Information about a repository. */
external interface ArtifactsRepoInfo {
/** Unique repository ID. */
    var id: String

/** Repository name. */
    var name: String

/** Repository description, or null if not set. */
    var description: String?

/** Default branch name (e.g. "main"). */
    var defaultBranch: String

/** ISO 8601 creation timestamp. */
    var createdAt: String

/** ISO 8601 last-updated timestamp. */
    var updatedAt: String

/** ISO 8601 timestamp of the last push, or null if never pushed. */
    var lastPushAt: String?

/** Fork source (e.g. "github:owner/repo", "artifacts:namespace/repo"), or null if not a fork. */
    var source: String?

/** Whether the repository is read-only. */
    var readOnly: Boolean

/** HTTPS git remote URL. */
    var remote: String
}
