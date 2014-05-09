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
							<td colspan="3">
								<div class="buttonUl">
									<ul>
										<li>
											<a  class="submitButton" href="javascript:alert('<s:property value="%{getText('enterprise_checkIntegrityReport_alert')}"/>');"><s:property value="%{getText('enterprise_checkIntegrityReport')}"/></a>
										</li>
									</ul>
								</div>
							</td>
						</tr>
					</table>
				</fieldset>
			</td>
		</tr>
	</table>
</form>