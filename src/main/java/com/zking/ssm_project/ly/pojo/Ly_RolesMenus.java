package com.zking.ssm_project.ly.pojo;

import java.io.Serializable;

/**
 * 对应数据库角色菜单表ly_rolesmenus的实体类
 */
public class Ly_RolesMenus implements Serializable {

    /**
     * 角色菜单编号
     */
    private String rmId;

    /**
     * 角色编号
     */
    private String rId;

    /**
     * 菜单编号
     */
    private String mId;

    /**
     * 无参构造方法
     */
    public Ly_RolesMenus() {
    }

    /**
     * 有参构造方法
     *
     * @param rmId 角色菜单编号
     * @param rId  角色编号
     * @param mId  菜单编号
     */
    public Ly_RolesMenus(String rmId, String rId, String mId) {
        this.rmId = rmId;
        this.rId = rId;
        this.mId = mId;
    }

    public String getRmId() {
        return rmId;
    }

    public void setRmId(String rmId) {
        this.rmId = rmId;
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    @Override
    public String toString() {
        return "Ly_RolesMenus{" +
                "rmId='" + rmId + '\'' +
                ", rId='" + rId + '\'' +
                ", mId='" + mId + '\'' +
                '}';
    }
}
