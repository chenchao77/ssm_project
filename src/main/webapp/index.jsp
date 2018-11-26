<%--
  Created by IntelliJ IDEA.
  User: 老妈给的电脑
  Date: 2018/11/26
  Time: 14:31
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
<body class="layui-layout-body">

<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo" align="center"><h2>宅急送物流系统</h2></div>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item"><a href="/loginOut.jsp"><h2>退出</h2></a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul id="tree">
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div class="layui-tab" lay-filter="demo" lay-allowclose="true">
            <ul class="layui-tab-title">
                <li lay-id="ss" class="layui-this">首页</li>
            </ul>
            <div class="layui-tab-content">
                <div class="layui-tab-item layui-show"><img style="width: 1300px;height: 550px" src="/images/zq1.jpg">
                </div>
            </div>
        </div>
        <div class="layui-footer">
            <!-- 底部固定区域 -->
        </div>
    </div>
</div>

<script type="text/javascript" src="/js/jquery-3.2.1.js"></script>
<script type="text/javascript">
    $.ajax({
        type: "post",
        url: "/ly/findLy_MenusParentAll.action",
        datatype: "json",
        success: function (data) {
            var tree = eval("(" + data + ")");
            layui.use(['tree', 'element'], function () {
                var element = layui.element;
                layui.tree({
                    elem: '#tree' //传入元素选择器
                    , skin: 'sidebar'
                    , nodes: tree
                    , click: function (node) {
                        alert("node：" + node);
                        if (node.children == null) {
                            var exist = $("li[lay-id='" + node.mId + "']").length;
                            if (exist == 1) {   //tab已经打开
                                element.tabChange('demo', node.mId); //切换到：用户管理
                            } else {    //tab没有打开
                                //新增一个Tab项
                                element.tabAdd('demo', {
                                    title: node.mName,//用于演示
                                    content: '<iframe frameborder="0" src="${node.murl}" style="width: 100%;height:100%;"></iframe>',
                                    id: node.mId//实际使用一般是规定好的id，这里以时间戳模拟下
                                })
                                //展开tab下的内容
                                element.tabChange('demo', node.mId); //切换到：用户管理
                            }
                        }

                    }
                });
            });
        }
    });
</script>

</body>
</html>
