<%@ include file="/WEB-INF/jsp/header.jsp" %>

<s:action name="excellentselect!show" namespace="/correspondent" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>
<div class="buttonUl"><ul><li><a  class="submitButton" href="/correspondent/browseExcellentSelect.action"><s:property value="%{getText('common_back')}"/></a></li></ul></div>