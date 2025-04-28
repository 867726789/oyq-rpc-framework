package org.oyq.utils;

/**
 * 运行时状态工具类
 *
 * @author oyq
 * @since 1
 */
public class RuntimeUtil {
    /**
     * 获取CPU的核心数
     *
     * @return cpu的核心数
     */
    public static int cpus() {
        return Runtime.getRuntime().availableProcessors();
    }
}
