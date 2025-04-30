package org.oyq.remoting.transport;

import org.oyq.config.RpcServiceConfig;

public interface RpcServer {

    int PORT = 9090;

    void registerService(RpcServiceConfig rpcServiceConfig);

    void start();
}
