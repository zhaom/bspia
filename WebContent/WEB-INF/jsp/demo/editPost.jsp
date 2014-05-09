<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>编辑博客文章</title>
</head>

<body>
<form action="/demo/post!save.action" method="post">
<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
<label>文章标题<input type="text" name="title" value="<s:property value='title'/>"/></label></br>
<div>文章内容
<textarea cols="80" rows="20" name="content" ><s:property value='content'/></textarea>
</div>
<input type="submit" value="发表" />
</form>
</body>
</html>