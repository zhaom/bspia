<%@ include file="/WEB-INF/jsp/header.jsp" %>

<%
String workplace = request.getParameter("workplace");
if(workplace!=null && !workplace.isEmpty()){
	workplace = java.net.URLEncoder.encode(workplace, "UTF-8");
	request.setAttribute("encodeworkplace",workplace);
}
%>
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
				<form id="editForm" class="submitForm" action="/train/findCandidates.action" method="post">
					<input type="hidden" name="defaultSearch" value="N" />
					<table>
						<tr>
							<td class="label"><s:property value="%{getText('candidates_workplace')}"/> </td>					
							<td><input type="text" name="workplace" value="<s:property  value='#parameters.workplace'/>"/> </td>
							<td align="left"><input type="submit" class="submitButton" value="<s:property value="%{getText('common_find')}"/>" /> </td>
							<td>&nbsp;</td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</div>
	<s:action name="candidatePaging" id="paging" namespace="/train" executeResult="false">
		<s:param name="rows" value="20"/>
	</s:action>
	
	<s:action name="candidate!query" namespace="/train" executeResult="true" >
		<s:param name="pno" value="#parameters.pno"/>
		<s:param name="rows" value="20"/>
		<s:param name="workplace" value="#parameters.workplace"/>
	</s:action>
	<div class="buttonUl">
		<ul>
			<m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/train/findCandidates.action?pno={page}&workplace=%{#request.encodeworkplace}" pageLimit="10" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" />
		</ul>
	</div>