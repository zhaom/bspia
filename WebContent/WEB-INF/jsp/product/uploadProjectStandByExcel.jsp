<%@ include file="/WEB-INF/jsp/menu.jsp" %>

	<form id="editForm" class="submitForm" action="/product/projectStand!uploadByExcel.action" enctype="multipart/form-data" method="post">
		<s:property value="%{getText('projectstand_import_browsefile')}"/>
		<input type="file" name="file"></input>
		<input type="submit" class="submitButton" value=<s:property value="%{getText('common_submit')}"/> />
	</form>
	
<%@ include file="/WEB-INF/jsp/bottom.jsp" %>