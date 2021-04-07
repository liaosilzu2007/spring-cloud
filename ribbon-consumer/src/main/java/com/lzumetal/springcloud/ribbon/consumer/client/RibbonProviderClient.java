package com.lzumetal.springcloud.ribbon.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liaosi
 * @date 2021-04-06
 */
@FeignClient(name = "ribbon-provider", path = "/ribbonProvider")
public interface RibbonProviderClient {

    @GetMapping("/hello")
    String hello();

}
