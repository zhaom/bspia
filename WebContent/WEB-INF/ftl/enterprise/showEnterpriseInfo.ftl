<div> 
	<table class="basic-table-sh">
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><@s.text name="common_baseinfo"/></legend>
					<table class="basic-table-sh">
						<tr>
							<td class="label"> <@s.text name="enterprise_name"/> </td>
							<td colspan="3"> ${name?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_nature"/> </td>
							<td> ${natureDescription?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_natureOtherDesc"/> </td>					
							<td> ${natureotherdesc?if_exists} </td>
						</tr>
						<tr>
							<td class="label"><@s.text name="enterprise_operation"/>  </td>
							<td colspan="3">
								<input type="checkbox" class="bscheckbox"  name="omprodprod" <#if omprodprod?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_OMProdProd"/>
								<input type="checkbox" class="bscheckbox"  name="omprodsale" <#if omprodsale?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="enterprise_OMProdSale"/>
								<input type="checkbox" class="bscheckbox"  name="omprojmaint" <#if omprojmaint?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="enterprise_OMProjMaint"/>
								<input type="checkbox" class="bscheckbox"  name="omnetalarm" <#if omnetalarm?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="enterprise_OMNetAlarm"/>
								<input type="checkbox" class="bscheckbox"  name="omsptain" <#if omsptain?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="enterprise_OMspTain"/>
								<input type="checkbox" class="bscheckbox"  name="ommedia" <#if ommedia?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_OMMedia"/>
								<input type="checkbox" class="bscheckbox"  name="omprojconstruct" <#if omprojconstruct?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="enterprise_OMProjConstruct"/>
								<input type="checkbox" class="bscheckbox"  name="omother" <#if omother?if_exists=="checked">checked</#if>  disabled="true"><@s.text name="enterprise_OMOther"/>
							</td>
						</tr>
						<tr>
							<td class="label"><@s.text name="enterprise_productBound"/>  </td>					
							<td colspan="3"> 
								<input type="checkbox" class="bscheckbox"  name="productboundvideo" <#if productboundvideo?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_productboundvideo"/>
								<input type="checkbox" class="bscheckbox"  name="productboundbangsec" <#if productboundbangsec?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_productboundbangsec"/>
								<input type="checkbox" class="bscheckbox"  name="productboundaroundalarm" <#if productboundaroundalarm?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_productboundaroundalarm"/>
								<input type="checkbox" class="bscheckbox"  name="productboundtheftalarm" <#if productboundtheftalarm?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_productboundtheftalarm"/>
								<input type="checkbox" class="bscheckbox"  name="productboundentrancecontrol" <#if productboundentrancecontrol?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_productboundentrancecontrol"/>
								<input type="checkbox" class="bscheckbox"  name="productboundbuildvoice" <#if productboundbuildvoice?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_productboundbuildvoice"/>
								<input type="checkbox" class="bscheckbox"  name="productboundbuildintell" <#if productboundbuildintell?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_productboundbuildintell"/>
								<input type="checkbox" class="bscheckbox"  name="productboundvohilealarm" <#if productboundvohilealarm?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_productboundvohilealarm"/>
								<input type="checkbox" class="bscheckbox"  name="productboundbodysec" <#if productboundbodysec?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_productboundbodysec"/>
								<input type="checkbox" class="bscheckbox"  name="productboundbasesec" <#if productboundbasesec?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_productboundbasesec"/>
								<input type="checkbox" class="bscheckbox"  name="productbounddooralarm" <#if productbounddooralarm?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_productbounddooralarm"/>
							</td>
						</tr>
						<tr>
							<td class="label"><@s.text name="enterprise_projectBound"/>  </td>					
							<td colspan="3">
								<input type="checkbox" class="bscheckbox"  name="industryboundfiance" <#if industryboundfiance?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_industryboundfiance"/>
								<input type="checkbox" class="bscheckbox"  name="industryboundculture" <#if industryboundculture?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_industryboundculture"/>
								<input type="checkbox" class="bscheckbox"  name="industryboundeducation" <#if industryboundeducation?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_industryboundeducation"/>
								<input type="checkbox" class="bscheckbox"  name="industryboundcommu" <#if industryboundcommu?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_industryboundcommu"/>
								<input type="checkbox" class="bscheckbox"  name="industryboundgov" <#if industryboundgov?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_industryboundgov"/>
								<input type="checkbox" class="bscheckbox"  name="industryboundenterprise" <#if industryboundenterprise?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_industryboundenterprise"/>
								<input type="checkbox" class="bscheckbox"  name="industryboundenerge" <#if industryboundenerge?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_industryboundenerge"/>
								<input type="checkbox" class="bscheckbox"  name="industryboundhome" <#if industryboundhome?if_exists=="checked">checked</#if> disabled="true"><@s.text name="enterprise_industryboundhome"/>

							</td>
						</tr>

						<tr>
							<td class="label"> <@s.text name="enterprise_employeeTotal"/> </td>					
							<td> ${employeetotal?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_managerTotal"/> </td>					
							<td> ${managertotal?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_techniciansTotal"/> </td>					
							<td> ${technicianstotal?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_bachelorTotal"/> </td>					
							<td> ${bachelortotal?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_seniorTotal"/> </td>					
							<td> ${seniortotal?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_middleTotal"/> </td>					
							<td> ${middletotal?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_juniorTotal"/> </td>					
							<td> ${juniortotal?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_professionalTotal"/> </td>					
							<td> ${professionaltotal?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_createdLogin"/> </td>					
							<td> ${createdUserName?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_createdDatetime"/> </td>					
							<td> <#if createddatetime?exists>${createddatetime?datetime} </#if></td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_lastUpdateLogin"/> </td>					
							<td> ${lastUpdateUserName?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_lastUpdateDatetime"/> </td>					
							<td> <#if lastupdatedatetime?exists>${lastupdatedatetime?datetime}</#if> </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="finance_assets"/> </td>					
							<td> ${totalassets?if_exists} </td>
							<td class="label"> <@s.text name="finance_income"/> </td>					
							<td> ${businessincome?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="finance_netProfit"/> </td>					
							<td> ${netprofit?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_IntegrityInfo"/><@s.text name="integrityinfo_captureTime"/> </td>					
							<td> <#if productbound?if_exists!="62">${productbound?if_exists} </#if></td>
						</tr>
						<tr>
							<td class="label"><@s.text name="enterprise_introduction"/>  </td>					
							<td colspan="3"> ${introduction?if_exists} </td>
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
							<td class="label"> <@s.text name="enterprise_linkman"/> </td>
							<td> ${linkman?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_phone"/> </td>
							<td> ${phone?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_mobilePhone"/> </td>
							<td> ${mobilephone?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_zip"/> </td>
							<td> ${zip?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_fax"/> </td>
							<td> ${fax?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_email"/> </td>
							<td> ${email?if_exists} </td>
						</tr>
						<tr>
							<td class="label"><@s.text name="enterprise_address"/>  </td>					
							<td colspan="3"> ${address?if_exists} </td>
						</tr>
						<tr>
							<td class="label"><@s.text name="enterprise_officeAddr"/>  </td>					
							<td colspan="3"> ${officeaddr?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_url"/> </td>
							<td > ${url?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_legalRepresentative"/> </td>					
							<td> ${legalrepresentative?if_exists} </td>
						</tr>
						<tr>							
							<td class="label"> <@s.text name="enterprise_legalRepresentativeTele"/> </td>					
							<td> ${legalrepresentativetele?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_legalRepresentativeMobile"/> </td>					
							<td> ${legalrepresentativemobile?if_exists} </td>
						</tr>
					</table>
				</fieldset>
			</td>
		</tr>
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><@s.text name="enterprise_reginfo"/></legend>
					<table class="basic-table-sh">
						<tr>
							<td class="label"> <@s.text name="enterprise_registerTime"/> </td>
							<td> <#if registertime?exists>${registertime?datetime} </#if>&nbsp;</td>
							<td class="label"> <@s.text name="enterprise_registerCapital"/> </td>
							<td> ${registercapital?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_registerAddr"/> </td>
							<td colspan="3"> ${registeraddr?if_exists} </td>
						</tr>
					</table>
				</fieldset>
			</td>
		</tr>
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><@s.text name="enterprise_IPOinfo"/></legend>
					<table class="basic-table-sh">
						<tr>
							<td class="label"> <@s.text name="enterprise_IPO"/> </td>					
							<td> ${IPODescription?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_IPOTime"/> </td>					
							<td> <#if ipotime?exists>${ipotime?datetime}</#if>&nbsp; </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_IPOArea"/> </td>					
							<td> ${ipoarea?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_IPOForum"/> </td>					
							<td> ${ipoforum?if_exists} </td>
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
							<td class="label"> <@s.text name="enterprise_spQualifacationLevelDescripton"/> </td>
							<td>
								 ${spQualifacationLevelDescripton?if_exists}
							</td>
							<td class="label"> <@s.text name="enterprise_qualifacationGetFire"/> </td>
							<td>
								${qualifacationGetFireDesc?if_exists}	
							</td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_qualifacationGetConf"/> </td>
							<td>
								${qualifacationGetConfDesc?if_exists}
							</td>
							<td class="label"> <@s.text name="enterprise_qualifacationGetBuildInte"/> </td>
							<td>
								${qualifacationGetBuildInteDesc?if_exists}
							</td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_qualifacationGetBuildProj"/> </td>
							<td>
								${qualifacationGetBuildProjDesc?if_exists}
							</td>
							<td class="label"> <@s.text name="enterprise_qualifacationGetITInte"/> </td>
							<td>
								${qualifacationGetITInteDesc?if_exists}	
							</td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_qualificationSupervision"/> </td>
							<td>
								${qualificationSupervisionDesc?if_exists}
							</td>
							<td class="label"> <@s.text name="enterprise_qualificationComputerSp"/> </td>
							<td>
								${qualificationComputerSpDesc?if_exists}	
							</td>
						</tr>
					</table>
				</fieldset>
			</td>
		</tr>
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><@s.text name="enterprise_enrollinfo"/></legend>
					<table class="basic-table-sh">
						<tr>
							<td class="label"> <@s.text name="enterprise_memberType"/> </td>					
							<td> ${memberTypeDescription?if_exists} </td>
							<td class="label"> <@s.text name="enterprise_feePayment"/> </td>
							<td> ${feePaymentDescription?if_exists} </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_qualityCertifacationDescripton"/> </td>
							<td>
								 ${qualityCertifacationDescripton?if_exists}
							</td>
							<td class="label"> <@s.text name="enterprise_qualityCertifacationOtherDesc"/> </td>
							<td>
								${qualitycertifacationotherdesc?if_exists}					
							</td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_enrollTime"/> </td>					
							<td> <#if enrolltime?exists>${enrolltime?datetime}</#if>&nbsp; </td>
							<td class="label"> <@s.text name="enterprise_withDrawtime"/> </td>					
							<td> <#if withdrawtime?exists>${withdrawtime?datetime}</#if>&nbsp; </td>
						</tr>
						<tr>
							<td class="label"> <@s.text name="enterprise_toHighApplyLevelDescripton"/> </td>
							<td>
								${toHighApplyLevelDescripton?if_exists}
							</td>
							<td class="label"> <@s.text name="enterprise_sponsorshipAmount"/> </td>					
							<td> ${sponsorshipamount?if_exists} </td>

						</tr>
					</table>
				</fieldset>
			</td>
		</tr>
	</table>
</div>