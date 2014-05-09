<div> 
	<table class="basic-form">
		<tr>
			<td class="label"><@s.text name="enumeration_enumid"/></td>
			<td>${enumid?if_exists}</td>
		</tr>
		<tr>
			<td class="label"><@s.text name="enumeration_enumtypeid"/></td>
			<td>${enumtypeid?if_exists}</td>
		</tr>
		<tr>
			<td class="label"><@s.text name="enumeration_enumcode"/></td>
			<td>${enumcode?if_exists}</td>
		</tr>
		<tr>
			<td class="label"><@s.text name="enumeration_desc"/></td>
			<td>${description?if_exists}</td>
		</tr>
	</table>
</div>