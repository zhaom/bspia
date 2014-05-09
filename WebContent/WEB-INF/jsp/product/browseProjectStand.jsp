<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%
String enterprisename = request.getParameter("enterprisename");
if(enterprisename!=null && !enterprisename.isEmpty()){
	enterprisename = java.net.URLEncoder.encode(enterprisename, "UTF-8");
	request.setAttribute("encodeEnterprisename",enterprisename);
}
String projectname = request.getParameter("projectname");
if(projectname!=null && !projectname.isEmpty()){
	projectname = java.net.URLEncoder.encode(projectname, "UTF-8");
	request.setAttribute("encodeProjectname",projectname);
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
							<s:property value="%{getText('common_find')}"/><s:property value="%{getText('projectstand')}"/>
							</h3>
						</div>
					</div>
				</div>
			</td>
			<td align="right">
				<a class="submitButton" href="/product/uploadProjectStandByExcel.action"><s:property value="%{getText('menu_mem_import')}"/></a>
			</td>
		</tr>
		<tr>
			<td>
				<form id="editForm" class="submitForm" action="/product/browseProjectStand.action" method="post">
					<table>
						<tr>
							<td class="label"><s:property value="%{getText('projectstand_enterprisename')}"/> </td>
							<td><input type="text" name="enterprisename" value="<s:property  value='#parameters.enterprisename'/>"/> </td>
							<td class="label"><s:property value="%{getText('projectstand_projectname')}"/> </td>
							<td><input type="text" name="projectname" value="<s:property  value='#parameters.projectname'/>"/> </td>							
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

  <s:action name="projectStandPaging" id="paging" namespace="/product" executeResult="false">
      <s:param name="rows" value="20"/>
  </s:action>

	
  <s:action name="projectStand!query" namespace="/product" executeResult="true" >
  	<s:param name="pno" value="#parameters.pno"/>
    <s:param name="rows" value="20"/>
    <s:param name="enterprisename" value="#parameters.enterprisename"/>
    <s:param name="projectname" value="#parameters.projectname"/>
  </s:action>
<div class="buttonUl"><ul><m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/product/browseProjectStand.action?pno={page}&enterprisename=%{#request.encodeEnterprisename}&projectname=%{#request.encodeProjectname}" pageLimit="10" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" /></ul></div>