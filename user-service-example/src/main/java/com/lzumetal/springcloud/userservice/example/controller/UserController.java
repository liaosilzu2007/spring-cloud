package com.lzumetal.springcloud.userservice.example.controller;

import com.lzumetal.cloud.common.resp.ResponseData;
import com.lzumetal.springcloud.userservice.example.biz.UserService;
import com.lzumetal.springcloud.userservice.example.entity.User;
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


    @RequestMapping("/getUserById")
    public ResponseData getUserById(@RequestParam Long id) {
        User user = userService.getById(id);
        log.info("用户|查询用户|id={}|{}", id, user);
        return ResponseData.data(user);
    }


    @RequestMapping("/modifyNickname")
    public ResponseData modifyNickname(@RequestParam Long id, @RequestParam String nickname) {
        log.info("用户|修改昵称|id={},nickname={}", id, nickname);
        return ResponseData.success();
    }


}
