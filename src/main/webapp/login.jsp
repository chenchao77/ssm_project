<%--
  Created by IntelliJ IDEA.
  User: 老妈给的电脑
  Date: 2018/11/24
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--开启el表达式可用-->
<%@page isELIgnored="false" %>
<!--引入layUi的插件-->
<%@include file="layUiCommonUrl.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 align="center">用户登录</h2><br/><br/>
<form class="layui-form" action="/ly/ly_UsersLogin.action" method="post">
    <div class="layui-form-item" align="center">
        <div class="layui-inline">
            <label class="layui-form-label">用户名称</label>
            <div class="layui-input-inline">
                <input type="text" name="uName" lay-verify="required" placeholder="请输入用户名称"
                       autocomplete="off" class="layui-input" style="width: 300px">
            </div>
        </div>
        <br/> <br/>
        <div class="layui-inline">
            <label class="layui-form-label">用户密码</label>
            <div class="layui-input-inline">
                <input type="password" name="uPassword" lay-verify="required" placeholder="请输入用户密码"
                       autocomplete="off" class="layui-input" style="width: 300px">
            </div>
        </div>
        <br/> <br/>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="demo1" style="width: 100px">提交</button>
                <button type="reset" class="layui-btn layui-btn-primary" style="width: 100px">重置</button>
            </div>
        </div>
    </div>
</form>
</body>
</html>
