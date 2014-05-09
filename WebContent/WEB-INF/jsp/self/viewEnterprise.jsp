<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%

String requestId = request.getParameter("requestId");

%>

<div class="buttonUl">
	<ul>
		<li>
			<a  class="submitButton" href="/self/viewListCompleteProject.action?requestId=<%=requestId %>"><s:property value="%{getText('self_completeproj_list')}"/></a>
		</li>
		<li>
			<a  class="submitButton" href="/self/viewListCostEngineer.action?requestId=<%=requestId %>"><s:property value="%{getText('self_costengineer')}"/></a>
		</li>
		<li>
			<a  class="submitButton" href="/self/viewListTechPerson.action?requestId=<%=requestId %>"><s:property value="%{getText('self_techperson')}"/></a>
		</li>
	</ul>
</div>
<div>
	<s:action name="selfEnterprise!show" namespace="/self" executeResult="true">
		<s:param name="requestId" value="requestId"/>
	</s:action>
</div>