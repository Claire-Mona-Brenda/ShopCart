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
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
    	<div id="box">
    		<form action="LoginServlet" method="post" name="form">
    			<p class="main">
    				<label>用户名：</label>
    				<input type="text" name="username">
    				<label>密码：</label>
    				<input type="password" name="password">
    			</p>
    			<p class="space">
    				<input type="submit" value="登录" class="login" style="cursor:pointer">
    			</p>
    		</form>
    	</div>
    </div>
  </body>
</html>
