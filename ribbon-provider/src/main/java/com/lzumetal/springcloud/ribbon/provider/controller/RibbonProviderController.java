package com.lzumetal.springcloud.ribbon.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author liaosi
 * @date 2021-04-06
 */
@RestController
@RequestMapping(value = "/ribbonProvider", method = {RequestMethod.GET, RequestMethod.POST})
public class RibbonProviderController {


    @RequestMapping(value = "/hello")
    public String hello(HttpServletRequest request) {
        int serverPort = request.getServerPort();
        return "hello, this is Ribbon Provider service, from port : " + serverPort;
    }

}
