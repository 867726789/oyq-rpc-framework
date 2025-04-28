package org.oyq.registry;



import org.oyq.extension.SPI;
import org.oyq.remoting.dto.RpcRequest;

import java.net.InetSocketAddress;

/**
 * 服务发现
 */
@SPI
public interface ServiceDiscovery {
    /**
     *
     * @param rpcRequest Rpc服务请求
     * @return 服务地址
     */
    InetSocketAddress lookupService(RpcRequest rpcRequest);
}
