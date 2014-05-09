<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/self/selfEnterprise!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		
		<table class="basic-form">
			<tr>
				<td class="label">
					<s:property value="%{getText('self_enterprisename')}"/>
				</td>
				<td>
					<input type="text" name="name" value="<s:property value='name'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('self_businesstype')}"/>
				</td>
				<td>
					<input type="text" name="businesstype" value="<s:property value='businesstype'/>"/>
				</td>
			</tr>
			<tr>

				<td class="label">
					<s:property value="%{getText('self_province')}"/>
				</td>
				<td>
					<input type="text" name="province" value="<s:property value='province'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('self_city')}"/>
				</td>
				<td>
					<input type="text" name="city" value="<s:property value='city'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('self_regaddr')}"/>
				</td>
				<td>
					<input type="text" name="regaddr" value="<s:property value='regaddr'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('self_regzipcode')}"/>
				</td>
				<td>
					<input type="text" name="regzipcode" value="<s:property value='regzipcode'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('self_linkaddr')}"/>
				</td>
				<td>
					<input type="text" name="linkaddr" value="<s:property value='linkaddr'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('self_linkzipcode')}"/>
				</td>
				<td>
					<input type="text" name="linkzipcode" value="<s:property value='linkzipcode'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('self_mail')}"/>
				</td>
				<td>
					<input type="text" name="mailbox" value="<s:property value='mailbox'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('self_regtime')}"/>
				</td>
				<td>
					<input type="text" name="regtime" value="<s:property value='regtime'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('self_lagelperson')}"/>
				</td>
				<td>
					<input type="text" name="legalperson" value="<s:property value='legalperson'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('self_cardtype')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'EXPERT_CARDTYPE'}" />
					    <s:param name="selectName" value="%{'legalpersoncardtypeenumid'}"/>
					    <s:param name="selectedKey" value="%{legalpersoncardtypeenumid}"/>
				  	</s:action>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('self_cardno')}"/>
				</td>
				<td>
					<input type="text" name="legalpersoncardno" value="<s:property value='legalpersoncardno'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('self_position')}"/>
				</td>
				<td>
					<input type="text" name="legalpersonposition" value="<s:property value='legalpersonposition'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('self_linkperson')}"/>
				</td>
				<td>
					<input type="text" name="contact" value="<s:property value='contact'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('self_linkcardno')}"/>
				</td>
				<td>
					<input type="text" name="contactcardno" value="<s:property value='contactcardno'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('self_linkposition')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="contactposition" value="<s:property value='contactposition'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('self_linktel')}"/>
				</td>
				<td>
					<input type="text" name="linktel" value="<s:property value='linktel'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('self_linkfax')}"/>
				</td>
				<td>
					<input type="text" name="linkfax" value="<s:property value='linkfax'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('self_email')}"/>
				</td>
				<td>
					<input type="text" name="linkemail" value="<s:property value='linkemail'/>"/>
				</td>

				<td class="label">
					<s:property value="%{getText('self_website')}"/>
				</td>
				<td>
					<input type="text" name="linkwebsite" value="<s:property value='linkwebsite'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('self_businesslicense')}"/>
				</td>
				<td>
					<input type="text" name="businesslicense" value="<s:property value='businesslicense'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('self_orgno')}"/>
				</td>
				<td>
					<input type="text" name="orgcode" value="<s:property value='orgcode'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('self_replylevel')}"/>
				</td>
				<td>
					<input type="text" name="requestlevel" value="<s:property value='requestlevel'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('self_replyno')}"/>
				</td>
				<td>
					<input type="text" name="requestcode" value="<s:property value='requestcode'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('self_replytime')}"/>
				</td>
				<td>
					<input type="text" name="requesttime" value="<s:property value='requesttime'/>"/>
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
					<s:property value="%{getText('self_enterprisedesc')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="enterprisedesc" ><s:property value='enterprisedesc'/></textarea>
				</td>
			</tr>

			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>