package com.zking.ssm_project.ly.service.impl;

import com.zking.ssm_project.ly.mapper.ILy_UsersMapper;
import com.zking.ssm_project.ly.pojo.Ly_Users;
import com.zking.ssm_project.ly.service.ILy_UsersService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 对应数据库用户表ly_users的service包的实现类
 */
@Repository("ILy_UsersService")//创建ILy_UsersService的bean
public class Ly_UsersServiceImpl implements ILy_UsersService {

    @Resource(name = "ILy_UsersMapper")//得到ILy_UsersMapper的bean
    private ILy_UsersMapper iLy_usersMapper;

    @Override
    public Ly_Users ly_UsersLogin(Ly_Users ly_users) {
        return iLy_usersMapper.ly_UsersLogin(ly_users);
    }

}
