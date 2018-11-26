package com.zking.ssm_project.ly.controller;

import com.zking.ssm_project.ly.pojo.Ly_Users;
import com.zking.ssm_project.ly.service.ILy_UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 对应数据库用户表ly_users的controller包的数据交互类
 */
@Controller
@RequestMapping("ly")
public class Ly_UsersController {

    @Resource(name = "ILy_UsersService")//得到IT_userService的bean
    protected ILy_UsersService iLy_usersService;

    /**
     * 用户登录的方法
     *
     * @return
     */
    @RequestMapping("ly_UsersLogin")
    public String ly_UsersLogin(Ly_Users ly_users) {
        if (iLy_usersService.ly_UsersLogin(ly_users) != null) {
            return "index";
        }
        return "404";
    }

}
