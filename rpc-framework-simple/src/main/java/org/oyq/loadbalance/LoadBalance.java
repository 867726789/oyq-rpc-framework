package org.oyq.loadbalance;


import org.oyq.extension.SPI;
import org.oyq.remoting.dto.RpcRequest;

import java.util.List;

/**
 * 负载均衡策略接口
 */
@SPI
public interface LoadBalance {

    /**
     * 负载均衡选择一个服务地址
     *
     * @param serviceUrlList 服务地址列表
     * @param rpcRequest
     * @return 服务地址
     */
    String selectServiceAddress(List<String> serviceUrlList, RpcRequest rpcRequest);
}
