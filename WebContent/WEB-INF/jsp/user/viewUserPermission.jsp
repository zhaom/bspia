<%@ include file="/WEB-INF/jsp/header.jsp" %>
<s:action name="userPermission!show" namespace="/system" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>
<div class="buttonUl"><ul><li><a class="submitButton" href="/system/browse.action"><s:property value="%{getText('common_back')}"/></a></li></ul></div>