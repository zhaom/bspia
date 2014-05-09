<div> 
	<table class="basic-table-sh">
			<tr>
				<td class="label">
					<@s.text name="finance_financeTime"/>
				</td>
				<td>
					<#if financetime?exists>
						${financetime?datetime}
					</#if>
				</td>
				<td class="label">
					<@s.text name="finance_assets"/>
				</td>
				<td>
					${assets?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="finance_income"/>
				</td>
				<td>
					${income?if_exists}
				</td>
				<td class="label">
					<@s.text name="finance_netProfit"/>
				</td>
				<td>
					${netprofit?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="finance_netChainRatio"/>
				</td>
				<td>
					${netchainratio?if_exists}
				</td>
				<td class="label">
					<@s.text name="finance_netyearratio"/>
				</td>
				<td>
					${netyearratio?if_exists}
				</td>
			</tr>
	</table>
</div>