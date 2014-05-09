<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/expert/expert!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		
		<table class="basic-form">
			<tr>
				<td class="label">
					<s:property value="%{getText('expert_name')}"/>
				</td>
				<td>
					<input type="text" name="name" value="<s:property value='name'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('expert_birthday')}"/>
				</td>
				<td>
					<input type="text" name="birthday" class="inputDatetime" value="<s:property value='birthday'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expert_gender')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'GENDER_TYPE'}" />
					    <s:param name="selectName" value="%{'genderenumid'}"/>
					    <s:param name="selectedKey" value="%{genderenumid}"/>
				  	</s:action>
				</td>
				<td class="label">
					<s:property value="%{getText('expert_political')}"/>
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
					<s:property value="%{getText('expert_educationEnumId')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'EXPERT_EDU'}" />
					    <s:param name="selectName" value="%{'educationenumid'}"/>
					    <s:param name="selectedKey" value="%{educationenumid}"/>
				  	</s:action>
				</td>
				<td class="label">
					<s:property value="%{getText('expert_major')}"/>
				</td>
				<td>
					<input type="text" name="major" value="<s:property value='major'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expert_university')}"/>
				</td>
				<td>
					<input type="text" name="university" value="<s:property value='university'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('expert_position')}"/>
				</td>
				<td>
					<input type="text" name="position" value="<s:property value='position'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expert_title')}"/>
				</td>
				<td>
					<input type="text" name="title" value="<s:property value='title'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('expert_mobilePhone')}"/>
				</td>
				<td>
					<input type="text" name="mobilephone" value="<s:property value='mobilephone'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expert_tele')}"/>
				</td>
				<td>
					<input type="text" name="tele" value="<s:property value='tele'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('expert_workplace')}"/>
				</td>
				<td>
					<input type="text" name="workplace" value="<s:property value='workplace'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expert_cardTypeEnumId')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'EXPERT_CARDTYPE'}" />
					    <s:param name="selectName" value="%{'cardtypeenumid'}"/>
					    <s:param name="selectedKey" value="%{cardtypeenumid}"/>
				  	</s:action>
				</td>
				<td class="label">
					<s:property value="%{getText('expert_cardNo')}"/>
				</td>
				<td>
					<input type="text" name="cardno" value="<s:property value='cardno'/>"/>
				</td>
			</tr>			
			<tr>
				<td class="label">
					<s:property value="%{getText('expert_email')}"/>
				</td>
				<td>
					<input type="text" name="email" value="<s:property value='email'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('expert_contact')}"/>
				</td>
				<td>
					<input type="text" name="contact" value="<s:property value='contact'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expert_address')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="address" value="<s:property value='address'/>"/>
				</td>
			</tr>			
			<tr>
				<td class="label">
					<s:property value="%{getText('expert_homeaddress')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="homeaddress" value="<s:property value='homeaddress'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expert_zipCode')}"/>
				</td>
				<td>
					<input type="text" name="zipcode" value="<s:property value='zipcode'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('expert_retirementEnumId')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'EXPERT_RETIRE'}" />
					    <s:param name="selectName" value="%{'retirementenumid'}"/>
					    <s:param name="selectedKey" value="%{retirementenumid}"/>
				  	</s:action>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expert_workduring')}"/>
				</td>
				<td>
					<input type="text" name="workduring" value="<s:property value='workduring'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('expert_majorworkduring')}"/>
				</td>
				<td>
					<input type="text" name="majorworkduring" value="<s:property value='majorworkduring'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expert_majordirection')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'MAJOR_DIRECT'}" />
					    <s:param name="selectName" value="%{'majordirectenumid'}"/>
					    <s:param name="selectedKey" value="%{majordirectenumid}"/>
				  	</s:action>
				</td>
				<td class="label">
					<s:property value="%{getText('expert_parttimejob')}"/>
				</td>
				<td>
					<input type="text" name="parttimejob" value="<s:property value='parttimejob'/>"/>
				</td>
			</tr>

			<tr>
				<td class="label">
					<s:property value="%{getText('expert_professionalBound')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="professionalbound" ><s:property value='professionalbound'/></textarea>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expert_resume')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="resume" ><s:property value='resume'/></textarea>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expert_workcapity')}"/> 
				</td>					
				<td colspan="3"> 
					<input type="checkbox" class="bscheckbox"  name="workcaplitystrategy" <s:property value='workcaplitystrategy'/> value="checked"><s:property value="%{getText('expert_workcapity_1')}"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplitypolicy" <s:property value='workcaplitypolicy'/> value="checked"><s:property value="%{getText('expert_workcapity_2')}"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplitymarket" <s:property value='workcaplitymarket'/> value="checked"><s:property value="%{getText('expert_workcapity_3')}"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplityconstruct" <s:property value='workcaplityconstruct'/> value="checked"><s:property value="%{getText('expert_workcapity_4')}"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplityquality" <s:property value='workcaplityquality'/> value="checked"><s:property value="%{getText('expert_workcapity_5')}"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplitysupervision" <s:property value='workcaplitysupervision'/> value="checked"><s:property value="%{getText('expert_workcapity_6')}"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplitycost" <s:property value='workcaplitycost'/> value="checked"><s:property value="%{getText('expert_workcapity_7')}"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplityprojend" <s:property value='workcaplityprojend'/> value="checked"><s:property value="%{getText('expert_workcapity_8')}"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplityprojesta" <s:property value='workcaplityprojesta'/> value="checked"><s:property value="%{getText('expert_workcapity_9')}"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplitystandard" <s:property value='workcaplitystandard'/> value="checked"><s:property value="%{getText('expert_workcapity_10')}"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplitytrademark" <s:property value='workcaplitytrademark'/> value="checked"><s:property value="%{getText('expert_workcapity_11')}"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplityrisk" <s:property value='workcaplityrisk'/> value="checked"><s:property value="%{getText('expert_workcapity_12')}"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplitydataanalys" <s:property value='workcaplitydataanalys'/> value="checked"><s:property value="%{getText('expert_workcapity_13')}"/>
					&nbsp;&nbsp;<s:property value="%{getText('expert_workcapity_14')}"/>
					<input type="text" name="workcaplityothers" value="<s:property value='workcaplityothers'/>"/>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>