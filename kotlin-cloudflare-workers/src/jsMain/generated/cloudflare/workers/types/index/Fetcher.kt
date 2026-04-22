// Automatically generated - do not modify!

package cloudflare.workers.types.index

typealias Fetcher<T : Rpc.EntrypointBranded? /* default is Nothing? */, Reserved : String /* default is Nothing */> = Any /* (T extends Rpc.EntrypointBranded ? Rpc.Provider<T, Reserved | "fetch" | "connect"> : unknown) & {
    fetch(input: RequestInfo | URL, init?: RequestInit): Promise<Response>;
    connect(address: SocketAddress | string, options?: SocketOptions): Socket;
} */
