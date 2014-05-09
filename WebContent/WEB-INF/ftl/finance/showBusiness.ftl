<div> 
	<table class="basic-table-sh">
			<tr>
				<td class="label">
					<@s.text name="business_financeDuring"/>
				</td>
				<td>
					${financeduring?if_exists}
				</td>
				<td class="label">
					<@s.text name="business_netAssetsYield"/>
				</td>
				<td>
					${netassetsyield?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="business_ruturnRate"/>
				</td>
				<td>
					${ruturnrate?if_exists}
				</td>
				<td class="label">
					<@s.text name="business_debtRate"/>
				</td>
				<td>
					${debtrate?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="business_assetsRurnover"/>
				</td>
				<td>
					${assetsrurnover?if_exists}
				</td>
				<td class="label">
					<@s.text name="business_liquidityTurnover"/>
				</td>
				<td>
					${liquidityturnover?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="business_receivablesTurnover"/>
				</td>
				<td>
					${receivablesturnover?if_exists}
				</td>				
				<td class="label">
					&nbsp;
				</td>
				<td>
					&nbsp;
				</td>
			</tr>
	</table>
</div>