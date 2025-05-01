package org.oyq;

import org.oyq.annotation.RpcReference;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RpcReference(version = "version2", group = "test2")
    private HelloService helloService;

    @RequestMapping("/test")
    public String test(@RequestBody Hello hello) {
        return helloService.hello(hello);
    }

//    public void test() throws InterruptedException {
//        String hello = this.helloService.hello(new Hello("111", "222"));
//        System.out.println(hello);
////        //如需使用 assert 断言，需要在 VM options 添加参数：-ea
////        assert "Hello description is 222".equals(hello);
////        Thread.sleep(12000);
////        for (int i = 0; i < 10; i++) {
////            System.out.println(helloService.hello(new Hello("111", "222")));
////        }
//    }

}
