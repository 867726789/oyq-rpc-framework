package org.oyq.loadbalance.loadbalancer;

import org.oyq.loadbalance.AbstractLoadBalance;
import org.oyq.remoting.dto.RpcRequest;

import java.util.List;
import java.util.Random;

public class RadomLoadBalance extends AbstractLoadBalance {

    @Override
    protected String doSelect(List<String> serviceAddresses, RpcRequest rpcRequest) {
        Random  random = new Random();
        int index = random.nextInt(serviceAddresses.size());
        return serviceAddresses.get(index);
    }
}
