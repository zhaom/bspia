<%@ include file="/WEB-INF/jsp/header.jsp" %>

  <s:action name="userPermission!list" namespace="/system" executeResult="true" >
	<s:param name="requestId" value="requestId"/>
  	<s:param name="pno" value="0"/>
    <s:param name="rows" value="100"/>
  </s:action>
  <div class="buttonUl"><ul><li><a class="submitButton" href="/system/userPermission!add.action?userId=<%=request.getParameter("requestId")%>"><s:property value="%{getText('common_add')}"/>  </a></li></ul></div>