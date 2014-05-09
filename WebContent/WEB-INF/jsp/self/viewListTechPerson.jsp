<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%
String requestId = request.getParameter("requestId");
%>
<div class="buttonUl">
	<ul>
		<li>
			<a  class="submitButton" href="/self/viewEnterprise.action?requestId=<%=requestId %>"><s:property value="%{getText('selfinfo')}"/></a>
		</li>
		<li>
			<a  class="submitButton" href="/self/viewListCompleteProject.action?requestId=<%=requestId %>"><s:property value="%{getText('self_completeproj_list')}"/></a>
		</li>
		<li>
			<a  class="submitButton" href="/self/viewListCostEngineer.action?requestId=<%=requestId %>"><s:property value="%{getText('self_costengineer')}"/></a>
		</li>	
	</ul>
</div>
<div>
  <s:action name="selfEnterprise!viewTech" namespace="/self" executeResult="true" >
    <s:param name="requestId" value="#parameters.requestId"/>
  </s:action>
</div>