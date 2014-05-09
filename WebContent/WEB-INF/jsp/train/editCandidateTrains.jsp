<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/train/candidatetrains!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		<input type="hidden" name="candidateid" value="<s:property value='candidateid'/>"/>
		
		<table class="basic-form">

			<tr>
				<td class="label">
					<s:property value="%{getText('candidatetrain_train_name')}"/>
				</td>
				<td>
					<s:action name="train!selectList" namespace="/train" executeResult="true" >
					    <s:param name="selectName" value="%{'trainid'}"/>
					    <s:param name="selectedKey" value="%{trainid}"/>
				  	</s:action>
				</td>
				<td class="label">
					<s:property value="%{getText('candidatetrain_attendcertno')}"/>
				</td>
				<td>
					<input type="text" name="attendcertno" value="<s:property value='attendcertno'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('candidatetrain_trainresult')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'SELECT_RESULT'}" />
					    <s:param name="selectName" value="%{'trainresultenumid'}"/>
					    <s:param name="selectedKey" value="%{trainresultenumid}"/>
				  	</s:action>
				</td>
				<td class="label">
					&nbsp;
				</td>
				<td>
					&nbsp;
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>