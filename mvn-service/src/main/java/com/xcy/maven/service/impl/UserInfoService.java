package com.xcy.maven.service.impl;

import com.xcy.maven.facade.api.IUserInfoService;
import org.springframework.stereotype.Service;
import com.xcy.maven.facade.api.model.User;

/**
 * Created by xuchunyang on 2018/7/10 10点46分
 */
@Service
public class UserInfoService implements IUserInfoService {


    @Override
    public User getUserInfo(Long userId) {
        User user = new User();
        user.setAge(10);
        user.setName("XuChunyang");
        user.setSex("Male");
        user.setSex("Female");
        return user;
    }
}
