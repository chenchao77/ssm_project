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
    <script>
        layui.use('element', function () {
            var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块

            //监听导航点击
            element.on('nav(demo)', function (elem) {
                //console.log(elem)
                alert(elem.text());
                //layer.msg(elem.text());
            });
        });
    </script>
</head>
<body>
<ul class="layui-nav layui-nav-tree layui-inline" lay-filter="demo" style="margin-right: 10px;">
    <li class="layui-nav-item layui-nav-itemed">
        <a href="javascript:;">默认展开</a>
        <dl class="layui-nav-child">
            <dd><a href="javascript:;">选项一</a></dd>
            <dd><a href="javascript:;">选项二</a></dd>
            <dd><a href="javascript:;">选项三</a></dd>
            <dd><a href="javascript:;">跳转项</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item">
        <a href="javascript:;">解决方案</a>
        <dl class="layui-nav-child">
            <dd><a href="javascript:;">移动模块</a></dd>
            <dd><a href="javascript:;">后台模版</a></dd>
            <dd><a href="javascript:;">电商平台</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item"><a href="javascript:;">云市场</a></li>
    <li class="layui-nav-item"><a href="javascript:;">社区</a></li>
</ul>
</body>
</html>
