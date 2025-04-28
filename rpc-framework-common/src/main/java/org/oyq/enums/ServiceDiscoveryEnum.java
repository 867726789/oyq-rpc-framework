package org.oyq.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 发现中心枚举类型
 * @author oyq
 * @since 1
 */
@AllArgsConstructor
@Getter
public enum ServiceDiscoveryEnum {

    ZK("zk"),
    NACOS("nacos");

    private final String name;
}
