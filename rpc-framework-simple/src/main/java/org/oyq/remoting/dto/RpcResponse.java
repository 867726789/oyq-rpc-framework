package org.oyq.remoting.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.oyq.enums.RpcResponseCodeEnum;

import java.io.Serial;
import java.io.Serializable;

/**
 * RPC 响应通用封装类.
 * 用于统一封装远程调用的返回结果，包含状态码、消息和业务数据.
 *
 * @param <T> 响应体数据类型
 * @author oyq
 * @since 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RpcResponse<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 7216777645739233009L;

    /**
     * 请求唯一标识（UUID格式），需与请求端的 {@code requestId} 一致.
     */
    private String requestId;

    /**
     * 响应状态码.
     * @see RpcResponseCodeEnum
     */
    private Integer code;

    /**
     * 响应消息（通常用于错误描述）.
     */
    private String message;

    /**
     * 响应业务数据（泛型）.
     * 成功时返回业务对象，失败时为 null.
     */
    private T data;

    /**
     * 构建成功响应.
     *
     * @param data 业务数据
     * @param requestId 请求ID
     * @param <T> 响应体类型
     * @return 成功响应的 {@code RpcResponse} 实例
     * @see RpcResponseCodeEnum#SUCCESS
     */
    public static <T> RpcResponse<T> success(T data, String requestId) {
        RpcResponse<T> response = new RpcResponse<>();
        response.setCode(RpcResponseCodeEnum.SUCCESS.getCode());
        response.setMessage(RpcResponseCodeEnum.SUCCESS.getMessage());
        response.setRequestId(requestId);
        if (null != data) {
            response.setData(data);
        }
        return response;
    }

    /**
     * 构建失败响应.
     *
     * @param rpcResponseCodeEnum 错误状态枚举
     * @param <T> 响应体类型
     * @return 失败响应的 {@code RpcResponse} 实例
     * @see RpcResponseCodeEnum
     */
    public static <T> RpcResponse<T> fail(RpcResponseCodeEnum rpcResponseCodeEnum) {
        RpcResponse<T> response = new RpcResponse<>();
        response.setCode(rpcResponseCodeEnum.getCode());
        response.setMessage(rpcResponseCodeEnum.getMessage());
        return response;
    }


}
