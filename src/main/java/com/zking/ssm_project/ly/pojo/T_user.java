package com.zking.ssm_project.ly.pojo;

import java.io.Serializable;

/**
 * 对应数据库用户表t_user的实体类
 */
public class T_user implements Serializable {

    /**
     * 用户编号
     */
    private String uid;

    /**
     * 用户名称
     */
    private String uname;

    /**
     * 用户密码
     */
    private String upassword;

    public T_user() {
    }

    public T_user(String uid, String uname, String upassword) {
        this.uid = uid;
        this.uname = uname;
        this.upassword = upassword;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    @Override
    public String toString() {
        return "T_user{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                '}';
    }
}
