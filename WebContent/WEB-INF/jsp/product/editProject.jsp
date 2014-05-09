<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/product/project!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		
		<input type="hidden" name="enterpriseid" value="<s:property value='enterpriseid'/>"/>
		
		<table class="basic-form">
			<tr>
				<td class="label">
					<s:property value="%{getText('project_name')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="name" size="100" value="<s:property value='name'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('project_amount')}"/>
				</td>
				<td>
					<input type="text" name="amount" value="<s:property value='amount'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('project_categoryId')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'PROJ_CATE'}" />
					    <s:param name="selectName" value="%{'categoryid'}"/>
					    <s:param name="selectedKey" value="%{categoryid}"/>
				  	</s:action>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('project_industry')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="industry" value="<s:property value='industry'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('project_beginTime')}"/>
				</td>
				<td>
					<input type="text" name="begintime"  class="inputDatetime" value="<s:property value='begintime'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('project_endTime')}"/>
				</td>
				<td>
					<input type="text" name="endtime" class="inputDatetime" value="<s:property value='endtime'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('project_constructionCycle')}"/>
				</td>
				<td>
					<input type="text" name="constructioncycle" value="<s:property value='constructioncycle'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('project_constructionProvince')}"/>
				</td>
				<td>
					<input type="text" name="constructionprovince" value="<s:property value='constructionprovince'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('project_constructionCity')}"/>
				</td>
				<td>
					<input type="text" name="constructioncity" value="<s:property value='constructioncity'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('project_constructionDistrict')}"/>
				</td>
				<td>
					<input type="text" name="constructiondistrict" value="<s:property value='constructiondistrict'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('project_buildCorp')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="buildcorp" value="<s:property value='buildcorp'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('project_designCorp')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="designcorp" value="<s:property value='designcorp'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('project_constructionCorp')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="constructioncorp" value="<s:property value='constructioncorp'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('project_supervisionCorp')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="supervisioncorp" value="<s:property value='supervisioncorp'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('project_honor')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="honor" value="<s:property value='honor'/>"/>
				</td>
			</tr>			
			<tr>
				<td class="label">
					<s:property value="%{getText('project_acceptanceTime')}"/>
				</td>
				<td>
					<input type="text" name="acceptancetime" class="inputDatetime" value="<s:property value='acceptancetime'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('project_acceptanceExpert')}"/>
				</td>
				<td>
					<input type="text" name="acceptanceexpert" value="<s:property value='acceptanceexpert'/>"/>
				</td>
			</tr>			
			<tr>
				<td class="label">
					<s:property value="%{getText('project_acceptanceFee')}"/>
				</td>
				<td>
					<input type="text" name="acceptancefee" value="<s:property value='acceptancefee'/>"/>
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
					<s:property value="%{getText('project_acceptanceViews')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="acceptanceviews" ><s:property value='acceptanceviews'/></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>