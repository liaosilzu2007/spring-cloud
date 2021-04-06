package com.lzumetal.springcloud.userservice.controller;

import com.lzumetal.cloud.common.resp.ResponseData;
import com.lzumetal.springcloud.userservice.entity.User;
import com.lzumetal.springcloud.userservice.biz.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liaosi
 * @date 2021-02-24
 */
@Slf4j
@RestController
@RequestMapping(value = "/user", method = {RequestMethod.GET, RequestMethod.POST})
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("/getById")
    public ResponseData getById(@RequestParam Long id) {
        User user = userService.getById(id);
        log.info("用户|查询用户|id={}|{}", id, user);
        return ResponseData.data(user);
    }



    @RequestMapping("/getCoupon")
    public ResponseData getCoupon(@RequestParam Long userId, @RequestParam String type) {
        log.info("用户|查询用户的优惠券|userId={},type={}", userId, type);
        return ResponseData.success();
    }


}
