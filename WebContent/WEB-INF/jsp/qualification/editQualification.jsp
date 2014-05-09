<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/qualification/qualification!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		<input type="hidden" name="enterpriseid" value="<s:property value='enterpriseid'/>"/>
		<table class="basic-form">
			<tr>
				<td class="label">
					<s:property value="%{getText('qualification_qualificationTypeId')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'QUALIF_TYPE'}" />
					    <s:param name="selectName" value="%{'qualificationtypeid'}"/>
					    <s:param name="selectedKey" value="%{qualificationtypeid}"/>
				  	</s:action>
				</td>

				<td class="label">
					<s:property value="%{getText('qualification_qualificationLevel')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
					    <s:param name="selectName" value="%{'qualificationlevel'}"/>
					    <s:param name="selectedKey" value="%{qualificationlevel}"/>
				  	</s:action>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('qualification_qualificationTime')}"/>
				</td>
				<td>
					<input type="text" name="qualificationtime"  class="inputDatetime" value="<s:property value='qualificationtime'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('qualification_qualificationNo')}"/>
				</td>
				<td>
					<input type="text" name="qualificationno" value="<s:property value='qualificationno'/>"/>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>