<%@ include file="/WEB-INF/jsp/header.jsp" %>

<s:action name="candidate!show" namespace="/train" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>
<div class="buttonUl"><ul><li><a  class="submitButton" href="/train/browseCandidates.action"><s:property value="%{getText('common_back')}"/></a></li></ul></div>