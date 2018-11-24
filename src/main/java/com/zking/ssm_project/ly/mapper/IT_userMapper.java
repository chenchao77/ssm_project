package com.zking.ssm_project.ly.mapper;

import com.zking.ssm_project.ly.pojo.T_user;
import org.springframework.stereotype.Repository;

/**
 * 对应数据库用户表t_user的mapper包的接口
 */
@Repository("IT_userMapper")//创建一个IT_userMapper的bean
public interface IT_userMapper {

    /**
     * 用户登录的方法
     *
     * @param t_user
     * @return
     */
    public T_user t_userLogin(T_user t_user);

}
