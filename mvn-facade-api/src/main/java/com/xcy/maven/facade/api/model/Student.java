package com.xcy.maven.facade.api.model;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by xuchunyang on 2018/7/17 15点36分
 */
public class Student extends User {

    private String stu_no;

    private int group_no;

    private String group_name;


    public String getStu_no() {
        return stu_no;
    }

    public void setStu_no(String stu_no) {
        this.stu_no = stu_no;
    }

    public int getGroup_no() {
        return group_no;
    }

    public void setGroup_no(int group_no) {
        this.group_no = group_no;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
