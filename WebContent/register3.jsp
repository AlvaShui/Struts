<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>register page</title>
</head>
<body>
<h2>please register!</h2>
<center>
<s:form	action="register3" validate="true">
	<s:textfield label="user.userName" value="用户名"></s:textfield>
	<s:password label="user.password" value="用户名"></s:textfield>
	<s:textfield label="user.userName" value="用户名"></s:textfield>
	<s:textfield label="user.userName" value="用户名"></s:textfield>
	
</s:form>
<form action="register" method="post">
	   用户名:<input type="text" name="userName"/><br/>
                密码:<input type="password" name="password"/><br/>
     	年龄:<input type="text" name="age"/><br/>
     	生日:<input type="text" name="birthDay"/><br/>
         <input type="submit" value="注册"/>
</form>
</center>
</body>
</html>