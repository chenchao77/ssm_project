package com.zking.ssm_project.ly.pojo;

import java.io.Serializable;

/**
 * 对应数据库用户表ly_users的实体类
 */
public class Ly_Users implements Serializable {

    /**
     * 用户编号
     */
    private String uId;

    /**
     * 用户姓名
     */
    private String uName;

    /**
     * 用户密码
     */
    private String uPassword;

    /**
     * 用户性别
     */
    private String uSex;

    /**
     * 出生日期
     */
    private String uBirthday;

    /**
     * 联系电话
     */
    private String uPhone;

    /**
     * 无参构造方法
     */
    public Ly_Users() {
    }

    /**
     * 有参构造方法
     *
     * @param uId       用户编号
     * @param uName     用户名称
     * @param uPassword 用户密码
     * @param uSex      用户性别
     * @param uBirthday 出生日期
     * @param uPhone    联系电话
     */
    public Ly_Users(String uId, String uName, String uPassword, String uSex, String uBirthday, String uPhone) {
        this.uId = uId;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uSex = uSex;
        this.uBirthday = uBirthday;
        this.uPhone = uPhone;
    }

    //封装
    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public String getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(String uBirthday) {
        this.uBirthday = uBirthday;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    @Override
    public String toString() {
        return "Ly_Users{" +
                "uId='" + uId + '\'' +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uSex='" + uSex + '\'' +
                ", uBirthday='" + uBirthday + '\'' +
                ", uPhone='" + uPhone + '\'' +
                '}';
    }
}
