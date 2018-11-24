package com.zking.ssm_project.ly.service;

import com.zking.ssm_project.ly.pojo.T_user;

/**
 * 对应数据库用户表t_user的service包的接口
 */
public interface IT_userService {

    /**
     * 用户登录的方法
     *
     * @param t_user
     * @return
     */
    public T_user t_userLogin(T_user t_user);

}
