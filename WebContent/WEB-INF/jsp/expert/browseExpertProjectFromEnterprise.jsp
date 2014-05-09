<%@ include file="/WEB-INF/jsp/header.jsp" %>


  <s:action name="expertprojectPaging" id="paging" namespace="/expert" executeResult="false">
      <s:param name="rows" value="10"/>
  </s:action>
	<div class="buttonUl"><ul><m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/expert/browseExpertProjectFromEnterprise.action?pno={page}&requestId=%{#parameters.requestId}" pageLimit="5" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" /></ul></div>  
  <s:action name="expertproject!list" namespace="/expert" executeResult="true" >
  	<s:param name="pno" value="#parameters.pno"/>
    <s:param name="rows" value="10"/>
    <s:param name="requestId" value="#parameters.requestId"/>
  </s:action>

  <div class="buttonUl"><ul><li><a class="submitButton" href="/expert/expertproject!add.action?enterpriseid=<%=request.getParameter("requestId")%>"><s:property value="%{getText('common_add')}"/></a></li></ul></div>