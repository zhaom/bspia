<%@ include file="/WEB-INF/jsp/menu.jsp" %>

	<form id="editForm" class="submitForm" action="/self/selfCompleteProject!uploadByExcel.action" enctype="multipart/form-data" method="post">
		<s:property value="%{getText('self_completeproj_import_browsefile')}"/>
		<input type="file" name="file"></input>
		<input type="submit" class="submitButton" value=<s:property value="%{getText('common_submit')}"/> />
	</form>
	
<%@ include file="/WEB-INF/jsp/bottom.jsp" %>