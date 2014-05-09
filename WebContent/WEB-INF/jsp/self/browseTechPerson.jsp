<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%
String enterprisename = request.getParameter("enterprisename");
if(enterprisename!=null && !enterprisename.isEmpty()){
	enterprisename = java.net.URLEncoder.encode(enterprisename, "UTF-8");
	request.setAttribute("encodeEnterprisename",enterprisename);
}
String personname = request.getParameter("personname");
if(personname!=null && !personname.isEmpty()){
	personname = java.net.URLEncoder.encode(personname, "UTF-8");
	request.setAttribute("encodePersonname",personname);
}
%>
<div> 
	<table class="basic-table-sh">
		<tr>
			<td width="80%">
				<div class="screenlet">
					<div class="screenlet-header widget">
						<div class="item-box">
							<h3 class="screenlet-title">
							<s:property value="%{getText('common_find')}"/><s:property value="%{getText('self_techperson')}"/>
							</h3>
						</div>
					</div>
				</div>
			</td>
			<td align="right">
				<a class="submitButton" href="/self/uploadSelfTechPersonByExcel.action"><s:property value="%{getText('menu_mem_import')}"/></a>
			</td>
		</tr>
		<tr>
			<td>
				<form id="editForm" class="submitForm" action="/self/browseTechPerson.action" method="post">
					<table>
						<tr>
							<td class="label"><s:property value="%{getText('self_techperson_enterprisename')}"/> </td>
							<td><input type="text" name="enterprisename" value="<s:property  value='#parameters.enterprisename'/>"/> </td>
							<td class="label"><s:property value="%{getText('self_techperson_personname')}"/> </td>
							<td><input type="text" name="personname" value="<s:property  value='#parameters.personname'/>"/> </td>
							<td align="left"><input type="submit" class="submitButton" value="<s:property value="%{getText('common_find')}"/>" /> </td>
							<td>&nbsp;</td>
						</tr>
					</table>
				</form>
			</td>
			<td>&nbsp;</td>
		</tr>
	</table>
</div>

  <s:action name="selfTechPersonPaging" id="paging" namespace="/self" executeResult="false">
      <s:param name="rows" value="20"/>
  </s:action>

	
  <s:action name="selfTechPerson!query" namespace="/self" executeResult="true" >
  	<s:param name="pno" value="#parameters.pno"/>
    <s:param name="rows" value="20"/>
    <s:param name="enterprisename" value="#parameters.enterprisename"/>
    <s:param name="personname" value="#parameters.personname"/>
  </s:action>
  <%--
<div class="buttonUl"><ul><m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/self/browseTechPerson.action?pno={page}&enterprisename=%{#request.encodeEnterprisename}&personname=%{#request.encodePersonname}" pageLimit="5" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" /></ul></div>
 --%>