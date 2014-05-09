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
  <s:action name="enterprisePaging" id="paging" namespace="/enterprise" executeResult="false">
      <s:param name="rows" value="1000"/>
  </s:action>
  <s:action name="enterprise!query" namespace="/enterprise" executeResult="true" >
  	<s:param name="pno" value="#parameters.pno"/>
    <s:param name="rows" value="1000"/>
    <s:param name="name" value="#parameters.name"/>
    <s:param name="legalrepresentative" value="#parameters.legalrepresentative"/>
    <s:param name="linkman" value="#parameters.linkman"/>
    <s:param name="membertypeid" value="#parameters.membertypeid"/>
    <s:param name="qualifacationgetfire" value="#parameters.qualifacationgetfire"/>
    <s:param name="qualifacationgetconf" value="#parameters.qualifacationgetconf"/>
    <s:param name="qualifacationgetbuildinte" value="#parameters.qualifacationgetbuildinte"/>
    <s:param name="qualifacationgetbuildproj" value="#parameters.qualifacationgetbuildproj"/>
    <s:param name="qualifacationgetitinte" value="#parameters.qualifacationgetitinte"/>
    <s:param name="qualificationsupervision" value="#parameters.qualificationsupervision"/>
    <s:param name="qualificationcomputersp" value="#parameters.qualificationcomputersp"/>
    <s:param name="totalassets" value="#parameters.totalassets"/>
    <s:param name="businessincome" value="#parameters.businessincome"/>
    <s:param name="spqualifacationlevel" value="#parameters.spqualifacationlevel"/>
    <s:param name="natureid" value="#parameters.natureid"/>
    <s:param name="qualitycertifacation" value="#parameters.qualitycertifacation"/>
    <s:param name="feepaymentflag" value="#parameters.feepaymentflag"/>
  </s:action>
</body>   
</html> 