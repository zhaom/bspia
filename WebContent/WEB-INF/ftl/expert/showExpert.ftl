<div> 
	<table class="basic-table-sh">
			<tr>
				<td class="label">
					<@s.text name="expert_name"/>
				</td>
				<td>
					${name?if_exists}
				</td>

				<td colspan="2">
					<img src ='/UploadImages/${picture?if_exists}' width="160" height="200"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expert_gender"/>
				</td>
				<td>
					${genderdesc?if_exists}
				</td>
				<td class="label">
					<@s.text name="expert_political"/>
				</td>
				<td>
					${politicaldesc?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expert_educationEnumId"/>
				</td>
				<td>
					${educationdesc?if_exists}
				</td>
				<td class="label">
					<@s.text name="expert_major"/>
				</td>
				<td>
					${major?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expert_university"/>
				</td>
				<td>
					${university?if_exists}
				</td>
				<td class="label">
					<@s.text name="expert_position"/>
				</td>
				<td>
					${position?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expert_title"/>
				</td>
				<td>
					${title?if_exists}
				</td>				
				<td class="label">
					<@s.text name="expert_mobilePhone"/>
				</td>
				<td>
					${mobilephone?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expert_tele"/>
				</td>
				<td>
					${tele?if_exists}
				</td>
				<td class="label">
					<@s.text name="expert_workplace"/>
				</td>
				<td>
					${workplace?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expert_birthday"/>
				</td>
				<td>
					<#if birthday?exists>
						${birthday?date}
					</#if>
				</td>
				<#-- 
				<td class="label">
					<@s.text name="expert_cardTypeEnumId"/>
				</td>
				<td>
					${cardtypedesc?if_exists}
				</td>
				-->
				<td class="label">
					<@s.text name="expert_cardNo"/>
				</td>
				<td>
					${cardno?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expert_email"/>
				</td>
				<td>
					${email?if_exists}
				</td>				
				<td class="label">
					<@s.text name="expert_contact"/>
				</td>
				<td>
					${contact?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expert_address"/>
				</td>
				<td colspan="3">
					${address?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expert_homeaddress"/>
				</td>
				<td colspan="3">
					${homeaddress?if_exists}
				</td>
			</tr>	
			<tr>
				<td class="label">
					<@s.text name="expert_zipCode"/>
				</td>
				<td>
					${zipcode?if_exists}
				</td>				
				<td class="label">
					<@s.text name="expert_retirementEnumId"/>
				</td>
				<td>
					${retirementdesc?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expert_workduring"/>
				</td>
				<td>
					${workduring?if_exists}
				</td>				
				<td class="label">
					<@s.text name="expert_majorworkduring"/>
				</td>
				<td>
					${majorworkduring?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expert_majordirection"/>
				</td>
				<td>
					${majordirectiondesc?if_exists}
				</td>				
				<td class="label">
					<@s.text name="expert_parttimejob"/>
				</td>
				<td>
					${parttimejob?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="expert_professionalBound"/>
				</td>
				<td colspan="3">
					${professionalbound?if_exists}
				</td>
			</tr>

			<tr>
				<td class="label">
					<@s.text name="expert_resume"/>
				</td>
				<td colspan="3">
					${resume?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label"><@s.text name="expert_workcapity"/>  </td>
				<td colspan="3">
					<input type="checkbox" class="bscheckbox"  name="workcaplitystrategy" <#if workcaplitystrategy?if_exists=="checked">checked</#if> disabled="true"><@s.text name="expert_workcapity_1"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplitypolicy" <#if workcaplitypolicy?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="expert_workcapity_2"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplitymarket" <#if workcaplitymarket?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="expert_workcapity_3"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplityconstruct" <#if workcaplityconstruct?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="expert_workcapity_4"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplityquality" <#if workcaplityquality?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="expert_workcapity_5"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplitysupervision" <#if workcaplitysupervision?if_exists=="checked">checked</#if> disabled="true"><@s.text name="expert_workcapity_6"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplitycost" <#if workcaplitycost?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="expert_workcapity_7"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplityprojend" <#if workcaplityprojend?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="expert_workcapity_8"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplityprojesta" <#if workcaplityprojesta?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="expert_workcapity_9"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplitystandard" <#if workcaplitystandard?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="expert_workcapity_10"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplitytrademark" <#if workcaplitytrademark?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="expert_workcapity_11"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplityrisk" <#if workcaplityrisk?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="expert_workcapity_12"/>
					<input type="checkbox" class="bscheckbox"  name="workcaplitydataanalys" <#if workcaplitydataanalys?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="expert_workcapity_13"/>
					&nbsp;&nbsp;<@s.text name="expert_workcapity_14"/>:${workcaplityothers?if_exists}
				</td>
			</tr>
	</table>
</div>