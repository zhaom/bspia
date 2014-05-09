<%@ include file="/WEB-INF/jsp/header.jsp" %>

<s:action name="expert!show" namespace="/expert" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>
<div class="buttonUl">
	<ul>
		<li>
			<a  class="submitButton" href="/expert/browse.action"><s:property value="%{getText('common_back')}"/></a>
		</li>
		<li>
			<a  class="submitButton" href="/expert/uploadExpertPicture.action?id=<%=request.getParameter("requestId")  %>"><s:property value="%{getText('correspondent_upload_picture')}"/></a>
		</li>
	</ul>
</div>