<%@ include file="/WEB-INF/jsp/header.jsp" %>

<form id="editForm" class="submitForm" action="/enterprise/enterprise!save.action" method="post">

	<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
	<table class="basic-table-sh">
		
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><s:property value="%{getText('enterprise_IntegrityInfo')}"/> </legend>
					<table class="basic-table-sh">
					    <tr>
					    	<td class="label"><s:property value="%{getText('enterprise_name')}"/> </td>
					    	<td colspan="3">
					    		<input type="text" readonly="true" name="name" value="<s:property value='name'/>"/>
					    	</td>
					    </tr>
						<tr>
							<td class="label"><s:property value="%{getText('integrityinfo_captureTime')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_YEAR'}" />
								    <s:param name="selectName" value="%{'productbound'}"/>
								    <s:param name="selectedKey" value="%{productbound}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_IntegrityInfo')}"/> </td>
							<td>
								<input type="text" name="projectbound" value="<s:property value='projectbound'/>"/>
							</td>
						</tr>
					</table>
				</fieldset>
			</td>
		</tr>

		<tr>
			<td colspan="4">
				<input type="submit" class="submitButton" value="<s:property value="%{getText('common_submit')}"/>" />
			</td>
		</tr>
	</table>
</form>