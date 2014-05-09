<div> 
	<table class="basic-table-sh">
			<tr>
				<td class="label">
					<@s.text name="excellentselect_enterpriseName"/>
				</td>
				<td >
					${enterprisename?if_exists}
				</td>
				<td class="label">
					<@s.text name="excellentselect_legalRepresentative"/>
				</td>
				<td>
					${legalrepresentative?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="excellentselect_address"/>
				</td>
				<td colspan="3">
					${address?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="excellentselect_selectYear"/>
				</td>
				<td>
					${selectyear?if_exists}
				</td>
				<td class="label">
					<@s.text name="excellentselect_requestTypeId"/>
				</td>
				<td>
					${requesttypedesc?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="excellentselect_requestName"/>
				</td>
				<td>
					${requestname?if_exists}
				</td>
				<td class="label">
					<@s.text name="excellentselect_requestOld"/>
				</td>
				<td>
					${requestold?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="excellentselect_position"/>
				</td>
				<td>
					${position?if_exists}
				</td>
				<td class="label">
					<@s.text name="excellentselect_spWorkDuring"/>
				</td>
				<td>
					${spworkduring?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="excellentselect_majorTitle"/>
				</td>
				<td>
					${majortitle?if_exists}
				</td>				
				<td class="label">
					<@s.text name="excellentselect_educationEnumId"/>
				</td>
				<td>
					${educationdesc?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="excellentselect_mobilePhone"/>
				</td>
				<td>
					${mobilephone?if_exists}
				</td>
				<td class="label">
					<@s.text name="excellentselect_tele"/>
				</td>
				<td>
					${tele?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="excellentselect_requestLitigation"/>
				</td>
				<td colspan="3">
					${requestlitigation?if_exists}
				</td>
			</tr>

			<tr>
				<td class="label">
					<@s.text name="excellentselect_introduction"/>
				</td>
				<td colspan="3">
					${introduction?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="excellentselect_requestPublish"/>
				</td>
				<td colspan="3">
					${requestpublish?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="excellentselect_workIntroduction"/>
				</td>
				<td colspan="3">
					${workintroduction?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="excellentselect_enterpriseRemark"/>
				</td>
				<td colspan="3">
					${enterpriseremark?if_exists}
				</td>
			</tr>			
			<tr>
				<td class="label">
					<@s.text name="excellentselect_otherRemark"/>
				</td>
				<td colspan="3">
					${otherremark?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="excellentselect_checkReport"/>
				</td>
				<td colspan="3">
					${checkreport?if_exists}
				</td>
			</tr>					
			<tr>

				<td class="label">
					<@s.text name="excellentselect_selectResultEnumId"/>
				</td>
				<td>
					${selectresultdesc?if_exists}
				</td>
				<td class="label">
					<@s.text name="excellentselect_score"/>
				</td>
				<td >
					${score?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="excellentselect_selectRemark"/>
				</td>
				<td colspan="3">
					${selectremark?if_exists}
				</td>
			</tr>		
	</table>
</div>