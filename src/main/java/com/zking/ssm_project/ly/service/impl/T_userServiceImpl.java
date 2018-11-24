package com.zking.ssm_project.ly.service.impl;

import com.zking.ssm_project.ly.mapper.IT_userMapper;
import com.zking.ssm_project.ly.pojo.T_user;
import com.zking.ssm_project.ly.service.IT_userService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 对应数据库用户表t_user的service包的实现类
 */
@Repository("IT_userService")//创建IT_userService的bean
public class T_userServiceImpl implements IT_userService {

    @Resource(name = "IT_userMapper")//得到IT_userMapper的bean
    private IT_userMapper it_userMapper;

    @Override
    public T_user t_userLogin(T_user t_user) {
        return it_userMapper.t_userLogin(t_user);
    }


}
