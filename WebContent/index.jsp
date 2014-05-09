<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>
	<s:i18n name="bspia">  
    	<s:property value="%{getText('common_title')}"/>  
	</s:i18n>
</title>
<link type="text/css" href="/css/main.css" rel="stylesheet" />
<style type="text/css">
<!--
*{
	margin:0px;
	padding:0px;
}
body {
	margin:0px;
	padding:0px;
	font-size:13px;
	color:#000000;
}
td{
	font:13px;
}
.input01{
	width:120px;
	height:18px;
	background-color:#FFFFFF;
	border:#7F9DB9 solid 1px;
}
-->
</style>
</head>

<body>

<TABLE width="100%" height="100%" border=0 cellPadding=0 cellSpacing=0>
  <TBODY>
	  <TR>
	    <TD height=164 background="/images/login/200901.gif">&nbsp;</TD>
	  </TR>
	  <TR>
	    <TD vAlign=top align=center background="/images/login/200902.gif"  height=385>
	    	<table width="568" border="0" cellspacing="0" cellpadding="0" class="line">
	      		<tr>
	       			 <td height="56" valign="top" background="/images/login/200912.gif">
	       			 <%--
	       			 <table width="568" border="0" cellspacing="0" cellpadding="0">
			          <tr>
			            <td width="227" valign="top"><img src="/images/login/logo.gif" width="219" height="56"></td>
			            <td width="341">
				            <table width="254" valign="bottom" height="42" border="0" cellpadding="0" cellspacing="0">
				              <tr>
				                <td width="254" valign="bottom"><img src="/images/login/200911.gif" width="292" height="29"></td>
				              </tr>
				            </table>
			            </td>
			          </tr>
			        </table>
			         --%>
	       			</td>
	      		</tr>
	      		<tr>
	        		<td height="217" valign="top" background="/images/login/200910.gif">
			        	<table width="568" border="0" cellspacing="0" cellpadding="0">
					          <tr>
					            <td width="269" height="191">&nbsp;</td>
					            <td width="299">
					            
						            <form method="post" action="/demo/login.action" name="loginform" style='margin: 0;'>
							         
						              <table width="284" border="0" cellspacing="0" cellpadding="0">
						              	<tr>
						              		<td width="258"><div class="errorMessage">
						              			<s:fielderror/></div>
						              		</td>
						              	</tr>
						                <tr>
						                  	<td align="right">
						                  		<s:property value="%{getText('user_userId')}"/>&nbsp;
						                  	</td>                  
						                    <td align="left">                    	 
						                    	<input id="loginId" type="text" name="loginId"  class="input01"/>
						                    </td>    
											<td ></td>
						                  	<td ></td>
						                </tr>
						                <tr>
						                  <td align="right"><s:property value="%{getText('user_password')}"/>&nbsp;</td>
						                  <td align="left">
											<input id="password" type="password" name="password" class="input01"  />
						                  </td>
						                  <td ></td>
						                  <td ></td>
						                </tr>
						                <tr>
						                  <td align="right"><s:property value="%{getText('user_validCode')}"/>&nbsp;</td>
						                  <td>
											  <input type="text" name="checkcode" size="4"/>&nbsp;<img src="/demo/checkCode.action"/>
						                  </td>
						                  <td ></td>
						                  <td ></td>
						                </tr>                
						                <tr>
						                	<td > </td>
						                  <td colspan="2" align="left"><input type="image" src="/images/login/200904.gif" width="64" height="22"  border="0"/ >&nbsp;</td>
						                  <td > </td>
						                  <td ></td>
						                </tr>                 
						              </table>
						            
						            </form>
					            </td>
					          </tr>
					          <tr>
					            <td height="26" colspan="2" align="center">	
					            	<s:i18n name="bspia">  
					    				<s:property value="%{getText('common_title')}"/>  
									</s:i18n>
								</td>
					            </tr>
					        </table>
	        			</td>
	      			</tr>
	    		</table>
	    	</TD>
	  	</TR>
	  	<TR>
			<TD background="/images/login/200903.gif" height="98">&nbsp;</TD>
		</TR>
	</TBODY>
</TABLE>

</body>
</html>