<div> 
	<table class="basic-table-sh">
			<tr>
				<td class="label">
					<@s.text name="litigation_litigationDuring"/>
				</td>
				<td colspan="3">
					${litigationduring?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="litigation_litigationContent"/>
				</td>
				<td colspan="3">
					${litigationcontent?if_exists}
				</td>
			</tr>
	</table>
</div>