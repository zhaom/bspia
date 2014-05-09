<div> 
	<table class="basic-table-sh">
			<tr>
				<td class="label">
					<@s.text name="correspondent_name"/>
				</td>
				<td>
					${name?if_exists}
				</td>

				<td colspan="2">
					<img src ='/UploadImages/${picture?if_exists}' width="160" height="200"/>
				</td>
			</tr>
			<tr>
				<#-- 
				<td class="label">
					<@s.text name="correspondent_cardTypeEnumId"/>
				</td>
				<td>
					${cardtypedesc?if_exists}
				</td>
				-->
				<td class="label">
					<@s.text name="correspondent_genderEnumId"/>
				</td>
				<td>
					${genderdesc?if_exists}
				</td>
				<td class="label">
					<@s.text name="correspondent_cardNo"/>
				</td>
				<td>
					${cardno?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="correspondent_nation"/>
				</td>
				<td>
					${nation?if_exists}
				</td>
				<td class="label">
					<@s.text name="correspondent_educationEnumId"/>
				</td>
				<td>
					${educationdesc?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="correspondent_major"/>
				</td>
				<td>
					${major?if_exists}
				</td>				
				<td class="label">
					<@s.text name="correspondent_university"/>
				</td>
				<td>
					${university?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="correspondent_title"/>
				</td>
				<td>
					${title?if_exists}
				</td>
				<td class="label">
					<@s.text name="correspondent_politicalEnumId"/>
				</td>
				<td>
					${politicaldesc?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="correspondent_position"/>
				</td>
				<td>
					${position?if_exists}
				</td>
				<td class="label">
					<@s.text name="correspondent_workplace"/>
				</td>
				<td>
					${workplace?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="correspondent_contact"/>
				</td>
				<td>
					${contact?if_exists}
				</td>				
				<td class="label">
					<@s.text name="correspondent_workDuring"/>
				</td>
				<td>
					${workduring?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="correspondent_tele"/>
				</td>
				<td>
					${tele?if_exists}
				</td>				
				<td class="label">
					<@s.text name="correspondent_mobilePhone"/>
				</td>
				<td>
					${mobilephone?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="correspondent_address"/>
				</td>
				<td colspan="3">
					${address?if_exists}
				</td>
			</tr>			
			<tr>
				<td class="label">
					<@s.text name="correspondent_zipCode"/>
				</td>
				<td>
					${zipcode?if_exists}
				</td>				
				<td class="label">
					<@s.text name="correspondent_email"/>
				</td>
				<td>
					${email?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="correspondent_excellentdesc"/>
				</td>
				<td>
					${excellentdesc?if_exists}
				</td>				
				<td class="label">
					<@s.text name="correspondent_excellentyeardesc"/>
				</td>
				<td>
					${excellentyeardesc?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="correspondent_publishenumdesc"/>
				</td>
				<td>
					${publishenumdesc?if_exists}
				</td>
				<td class="label">
					&nbsp;
				</td>
				<td>
					&nbsp;
				</td>
			</tr>			
			<tr>
				<td class="label">
					<@s.text name="correspondent_resume"/>
				</td>
				<td colspan="3">
					${resume?if_exists}
				</td>
			</tr>

			<tr>
				<td class="label">
					<@s.text name="correspondent_publishDesc"/>
				</td>
				<td colspan="3">
					${publishdesc?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="correspondent_remark"/>
				</td>
				<td colspan="3">
					${remark?if_exists}
				</td>
			</tr>
	</table>
</div>