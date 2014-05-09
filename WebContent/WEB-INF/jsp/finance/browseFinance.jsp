<%@ include file="/WEB-INF/jsp/header.jsp" %>


  <s:action name="financePaging" id="paging" namespace="/finance" executeResult="false">
      <s:param name="rows" value="10"/>
  </s:action>
	<div class="buttonUl"><ul><m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/finance/browseFinance.action?pno={page}&requestId=%{#parameters.requestId}" pageLimit="5" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" /></ul></div>  
  <s:action name="finance!list" namespace="/finance" executeResult="true" >
  	<s:param name="pno" value="#parameters.pno"/>
    <s:param name="rows" value="10"/>
    <s:param name="requestId" value="#parameters.requestId"/>
  </s:action>

  <div class="buttonUl"><ul><li><a class="submitButton" href="/finance/finance!add.action?enterpriseid=<%=request.getParameter("requestId")%>"><s:property value="%{getText('common_add')}"/></a></li></ul></div>