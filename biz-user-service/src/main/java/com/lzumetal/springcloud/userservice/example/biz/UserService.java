package com.lzumetal.springcloud.userservice.example.biz;

import com.lzumetal.springcloud.userservice.example.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author liaosi
 * @date 2021-02-24
 */
@Service
public class UserService {


    public User getById(Long id) {
        if (id == null || id <= 0) {
            return null;
        }
        User user = new User();
        user.setId(id);
        user.setNickname("zhangsan");
        user.setLoginName("zhangsan@123.com");
        return user;
    }

}
