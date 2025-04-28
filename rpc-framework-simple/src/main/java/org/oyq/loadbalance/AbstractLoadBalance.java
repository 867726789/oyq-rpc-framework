package org.oyq.loadbalance;

import org.oyq.remoting.dto.RpcRequest;
import org.oyq.utils.CollectionUtil;

import java.util.List;

/**
 * 负载均衡抽象类
 *
 */
public abstract class AbstractLoadBalance implements LoadBalance {

    @Override
    public String selectServiceAddress(List<String> serviceAddresses, RpcRequest rpcRequest) {
        // 首先进行简单逻辑判断
        if (CollectionUtil.isEmpty(serviceAddresses)) {
            return null;
        }
        if (serviceAddresses.size() == 1) {
            return serviceAddresses.get(0);
        }
        // 实际负载均衡
        return doSelect(serviceAddresses, rpcRequest);
    }

    protected abstract String doSelect(List<String> serviceAddresses, RpcRequest rpcRequest);

}
