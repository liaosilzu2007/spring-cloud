package com.lzumetal.springcloud.ribbon.consumer.controller;

import com.lzumetal.springcloud.ribbon.consumer.client.RibbonProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author liaosi
 * @date 2021-04-06
 */
@RestController
@RequestMapping(value = "/ribbonConsumer", method = {RequestMethod.GET, RequestMethod.POST})
public class RibbonConsumerController {

    @Autowired
    private RibbonProviderClient ribbonProviderClient;


    @RequestMapping(value = "/getHelloFromProvider")
    public String getHelloFromProvider() {
        return "getHelloFromProvider: " + ribbonProviderClient.hello();
    }


}
