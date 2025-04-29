package org.oyq;

import org.oyq.serviceimpl.HelloServiceImpl;
import org.oyq.remoting.transport.socket.SocketRpcServer;
import org.oyq.config.RpcServiceConfig;

public class SocketServerMain {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        SocketRpcServer socketRpcServer = new SocketRpcServer();
        RpcServiceConfig rpcServiceConfig = new RpcServiceConfig();
        rpcServiceConfig.setService(helloService);
        socketRpcServer.registerService(rpcServiceConfig);
        socketRpcServer.start();
    }
}
