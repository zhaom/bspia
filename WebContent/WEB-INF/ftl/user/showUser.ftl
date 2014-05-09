<div> 
	<table class="basic-form">
		<tr>
			<td class="label"><@s.text name="user_userId"/></td>
			<td>${loginid?if_exists}</td>
		</tr>
		<tr>
			<td class="label"><@s.text name="user_name"/></td>
			<td>${name?if_exists}</td>
		</tr>
		<tr>
			<td class="label"><@s.text name="user_depart"/></td>
			<td>${departname?if_exists}</td>
		</tr>
		<tr>
			<td class="label"><@s.text name="user_remark"/></td>
			<td>${remark?if_exists}</td>
		</tr>
	</table>
</div>
