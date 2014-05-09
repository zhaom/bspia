<%@ include file="/WEB-INF/jsp/header.jsp" %>

<s:action name="litigation!show" namespace="/finance" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>
<div class="buttonUl"><ul><li><a  class="submitButton" href="/finance/browseLitigation.action?requestId=<%=request.getParameter("enterpriseid") %>"><s:property value="%{getText('common_back')}"/></a></li></ul></div>