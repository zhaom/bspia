<div> 
	<table class="basic-table-sh">
			<tr>
				<td class="label">
					<@s.text name="examination_examName"/>
				</td>
				<td colspan="3">
					${examname?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="examination_examAddr"/>
				</td>
				<td colspan="3">
					${examaddr?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="examination_examTypeEnumId"/>
				</td>
				<td>
					${examtypedesc?if_exists}
				</td>
				<td class="label">
					<@s.text name="examination_examDuring"/>
				</td>
				<td>
					${examduring?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="examination_examCount"/>
				</td>
				<td>
					${examcount?if_exists}
				</td>
				<td class="label">
					<@s.text name="examination_contact"/>
				</td>
				<td>
					${contact?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="examination_tel"/>
				</td>
				<td>
					${tel?if_exists}
				</td>
				<td class="label">
					<@s.text name="examination_email"/>
				</td>
				<td>
					${email?if_exists}
				</td>
			</tr>
	</table>
</div>