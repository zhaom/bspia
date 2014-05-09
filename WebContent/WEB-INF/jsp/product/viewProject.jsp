<%@ include file="/WEB-INF/jsp/header.jsp" %>

<s:action name="project!show" namespace="/product" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>
<div class="buttonUl"><ul><li><a  class="submitButton" href="/product/browseProject.action"><s:property value="%{getText('common_back')}"/></a></li></ul></div>


