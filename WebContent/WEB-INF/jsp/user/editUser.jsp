<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/system/user2!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		
		<table class="basic-form">
			<tr>
				<td class="label">
					<s:property value="%{getText('user_userId')}"/>
				</td>
				<td>
					<input type="text" name="loginid" value="<s:property value='loginid'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('user_name')}"/>
				</td>
				<td>
					<input type="text" name="name" value="<s:property value='name'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('user_depart')}"/>
				</td>
				<td>
					<input type="text" name="departname" value="<s:property value='departname'/>"/>
				</td>
				<td class="label">
					&nbsp;
				</td>
				<td>
					&nbsp;
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('user_remark')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="5" name="remark" ><s:property value='remark'/></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>