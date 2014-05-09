<%@ include file="/WEB-INF/jsp/header.jsp" %>

<%
String name = request.getParameter("name");
if(name!=null && !name.isEmpty()){
	name = java.net.URLEncoder.encode(name, "UTF-8");
	request.setAttribute("encodename",name);
}
String legalrepresentative = request.getParameter("legalrepresentative");
if(legalrepresentative!=null && !legalrepresentative.isEmpty()){
	legalrepresentative = java.net.URLEncoder.encode(legalrepresentative, "UTF-8");
	request.setAttribute("encodelegalrepresentative",legalrepresentative);
}
String linkman = request.getParameter("linkman");
if(linkman!=null && !linkman.isEmpty()){
	linkman = java.net.URLEncoder.encode(linkman, "UTF-8");
	request.setAttribute("encodelinkman",linkman);
}

%>

<div> 
	<table class="basic-table-sh">
		<tr>
			<td width="20%">
				<div class="screenlet">
					<div class="screenlet-header widget">
						<div class="item-box">
							<h3 class="screenlet-title">
							<s:property value="%{getText('common_find')}"/><s:property value="%{getText('enterprise')}"/>
							</h3>
						</div>
					</div>
				</div>
			</td>
			<td width="50%">&nbsp;</td>
			<td align="right">
				&nbsp;
			</td>
		</tr>
		<tr>
			<td colspan="3">
				<form id="editForm" class="submitForm" action="/enterprise/findEnterprise.action" method="post">
					<input type="hidden" name="defaultSearch" value="N" />
					<table>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_name')}"/> </td>
							<td><input type="text" name="name" value="<s:property  value='#parameters.name'/>"/> </td>
							
							<td class="label"><s:property value="%{getText('enterprise_legalRepresentative')}"/> </td>					
							<td><input type="text" name="legalrepresentative" value="<s:property  value='#parameters.legalrepresentative'/>"/> </td>

							<td class="label"><s:property value="%{getText('enterprise_linkman')}"/> </td>					
							<td><input type="text" name="linkman" value="<s:property  value='#parameters.linkman'/>"/> </td>							
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_qualifacationGetFire')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
								    <s:param name="selectName" value="%{'qualifacationgetfire'}"/>
								    <s:param name="selectedKey" value="%{qualifacationgetfire}"/>
							  	</s:action>							
							</td>
							
							<td class="label"><s:property value="%{getText('enterprise_qualifacationGetConf')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL_CONF'}" />
								    <s:param name="selectName" value="%{'qualifacationgetconf'}"/>
								    <s:param name="selectedKey" value="%{qualifacationgetconf}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_qualifacationGetBuildInte')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL_CONF'}" />
								    <s:param name="selectName" value="%{'qualifacationgetbuildinte'}"/>
								    <s:param name="selectedKey" value="%{qualifacationgetbuildinte}"/>
							  	</s:action>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_qualifacationGetBuildProj')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
								    <s:param name="selectName" value="%{'qualifacationgetbuildproj'}"/>
								    <s:param name="selectedKey" value="%{qualifacationgetbuildproj}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_qualifacationGetITInte')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL_IT'}" />
								    <s:param name="selectName" value="%{'qualifacationgetitinte'}"/>
								    <s:param name="selectedKey" value="%{qualifacationgetitinte}"/>
							  	</s:action>							
							</td>
							<td class="label"><s:property value="%{getText('enterprise_qualificationSupervision')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
								    <s:param name="selectName" value="%{'qualificationsupervision'}"/>
								    <s:param name="selectedKey" value="%{qualificationsupervision}"/>
							  	</s:action>							
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_qualificationComputerSp')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
								    <s:param name="selectName" value="%{'qualificationcomputersp'}"/>
								    <s:param name="selectedKey" value="%{qualificationcomputersp}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('finance_assets')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'AMOUNT_RANGE'}" />
								    <s:param name="selectName" value="%{'totalassets'}"/>
								    <s:param name="selectedKey" value="%{totalassets}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('finance_income')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'AMOUNT_RANGE'}" />
								    <s:param name="selectName" value="%{'businessincome'}"/>
								    <s:param name="selectedKey" value="%{businessincome}"/>
							  	</s:action>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_IntegrityInfo')}"/><s:property value="%{getText('integrityinfo_captureTime')}"/></td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_YEAR'}" />
								    <s:param name="selectName" value="%{'productbound'}"/>
								    <s:param name="selectedKey" value="%{productbound}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_spQualifacationLevelDescripton')}"/></td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
								    <s:param name="selectName" value="%{'spqualifacationlevel'}"/>
								    <s:param name="selectedKey" value="%{spqualifacationlevel}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_nature')}"/></td>					
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'ENTERP_NATURE'}" />
								    <s:param name="selectName" value="%{'natureid'}"/>
								    <s:param name="selectedKey" value="%{natureid}"/>
							  	</s:action>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_memberType')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'ENTERP_MEMBER_TYPE'}" />
								    <s:param name="selectName" value="%{'membertypeid'}"/>
								    <s:param name="selectedKey" value="%{membertypeid}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_qualityCertifacationDescripton')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_CERTI'}" />
								    <s:param name="selectName" value="%{'qualitycertifacation'}"/>
								    <s:param name="selectedKey" value="%{qualitycertifacation}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_feePayment')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'ENTERP_FEE_FLAG'}" />
								    <s:param name="selectName" value="%{'feepaymentflag'}"/>
								    <s:param name="selectedKey" value="%{feepaymentflag}"/>
							  	</s:action>							
							</td>						
						</tr>
						
						<tr>
							<td align="left"><input type="submit" class="submitButton" value="<s:property value="%{getText('common_find')}"/>" /> </td>
							<%if(request.getParameter("defaultSearch")!=null && "N".equals(request.getParameter("defaultSearch"))){ %>
							<td><a class="submitButton" target="blank" href="/enterprise/exportEnterprise.action?name=<s:property  value='#request.name'/>&legalrepresentative=<s:property  value='#request.legalrepresentative'/>&linkman=<s:property  value='#request.linkman'/>&spqualifacationlevel=<s:property  value='#request.spqualifacationlevel'/>&qualifacationgetfire=<s:property  value='#parameters.qualifacationgetfire'/>&qualifacationgetconf=<s:property  value='#parameters.qualifacationgetconf'/>&qualifacationgetbuildinte=<s:property  value='#parameters.qualifacationgetbuildinte'/>&qualifacationgetbuildproj=<s:property  value='#parameters.qualifacationgetbuildproj'/>&qualifacationgetitinte=<s:property  value='#parameters.qualifacationgetitinte'/>&qualificationsupervision=<s:property  value='#parameters.qualificationsupervision'/>&qualificationcomputersp=<s:property  value='#parameters.qualificationcomputersp'/>&totalassets=<s:property  value='#parameters.totalassets'/>&businessincome=<s:property  value='#parameters.businessincome'/>&productbound=<s:property  value='#parameters.productbound'/>&natureid=<s:property  value='#parameters.natureid'/>&qualitycertifacation=<s:property  value='#parameters.qualitycertifacation'/>&feepaymentflag=<s:property  value='#parameters.feepaymentflag'/>"><s:property value="%{getText('enterprise_exporttoexcel')}"/></a></td>
							<%} %>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</div>
  <s:action name="enterprisePaging" id="paging" namespace="/enterprise" executeResult="false">
      <s:param name="rows" value="20"/>
  </s:action>
  <s:action name="enterprise!query" namespace="/enterprise" executeResult="true" >
  	<s:param name="pno" value="#parameters.pno"/>
    <s:param name="rows" value="20"/>
    <s:param name="name" value="#parameters.name"/>
    <s:param name="legalrepresentative" value="#parameters.legalrepresentative"/>
    <s:param name="linkman" value="#parameters.linkman"/>
    <s:param name="membertypeid" value="#parameters.membertypeid"/>
    <s:param name="qualifacationgetfire" value="#parameters.qualifacationgetfire"/>
    <s:param name="qualifacationgetconf" value="#parameters.qualifacationgetconf"/>
    <s:param name="qualifacationgetbuildinte" value="#parameters.qualifacationgetbuildinte"/>
    <s:param name="qualifacationgetbuildproj" value="#parameters.qualifacationgetbuildproj"/>
    <s:param name="qualifacationgetitinte" value="#parameters.qualifacationgetitinte"/>
    <s:param name="qualificationsupervision" value="#parameters.qualificationsupervision"/>
    <s:param name="qualificationcomputersp" value="#parameters.qualificationcomputersp"/>
    <s:param name="totalassets" value="#parameters.totalassets"/>
    <s:param name="businessincome" value="#parameters.businessincome"/>
    <s:param name="spqualifacationlevel" value="#parameters.spqualifacationlevel"/>
    <s:param name="natureid" value="#parameters.natureid"/>
    <s:param name="qualitycertifacation" value="#parameters.qualitycertifacation"/>
    <s:param name="feepaymentflag" value="#parameters.feepaymentflag"/>
  </s:action>
  <div class="buttonUl">
  	<ul>
  	<m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/enterprise/findEnterprise.action?pno={page}&name=%{#request.encodename}&legalrepresentative=%{#request.encodelegalrepresentative}&linkman=%{#request.linkman}&membertypeid=%{#parameters.membertypeid}&qualifacationgetfire=%{#parameters.qualifacationgetfire}&qualifacationgetconf=%{#parameters.qualifacationgetconf}&qualifacationgetbuildinte=%{#parameters.qualifacationgetbuildinte}&qualifacationgetbuildproj=%{#parameters.qualifacationgetbuildproj}&qualifacationgetitinte=%{#parameters.qualifacationgetitinte}&qualificationsupervision=%{#parameters.qualificationsupervision}&qualificationcomputersp=%{#parameters.qualificationcomputersp}&totalassets=%{#parameters.totalassets}&businessincome=%{#parameters.businessincome}&spqualifacationlevel=%{#parameters.spqualifacationlevel}&natureid=%{#parameters.natureid}&qualitycertifacation=%{#parameters.qualitycertifacation}&feepaymentflag=%{#parameters.feepaymentflag}" pageLimit="10" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" />
  	</ul>
  </div>