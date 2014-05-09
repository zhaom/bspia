<%@ include file="/WEB-INF/jsp/header.jsp" %>

<s:action name="integrity!show" namespace="/qualification" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>
<div class="buttonUl"><ul><li><a  class="submitButton" href="/qualification/browseIntegrityinfo.action?requestId=<%=request.getParameter("enterpriseid") %>"><s:property value="%{getText('common_back')}"/></a></li></ul></div>


