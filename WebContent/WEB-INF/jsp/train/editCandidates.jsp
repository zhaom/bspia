<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/train/candidate!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		
		<table class="basic-form">
			<tr>
				<td class="label">
					<s:property value="%{getText('candidates_name')}"/>
				</td>
				<td>
					<input type="text" name="name" value="<s:property value='name'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('candidates_genderEnumId')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'GENDER_TYPE'}" />
					    <s:param name="selectName" value="%{'genderenumid'}"/>
					    <s:param name="selectedKey" value="%{genderenumid}"/>
				  	</s:action>
				</td>
			</tr>
			<tr>

				<td class="label">
					<s:property value="%{getText('candidates_cardTypeEnumId')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'EXPERT_CARDTYPE'}" />
					    <s:param name="selectName" value="%{'cardtypeenumid'}"/>
					    <s:param name="selectedKey" value="%{cardtypeenumid}"/>
				  	</s:action>
				</td>
				<td class="label">
					<s:property value="%{getText('candidates_cardNo')}"/>
				</td>
				<td>
					<input type="text" name="cardno" value="<s:property value='cardno'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('candidates_nationalityEnumId')}"/>
				</td>
				<td>
					<input type="text" name="nationalityenumid" value="<s:property value='nationalityenumid'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('candidates_educationEnumId')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'EXPERT_EDU'}" />
					    <s:param name="selectName" value="%{'educationenumid'}"/>
					    <s:param name="selectedKey" value="%{educationenumid}"/>
				  	</s:action>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('candidates_title')}"/>
				</td>
				<td>
					<input type="text" name="title" value="<s:property value='title'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('candidates_politicalEnumId')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'POLITIC_TYPE'}" />
					    <s:param name="selectName" value="%{'politicalenumid'}"/>
					    <s:param name="selectedKey" value="%{politicalenumid}"/>
				  	</s:action>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('candidates_position')}"/>
				</td>
				<td>
					<input type="text" name="position" value="<s:property value='position'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('candidates_workplace')}"/>
				</td>
				<td>
					<input type="text" name="workplace" value="<s:property value='workplace'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('candidates_tele')}"/>
				</td>
				<td>
					<input type="text" name="tele" value="<s:property value='tele'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('candidates_mobilePhone')}"/>
				</td>
				<td>
					<input type="text" name="mobilephone" value="<s:property value='mobilephone'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('candidates_address')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="address" value="<s:property value='address'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('candidates_zipCode')}"/>
				</td>
				<td>
					<input type="text" name="zipcode" value="<s:property value='zipcode'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('candidates_securityBelong')}"/>
				</td>
				<td>
					<input type="text" name="securitybelong" value="<s:property value='securitybelong'/>"/>
				</td>
			</tr>			
			<tr>
				<td class="label">
					<s:property value="%{getText('candidates_studayExperience')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="studayexperience" ><s:property value='studayexperience'/></textarea>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('candidates_workExprience')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="workexprience" ><s:property value='workexprience'/></textarea>
				</td>
			</tr>

			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>