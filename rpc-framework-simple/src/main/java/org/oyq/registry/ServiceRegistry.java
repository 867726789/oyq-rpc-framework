package org.oyq.registry;

import org.oyq.extension.SPI;

import java.net.InetSocketAddress;

@SPI
public interface ServiceRegistry {

    void registerService(String rpcServiceName, InetSocketAddress inetSocketAddress);
}
