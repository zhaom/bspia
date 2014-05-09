<%@ include file="/WEB-INF/jsp/header.jsp" %>

<s:action name="finance!show" namespace="/finance" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>
<div class="buttonUl"><ul><li><a  class="submitButton" href="/finance/browseFinance.action?requestId={enterpriseid}"><s:property value="%{getText('common_back')}"/></a></li></ul></div>


