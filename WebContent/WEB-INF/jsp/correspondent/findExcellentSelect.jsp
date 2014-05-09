<%@ include file="/WEB-INF/jsp/header.jsp" %>

<div> 
	<table class="basic-table-sh">
		<tr>
			<td >
				<div class="screenlet">
					<div class="screenlet-header widget">
						<div class="item-box">
							<h3 class="screenlet-title">
							<s:property value="%{getText('common_find')}"/><s:property value="%{getText('excellentselect')}"/>
							</h3>
						</div>
					</div>
				</div>
			</td>
		</tr>
		<tr>
			<td>
				<form id="editForm" class="submitForm" action="/correspondent/findExcellentSelect.action" method="post">
					<input type="hidden" name="defaultSearch" value="N" />
					<table>
						<tr>
							<td class="label"><s:property value="%{getText('excellentselect_selectYear')}"/> </td>					
							<td> 
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_YEAR'}" />
								    <s:param name="selectName" value="%{'selectyear'}"/>
								    <s:param name="selectedKey" value="%{selectyear}"/>
							  	</s:action>
							</td>
							<td class="label">
								<s:property value="%{getText('excellentselect_requestTypeId')}"/>
							</td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'REQUEST_TYPE'}" />
								    <s:param name="selectName" value="%{'requesttypeid'}"/>
								    <s:param name="selectedKey" value="%{requesttypeid}"/>
							  	</s:action>
							</td>
							<td align="left"><input type="submit" class="submitButton" value="<s:property value="%{getText('common_find')}"/>" /> </td>
							<%if(request.getParameter("defaultSearch")!=null && "N".equals(request.getParameter("defaultSearch"))){ %>
							<td><a class="submitButton" target="blank" href="/correspondent/exportExcellentSelect.action?selectyear=<s:property  value='#parameters.selectyear'/>&requesttypeid=<s:property  value='#parameters.requesttypeid'/>"><s:property value="%{getText('excellentselect_exporttoexcel')}"/></a></td>
							<%} %>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</div>
  <s:action name="excellentselectPaging" id="paging" namespace="/correspondent" executeResult="false">
      <s:param name="rows" value="200"/>
  </s:action>
  
  <s:action name="excellentselect!query" namespace="/correspondent" executeResult="true" >
  	<s:param name="pno" value="#parameters.pno"/>
    <s:param name="rows" value="200"/>
    <s:param name="selectyear" value="#parameters.selectyear"/>
    <s:param name="requesttypeid" value="#parameters.requesttypeid"/>
  </s:action>
  <div class="buttonUl">
  	<ul>
  		<m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/correspondent/findExcellentSelect.action?pno={page}&selectyear=%{#parameters.selectyear}&requesttypeid=%{#parameters.requesttypeid}" pageLimit="5" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" />
  	</ul>
  </div>
