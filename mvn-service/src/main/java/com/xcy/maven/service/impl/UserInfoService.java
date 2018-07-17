package com.xcy.maven.service.impl;

import com.xcy.maven.dao.IUserInfoDao;
import com.xcy.maven.facade.api.IUserInfoService;
import com.xcy.maven.facade.api.model.Student;
import org.codehaus.jackson.map.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.xcy.maven.facade.api.model.User;

import javax.annotation.Resource;

/**
 * Created by xuchunyang on 2018/7/10 10点46分
 */
@Service
public class UserInfoService implements IUserInfoService {


    @Resource
    private IUserInfoDao userInfoDao;

    @Override
    public User getUserInfo(Long userId) {
        User user = userInfoDao.fetchUserInfoById(userId);
        Student student = new Student();

        BeanUtils.copyProperties(user, student);
        student.setStu_no("123345");
        student.setGroup_no(1);
        student.setGroup_name("高三（1）班");

        return student;
    }
}
