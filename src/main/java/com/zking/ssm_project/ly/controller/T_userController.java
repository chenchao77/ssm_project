package com.zking.ssm_project.ly.controller;

import com.zking.ssm_project.ly.pojo.T_user;
import com.zking.ssm_project.ly.service.IT_userService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 对应数据库用户表t_user的controller包的数据交互类
 */
@Controller
@RequestMapping("ly")
public class T_userController {

    @Resource(name = "IT_userService")//得到IT_userService的bean
    private IT_userService it_userService;

    /**
     * 用户登录的方法
     *
     * @return
     */
    @RequestMapping("t_userLogin")
    public String t_userLogin(T_user t_user) {
        System.out.println("进来了：" + t_user);
        if (it_userService.t_userLogin(t_user) != null) {
            return "index";
        }
        return "404";
    }

}
