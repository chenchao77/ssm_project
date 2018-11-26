package com.zking.ssm_project.ly.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 对应数据库菜单表ly_menus的实体类
 */
public class Ly_Menus implements Serializable {

    /**
     * 菜单编号
     */
    private String mId;

    /**
     * 菜单名称
     */
    private String mName;

    /**
     * 父级编号
     */
    private String pId;

    /**
     * 显示顺序
     */
    private String byNumber;

    /**
     * 图片
     */
    private String iconCls;

    /**
     * 路径
     */
    private String murl;

    /**
     * 子级菜单集合
     */
    private List<Ly_Menus> children;

    /**
     * 无参构造方法
     */
    public Ly_Menus() {
    }

    /**
     * 有参构造方法
     *
     * @param mId      菜单编号
     * @param mName    菜单名称
     * @param pId      父级编号
     * @param byNumber 显示顺序
     * @param iconCls  图片
     * @param murl     地址
     * @param children 级菜单集合
     */
    public Ly_Menus(String mId, String mName, String pId, String byNumber, String iconCls, String murl, List<Ly_Menus> children) {
        this.mId = mId;
        this.mName = mName;
        this.pId = pId;
        this.byNumber = byNumber;
        this.iconCls = iconCls;
        this.murl = murl;
        this.children = children;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getByNumber() {
        return byNumber;
    }

    public void setByNumber(String byNumber) {
        this.byNumber = byNumber;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getMurl() {
        return murl;
    }

    public void setMurl(String murl) {
        this.murl = murl;
    }

    public List<Ly_Menus> getChildren() {
        return children;
    }

    public void setChildren(List<Ly_Menus> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Ly_Menus{" +
                "mId='" + mId + '\'' +
                ", mName='" + mName + '\'' +
                ", pId='" + pId + '\'' +
                ", byNumber='" + byNumber + '\'' +
                ", iconCls='" + iconCls + '\'' +
                ", murl='" + murl + '\'' +
                ", children=" + children +
                '}';
    }
}
