package com.zking.ssm_project.ly.pojo;

import java.io.Serializable;

/**
 * 对应数据库用户角色表ly_usersroles的实体类
 */
public class Ly_UsersRoles implements Serializable {

    /**
     * 用户角色编号
     */
    private String urId;

    /**
     * 用户编号
     */
    private String uId;

    /**
     * 角色编号
     */
    private String rId;

    /**
     * 无参构造方法
     */
    public Ly_UsersRoles() {

    }

    /**
     * 有参构造方法
     *
     * @param urId 用户角色编号
     * @param uId  用户编号
     * @param rId  角色编号
     */
    public Ly_UsersRoles(String urId, String uId, String rId) {
        this.urId = urId;
        this.uId = uId;
        this.rId = rId;
    }

    public String getUrId() {
        return urId;
    }

    public void setUrId(String urId) {
        this.urId = urId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    @Override
    public String toString() {
        return "Ly_UsersRoles{" +
                "urId='" + urId + '\'' +
                ", uId='" + uId + '\'' +
                ", rId='" + rId + '\'' +
                '}';
    }
}
