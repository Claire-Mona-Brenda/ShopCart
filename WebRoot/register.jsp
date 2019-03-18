<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <%request.setCharacterEncoding("UTF-8"); %>
    <base href="<%=basePath%>">
    
    <title>register page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/login.css">

  </head>
  
  <body>
   	<div id="container">
    	<div class="logo">
    		<a href="#"><img alt="" src="assets/logo.png"></a>
    	</div>
    	<div class="box">
    		 <form action="RegisterServlet" method="post">
    		 	 <font color="red">您尚未注册，请填入您的注册信息</font>
    		 	<p>用户名：<input typye="text" name="username"></p>
    		 	<p>密码：<input type="password" name="password"></p>
    		 	<p>确认密码：<input type="password" name="re_password"></p>
    		 	<p><input type="submit" value="提交" name="submit"></p>
    		 </form>
    	</div>
    </div>
  </body>
</html>
