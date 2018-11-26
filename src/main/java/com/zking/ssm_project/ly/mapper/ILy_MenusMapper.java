package com.zking.ssm_project.ly.mapper;

import com.zking.ssm_project.ly.pojo.Ly_Menus;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 对应数据库菜单表ly_menus的mapper包的接口
 */
@Repository("ILy_MenusMapper")//创建ILy_MenusMapper的bean
public interface ILy_MenusMapper {

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
