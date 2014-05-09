<div> 
	<table class="basic-table-sh">
			<tr>
				<td class="label">
					<@s.text name="candidates_name"/>
				</td>
				<td >
					${name?if_exists}
				</td>
				<td class="label">
					<@s.text name="candidates_genderEnumId"/>
				</td>
				<td >
					${genderenumdesc?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="candidates_cardTypeEnumId"/>
				</td>
				<td>
					${cardtypeenumdesc?if_exists}
				</td>
				<td class="label">
					<@s.text name="candidates_cardNo"/>
				</td>
				<td>
					${cardno?if_exists}
				</td>
			</tr>

			<tr>
				<td class="label">
					<@s.text name="candidates_nationalityEnumId"/>
				</td>
				<td >
					${nationalityenumid?if_exists}
				</td>
				<td class="label">
					<@s.text name="candidates_educationEnumId"/>
				</td>
				<td colspan="3">
					${educationenumdesc?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="candidates_title"/>
				</td>
				<td>
					${title?if_exists}
				</td>
				<td class="label">
					<@s.text name="candidates_politicalEnumId"/>
				</td>
				<td>
					${politicalenumdesc?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="candidates_position"/>
				</td>
				<td>
					${position?if_exists}
				</td>
				<td class="label">
					<@s.text name="candidates_workplace"/>
				</td>
				<td colspan="3">
					${workplace?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="candidates_tele"/>
				</td>
				<td>
					${tele?if_exists}
				</td>
				<td class="label">
					<@s.text name="candidates_mobilePhone"/>
				</td>
				<td>
					${mobilephone?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="candidates_address"/>
				</td>
				<td colspan="3">
					${address?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="candidates_zipCode"/>
				</td>
				<td>
					${zipcode?if_exists}
				</td>
				<td class="label">
					<@s.text name="candidates_securityBelong"/>
				</td>
				<td>
					${securitybelong?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="candidates_studayExperience"/>
				</td>
				<td colspan="3">
					${studayexperience?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="candidates_workExprience"/>
				</td>
				<td colspan="3">
					${workexprience?if_exists}
				</td>
			</tr>
	</table>
</div>