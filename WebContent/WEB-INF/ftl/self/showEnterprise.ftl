<div> 
	<table class="basic-table-sh">
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><@s.text name="common_baseinfo"/></legend>
					<table class="basic-table-sh">
						<tr>
							<td class="label"> <@s.text name="self_businesstype"/> </td>
							<td> ${businesstype?if_exists} </td>
							<td class="label"> <@s.text name="self_enterprisename"/> </td>					
							<td> ${name?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="self_province"/> </td>
							<td> ${province?if_exists} </td>
							<td class="label"> <@s.text name="self_city"/> </td>					
							<td> ${city?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="self_regaddr"/> </td>
							<td colspan="3"> ${regaddr?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="self_regzipcode"/> </td>
							<td > ${regzipcode?if_exists} </td>
							<td class="label"> <@s.text name="self_regtime"/> </td>
							<td > ${regtime?if_exists} </td>							
							
						</tr>
					</table>
				</fieldset>
			</td>
		</tr>
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><@s.text name="common_linkinfo"/></legend>
					<table class="basic-table-sh">
						<tr>
							<td class="label"> <@s.text name="self_linkaddr"/> </td>
							<td colspan="3"> ${linkaddr?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="self_linkzipcode"/> </td>
							<td> ${linkzipcode?if_exists} </td>
							<td class="label"> <@s.text name="self_mail"/> </td>
							<td> ${mailbox?if_exists} </td>
						</tr>						
						<tr>
							<td class="label"> <@s.text name="self_lagelperson"/> </td>
							<td> ${legalperson?if_exists} </td>
							<td class="label"> <@s.text name="self_position"/> </td>
							<td> ${legalpersonposition?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="self_cardno"/> </td>
							<td colspan="3"> ${legalpersoncardno?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="self_linkperson"/> </td>
							<td> ${contact?if_exists} </td>
							<td class="label"> <@s.text name="self_linkcardno"/> </td>
							<td> ${contactcardno?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="self_linkposition"/> </td>
							<td> ${contactposition?if_exists} </td>
							<td class="label"> <@s.text name="self_linktel"/> </td>
							<td> ${linktel?if_exists} </td>
						</tr>									
						<tr>
							<td class="label"> <@s.text name="self_linkfax"/> </td>
							<td> ${linkfax?if_exists} </td>
							<td class="label"> <@s.text name="self_email"/> </td>
							<td> ${linkemail?if_exists} </td>
						</tr>	
						<tr>
							<td class="label"> <@s.text name="self_website"/> </td>
							<td> ${linkwebsite?if_exists} </td>
							<td class="label"> <@s.text name="self_businesslicense"/> </td>
							<td> ${businesslicense?if_exists} </td>
						</tr>	
					</table>
				</fieldset>
			</td>
		</tr>
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"> <@s.text name="enterprise_QualifacationInfo"/> </legend>
					<table class="basic-table-sh">
						<tr>
							<td class="label"> <@s.text name="self_orgno"/> </td>
							<td>
								 ${orgcode?if_exists}
							</td>
							<td class="label"> <@s.text name="self_replylevel"/> </td>
							<td>
								${requestlevel?if_exists}	
							</td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="self_replyno"/> </td>
							<td>
								 ${requestcode?if_exists}
							</td>
							<td class="label"> <@s.text name="self_replytime"/> </td>
							<td>
								${requesttime?if_exists}	
							</td>
						</tr>	
					</table>
				</fieldset>
			</td>
		</tr>
	</table>
</div>													