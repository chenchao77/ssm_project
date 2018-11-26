package com.zking.ssm_project.ly.pojo;

import java.io.Serializable;

/**
 * 对应数据库角色表ly_roles的实体类
 */
public class Ly_Roles implements Serializable {

    /**
     * 角色编号
     */
    private String rId;

    /**
     * 角色名称
     */
    private String rName;

    /**
     * 无参构造方法
     */
    public Ly_Roles() {
    }

    /**
     * 有参构造方法
     *
     * @param rId   角色编号
     * @param rName 角色名称
     */
    public Ly_Roles(String rId, String rName) {
        this.rId = rId;
        this.rName = rName;
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    @Override
    public String toString() {
        return "Ly_Roles{" +
                "rId='" + rId + '\'' +
                ", rName='" + rName + '\'' +
                '}';
    }
}
