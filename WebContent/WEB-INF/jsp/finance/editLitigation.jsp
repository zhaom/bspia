<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/finance/litigation!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		<input type="hidden" name="enterpriseid" value="<s:property value='enterpriseid'/>"/>
		
		<table class="basic-form">
			<tr>
				<td class="label">
					<s:property value="%{getText('litigation_litigationDuring')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="litigationduring" size="100" value="<s:property value='litigationduring'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('litigation_litigationContent')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="litigationcontent" ><s:property value='litigationcontent'/></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>