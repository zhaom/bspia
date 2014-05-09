<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/train/train!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		
		<table class="basic-form">
			<tr>
				<td class="label">
					<s:property value="%{getText('train_trainName')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="trainname" size="100" value="<s:property value='trainname'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('train_trainAddr')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="trainaddr" value="<s:property value='trainaddr'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('train_trainTypeEnumId')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'TRAIN_TYPE'}" />
					    <s:param name="selectName" value="%{'traintypeenumid'}"/>
					    <s:param name="selectedKey" value="%{traintypeenumid}"/>
				  	</s:action>
				</td>
				<td class="label">
					<s:property value="%{getText('train_trainDuring')}"/>
				</td>
				<td>
					<input type="text" name="trainduring" value="<s:property value='trainduring'/>"/>
				</td>
			</tr>			
			<tr>
				<td class="label">
					<s:property value="%{getText('train_fee')}"/>
				</td>
				<td>
					<input type="text" name="fee" value="<s:property value='fee'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('train_planAmount')}"/>
				</td>
				<td>
					<input type="text" name="planamount" value="<s:property value='planamount'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('train_contact')}"/>
				</td>
				<td>
					<input type="text" name="contact" value="<s:property value='contact'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('train_tel')}"/>
				</td>
				<td>
					<input type="text" name="tel" value="<s:property value='tel'/>"/>
				</td>
			</tr>			
			<tr>
				<td class="label">
					<s:property value="%{getText('train_email')}"/>
				</td>
				<td>
					<input type="text" name="email" value="<s:property value='email'/>"/>
				</td>
				<td class="label">
					&nbsp;
				</td>
				<td>
					&nbsp;
				</td>
			</tr>					
			
			<tr>
				<td class="label">
					<s:property value="%{getText('train_trainRemark')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="trainremark" ><s:property value='trainremark'/></textarea>
				</td>
			</tr>

			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>