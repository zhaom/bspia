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
			<td >
				<div class="screenlet">
					<div class="screenlet-header widget">
						<div class="item-box">
							<h3 class="screenlet-title">
							<s:property value="%{getText('common_find')}"/><s:property value="%{getText('expert')}"/>
							</h3>
						</div>
					</div>
				</div>
			</td>
		</tr>
		<tr>
			<td>
				<form id="editForm" class="submitForm" action="/expert/browseExpertProject.action" method="post">
					<table>
						<tr>
							<td class="label"><s:property value="%{getText('expertproject_name')}"/> </td>
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
	<s:action name="expertprojectPaging" id="paging" namespace="/expert" executeResult="false">
		<s:param name="rows" value="10"/>
	</s:action>
	
	<s:action name="expertproject!list" namespace="/expert" executeResult="true" >
		<s:param name="pno" value="#parameters.pno"/>
		<s:param name="rows" value="10"/>
		<s:param name="requestId" value="#parameters.requestId"/>
	</s:action>
	
	<div class="buttonUl"><ul>
	<m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/expert/browseExpertProject.action?pno={page}&requestId=%{#request.encodeRequestId}" pageLimit="10" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" />
	</ul></div>
	<div class="buttonUl"><ul><li><a class="submitButton"  href="/expert/expertproject!add.action"><s:property value="%{getText('common_add')}"/>  </a></li></ul></div>