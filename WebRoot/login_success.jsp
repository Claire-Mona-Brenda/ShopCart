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
    
    <title>My JSP 'login_success.jsp' starting page</title>
    
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
    		<%
    			String loginUser="";
    			if(session.getAttribute("loginUser")!=null){
    				loginUser=session.getAttribute("loginUser").toString();
    			}
    		 %>
    		 <font color="red">欢迎您<%=loginUser %>，登陆成功</font>
    	</div>
    </div>
  </body>
</html>
