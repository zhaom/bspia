<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/finance/finance!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		<input type="hidden" name="enterpriseid" value="<s:property value='enterpriseid'/>"/>
		
		<table class="basic-form">
			<tr>
				<td class="label">
					<s:property value="%{getText('finance_financeTime')}"/>
				</td>
				<td>
					<input type="text" name="financetime" class="inputDatetime" value="<s:property value='financetime'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('finance_assets')}"/>
				</td>
				<td>
					<input type="text" name="assets" value="<s:property value='assets'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('finance_income')}"/>
				</td>
				<td>
					<input type="text" name="income" value="<s:property value='income'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('finance_netProfit')}"/>
				</td>
				<td>
					<input type="text" name="netprofit" value="<s:property value='netprofit'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('finance_netChainRatio')}"/>
				</td>
				<td>
					<input type="text" name="netchainratio" value="<s:property value='netchainratio'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('finance_netYearRatio')}"/>
				</td>
				<td>
					<input type="text" name="netyearratio" value="<s:property value='netyearratio'/>"/>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>