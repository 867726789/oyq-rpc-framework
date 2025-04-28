package org.oyq.remoting.dto;

import lombok.*;

/**
 * RPC 消息传输对象.
 * 用于封装网络传输中的消息头、序列化方式、压缩格式和业务数据.
 *
 * @author oyq
 * @since 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RpcMessage {

    /**
     * 消息类型 (1字节).
     * @see org.oyq.remoting.constants.RpcConstants#REQUEST_TYPE
     * @see org.oyq.remoting.constants.RpcConstants#RESPONSE_TYPE
     * @see org.oyq.remoting.constants.RpcConstants#HEARTBEAT_REQUEST_TYPE
     * @see org.oyq.remoting.constants.RpcConstants#HEARTBEAT_RESPONSE_TYPE
     */
    private byte messageType;

    /**
     * 序列化编解码器类型 (1字节).
     * @see org.oyq.enums.SerializationTypeEnum#KYRO
     * @see org.oyq.enums.SerializationTypeEnum#PROTOSTUFF
     * @see org.oyq.enums.SerializationTypeEnum#HESSIAN
     */
    private byte codec;

    /**
     * 压缩算法类型 (1字节).
     * @see org.oyq.enums.CompressTypeEnum#GZIP
     */
    private byte compress;

    /**
     * 请求ID (4字节)，用于匹配请求和响应.
     * 通过原子计数器生成，确保唯一性.
     */
    private int requestId;

    /**
     * 业务数据负载 (变长).
     */
    private Object data;
}