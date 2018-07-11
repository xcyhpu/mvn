package com.xcy.maven.service.impl;

import com.xcy.maven.facade.api.IUserInfoService;

/**
 * Created by xuchunyang on 2018/7/10 10点46分
 */
public class UserInfoService implements IUserInfoService {

    @Override
    public String getUserInfo(Long userId) {
        return "Hello World";
    }
}
