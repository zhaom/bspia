<div> 
	<table class="basic-table-sh">
			<tr>
				<td class="label">
					<@s.text name="expertproject_name"/>
				</td>
				<td colspan="3">
					${name?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_address"/>
				</td>
				<td colspan="3">
					${address?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_category"/>
				</td>
				<td>
					${categorydesc?if_exists}
				</td>
				<td class="label">
					<@s.text name="expertproject_industry"/>
				</td>
				<td>
					${industrydesc?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_level"/>
				</td>
				<td>
					${leveldesc?if_exists}
				</td>
				<td class="label">
					<@s.text name="expertproject_amount"/>
				</td>
				<td>
					${amount?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_begintime"/>
				</td>
				<td>
					<#if begintime?exists>${begintime?datetime}</#if>&nbsp;
				</td>
				<td class="label">
					<@s.text name="expertproject_endtime"/>
				</td>
				<td>
					<#if endtime?exists>${endtime?datetime}</#if>&nbsp;
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_buildCorpName"/>
				</td>
				<td colspan="3">
					${buildcorpname?if_exists}
				</td>	
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_buildCorpAddr"/>
				</td>
				<td colspan="3">
					${buildcorpaddr?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_buildCorpContact"/>
				</td>
				<td>
					${buildcorpcontact?if_exists}
				</td>
				<td class="label">
					<@s.text name="expertproject_buildCorpContactTele"/>
				</td>
				<td>
					${buildcorpcontacttele?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_designCorpName"/>
				</td colspan="3">
				<td>
					${designcorpname?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_designCorpAddr"/>
				</td>
				<td colspan="3">
					${designcorpaddr?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_designCorpContact"/>
				</td>
				<td>
					${designcorpcontact?if_exists}
				</td>				
				<td class="label">
					<@s.text name="expertproject_designCorpContactTele"/>
				</td>
				<td>
					${designcorpcontacttele?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_constructionCorpName"/>
				</td>
				<td colspan="3">
					${constructioncorpname?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_constructionCorpAddr"/>
				</td>
				<td colspan="3">
					${constructioncorpaddr?if_exists}
				</td>
			</tr>	
			<tr>
				<td class="label">
					<@s.text name="expertproject_constructionCorpContact"/>
				</td>
				<td>
					${constructioncorpcontact?if_exists}
				</td>				
				<td class="label">
					<@s.text name="expertproject_constructionCorpContactTele"/>
				</td>
				<td>
					${constructioncorpcontacttele?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_supervisionCorpName"/>
				</td>
				<td colspan="3">
					${supervisioncorpname?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_supervisionCorpAddr"/>
				</td>
				<td colspan="3">
					${supervisioncorpaddr?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_supervisionCorpContact"/>
				</td>
				<td>
					${supervisioncorpcontact?if_exists}
				</td>				
				<td class="label">
					<@s.text name="expertproject_supervisionCorpContactTele"/>
				</td>
				<td>
					${supervisioncorpcontacttele?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_serviceType"/>
				</td>
				<td>
					${servicetypedesc?if_exists}
				</td>
				<td class="label">
					<@s.text name="expertproject_acceptanceTime"/>
				</td>
				<td>
					<#if acceptancetime?exists>${acceptancetime?datetime}</#if>&nbsp;
				</td>
			</tr>

			<tr>
				<td class="label">
					<@s.text name="expertproject_serviceExpert"/>
				</td>
				<td>
					${serviceexpert?if_exists}
				</td>
				<td class="label">
					<@s.text name="expertproject_serviceTime"/>
				</td>
				<td>
					<#if servicetime?exists>${servicetime?datetime}</#if>&nbsp;
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_serviceFee"/>
				</td>
				<td>
					${servicefee?if_exists}
				</td>
				<td class="label">
					<@s.text name="expertproject_serviceResult"/>
				</td>
				<td>
					${serviceresultdesc?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_serviceViews"/>
				</td>
				<td colspan="3">
					${serviceviews?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_remark"/>
				</td>
				<td colspan="3">
					${remark?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expertproject_otherRemark"/>
				</td>
				<td colspan="3">
					${otherremark?if_exists}
				</td>
			</tr>
	</table>
</div>