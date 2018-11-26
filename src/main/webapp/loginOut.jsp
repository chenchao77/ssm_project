<%--
  Created by IntelliJ IDEA.
  User: 老妈给的电脑
  Date: 2018/11/26
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<!--注销页面-->
<%
    request.getSession().invalidate();
    response.sendRedirect("login.jsp");
%>