<div> 
	<table class="basic-table-sh">
			<tr>
				<td class="label">
					<@s.text name="qualification_qualificationTypeId"/>
				</td>
				<td>
					${qualificationtypedescription?if_exists}
				</td>
				<td class="label">
					<@s.text name="qualification_qualificationLevel"/>
				</td>
				<td>
					${qualificationleveldescription?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="qualification_qualificationTime"/>
				</td>
				<td>
					<#if qualificationtime?exists>
					${qualificationtime?datetime}
					</#if>&nbsp;
				</td>
				<td class="label">
					<@s.text name="qualification_qualificationNo"/>
				</td>
				<td>
					${qualificationno?if_exists}
				</td>
			</tr>
	</table>
</div>