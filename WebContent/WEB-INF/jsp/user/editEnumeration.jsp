<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/system/enumeration!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		
		<table class="basic-form">
			<tr>
				<td class="label">
					<s:property value="%{getText('enumeration_desc')}"/>
				</td>
				<td>
					<textarea cols="80" rows="20" name="description" ><s:property value='description'/></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>