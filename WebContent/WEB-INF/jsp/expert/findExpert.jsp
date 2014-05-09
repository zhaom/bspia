<%@ include file="/WEB-INF/jsp/header.jsp" %>


<div> 
	<table class="basic-table-sh">
		<tr>
			<td >
				<div class="screenlet">
					<div class="screenlet-header widget">
						<div class="item-box">
							<h3 class="screenlet-title">
							<s:property value="%{getText('common_find')}"/><s:property value="%{getText('expert')}"/>
							</h3>
						</div>
					</div>
				</div>
			</td>
		</tr>
		<tr>
			<td>
				<form id="editForm" class="submitForm" action="/expert/findExpert.action" method="post">
					<input type="hidden" name="defaultSearch" value="N" />
					<table>
						<tr>
							<td class="label">
								<s:property value="%{getText('expert_retirementEnumId')}"/>
							</td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'EXPERT_RETIRE'}" />
								    <s:param name="selectName" value="%{'retirementenumid'}"/>
								    <s:param name="selectedKey" value="%{retirementenumid}"/>
							  	</s:action>
							</td>
							<td class="label">
								<s:property value="%{getText('expert_majordirection')}"/>
							</td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'MAJOR_DIRECT'}" />
								    <s:param name="selectName" value="%{'majordirectenumid'}"/>
								    <s:param name="selectedKey" value="%{majordirectenumid}"/>
							  	</s:action>
							</td>
							<td class="label">
								<s:property value="%{getText('expert_gender')}"/>
							</td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'GENDER_TYPE'}" />
								    <s:param name="selectName" value="%{'genderenumid'}"/>
								    <s:param name="selectedKey" value="%{genderenumid}"/>
							  	</s:action>
							</td>
						</tr>
						<tr>
							<td class="label">
								<s:property value="%{getText('excellentselect_requestOld')}"/>
							</td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'OLD_RANGE'}" />
								    <s:param name="selectName" value="%{'workduring'}"/>
								    <s:param name="selectedKey" value="%{workduring}"/>
							  	</s:action>
							</td>
							<td align="left"><input type="submit" class="submitButton" value="<s:property value="%{getText('common_find')}"/>" /> </td>
							<%if(request.getParameter("defaultSearch")!=null && "N".equals(request.getParameter("defaultSearch"))){ %>
							<td><a class="submitButton" target="blank" href="/expert/exportExpert.action?retirementenumid=<s:property  value='#parameters.retirementenumid'/>&majordirectenumid=<s:property  value='#parameters.majordirectenumid'/>&genderenumid=<s:property  value='#parameters.genderenumid'/>&workduring=<s:property  value='#parameters.workduring'/>"><s:property value="%{getText('expert_exporttoexcel')}"/></a></td>
							<%} %>
							<td>&nbsp;</td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</div>
	<s:action name="expertPaging" id="paging" namespace="/expert" executeResult="false">
		<s:param name="rows" value="200"/>
	</s:action>
	
	<s:action name="expert!query" namespace="/expert" executeResult="true" >
		<s:param name="pno" value="#parameters.pno"/>
		<s:param name="rows" value="200"/>
		<s:param name="retirementenumid" value="#parameters.retirementenumid"/>
		<s:param name="majordirectenumid" value="#parameters.majordirectenumid"/>
		<s:param name="genderenumid" value="#parameters.genderenumid"/>
		<s:param name="workduring" value="#parameters.workduring"/>
	</s:action>
	
	<div class="buttonUl">
		<ul>
			<m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/expert/findExpert.action?pno={page}&majordirectenumid=%{#parameters.majordirectenumid}&retirementenumid=%{#parameters.retirementenumid}&genderenumid=%{#parameters.genderenumid}&workduring=%{#parameters.workduring}" pageLimit="10" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" />
		</ul>
	</div>