<%@ include file="/WEB-INF/jsp/header.jsp" %>

<form id="editForm" action="/system/userPermission!save.action" method="post">
	<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
	<% if(request.getParameter("userId")!=null) {
		System.out.println("userId:"+request.getParameter("userId"));
	%>
	<input type="hidden" name="userId" value="<%=request.getParameter("userId")%>">
	<%} %>
	<table class="basic-form">
		<tr>
			<td class="label"><s:property value="%{getText('user_permissionId')}"/></td>
			<td>
				<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
				  	<s:param name="requestId" value="%{'PERMISSION'}" />
				    <s:param name="selectName" value="%{'permissionid'}"/>
				    <s:param name="selectedKey" value="%{permissionid}"/>
			  	</s:action>
			  	
			</td>
		</tr>
		<tr>
			<td class="label"><s:property value="%{getText('user_remark')}"/></td>
			<td>
				<textarea cols="80" rows="5" name="remark" ><s:property value='remark'/></textarea>
			</td>
		</tr>
	<tr>
		<td colspan="2">
			<input type="submit" class="submitButton"  value='<s:property value="%{getText('common_submit')}"/>' />
		</td>
	</tr>
	</table>
</form>