package com.lzumetal.springcloud.apollo.Config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author liaosi
 * @date 2020-07-12
 */
@Getter
@Setter
@ToString
public class ConfigBean {

    //后面的100是指coupon_count取不到时的默认值
    @Value("${coupon_count:100}")
    private Long couponCount;

    @Value("${coupon_type:1}")
    private Integer type;

}
