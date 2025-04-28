package org.oyq.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Rpc传输方式枚举类型
 * @author oyq
 * @since 1
 */
@AllArgsConstructor
@Getter
public enum RpcRequestTransportEnum {

    NETTY("netty"),
    SOCKET("socket");

    private final String name;
}
