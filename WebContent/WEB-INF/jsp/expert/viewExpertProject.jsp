<%@ include file="/WEB-INF/jsp/header.jsp" %>

<s:action name="expertproject!show" namespace="/expert" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>
<div class="buttonUl"><ul><li><a  class="submitButton" href="/expert/browseExpertProject.action"><s:property value="%{getText('common_back')}"/></a></li></ul></div>