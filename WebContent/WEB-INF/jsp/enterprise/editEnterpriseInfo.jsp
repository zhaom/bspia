<%@ include file="/WEB-INF/jsp/header.jsp" %>

<form id="editForm" class="submitForm" action="/enterprise/enterprise!save.action" method="post">

	<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
	<table class="basic-table-sh">
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><s:property value="%{getText('common_baseinfo')}"/></legend>
					<table class="basic-table-sh">
						<!-- 
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_userLoginId')}"/> </td>					
							<td><input type="text" name="userloginid" value="<s:property value='userloginid'/>"/> </td>
							<td class="label"><s:property value="%{getText('enterprise_password')}"/></td>
							<td><input type="text" name="password" value="<s:property value='password'/>"/></td>
						</tr>
						 -->
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_name')}"/> </td>
							<td colspan="3"> <input type="text" name="name" size="100" value="<s:property value='name'/>"/> </td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_nature')}"/></td>					
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'ENTERP_NATURE'}" />
								    <s:param name="selectName" value="%{'natureid'}"/>
								    <s:param name="selectedKey" value="%{natureid}"/>
							  	</s:action>
							</td>
							
							<td class="label"><s:property value="%{getText('enterprise_natureOtherDesc')}"/> </td>					
							<td> 
								<input type="text" name="natureotherdesc" value="<s:property value='natureotherdesc'/>"/>
							</td>
						</tr>
						
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_operation')}"/> </td>					
							<td colspan="3"> 
								<input type="checkbox" class="bscheckbox"  name="omprodprod" <s:property value='omprodprod'/> value="checked"><s:property value="%{getText('enterprise_OMProdProd')}"/>
								<input type="checkbox" class="bscheckbox"  name="omprodsale" <s:property value='omprodsale'/> value="checked"><s:property value="%{getText('enterprise_OMProdSale')}"/>
								<input type="checkbox" class="bscheckbox"  name="omprojmaint" <s:property value='omprojmaint'/> value="checked"><s:property value="%{getText('enterprise_OMProjMaint')}"/>
								<input type="checkbox" class="bscheckbox"  name="omnetalarm" <s:property value='omnetalarm'/> value="checked"><s:property value="%{getText('enterprise_OMNetAlarm')}"/>
								<input type="checkbox" class="bscheckbox"  name="omsptain" <s:property value='omsptain'/> value="checked"><s:property value="%{getText('enterprise_OMspTain')}"/>
								<input type="checkbox" class="bscheckbox"  name="ommedia" <s:property value='ommedia'/> value="checked"><s:property value="%{getText('enterprise_OMMedia')}"/>
								<input type="checkbox" class="bscheckbox"  name="omprojconstruct" <s:property value='omprojconstruct'/> value="checked"><s:property value="%{getText('enterprise_OMProjConstruct')}"/>
								<input type="checkbox" class="bscheckbox"  name="omother" <s:property value='omother'/> value="checked"><s:property value="%{getText('enterprise_OMOther')}"/>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_productBound')}"/></td>
							<td colspan="3">
								<input type="checkbox" class="bscheckbox"  name="productboundvideo" <s:property value='productboundvideo'/> value="checked"><s:property value="%{getText('enterprise_productboundvideo')}"/>
								<input type="checkbox" class="bscheckbox"  name="productboundbangsec" <s:property value='productboundbangsec'/> value="checked"><s:property value="%{getText('enterprise_productboundbangsec')}"/>
								<input type="checkbox" class="bscheckbox"  name="productboundaroundalarm" <s:property value='productboundaroundalarm'/> value="checked"><s:property value="%{getText('enterprise_productboundaroundalarm')}"/>
								<input type="checkbox" class="bscheckbox"  name="productboundtheftalarm" <s:property value='productboundtheftalarm'/> value="checked"><s:property value="%{getText('enterprise_productboundtheftalarm')}"/>
								<input type="checkbox" class="bscheckbox"  name="productboundentrancecontrol" <s:property value='productboundentrancecontrol'/> value="checked"><s:property value="%{getText('enterprise_productboundentrancecontrol')}"/>
								<input type="checkbox" class="bscheckbox"  name="productboundbuildvoice" <s:property value='productboundbuildvoice'/> value="checked"><s:property value="%{getText('enterprise_productboundbuildvoice')}"/>
								<input type="checkbox" class="bscheckbox"  name="productboundbuildintell" <s:property value='productboundbuildintell'/> value="checked"><s:property value="%{getText('enterprise_productboundbuildintell')}"/>
								<input type="checkbox" class="bscheckbox"  name="productboundvohilealarm" <s:property value='productboundvohilealarm'/> value="checked"><s:property value="%{getText('enterprise_productboundvohilealarm')}"/>
								<input type="checkbox" class="bscheckbox"  name="productboundbodysec" <s:property value='productboundbodysec'/> value="checked"><s:property value="%{getText('enterprise_productboundbodysec')}"/>
								<input type="checkbox" class="bscheckbox"  name="productboundbasesec" <s:property value='productboundbasesec'/> value="checked"><s:property value="%{getText('enterprise_productboundbasesec')}"/>
								<input type="checkbox" class="bscheckbox"  name="productbounddooralarm" <s:property value='productbounddooralarm'/> value="checked"><s:property value="%{getText('enterprise_productbounddooralarm')}"/>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_projectBound')}"/>  </td>					
							<td colspan="3">
								<input type="checkbox" class="bscheckbox"  name="industryboundfiance" <s:property value='industryboundfiance'/> value="checked"><s:property value="%{getText('enterprise_industryboundfiance')}"/>
								<input type="checkbox" class="bscheckbox"  name="industryboundculture" <s:property value='industryboundculture'/> value="checked"><s:property value="%{getText('enterprise_industryboundculture')}"/>
								<input type="checkbox" class="bscheckbox"  name="industryboundeducation" <s:property value='industryboundeducation'/> value="checked"><s:property value="%{getText('enterprise_industryboundeducation')}"/>
								<input type="checkbox" class="bscheckbox"  name="industryboundcommu" <s:property value='industryboundcommu'/> value="checked"><s:property value="%{getText('enterprise_industryboundcommu')}"/>
								<input type="checkbox" class="bscheckbox"  name="industryboundgov" <s:property value='industryboundgov'/> value="checked"><s:property value="%{getText('enterprise_industryboundgov')}"/>
								<input type="checkbox" class="bscheckbox"  name="industryboundenterprise" <s:property value='industryboundenterprise'/> value="checked"><s:property value="%{getText('enterprise_industryboundenterprise')}"/>
								<input type="checkbox" class="bscheckbox"  name="industryboundenerge" <s:property value='industryboundenerge'/> value="checked"><s:property value="%{getText('enterprise_industryboundenerge')}"/>
								<input type="checkbox" class="bscheckbox"  name="industryboundhome" <s:property value='industryboundhome'/> value="checked"><s:property value="%{getText('enterprise_industryboundhome')}"/>

							</td>
						</tr>
						<%--
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_industryBound')}"/>  </td>					
							<td colspan="3"><input type="text" name="industrybound" size="100" value="<s:property value='industrybound'/>"/> </td>
						</tr>
						 --%>

						<tr>
							<td class="label"><s:property value="%{getText('enterprise_employeeTotal')}"/> </td>					
							<td><input type="text" name="employeetotal" value="<s:property value='employeetotal'/>"/></td>
							<td class="label"><s:property value="%{getText('enterprise_managerTotal')}"/> </td>					
							<td><input type="text" name="managertotal" value="<s:property value='managertotal'/>"/></td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_techniciansTotal')}"/> </td>					
							<td><input type="text" name="technicianstotal" value="<s:property value='technicianstotal'/>"/> </td>
							<td class="label"><s:property value="%{getText('enterprise_bachelorTotal')}"/> </td>					
							<td><input type="text" name="bachelortotal" value="<s:property value='bachelortotal'/>"/></td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_seniorTotal')}"/> </td>					
							<td><input type="text" name="seniortotal" value="<s:property value='seniortotal'/>"/> </td>
							<td class="label"><s:property value="%{getText('enterprise_middleTotal')}"/> </td>					
							<td><input type="text" name="middletotal" value="<s:property value='middletotal'/>"/> </td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_juniorTotal')}"/> </td>					
							<td><input type="text" name="juniortotal" value="<s:property value='juniortotal'/>"/></td>
							<td class="label"><s:property value="%{getText('enterprise_professionalTotal')}"/>  </td>					
							<td><input type="text" name="professionaltotal" value="<s:property value='professionaltotal'/>"/></td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('finance_assets')}"/> </td>					
							<td><input type="text" name="totalassets" value="<s:property value='totalassets'/>"/></td>
							<td class="label"><s:property value="%{getText('finance_income')}"/>  </td>					
							<td><input type="text" name="businessincome" value="<s:property value='businessincome'/>"/></td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('finance_netProfit')}"/> </td>					
							<td><input type="text" name="netprofit" value="<s:property value='netprofit'/>"/></td>
							<td class="label"><s:property value="%{getText('enterprise_IntegrityInfo')}"/><s:property value="%{getText('integrityinfo_captureTime')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_YEAR'}" />
								    <s:param name="selectName" value="%{'productbound'}"/>
								    <s:param name="selectedKey" value="%{productbound}"/>
							  	</s:action>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_introduction')}"/> </td>					
							<td colspan="3">
								<textarea cols="75" rows="5" name="introduction" ><s:property value='introduction'/></textarea>
							</td>
						</tr>
					</table>
				</fieldset>
			</td>
		</tr>
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><s:property value="%{getText('common_linkinfo')}"/></legend>
					<table class="basic-table-sh">
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_linkman')}"/> </td>
							<td><input type="text" name="linkman" value="<s:property value='linkman'/>"/></td>
							<td class="label"><s:property value="%{getText('enterprise_phone')}"/> </td>
							<td><input type="text" name="phone" value="<s:property value='phone'/>"/></td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_mobilePhone')}"/> </td>
							<td><input type="text" name="mobilephone" value="<s:property value='mobilephone'/>"/>  </td>
							<td class="label"><s:property value="%{getText('enterprise_zip')}"/> </td>
							<td><input type="text" name="zip" value="<s:property value='zip'/>"/> </td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_fax')}"/>  </td>
							<td><input type="text" name="fax" value="<s:property value='fax'/>"/> </td>

							<td class="label"><s:property value="%{getText('enterprise_email')}"/> </td>
							<td><input type="text" name="email" value="<s:property value='email'/>"/>  </td>
						</tr>

						<tr>
							<td class="label"><s:property value="%{getText('enterprise_address')}"/> </td>					
							<td colspan="3"> <input type="text" size="100" name="address" value="<s:property value='address'/>"/></td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_officeAddr')}"/> </td>					
							<td colspan="3"><input type="text" name="officeaddr" size="100" value="<s:property value='officeaddr'/>"/> </td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_url')}"/> </td>
							<td ><input type="text" name="url" value="<s:property value='url'/>"/> </td>

							<td class="label"><s:property value="%{getText('enterprise_legalRepresentative')}"/> </td>					
							<td><input type="text" name="legalrepresentative" value="<s:property value='legalrepresentative'/>"/> </td>
						</tr>
						<tr>							
							<td class="label"><s:property value="%{getText('enterprise_legalRepresentativeTele')}"/> </td>					
							<td><input type="text" name="legalrepresentativetele" value="<s:property value='legalrepresentativetele'/>"/> </td>
							
							<td class="label"><s:property value="%{getText('enterprise_legalRepresentativeMobile')}"/> </td>					
							<td><input type="text" name="legalrepresentativemobile" value="<s:property value='legalrepresentativemobile'/>"/> </td>
						</tr>
					</table>
				</fieldset>
			</td>
		</tr>
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><s:property value="%{getText('enterprise_reginfo')}"/></legend>
					<table class="basic-table-sh">
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_registerTime')}"/>  </td>
							<td>  <input type="text" name="registertime" class="inputDatetime" value="<s:property value='registertime'/>"/> </td>
							<td class="label"><s:property value="%{getText('enterprise_registerCapital')}"/> </td>
							<td> <input type="text" name="registercapital" value="<s:property value='registercapital'/>"/> </td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_registerAddr')}"/>  </td>
							<td colspan="3"><input type="text" size="100" name="registeraddr" value="<s:property value='registeraddr'/>"/></td>
						</tr>
					</table>
				</fieldset>
			</td>
		</tr>
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><s:property value="%{getText('enterprise_IPOinfo')}"/></legend>
					<table class="basic-table-sh">
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_IPO')}"/></td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'ENTERP_IPO_FLAG'}" />
								    <s:param name="selectName" value="%{'ipoflag'}"/>
								    <s:param name="selectedKey" value="%{ipoflag}"/>
							  	</s:action>							
							</td>
							<td class="label"><s:property value="%{getText('enterprise_IPOTime')}"/>  </td>
							<td><input type="text" name="ipotime" class="inputDatetime" value="<s:property value='ipotime'/>"/></td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_IPOArea')}"/> </td>
							<td><input type="text" name="ipoarea" value="<s:property value='ipoarea'/>"/></td>
							<td class="label"> <s:property value="%{getText('enterprise_IPOForum')}"/>  </td>
							<td><input type="text" name="ipoforum" value="<s:property value='ipoforum'/>"/> </td>
						</tr>
					</table>
				</fieldset>
			</td>
		</tr>
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><s:property value="%{getText('enterprise_QualifacationInfo')}"/> </legend>
					<table class="basic-table-sh">
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_spQualifacationLevelDescripton')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
								    <s:param name="selectName" value="%{'spqualifacationlevel'}"/>
								    <s:param name="selectedKey" value="%{spqualifacationlevel}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_qualifacationGetFire')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
								    <s:param name="selectName" value="%{'qualifacationgetfire'}"/>
								    <s:param name="selectedKey" value="%{qualifacationgetfire}"/>
							  	</s:action>							
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_qualifacationGetConf')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL_CONF'}" />
								    <s:param name="selectName" value="%{'qualifacationgetconf'}"/>
								    <s:param name="selectedKey" value="%{qualifacationgetconf}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_qualifacationGetBuildInte')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL_CONF'}" />
								    <s:param name="selectName" value="%{'qualifacationgetbuildinte'}"/>
								    <s:param name="selectedKey" value="%{qualifacationgetbuildinte}"/>
							  	</s:action>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_qualifacationGetBuildProj')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
								    <s:param name="selectName" value="%{'qualifacationgetbuildproj'}"/>
								    <s:param name="selectedKey" value="%{qualifacationgetbuildproj}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_qualifacationGetITInte')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL_IT'}" />
								    <s:param name="selectName" value="%{'qualifacationgetitinte'}"/>
								    <s:param name="selectedKey" value="%{qualifacationgetitinte}"/>
							  	</s:action>							
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_qualificationSupervision')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
								    <s:param name="selectName" value="%{'qualificationsupervision'}"/>
								    <s:param name="selectedKey" value="%{qualificationsupervision}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_qualificationComputerSp')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_LEVEL'}" />
								    <s:param name="selectName" value="%{'qualificationcomputersp'}"/>
								    <s:param name="selectedKey" value="%{qualificationcomputersp}"/>
							  	</s:action>							
							</td>
						</tr>
					</table>
				</fieldset>
			</td>
		</tr>
		<tr>
			<td colspan="4">
				<fieldset>
					<legend accesskey="F" align="left"><s:property value="%{getText('enterprise_enrollinfo')}"/> </legend>
					<table class="basic-table-sh">
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_memberType')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'ENTERP_MEMBER_TYPE'}" />
								    <s:param name="selectName" value="%{'membertypeid'}"/>
								    <s:param name="selectedKey" value="%{membertypeid}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_feePayment')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'ENTERP_FEE_FLAG'}" />
								    <s:param name="selectName" value="%{'feepaymentflag'}"/>
								    <s:param name="selectedKey" value="%{feepaymentflag}"/>
							  	</s:action>							
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_qualityCertifacationDescripton')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'QUALIF_CERTI'}" />
								    <s:param name="selectName" value="%{'qualitycertifacation'}"/>
								    <s:param name="selectedKey" value="%{qualitycertifacation}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_qualityCertifacationOtherDesc')}"/> </td>
							<td>
								<input type="text" name="qualitycertifacationotherdesc" value="<s:property value='qualitycertifacationotherdesc'/>"/>					
							</td>
						</tr>

						<%--
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_offersBeginTime')}"/> </td>					
							<td><input type="text" name="offersbegintime" class="inputDatetime" value="<s:property value='offersbegintime'/>"/> </td>
							<td class="label"><s:property value="%{getText('enterprise_offersEndTime')}"/></td>					
							<td><input type="text" name="offersendtime" class="inputDatetime" value="<s:property value='offersendtime'/>"/> </td>
						</tr>
						 --%>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_enrollTime')}"/> </td>					
							<td><input type="text" name="enrolltime" class="inputDatetime"  value="<s:property value='enrolltime'/>"/></td>
							<td class="label"><s:property value="%{getText('enterprise_withDrawtime')}"/>  </td>					
							<td><input type="text" name="withdrawtime" class="inputDatetime" value="<s:property value='withdrawtime'/>"/> </td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_toHighApplyLevelDescripton')}"/> </td>
							<td>
								<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'APPLY_LEVEL'}" />
								    <s:param name="selectName" value="%{'tohighapplylevel'}"/>
								    <s:param name="selectedKey" value="%{tohighapplylevel}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('enterprise_sponsorshipAmount')}"/> </td>					
							<td><input type="text" name="sponsorshipamount" value="<s:property value='sponsorshipamount'/>"/> </td>
						</tr>
					</table>
				</fieldset>
			</td>
		</tr>
		<tr>
			<td colspan="4">
				<input type="submit" class="submitButton" value="<s:property value="%{getText('common_submit')}"/>" />
			</td>
		</tr>
	</table>
</form>