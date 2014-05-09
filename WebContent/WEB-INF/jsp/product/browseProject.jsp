<%@ include file="/WEB-INF/jsp/header.jsp" %>


  <s:action name="projectPaging" id="paging" namespace="/product" executeResult="false">
      <s:param name="rows" value="10"/>
  </s:action>
	<div class="buttonUl"><ul><m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/product/browseProject.action?pno={page}" pageLimit="5" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" /></ul></div>  
  <s:action name="project!list" namespace="/product" executeResult="true" >
  	<s:param name="pno" value="#parameters.pno"/>
    <s:param name="rows" value="10"/>
  </s:action>

  <div class="buttonUl"><ul><li><a class="submitButton" href="/product/project!add.action"><s:property value="%{getText('common_add')}"/></a></li></ul></div>