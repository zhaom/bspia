<%@ include file="/WEB-INF/jsp/header.jsp" %>

<s:action name="train!show" namespace="/train" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>
<div class="buttonUl"><ul><li><a  class="submitButton" href="/train/browseTrain.action"><s:property value="%{getText('common_back')}"/></a></li></ul></div>


