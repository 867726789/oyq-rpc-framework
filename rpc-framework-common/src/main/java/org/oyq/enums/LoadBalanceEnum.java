package org.oyq.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 负载均衡枚举
 * @author oyq
 * @since 1
 */
@AllArgsConstructor
@Getter
public enum LoadBalanceEnum {

    LOADBALANCE("loadBalance");

    private final String name;
}
