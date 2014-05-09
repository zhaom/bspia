<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/train/exam!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		
		<table class="basic-form">
			<tr>
				<td class="label">
					<s:property value="%{getText('examination_examName')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="examname" size="100" value="<s:property value='examname'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('examination_examAddr')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="examaddr" value="<s:property value='examaddr'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('examination_examTypeEnumId')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'EXAM_TYPE'}" />
					    <s:param name="selectName" value="%{'examtypeenumid'}"/>
					    <s:param name="selectedKey" value="%{examtypeenumid}"/>
				  	</s:action>
				</td>
				<td class="label">
					<s:property value="%{getText('examination_examDuring')}"/>
				</td>
				<td>
					<input type="text" name="examduring" value="<s:property value='examduring'/>"/>
				</td>
			</tr>

			<tr>
				<td class="label">
					<s:property value="%{getText('examination_examCount')}"/>
				</td>
				<td>
					<input type="text" name="examcount" value="<s:property value='examcount'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('examination_contact')}"/>
				</td>
				<td>
					<input type="text" name="contact" value="<s:property value='contact'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('examination_tel')}"/>
				</td>
				<td>
					<input type="text" name="tel"  value="<s:property value='tel'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('examination_email')}"/>
				</td>
				<td>
					<input type="text" name="email" value="<s:property value='email'/>"/>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>