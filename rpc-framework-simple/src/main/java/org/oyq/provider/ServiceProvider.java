package org.oyq.provider;

import org.oyq.config.RpcServiceConfig;

/**
 * 保存服务
 */
public interface ServiceProvider {

    /**
     * @param rpcServiceConfig Rpc服务相关配置（版本，组，服务）
     */
    void addService(RpcServiceConfig rpcServiceConfig);

    /**
     * @param rpcServiceName Rpc服务名
     * @return service object
     */
    Object getService(String rpcServiceName);

    /**
     * @param rpcServiceConfig Rpc服务相关配置（版本，组，服务）
     */
    void publishService(RpcServiceConfig rpcServiceConfig);

}
