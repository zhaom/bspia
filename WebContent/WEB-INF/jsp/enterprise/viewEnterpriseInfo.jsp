<%@ include file="/WEB-INF/jsp/header.jsp" %>

<s:action name="enterprise!show" namespace="/enterprise" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>
<div class="buttonUl"><ul><li><a  class="submitButton" href="/enterprise/browse.action"><s:property value="%{getText('common_back')}"/></a></li></ul></div>