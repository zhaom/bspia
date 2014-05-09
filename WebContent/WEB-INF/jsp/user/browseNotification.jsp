<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<s:action name="notificationPaging" id="paging" namespace="/system" executeResult="false">
		<s:param name="rows" value="10"/>
	</s:action>
	<%--
	<div class="buttonUl"><ul><m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/system/browseNotification.action?pno={page}" pageLimit="5" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" /></ul></div>  
 	--%>
	<s:action name="notification!list" namespace="/system" executeResult="true" >
		<s:param name="pno" value="#parameters.pno"/>
		<s:param name="rows" value="10"/>
	</s:action>
	<%--
	<div class="buttonUl"><ul><li><a class="submitButton" href="/system/notification!add.action"><s:property value="%{getText('common_add')}"/></a></li></ul></div>
	 --%>