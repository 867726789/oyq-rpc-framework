package org.oyq.remoting.transport.socket;

import org.oyq.exception.RpcException;
import org.oyq.remoting.dto.RpcRequest;
import org.oyq.remoting.dto.RpcResponse;
import org.oyq.remoting.transport.RpcRequestTransport;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * 基于Socket的RPC客户端实现
 * 通过TCP连接发送RPC请求并接收响应
 *
 * @author oyq
 * @since 1.0
 */
public class SocketRpcClient implements RpcRequestTransport {

    /**
     * 默认服务端地址（本机环回地址）
     */
    private static final InetSocketAddress DEFAULT_SERVER_ADDRESS =
            new InetSocketAddress("127.0.0.1", 8080);

    /**
     * 发送RPC请求到服务端
     *
     * @param rpcRequest RPC请求对象，包含方法调用信息
     * @return 远程调用结果
     * @throws RpcException 当网络通信或反序列化失败时抛出
     */
    @Override
    public Object sendRpcRequest(RpcRequest rpcRequest) {
        try (Socket socket = new Socket()) {
            // 1. 建立Socket连接
            socket.connect(DEFAULT_SERVER_ADDRESS);

            // 2. 序列化请求对象
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(rpcRequest);

            // 3. 获取并反序列化响应
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            return inputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RpcException("RPC服务调用失败: " + e.getMessage(), e);
        }
    }

}