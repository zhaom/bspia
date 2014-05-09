<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/train/examenrolls!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		<input type="hidden" name="candidateid" value="<s:property value='candidateid'/>"/>
		
		<table class="basic-form">

			<tr>
				<td class="label">
					<s:property value="%{getText('examenrolls_exam_name')}"/>
				</td>
				<td>
					<s:action name="exam!selectList" namespace="/train" executeResult="true" >
					    <s:param name="selectName" value="%{'examid'}"/>
					    <s:param name="selectedKey" value="%{examid}"/>
				  	</s:action>
				</td>
				<td class="label">
					<s:property value="%{getText('examenrolls_examcertno')}"/>
				</td>
				<td>
					<input type="text" name="examcertno" value="<s:property value='examcertno'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('examenrolls_score')}"/>
				</td>
				<td>
					<input type="text" name="score" value="<s:property value='score'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('examenrolls_certificatename')}"/>
				</td>
				<td>
					<input type="text" name="certificatename" value="<s:property value='certificatename'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('examenrolls_certificateno')}"/>
				</td>
				<td>
					<input type="text" name="certificateno" value="<s:property value='certificateno'/>"/>
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