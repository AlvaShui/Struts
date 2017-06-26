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
<s:form	action="register3" method="post">
	<s:textfield name="user.userName" label="用户名"></s:textfield>
	<s:password name="user.password" label="密码"></s:password>
	<s:textfield name="user.age" label="年龄"></s:textfield>
	<s:textfield name="user.birthDay" label="出生日期"></s:textfield>
	<s:submit value="注册"></s:submit>
</s:form>
</body>
</html>