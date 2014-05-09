<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/qualification/integrity!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		<input type="hidden" name="enterpriseid" value="<s:property value='enterpriseid'/>"/>
		<table class="basic-form">
			<tr>
				<td class="label">
					<s:property value="%{getText('integrityinfo_integrityTitle')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="integritytitle" size="100" value="<s:property value='integritytitle'/>"/>
				</td>
			</tr>


			<tr>
				<td class="label">
					<s:property value="%{getText('integrityinfo_captureTime')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="capturetime"  class="inputDatetime" value="<s:property value='capturetime'/>"/>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>