<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>查看博客文章</title>
</head>

<body>

<s:action name="post!show" namespace="/demo" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>
<a href="/demo/browse.action">返回我的博客文章列表</a>
</body>
</html>