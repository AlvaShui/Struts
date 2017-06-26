<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>register page</title>
</head>
<body>
<h2>please register!</h2>
<center>
<form action="register2" method="post">
	   用户名:<input type="text" name="user.userName"/><br/>
                密码:<input type="password" name="user.password"/><br/>
     	年龄:<input type="text" name="user.age"/><br/>
     	生日:<input type="text" name="user.birthDay"/><br/>
         <input type="submit" value="注册"/>
</form>
</center>
</body>
</html>