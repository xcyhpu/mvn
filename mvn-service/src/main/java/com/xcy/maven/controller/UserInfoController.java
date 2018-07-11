package com.xcy.maven.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.xcy.maven.facade.api.IUserInfoService;

/**
 * Created by xuchunyang on 2018/7/10 11点13分
 */
@Controller
public class UserInfoController {

    @Resource
    private IUserInfoService userInfoService;

    @ResponseBody
    @RequestMapping(value = "/hello")
    public Object sayHello() {

        return userInfoService.getUserInfo(1l);

    }

}
