<%@ page contentType="application/vnd.ms-excel; charset=gbk" %>   
<%@ page language="java" pageEncoding="GBK"%>   
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="m" uri="/meidusa-tags" %>
<%   
    String filename = new String(("表格名").getBytes("GBK"),"ISO-8859-1");    
    response.addHeader("Content-Disposition", "filename=" + filename + ".xls");   
%>   
<html>   
<head>   
    <meta name="Generator" content="Microsoft Excel 11">   
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">   
</head>   
<body >   
	<s:action name="expertPaging" id="paging" namespace="/expert" executeResult="false">
		<s:param name="rows" value="200"/>
	</s:action>
	
	<s:action name="expert!query" namespace="/expert" executeResult="true" >
		<s:param name="pno" value="#parameters.pno"/>
		<s:param name="rows" value="200"/>
		<s:param name="retirementenumid" value="#parameters.retirementenumid"/>
		<s:param name="majordirectenumid" value="#parameters.majordirectenumid"/>
	</s:action>
</body>   
</html> 