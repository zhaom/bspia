<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/finance/business!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		<input type="hidden" name="enterpriseid" value="<s:property value='enterpriseid'/>"/>
		
		<table class="basic-form">

			<tr>
				<td class="label">
					<s:property value="%{getText('business_financeDuring')}"/>
				</td>
				<td>
					<input type="text" name="financeduring" value="<s:property value='financeduring'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('business_netAssetsYield')}"/>
				</td>
				<td>
					<input type="text" name="netassetsyield" value="<s:property value='netassetsyield'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('business_ruturnRate')}"/>
				</td>
				<td>
					<input type="text" name="ruturnrate" value="<s:property value='ruturnrate'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('business_debtRate')}"/>
				</td>
				<td>
					<input type="text" name="debtrate" value="<s:property value='debtrate'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('business_assetsRurnover')}"/>
				</td>
				<td>
					<input type="text" name="assetsrurnover" value="<s:property value='assetsrurnover'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('business_liquidityTurnover')}"/>
				</td>
				<td>
					<input type="text" name="liquidityturnover" value="<s:property value='liquidityturnover'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('business_receivablesTurnover')}"/>
				</td>
				<td>
					<input type="text" name="receivablesturnover" value="<s:property value='receivablesturnover'/>"/>
				</td>
				<td class="label">
					&nbsp;
				</td>
				<td>
					&nbsp;
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>