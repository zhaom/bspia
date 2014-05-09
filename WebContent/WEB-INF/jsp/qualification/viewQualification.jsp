<%@ include file="/WEB-INF/jsp/header.jsp" %>

<s:action name="qualification!show" namespace="/qualification" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>
<div class="buttonUl"><ul><li><a  class="submitButton" href="/qualification/browseQualification.action?requestId=<%=request.getParameter("enterpriseid") %>"><s:property value="%{getText('common_back')}"/></a></li></ul></div>


