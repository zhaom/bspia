<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/system/notification!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		<input type="hidden" name="userid" value="<s:property  value='#session.loginUser.loginid'/>"/>
		
		<table class="basic-form">
			<tr>
				<td class="label">
					<s:property value="%{getText('notification_title')}"/>
				</td>
				<td>
					<input type="text" name="title" size="100" value="<s:property value='title'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('notificaiton_comment')}"/>
				</td>
				<td>
					<textarea cols="80" rows="20" name="comment" ><s:property value='comment'/></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>