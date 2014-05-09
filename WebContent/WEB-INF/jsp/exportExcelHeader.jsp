<%@ page contentType="application/vnd.ms-excel; charset=utf-8" language="java" import="java.sql.*" errorPage="" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="m" uri="/meidusa-tags" %>
<%   
    String filename = new String(("表格名").getBytes("utf-8"),"ISO-8859-1");    
    response.setHeader("Content-Disposition", "attachment;filename=" + filename + ".xls");   
%>  
<head>
	<meta name="Generator" content="Microsoft Excel 11">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>