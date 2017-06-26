<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login page</title>
</head>
<body>
<h2>please login!</h2>
<center>
<!-- OGNL转换成Map集合 -->
<form action="login2" method="post">
	   用户名1:<input type="text" name="users['one'].userName"/><br/><!-- 用users.one和users["one"]都可以表示map集合的取值 -->
                密码1:<input type="password" name="users.one.password"/><br/>
	   用户名2:<input type="text" name="users.two.userName"/><br/>
                密码2:<input type="password" name="users.two.password"/><br/>
                      <input type="submit" value="登陆"/>
</form>
<!-- OGNL转换成List集合 -->
<!-- <form action="login3" method="post">
	   用户名1:<input type="text" name="users[1].userName"/><br/>
                密码1:<input type="password" name="users[1].password"/><br/>
	   用户名2:<input type="text" name="users[2].userName"/><br/>
                密码2:<input type="password" name="users[2].password"/><br/>
                      <input type="submit" value="登陆"/>
</form> -->
</center>
</body>
</html>