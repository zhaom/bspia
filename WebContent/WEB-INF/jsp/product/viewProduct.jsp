<%@ include file="/WEB-INF/jsp/header.jsp" %>

<s:action name="product!show" namespace="/product" executeResult="true">
	<s:param name="requestId" value="requestId"/>
</s:action>
<div class="buttonUl"><ul><li><a  class="submitButton" href="/product/browseProduct.action"><s:property value="%{getText('common_back')}"/></a></li></ul></div>


