<%@ include file="/WEB-INF/jsp/header.jsp" %>

<form  id="editForm" action="/system/user!resetPassword.action" method="post">
	<input type="hidden" name="requestId" value="<s:property  value='#session.loginUser.id'/>"/>
<table class="basic-form">
	<div class="errorMessage"><s:fielderror/></div>
	
	<tr>
		<td class="label"><s:property value="%{getText('user_oldPassword')}"/></td>
		<td> <input type="password" name="oldPassword" value=""/></td>
	</tr>
	<tr>
		<td class="label"><s:property value="%{getText('user_newPassword')}"/></td>
		<td><input type="password" name="newPassword" value=""/></td>
	</tr>
	<tr>
		<td class="label"><s:property value="%{getText('user_confirmPassword')}"/></td>
		<td><input type="password" name="confirmPassword" value=""/></td>
	</tr>
	<tr><td colspan="2"><input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> /></td></tr>
</table>
</form>