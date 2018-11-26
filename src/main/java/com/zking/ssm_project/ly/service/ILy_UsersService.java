package com.zking.ssm_project.ly.service;

import com.zking.ssm_project.ly.pojo.Ly_Users;

/**
 * 对应数据库用户表ly_users的service包的接口
 */
public interface ILy_UsersService {

    /**
     * 用户登录的方法
     *
     * @param ly_users
     * @return
     */
    public Ly_Users ly_UsersLogin(Ly_Users ly_users);

}
