package org.oyq.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Rpc响应代码枚举类型
 * @author oyq
 * @since 1
 */
@AllArgsConstructor
@Getter
@ToString
public enum RpcResponseCodeEnum {

    SUCCESS(200, "远程调用成功"),
    FAIL(500, "远程调用失败");
    private final int code;

    private final String message;

}
