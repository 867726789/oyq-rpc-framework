package org.oyq.annotation;


import java.lang.annotation.*;

/**
 * RPC 服务自动注入
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Inherited
public @interface RpcReference {

    /**
     * 服务版本号
     */
    String version() default "";

    /**
     * 服务组
     */
    String group() default "";

}
