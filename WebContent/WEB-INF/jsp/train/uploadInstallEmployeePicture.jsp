<%@ include file="/WEB-INF/jsp/header.jsp" %>

    <form id="editForm" class="submitForm" action="/train/installEmployee!uploadPicture.action" method="post" enctype="multipart/form-data"> 
        <s:property value="%{getText('correspondent_upload_browsepicture')}"/>
        <input type="hidden" name="requestId" value="<s:property  value='#parameters.id'/>">
        <input type="file" name="file" />
        <input type="submit" class="submitButton"
			value=<s:property value="%{getText('common_submit')}"/> />
    </form >