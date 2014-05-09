<%@ include file="/WEB-INF/jsp/header.jsp" %>


<div> 
	<table class="basic-table-sh">
		<tr>
			<td>				
				<div class="buttonUl">
					<ul>
						<li><a class="submitButton" href="/train/statisticExamination.action?requestId=statisticAll&defaultStatistic=N"><s:property value="%{getText('enterprise_statistic_all')}"/></a></li>
					</ul>
				</div>
			</td>
		</tr>
	</table>
</div>

<%if(request.getParameter("defaultStatistic")!=null && "N".equals(request.getParameter("defaultStatistic"))){ %>
  <s:action name="examenrolls!statistic" namespace="/train" executeResult="true" >
    <s:param name="requestId" value="#parameters.requestId"/>
  </s:action>
<%} %>