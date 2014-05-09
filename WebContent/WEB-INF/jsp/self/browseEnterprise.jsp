<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%
String requestId = request.getParameter("requestId");
if(requestId!=null && !requestId.isEmpty()){
	requestId = java.net.URLEncoder.encode(requestId, "UTF-8");
	request.setAttribute("encodeRequestId",requestId);
}
%>
<div> 
	<table class="basic-table-sh">
		<tr>
			<td width="20%">
				<div class="screenlet">
					<div class="screenlet-header widget">
						<div class="item-box">
							<h3 class="screenlet-title">
							<s:property value="%{getText('common_find')}"/><s:property value="%{getText('enterprise')}"/>
							</h3>
						</div>
					</div>
				</div>
			</td>
			<td width="50%">&nbsp;</td>
			<td align="right">
				<a class="submitButton" href="/self/uploadSelfEnterpriseByExcel.action"><s:property value="%{getText('menu_mem_import')}"/></a>
			</td>
		</tr>
		<tr>
			<td>
				<form id="editForm" class="submitForm" action="/self/browseEnterprise.action" method="post">
					<table>
						<tr>
							<td class="label"><s:property value="%{getText('self_enterprisename')}"/> </td>
							<td><input type="text" name="requestId" value="<s:property  value='#parameters.requestId'/>"/> </td>
							<td align="left"><input type="submit" class="submitButton" value="<s:property value="%{getText('common_find')}"/>" /> </td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</div>

  <s:action name="selfEnterprisePaging" id="paging" namespace="/self" executeResult="false">
      <s:param name="rows" value="10"/>
  </s:action>

	
  <s:action name="selfEnterprise!list" namespace="/self" executeResult="true" >
  	<s:param name="pno" value="#parameters.pno"/>
    <s:param name="rows" value="10"/>
    <s:param name="requestId" value="#parameters.requestId"/>
  </s:action>
<div class="buttonUl"><ul><m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/self/browseEnterprise.action?pno={page}&requestId=%{#request.encodeRequestId}" pageLimit="5" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="true" /></ul></div>