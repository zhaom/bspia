<%@ include file="/WEB-INF/jsp/header.jsp" %>

    <form id="editForm" class="submitForm" action="/correspondent/correspondent!uploadByExcel.action" method="post" enctype="multipart/form-data"> 
        <s:property value="%{getText('correspondent_import_browsefile')}"/>
        <input type="file" name="file" />
        <input type="submit" class="submitButton"
			value=<s:property value="%{getText('common_submit')}"/> />
    </form >