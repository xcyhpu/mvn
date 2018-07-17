package com.xcy.maven.dao;

import com.xcy.maven.facade.api.model.User;

/**
 * Created by xuchunyang on 2018/7/10 10点06分
 */
public interface IUserInfoDao {


    public User fetchUserInfoById(Long userId);

}
