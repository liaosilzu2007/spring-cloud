package com.lzumetal.springcloud.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author liaosi
 * @date 2021-04-15
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {



    @RequestMapping("/hello")
    //通过HystrixCommand注解，手动指定一个降级方法，出现异常后会调用该降级方法
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello(@RequestParam String name) throws Exception {
        if ("zhangsan".equals(name)) {
            return String.format("hello %s !", name);
        } else {
            throw new Exception();
        }
    }


    /**
     * 出错后会调用该降级方法，返回指定的信息
     *
     * @param name
     * @return
     */
    public String helloFallback(String name) {
        return "this username is not exist ";
    }

}
