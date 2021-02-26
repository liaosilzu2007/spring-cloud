package com.lzumetal.springcloud.addressservice.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author liaosi
 * @date 2021-02-24
 */
@Getter
@Setter
@ToString
public class Address implements Serializable {

    private Long userId;

    private String province;

    private String city;

    private String district;

    private String detailAddr;

}
