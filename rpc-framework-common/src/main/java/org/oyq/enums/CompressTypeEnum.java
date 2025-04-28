package org.oyq.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 压缩算法类型枚举.
 * 定义支持的压缩算法及其编码标识.
 *

 */
@AllArgsConstructor
@Getter
public enum CompressTypeEnum {

    GZIP((byte) 0x01, "gzip");

    private final byte code;
    private final String name;

    public static String getName(byte code) {
        for (CompressTypeEnum c : CompressTypeEnum.values()) {
            if (c.getCode() == code) {
                return c.name;
            }
        }
        return null;
    }

}
