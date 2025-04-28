package org.oyq.remoting.transport;

import org.oyq.extension.SPI;
import org.oyq.remoting.dto.RpcRequest;

/**
 * RPC 请求传输接口（SPI 扩展点）.
 * 定义统一的 RPC 请求发送规范，支持通过 SPI 机制实现多种传输协议（如 Netty、Socket）.
 *
 * <p>实现类需在 META-INF/services 下提供扩展配置</p>
 *
 * @author oyq
 * @since 1.0
 */
@SPI
public interface RpcRequestTransport {


    Object sendRpcRequest(RpcRequest rpcRequest);

}
