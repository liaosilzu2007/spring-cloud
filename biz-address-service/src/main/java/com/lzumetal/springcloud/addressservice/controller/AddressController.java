package com.lzumetal.springcloud.addressservice.controller;

import com.lzumetal.cloud.common.resp.ResponseData;
import com.lzumetal.springcloud.addressservice.biz.AddressService;
import com.lzumetal.springcloud.addressservice.entity.Address;
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
@RequestMapping(value = "/address", method = {RequestMethod.GET, RequestMethod.POST})
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping("/getByUserId")
    public ResponseData getUserById(@RequestParam Long UserId) {
        Address address = AddressService.findByUserId(UserId);
        log.info("地址|查询用户地址|UserId={}|{}", UserId, address);
        return ResponseData.data(address);
    }


    @RequestMapping("/addNew")
    public ResponseData modifyNickname(Address address) {
        log.info("地址|新增地址|{}", address);
        return ResponseData.success();
    }


}
