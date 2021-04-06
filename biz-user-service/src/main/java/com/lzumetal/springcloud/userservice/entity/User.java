package com.lzumetal.springcloud.userservice.entity;


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
public class User implements Serializable {

    private Long id;

    private String nickname;

    private String loginName;

}
