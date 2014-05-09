<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录</title>
</head>

<body>
<form action="/demo/login.action" method="post">
<label>登录</label><br>
<label>请输入你的用户名</label><br>
<label>用户名</label><input name="loginId" type="text"/><br>
<label>密码</label><input name="password" type="text"/><br>
<label>请输入验证码</label><input type="text" name="checkcode" /><img src="/demo/checkCode.action"/></br><s:fielderror/>
<p><input type="submit" value="确定"/></p>
</form>
</body>
</html>