package org.oyq;

import org.oyq.annotation.RpcScan;
import org.oyq.remoting.transport.RpcServer;
import org.oyq.serviceimpl.HelloServiceImpl;
import org.oyq.config.RpcServiceConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RpcScan(basePackage = {"org.oyq"})
public class RpcServerMain {
    public static void main(String[] args) {
        // 注解自动注册
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(RpcServerMain.class);
        RpcServer rpcServer = (RpcServer) applicationContext.getBean("socketRpcServer");
        // 手动注册
        HelloService helloService2 = new HelloServiceImpl();
        RpcServiceConfig rpcServiceConfig = RpcServiceConfig.builder()
                .group("test1").version("version1").service(helloService2).build();
        rpcServer.registerService(rpcServiceConfig);
        rpcServer.start();
    }
}
