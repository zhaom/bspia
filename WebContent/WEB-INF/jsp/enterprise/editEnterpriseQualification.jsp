<%@ include file="/WEB-INF/jsp/header.jsp" %>

<form id="editForm" class="submitForm" action="/enterprise/enterprise!save.action" method="post">

	<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
	<table class="basic-table-sh">
		
		
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><s:property value="%{getText('enterprise_QualifacationInfo')}"/> </legend>
					<table class="basic-table-sh">
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_spQualifacationLevelDescripton')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
								    <s:param name="selectName" value="%{'spqualifacationlevel'}"/>
								    <s:param name="selectedKey" value="%{spqualifacationlevel}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_qualifacationGetFire')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
								    <s:param name="selectName" value="%{'qualifacationgetfire'}"/>
								    <s:param name="selectedKey" value="%{qualifacationgetfire}"/>
							  	</s:action>							
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_qualifacationGetConf')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL_CONF'}" />
								    <s:param name="selectName" value="%{'qualifacationgetconf'}"/>
								    <s:param name="selectedKey" value="%{qualifacationgetconf}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_qualifacationGetBuildInte')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL_CONF'}" />
								    <s:param name="selectName" value="%{'qualifacationgetbuildinte'}"/>
								    <s:param name="selectedKey" value="%{qualifacationgetbuildinte}"/>
							  	</s:action>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_qualifacationGetBuildProj')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
								    <s:param name="selectName" value="%{'qualifacationgetbuildproj'}"/>
								    <s:param name="selectedKey" value="%{qualifacationgetbuildproj}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_qualifacationGetITInte')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL_IT'}" />
								    <s:param name="selectName" value="%{'qualifacationgetitinte'}"/>
								    <s:param name="selectedKey" value="%{qualifacationgetitinte}"/>
							  	</s:action>							
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_qualificationSupervision')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
								    <s:param name="selectName" value="%{'qualificationsupervision'}"/>
								    <s:param name="selectedKey" value="%{qualificationsupervision}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_qualificationComputerSp')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
								    <s:param name="selectName" value="%{'qualificationcomputersp'}"/>
								    <s:param name="selectedKey" value="%{qualificationcomputersp}"/>
							  	</s:action>							
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