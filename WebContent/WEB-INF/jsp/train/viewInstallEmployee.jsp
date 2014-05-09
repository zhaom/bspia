<%@ include file="/WEB-INF/jsp/header.jsp" %>

<s:action name="installEmployee!show" namespace="/train" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>
<div class="buttonUl">
	<ul>
		<li>
			<a  class="submitButton" href="/train/browseInstallEmployee.action"><s:property value="%{getText('common_back')}"/></a>
		</li>
		<li>
			<a  class="submitButton" href="/train/uploadInstallEmployeePicture.action?id=<%=request.getParameter("requestId")  %>"><s:property value="%{getText('correspondent_upload_picture')}"/></a>
		</li>
	</ul>
</div>