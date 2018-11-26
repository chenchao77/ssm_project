package com.zking.ssm_project.ly.service.impl;

import com.zking.ssm_project.ly.mapper.ILy_MenusMapper;
import com.zking.ssm_project.ly.pojo.Ly_Menus;
import com.zking.ssm_project.ly.service.ILy_MenusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 对应数据库菜单表ly_menus的service包的实现类
 */
@Service("ILy_MenusService")//创建ILy_MenusService的bean
public class Ly_MenusServiceImpl implements ILy_MenusService {

    @Resource(name = "ILy_MenusMapper")//得到ILy_MenusMapper的bean
    private ILy_MenusMapper iLy_menusMapper;


    @Override
    public List<Ly_Menus> findLy_MenusParentAll() {
        return iLy_menusMapper.findLy_MenusParentAll();
    }

    @Override
    public List<Ly_Menus> findLy_MenusChildrenAll(String pid) {
        return iLy_menusMapper.findLy_MenusChildrenAll(pid);
    }
}
