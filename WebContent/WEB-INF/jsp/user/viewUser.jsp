<%@ include file="/WEB-INF/jsp/header.jsp" %>

<s:action name="user!show" namespace="/system" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>

<div class="buttonUl"><ul><li><a href="/system/browse.action"><s:property value="%{getText('common_back')}"/></a></li></ul></div>