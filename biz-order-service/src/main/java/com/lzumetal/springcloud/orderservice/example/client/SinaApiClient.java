package com.lzumetal.springcloud.orderservice.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liaosi
 * @date 2021-02-24
 */
@FeignClient(name = "hq-sinajs-client", url = "http://hq.sinajs.cn/")
public interface SinaApiClient {

    @GetMapping
    String getByCode(@RequestParam("list") String code);

}
