<%@ include file="/WEB-INF/jsp/header.jsp" %>


  <s:action name="candidatetrainsPaging" id="paging" namespace="/train" executeResult="false">
      <s:param name="rows" value="10"/>
  </s:action>
  
  <s:action name="candidatetrains!list" namespace="/train" executeResult="true" >
  	<s:param name="pno" value="#parameters.pno"/>
    <s:param name="rows" value="10"/>
    <s:param name="requestId" value="#parameters.requestId"/>
  </s:action>
  <div class="buttonUl"><ul><m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/train/browseTrainFromCandidate.action?pno={page}&requestId=%{#parameters.requestId}" pageLimit="5" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" /></ul></div>
  <div class="buttonUl"><ul><li><a class="submitButton" href="/train/candidatetrains!add.action?candidateid=<%=request.getParameter("requestId")%>"><s:property value="%{getText('common_add')}"/></a></li></ul></div>