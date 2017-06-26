<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>loginConverter page</title>
</head>
<body>
<h2>please login!</h2>
<center>
<h1 > 用户信息：用户名,密码</h1>
<s:fielderror/>
<form action="loginConverter" method="post">
	   				用户信息:<input type="text" name="user"/><br/>
                      <input type="submit" value="登陆"/>
</form>
</center>
</body>
</html>