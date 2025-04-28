package org.oyq.remoting.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;


/**
 * RPC 请求传输对象.
 * 封装远程方法调用的所有必要信息，包括目标接口、方法名、参数等.
 *

 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RpcRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = -5030733858575608441L;
    /**
     * 请求唯一标识（UUID格式）.
     * 用于匹配请求和响应，避免多请求混淆.
     */
    private String requestId;

    /**
     * 目标接口的全限定名.
     * 示例: org.oyq.service.UserService
     */
    private String interfaceName;

    /**
     * 调用的方法名.
     * 示例: getUserById
     */
    private String methodName;

    /**
     * 方法参数值数组.
     * 需与 {@link #paramTypes} 顺序一一对应.
     */
    private Object[] parameters;

    /**
     * 方法参数类型数组.
     * 用于服务端反序列化时确定参数类型.
     */
    private Class<?>[] paramTypes;

    /**
     * 服务版本号（语义化版本格式）.
     * 示例: 1.0.0
     */
    private String version;

    /**
     * 服务分组标识.
     * 用于区分同一接口的不同实现组.
     */
    private String group;

    /**
     * 获取完整的RPC服务名称.
     * 格式: interfaceName + group + version
     *
     * @return 服务唯一标识，示例: org.oyq.service.UserServiceGroupA1.0.0
     */
    public String getRpcServiceName() {
        return this.getInterfaceName() + this.getGroup() + this.getVersion();
    }
}
