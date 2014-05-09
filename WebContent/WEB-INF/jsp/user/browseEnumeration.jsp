<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<s:action name="enumerationPaging" id="paging" namespace="/system" executeResult="false">
		<s:param name="rows" value="10"/>
	</s:action>

	<div class="buttonUl"><ul><m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/system/browseEnumeration.action?pno={page}" pageLimit="5" showTotalPage="true" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" /></ul></div>  

	<s:action name="enumeration!list" namespace="/system" executeResult="true" >
		<s:param name="pno" value="#parameters.pno"/>
		<s:param name="rows" value="10"/>
	</s:action>