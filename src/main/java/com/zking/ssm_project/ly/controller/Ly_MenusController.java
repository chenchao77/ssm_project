package com.zking.ssm_project.ly.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zking.ssm_project.ly.pojo.Ly_Menus;
import com.zking.ssm_project.ly.service.ILy_MenusService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 对应数据库菜单表ly_menus的controller包的数据交互类
 */
@Controller
@RequestMapping("ly")
public class Ly_MenusController {

    @Resource(name = "ILy_MenusService")//得到ILy_MenusService的bean
    private ILy_MenusService iLy_menusService;

    /**
     * 查询所有父级菜单和子级菜单的方法
     *
     * @return
     */
    @RequestMapping("findLy_MenusParentAll")//访问路径
    @ResponseBody//JSON格式
    public String findLy_MenusParentAll() throws Exception {
        System.out.println("进来了菜单");
        //得到父级和子级菜单的集合信息
        List<Ly_Menus> ly_menusList = iLy_menusService.findLy_MenusParentAll();
        System.out.println("集合：" + ly_menusList);
        //创建map集合
        Map map = new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", 100);
        map.put("data", ly_menusList);
        //创建ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        String outStr = objectMapper.writeValueAsString(map);//这里需要抛出异常
        return outStr;
    }

}
