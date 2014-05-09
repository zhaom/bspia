<%@ include file="/WEB-INF/jsp/header.jsp" %>

<form id="editForm" class="submitForm" action="/correspondent/excellentselect!save.action" method="post">

	<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
	<table class="basic-table-sh">
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><s:property value="%{getText('excellentselect_requestInfo')}"/></legend>
					<table class="basic-table-sh">
						<tr>
							<td class="label"><s:property value="%{getText('excellentselect_enterpriseName')}"/> </td>
							<td > <input type="text" name="enterprisename" value="<s:property value='enterprisename'/>"/> </td>
							<td class="label"><s:property value="%{getText('excellentselect_legalRepresentative')}"/> </td>					
							<td > 
								<input type="text" name="legalrepresentative" value="<s:property value='legalrepresentative'/>"/>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('excellentselect_address')}"/></td>					
							<td colspan="3">
								<input type="text" name="address" size="100" value="<s:property value='address'/>"/>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('excellentselect_selectYear')}"/> </td>					
							<td> 
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_YEAR'}" />
								    <s:param name="selectName" value="%{'selectyear'}"/>
								    <s:param name="selectedKey" value="%{selectyear}"/>
							  	</s:action>
							</td>
							<td class="label">
								<s:property value="%{getText('excellentselect_requestTypeId')}"/>
							</td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'REQUEST_TYPE'}" />
								    <s:param name="selectName" value="%{'requesttypeid'}"/>
								    <s:param name="selectedKey" value="%{requesttypeid}"/>
							  	</s:action>
							</td>
						</tr>

						
						<tr>
							<td class="label"><s:property value="%{getText('excellentselect_requestName')}"/> </td>					
							<td> 
								<input type="text" name="requestname" value="<s:property value='requestname'/>"/>							
							</td>
							<td class="label"><s:property value="%{getText('excellentselect_requestOld')}"/> </td>					
							<td> 
								<input type="text" name="requestold" value="<s:property value='requestold'/>"/>							
							</td>
						</tr>

						<tr>
							<td class="label"><s:property value="%{getText('excellentselect_position')}"/> </td>					
							<td><input type="text" name="position" value="<s:property value='position'/>"/></td>
							<td class="label"><s:property value="%{getText('excellentselect_spWorkDuring')}"/> </td>					
							<td><input type="text" name="spworkduring" value="<s:property value='spworkduring'/>"/></td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('excellentselect_majorTitle')}"/> </td>					
							<td><input type="text" name="majortitle" value="<s:property value='majortitle'/>"/> </td>

							<td class="label">
								<s:property value="%{getText('excellentselect_educationEnumId')}"/>
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
								<s:property value="%{getText('excellentselect_mobilePhone')}"/>
							</td>
							<td>
								<input type="text" name="mobilephone" value="<s:property value='mobilephone'/>"/>
							</td>
							<td class="label"><s:property value="%{getText('excellentselect_tele')}"/> </td>					
							<td><input type="text" name="tele" value="<s:property value='tele'/>"/></td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('excellentselect_requestLitigation')}"/></td>					
							<td colspan="3">
								<input type="text" name="requestlitigation" size="100" value="<s:property value='requestlitigation'/>"/>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('excellentselect_introduction')}"/> </td>					
							<td colspan="3">
								<textarea cols="75" rows="5" name="introduction" ><s:property value='introduction'/></textarea>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('excellentselect_requestPublish')}"/> </td>					
							<td colspan="3">
								<textarea cols="75" rows="5" name="requestpublish" ><s:property value='requestpublish'/></textarea>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('excellentselect_workIntroduction')}"/> </td>					
							<td colspan="3">
								<textarea cols="75" rows="5" name="workintroduction" ><s:property value='workintroduction'/></textarea>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('excellentselect_enterpriseRemark')}"/> </td>					
							<td colspan="3">
								<textarea cols="75" rows="5" name="enterpriseremark" ><s:property value='enterpriseremark'/></textarea>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('excellentselect_otherRemark')}"/> </td>					
							<td colspan="3">
								<textarea cols="75" rows="5" name="otherremark" ><s:property value='otherremark'/></textarea>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('excellentselect_checkReport')}"/> </td>					
							<td colspan="3">
								<textarea cols="75" rows="5" name="checkreport" ><s:property value='checkreport'/></textarea>
							</td>
						</tr>
					</table>
				</fieldset>
			</td>
		</tr>
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><s:property value="%{getText('excellentselect_selectInfo')}"/></legend>
					<table class="basic-table-sh">
						<tr>

							<td class="label">
								<s:property value="%{getText('excellentselect_selectResultEnumId')}"/>
							</td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'SELECT_RESULT'}" />
								    <s:param name="selectName" value="%{'selectresultenumid'}"/>
								    <s:param name="selectedKey" value="%{selectresultenumid}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('excellentselect_score')}"/> </td>					
							<td> <input type="text" name="score" value="<s:property value='score'/>"/></td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('excellentselect_selectRemark')}"/> </td>					
							<td colspan="3"><input type="text" name="selectremark" size="100" value="<s:property value='selectremark'/>"/> </td>
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