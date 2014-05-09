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
							<s:property value="%{getText('common_find')}"/><s:property value="%{getText('correspondent')}"/>
							</h3>
						</div>
					</div>
				</div>
			</td>
			<td width="50%">&nbsp;</td>
			<td align="right">
				<a class="submitButton" target="blank" href="/correspondent/exportCorrespondentToExcel.action"><s:property value="%{getText('menu_correspondent_export')}"/></a>
			</td>
		</tr>
		<tr>
			<td>
				<form id="editForm" class="submitForm" action="/correspondent/browseCorrespondent.action" method="post">
					<table>
						<tr>
							<td class="label"><s:property value="%{getText('correspondent_name')}"/> </td>
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

  <s:action name="correspondentPaging" id="paging" namespace="/correspondent" executeResult="false">
      <s:param name="rows" value="10"/>
  </s:action>

	
  <s:action name="correspondent!list" namespace="/correspondent" executeResult="true" >
  	<s:param name="pno" value="#parameters.pno"/>
    <s:param name="rows" value="10"/>
    <s:param name="requestId" value="#parameters.requestId"/>
  </s:action>
<div class="buttonUl"><ul><m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/correspondent/browseCorrespondent.action?pno={page}&requestId=%{#request.encodeRequestId}" pageLimit="5" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" /></ul></div>
  <div class="buttonUl"><ul><li><a class="submitButton" href="/correspondent/correspondent!add.action"><s:property value="%{getText('common_add')}"/></a></li></ul></div>