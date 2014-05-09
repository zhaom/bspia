<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/correspondent/correspondent!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		
		<table class="basic-form">
			<tr>
				<td class="label">
					<s:property value="%{getText('correspondent_name')}"/>
				</td>
				<td>
					<input type="text" name="name" value="<s:property value='name'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('correspondent_genderEnumId')}"/>
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
					<s:property value="%{getText('correspondent_cardTypeEnumId')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'EXPERT_CARDTYPE'}" />
					    <s:param name="selectName" value="%{'cardtypeenumid'}"/>
					    <s:param name="selectedKey" value="%{cardtypeenumid}"/>
				  	</s:action>
				</td>
				<td class="label">
					<s:property value="%{getText('correspondent_cardNo')}"/>
				</td>
				<td>
					<input type="text" name="cardno" value="<s:property value='cardno'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('correspondent_nation')}"/>
				</td>
				<td>
					<input type="text" name="nation" value="<s:property value='nation'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('correspondent_educationEnumId')}"/>
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
					<s:property value="%{getText('correspondent_major')}"/>
				</td>
				<td>
					<input type="text" name="major" value="<s:property value='major'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('correspondent_university')}"/>
				</td>
				<td>
					<input type="text" name="university" value="<s:property value='university'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('correspondent_title')}"/>
				</td>
				<td>
					<input type="text" name="title" value="<s:property value='title'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('correspondent_politicalEnumId')}"/>
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
					<s:property value="%{getText('correspondent_position')}"/>
				</td>
				<td>
					<input type="text" name="position" value="<s:property value='position'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('correspondent_workplace')}"/>
				</td>
				<td>
					<input type="text" name="workplace" value="<s:property value='workplace'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('correspondent_contact')}"/>
				</td>
				<td>
					<input type="text" name="contact" value="<s:property value='contact'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('correspondent_workDuring')}"/>
				</td>
				<td>
					<input type="text" name="workduring" value="<s:property value='workduring'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('correspondent_tele')}"/>
				</td>
				<td>
					<input type="text" name="tele" value="<s:property value='tele'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('correspondent_mobilePhone')}"/>
				</td>
				<td>
					<input type="text" name="mobilephone" value="<s:property value='mobilephone'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('correspondent_address')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="address" value="<s:property value='address'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('correspondent_zipCode')}"/>
				</td>
				<td>
					<input type="text" name="zipcode" value="<s:property value='zipcode'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('correspondent_email')}"/>
				</td>
				<td>
					<input type="text" name="email" value="<s:property value='email'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('correspondent_excellentdesc')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'YORN_FLAG'}" />
					    <s:param name="selectName" value="%{'excellentenumid'}"/>
					    <s:param name="selectedKey" value="%{excellentenumid}"/>
				  	</s:action>
				</td>

				<td class="label">
					<s:property value="%{getText('correspondent_excellentyeardesc')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'QUALIF_YEAR'}" />
					    <s:param name="selectName" value="%{'excellentyear'}"/>
					    <s:param name="selectedKey" value="%{excellentyear}"/>
				  	</s:action>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('correspondent_publishenumdesc')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'YORN_FLAG'}" />
					    <s:param name="selectName" value="%{'publishenumid'}"/>
					    <s:param name="selectedKey" value="%{publishenumid}"/>
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
				<td class="label">
					<s:property value="%{getText('correspondent_resume')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="resume" ><s:property value='resume'/></textarea>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('correspondent_publishDesc')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="publishdesc" ><s:property value='publishdesc'/></textarea>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('correspondent_remark')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="remark" ><s:property value='remark'/></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>