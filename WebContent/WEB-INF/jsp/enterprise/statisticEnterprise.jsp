<%@ include file="/WEB-INF/jsp/header.jsp" %>


<div> 
	<table class="basic-table-sh">
		<tr>
			<td>				
				<div class="buttonUl">
					<ul>
						<li><a class="submitButton" href="/enterprise/statisticEnterprise.action?name=all&requestId=statisticAll&defaultStatistic=N"><s:property value="%{getText('enterprise_statistic_all')}"/></a></li>
					</ul>
				</div>
			</td>
			<td>				
				<div class="buttonUl">
					<ul>
						<li><a class="submitButton" href="/enterprise/statisticEnterprise.action?name=spqualifacationlevel&requestId=statisticSpc&defaultStatistic=N"><s:property value="%{getText('enterprise_statistic_spc')}"/></a></li>
					</ul>
				</div>
			</td>
			<td>				
				<div class="buttonUl">
					<ul>
						<li><a class="submitButton" href="/enterprise/statisticEnterprise.action?name=membertypeid&requestId=statisticSpc&defaultStatistic=N"><s:property value="%{getText('enterprise_statistic_mti')}"/></a></li>
					</ul>
				</div>
			</td>
			<td>				
				<div class="buttonUl">
					<ul>
						<li><a class="submitButton" href="/enterprise/statisticEnterprise.action?name=feepaymentflag&requestId=statisticSpc&defaultStatistic=N"><s:property value="%{getText('enterprise_statistic_fpf')}"/></a></li>
					</ul>
				</div>
			</td>
			<td>				
				<div class="buttonUl">
					<ul>
						<li><a class="submitButton" href="/enterprise/statisticEnterprise.action?name=natureid&requestId=statisticSpc&defaultStatistic=N"><s:property value="%{getText('enterprise_statistic_int')}"/></a></li>
					</ul>
				</div>
			</td>
			<td>				
				<div class="buttonUl">
					<ul>
						<li><a class="submitButton" href="/enterprise/statisticEnterprise.action?name=operation&requestId=statisticSpc&defaultStatistic=N"><s:property value="%{getText('enterprise_statistic_ind')}"/></a></li>
					</ul>
				</div>
			</td>
			<td>				
				<div class="buttonUl">
					<ul>
						<li><a class="submitButton" href="/enterprise/statisticEnterprise.action?name=integrity&requestId=statisticSpc&defaultStatistic=N"><s:property value="%{getText('enterprise_statistic_inte')}"/></a></li>
					</ul>
				</div>
			</td>
		</tr>
	</table>
</div>

<%if(request.getParameter("defaultStatistic")!=null && "N".equals(request.getParameter("defaultStatistic"))){ %>
  <s:action name="enterprise!statistic" namespace="/enterprise" executeResult="true" >
    <s:param name="name" value="#parameters.name"/>
    <s:param name="requestId" value="#parameters.requestId"/>
  </s:action>
<%} %>