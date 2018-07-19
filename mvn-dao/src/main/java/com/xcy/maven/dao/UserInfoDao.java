package com.xcy.maven.dao;

import com.xcy.maven.facade.api.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by xuchunyang on 2018/7/17 11点29分
 */
@Repository
public class UserInfoDao implements IUserInfoDao {

    @Override
    public User fetchUserInfoById(Long userId) {

        User user = new User();

        user.setSex("男");
        user.setName("Tomcat");
        user.setAge(30);

        user.setSex("女");
        user.setName("Jetty");
        user.setAge(27);

        user.setName("Terry");
        user.setAge(101);

        return user;
    }
}
