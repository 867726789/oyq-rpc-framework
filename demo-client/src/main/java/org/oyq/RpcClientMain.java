package org.oyq;

import org.oyq.annotation.RpcScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RpcScan(basePackage = {"org.oyq"})
@SpringBootApplication
public class RpcClientMain {
    public static void main(String[] args) {
        SpringApplication.run(RpcClientMain.class, args);
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(RpcClientMain.class);
//        HelloController helloController = (HelloController) applicationContext.getBean("helloController");
//        helloController.test();
    }
}
