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
  <s:action name="vEnterpriseAllInfoPaging" id="paging" namespace="/self" executeResult="false">
      <s:param name="rows" value="1000"/>
  </s:action>
  <s:action name="vEnterpriseAllInfo!query" namespace="/self" executeResult="true" >
  	<s:param name="pno" value="#parameters.pno"/>
    <s:param name="rows" value="1000"/>
    <s:param name="name" value="#parameters.name"/>
    <s:param name="businesstype" value="#parameters.businesstype"/>
    <s:param name="province" value="#parameters.province"/>
    <s:param name="city" value="#parameters.city"/>
    <s:param name="lagelperson" value="#parameters.lagelperson"/>
    <s:param name="contact" value="#parameters.contacte"/>
    <s:param name="requestlevel" value="#parameters.requestlevel"/>
    <s:param name="requestcode" value="#parameters.requestcode"/>
  </s:action>
</body>   
</html> 