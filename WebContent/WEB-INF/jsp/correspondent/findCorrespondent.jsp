<%@ include file="/WEB-INF/jsp/header.jsp" %>

<%
String name = request.getParameter("name");
if(name!=null && !name.isEmpty()){
	name = java.net.URLEncoder.encode(name, "UTF-8");
	request.setAttribute("encodename",name);
}
String workplace = request.getParameter("workplace");
if(workplace!=null && !workplace.isEmpty()){
	workplace = java.net.URLEncoder.encode(workplace, "UTF-8");
	request.setAttribute("encodeworkplace",workplace);
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
				<form id="editForm" class="submitForm" action="/correspondent/findCorrespondent.action" method="post">
					<input type="hidden" name="defaultSearch" value="N" />
					<table>
						<tr>
							<td class="label"><s:property value="%{getText('correspondent_name')}"/> </td>
							<td><input type="text" name="name" value="<s:property  value='#parameters.name'/>"/> </td>
							
							<td class="label"><s:property value="%{getText('correspondent_workplace')}"/> </td>					
							<td><input type="text" name="workplace" value="<s:property  value='#parameters.workplace'/>"/> </td>
							<td class="label"><s:property value="%{getText('correspondent_publishenumdesc')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'YORN_FLAG'}" />
								    <s:param name="selectName" value="%{'publishenumid'}"/>
								    <s:param name="selectedKey" value="%{publishenumid}"/>
							  	</s:action>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('correspondent_excellentdesc')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'YORN_FLAG'}" />
								    <s:param name="selectName" value="%{'excellentenumid'}"/>
								    <s:param name="selectedKey" value="%{excellentenumid}"/>
							  	</s:action>							
							</td>
							
							<td class="label"><s:property value="%{getText('correspondent_excellentyeardesc')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_YEAR'}" />
								    <s:param name="selectName" value="%{'excellentyear'}"/>
								    <s:param name="selectedKey" value="%{excellentyear}"/>
							  	</s:action>
							</td>
							<td align="left"><input type="submit" class="submitButton" value="<s:property value="%{getText('common_find')}"/>" /> </td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</div>
  <s:action name="correspondentPaging" id="paging" namespace="/correspondent" executeResult="false">
      <s:param name="rows" value="100"/>
  </s:action>
  <s:action name="correspondent!query" namespace="/correspondent" executeResult="true" >
  	<s:param name="pno" value="#parameters.pno"/>
    <s:param name="rows" value="100"/>
    <s:param name="name" value="#parameters.name"/>
    <s:param name="workplace" value="#parameters.workplace"/>
    <s:param name="publishenumid" value="#parameters.publishenumid"/>
    <s:param name="excellentenumid" value="#parameters.excellentenumid"/>
    <s:param name="excellentyear" value="#parameters.excellentyear"/>
  </s:action>
  <div class="buttonUl">
  	<ul>
  	<m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/correspondent/findCorrespondent.action?pno={page}&name=%{#request.encodename}&workplace=%{#request.encodeworkplace}&publishenumid=%{#parameters.publishenumid}&excellentenumid=%{#parameters.excellentenumid}&excellentyear=%{#parameters.excellentyear}" pageLimit="10" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" />
  	</ul>
  </div>