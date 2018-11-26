package com.zking.ssm_project.ly.mapper;

import com.zking.ssm_project.ly.pojo.Ly_Users;
import org.springframework.stereotype.Repository;

/**
 * 对应数据库用户表ly_users的mapper包的接口
 */
@Repository("ILy_UsersMapper")//创建一个ILy_UsersMapper的bean
public interface ILy_UsersMapper {

    /**
     * 用户登录的方法
     *
     * @param ly_users
     * @return
     */
    public Ly_Users ly_UsersLogin(Ly_Users ly_users);

}
