package com.zking.ssm_project.ly.service;

import com.zking.ssm_project.ly.pojo.Ly_Menus;

import java.util.List;

/**
 * 对应数据库菜单表ly_menus的service包的接口
 */
public interface ILy_MenusService {

    /**
     * 查询所有父级菜单
     *
     * @return
     */
    public List<Ly_Menus> findLy_MenusParentAll();

    /**
     * 查询所有子级菜单
     *
     * @param pid
     * @return
     */
    public List<Ly_Menus> findLy_MenusChildrenAll(String pid);


}
