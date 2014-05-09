<div> 
	<table class="basic-table-sh">
			<tr>
				<td class="label">
					<@s.text name="train_trainName"/>
				</td>
				<td colspan="3">
					${trainname?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="train_trainAddr"/>
				</td>
				<td colspan="3">
					${trainaddr?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="train_trainTypeEnumId"/>
				</td>
				<td>
					${traintypedesc?if_exists}
				</td>
				<td class="label">
					<@s.text name="train_trainDuring"/>
				</td>
				<td>
					${trainduring?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="train_fee"/>
				</td>
				<td>
					${fee?if_exists}
				</td>
				<td class="label">
					<@s.text name="train_planAmount"/>
				</td>
				<td>
					${planamount?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="train_contact"/>
				</td>
				<td>
					${contact?if_exists}
				</td>
				<td class="label">
					<@s.text name="train_tel"/>
				</td>
				<td>
					${tel?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="train_email"/>
				</td>
				<td colspan="3">
					${email?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="train_trainRemark"/>
				</td>
				<td colspan="3">
					${trainremark?if_exists}
				</td>
			</tr>
	</table>
</div>