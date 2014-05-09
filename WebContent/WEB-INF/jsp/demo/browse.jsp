<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="m" uri="/meidusa-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>我的博客文章列表</title>
</head>

<body>
  <s:action name="postPaging" id="paging" namespace="/demo" executeResult="false">
      <s:param name="rows" value="10"/>
  </s:action>
	<m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/demo/browse.action?pno={page}" pageLimit="5" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" />  
  <s:action name="post!list" namespace="/demo" executeResult="true" >
  	<s:param name="pno" value="#parameters.pno"/>
    <s:param name="rows" value="10"/>
  </s:action>
  <a href="/demo/post!add.action">发表新文章</a>
</body>
</html>