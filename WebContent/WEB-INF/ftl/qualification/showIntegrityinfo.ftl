<div> 
	<table class="basic-table-sh">
			<tr>
				<td class="label">
					<@s.text name="integrityinfo_integrityTitle"/>
				</td>
				<td colspan="3">
					${integritytitle?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="integrityinfo_captureTime"/>
				</td>
				<td>
					<#if capturetime?exists>
					${capturetime?datetime}
					</#if>&nbsp;
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