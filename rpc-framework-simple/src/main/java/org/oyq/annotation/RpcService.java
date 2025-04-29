package org.oyq.annotation;


import java.lang.annotation.*;

/**
 * RPC服务
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface RpcService {

    /**
     * 服务版本号
     */
    String version() default "";

    /**
     * 服务组
     */
    String group() default "";

}
