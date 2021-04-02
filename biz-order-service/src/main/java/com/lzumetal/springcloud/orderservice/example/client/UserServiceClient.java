package com.lzumetal.springcloud.orderservice.example.client;

import com.lzumetal.cloud.common.resp.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liaosi
 * @date 2021-04-02
 */
@FeignClient(name = "biz-user-service")
public interface UserServiceClient {

    @GetMapping(value = "/user/getById")
    ResponseData getById(@RequestParam("id") int id);
}