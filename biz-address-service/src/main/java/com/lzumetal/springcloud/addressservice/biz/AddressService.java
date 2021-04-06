package com.lzumetal.springcloud.addressservice.biz;

import com.lzumetal.springcloud.addressservice.entity.Address;
import org.springframework.stereotype.Service;

/**
 * @author liaosi
 * @date 2021-02-24
 */
@Service
public class AddressService {

    public static Address findByUserId(Long userId) {
        if (userId == null || userId <= 0) {
            return null;
        }
        Address address = new Address();
        address.setUserId(userId);
        address.setProvince("北京市");
        address.setCity("北京市");
        address.setDistrict("海淀区");
        address.setDetailAddr("知春路1号");
        return address;
    }
}
