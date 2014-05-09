<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/expert/expertproject!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		<input type="hidden" name="enterpriseid" value="<s:property value='enterpriseid'/>"/>
		
		<table class="basic-form">

			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_name')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="name" size="100" value="<s:property value='name'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_address')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="address" size="100" value="<s:property value='address'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_category')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'EXPERT_PROJ_CATE'}" />
					    <s:param name="selectName" value="%{'categoryenumid'}"/>
					    <s:param name="selectedKey" value="%{categoryenumid}"/>
				  	</s:action>
				</td>
				<td class="label">
					<s:property value="%{getText('expertproject_industry')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'EXPERT_PROJ_BIZ'}" />
					    <s:param name="selectName" value="%{'industryenumid'}"/>
					    <s:param name="selectedKey" value="%{industryenumid}"/>
				  	</s:action>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_level')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'EXPERT_PROJ_LVL'}" />
					    <s:param name="selectName" value="%{'levelenumid'}"/>
					    <s:param name="selectedKey" value="%{levelenumid}"/>
				  	</s:action>
				</td>
				<td class="label">
					<s:property value="%{getText('expertproject_amount')}"/>
				</td>
				<td>
					<input type="text" name="amount" value="<s:property value='amount'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_begintime')}"/>
				</td>
				<td>
					<input type="text" name="begintime" class="inputDatetime" value="<s:property value='begintime'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('expertproject_endtime')}"/>
				</td>
				<td>
					<input type="text" name="endtime" class="inputDatetime" value="<s:property value='endtime'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_buildCorpName')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="buildcorpname" size="100" value="<s:property value='buildcorpname'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_buildCorpAddr')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="buildcorpaddr" size="100" value="<s:property value='buildcorpaddr'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_buildCorpContact')}"/>
				</td>
				<td>
					<input type="text" name="buildcorpcontact" value="<s:property value='buildcorpcontact'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('expertproject_buildCorpContactTele')}"/>
				</td>
				<td>
					<input type="text" name="buildcorpcontacttele" value="<s:property value='buildcorpcontacttele'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_designCorpName')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="designcorpname" size="100" value="<s:property value='designcorpname'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_designCorpAddr')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="designcorpaddr" size="100" value="<s:property value='designcorpaddr'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_designCorpContact')}"/>
				</td>
				<td>
					<input type="text" name="designcorpcontact" value="<s:property value='designcorpcontact'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('expertproject_designCorpContactTele')}"/>
				</td>
				<td>
					<input type="text" name="designcorpcontacttele" value="<s:property value='designcorpcontacttele'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_constructionCorpName')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="constructioncorpname" size="100" value="<s:property value='constructioncorpname'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_constructionCorpAddr')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="constructioncorpaddr" size="100" value="<s:property value='constructioncorpaddr'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_constructionCorpContact')}"/>
				</td>
				<td>
					<input type="text" name="constructioncorpcontact" value="<s:property value='constructioncorpcontact'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('expertproject_constructionCorpContactTele')}"/>
				</td>
				<td>
					<input type="text" name="constructioncorpcontacttele" value="<s:property value='constructioncorpcontacttele'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_supervisionCorpName')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="supervisioncorpname" size="100" value="<s:property value='supervisioncorpname'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_supervisionCorpAddr')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="supervisioncorpaddr" size="100" value="<s:property value='supervisioncorpaddr'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_supervisionCorpContact')}"/>
				</td>
				<td>
					<input type="text" name="supervisioncorpcontact" value="<s:property value='supervisioncorpcontact'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('expertproject_supervisionCorpContactTele')}"/>
				</td>
				<td>
					<input type="text" name="supervisioncorpcontacttele" value="<s:property value='supervisioncorpcontacttele'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_serviceType')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'SERVICE_TYPE'}" />
					    <s:param name="selectName" value="%{'servicetypeenumid'}"/>
					    <s:param name="selectedKey" value="%{servicetypeenumid}"/>
				  	</s:action>
				</td>
				<td class="label">
					<s:property value="%{getText('expertproject_acceptanceTime')}"/>
				</td>
				<td>
					<input type="text" name="acceptancetime" class="inputDatetime" value="<s:property value='acceptancetime'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_serviceExpert')}"/>
				</td>
				<td>
					<input type="text" name="serviceexpert" value="<s:property value='serviceexpert'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('expertproject_serviceTime')}"/>
				</td>
				<td>
					<input type="text" name="servicetime" class="inputDatetime" value="<s:property value='servicetime'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_serviceFee')}"/>
				</td>
				<td>
					<input type="text" name="servicefee" value="<s:property value='servicefee'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('expertproject_serviceResult')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'SELECT_RESULT'}" />
					    <s:param name="selectName" value="%{'serviceresultenumid'}"/>
					    <s:param name="selectedKey" value="%{serviceresultenumid}"/>
				  	</s:action>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_serviceViews')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="serviceviews" ><s:property value='serviceviews'/></textarea>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_remark')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="remark" ><s:property value='remark'/></textarea>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('expertproject_otherRemark')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="otherremark" ><s:property value='otherremark'/></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>