package com.xcy.maven.facade.api;

import com.xcy.maven.facade.api.model.User;

/**
 * Created by xuchunyang on 2018/7/10 10点05分
 */
public interface IUserInfoService {

    public User getUserInfo(Long userId);
}
