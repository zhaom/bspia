<div> 
	<table class="basic-table-sh">
			<tr>
				<td class="label">
					<@s.text name="project_name"/>
				</td>
				<td colspan="3">
					${name?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="project_amount"/>
				</td>
				<td>
					${amount?if_exists}
				</td>
				<td class="label">
					<@s.text name="project_categoryId"/>
				</td>
				<td>
					${categorydescription?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="project_industry"/>
				</td>
				<td colspan="3">
					${industry?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="project_buildCorp"/>
				</td>
				<td colspan="3">
					${buildcorp?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="project_designCorp"/>
				</td>
				<td colspan="3">
					${designcorp?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="project_constructionCorp"/>
				</td>
				<td colspan="3">
					${constructioncorp?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="project_supervisionCorp"/>
				</td>
				<td colspan="3">
					${project_supervisionCorp?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="project_honor"/>
				</td>
				<td colspan="3">
					${honor?if_exists}
				</td>
			</tr>			
			<tr>
				<td class="label">
					<@s.text name="project_acceptanceTime"/>
				</td>
				<td>
					<#if acceptancetime?exists>
					${acceptancetime?datetime}
					</#if>&nbsp;
				</td>
				<td class="label">
					<@s.text name="project_acceptanceExpert"/>
				</td>
				<td>
					${acceptanceexpert?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="project_acceptanceFee"/>
				</td>
				<td>
					${acceptancefee?if_exists}
				</td>
				<td class="label">
					<@s.text name="enterprise_name"/>
				</td>
				<td>
					${enterprisename?if_exists}
				</td>
			</tr>			
			<tr>
				<td class="label">
					<@s.text name="project_beginTime"/>
				</td>
				<td>
					<#if begintime?exists>
					${begintime?datetime}
					</#if>&nbsp;
				</td>
				<td class="label">
					<@s.text name="project_endTime"/>
				</td>
				<td>
					${endtime?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="project_constructionCycle"/>
				</td>
				<td>
					${constructioncycle?if_exists}
				</td>
				<td class="label">
					<@s.text name="project_constructionProvince"/>
				</td>
				<td>
					${constructionprovince?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="project_constructionCity"/>
				</td>
				<td>
					${constructioncity?if_exists}
				</td>
				<td class="label">
					<@s.text name="project_constructionDistrict"/>
				</td>
				<td>
					${constructiondistrict?if_exists}
				</td>
			</tr>

	</table>
</div>