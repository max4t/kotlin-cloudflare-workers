// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface SecretsStoreSecret {
/**
     * Get a secret from the Secrets Store, returning a string of the secret value
     * if it exists, or throws an error if it does not exist
     */
    fun get(): js.promise.Promise<String>
}
