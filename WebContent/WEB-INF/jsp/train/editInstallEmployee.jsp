<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/train/installEmployee!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		
		<table class="basic-form">

			<tr>
				<td class="label">
					<s:property value="%{getText('installemployee_techtitle')}"/>
				</td>
				<td>
					<input type="text" name="techtitle" value="<s:property value='techtitle'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('installemployee_techtitlelevel')}"/>
				</td>
				<td>
					<input type="text" name="techtitlelevel" value="<s:property value='techtitlelevel'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('installemployee_personname')}"/>
				</td>
				<td>
					<input type="text" name="personname" value="<s:property value='personname'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('installemployee_personsex')}"/>
				</td>
				<td>
					<input type="text" name="personsex" value="<s:property value='personsex'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('installemployee_personnation')}"/>
				</td>
				<td>
					<input type="text" name="personnation" value="<s:property value='personnation'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('installemployee_persondegree')}"/>
				</td>
				<td>
					<input type="text" name="persondegree" value="<s:property value='persondegree'/>"/>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('installemployee_politice')}"/>
				</td>
				<td>
					<input type="text" name="politice" value="<s:property value='politice'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('installemployee_idcardno')}"/>
				</td>
				<td>
					<input type="text" name="idcardno" value="<s:property value='idcardno'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('installemployee_enterprisename')}"/>
				</td>
				<td>
					<input type="text" name="enterprisename" value="<s:property value='enterprisename'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('installemployee_tel')}"/>
				</td>
				<td>
					<input type="text" name="tel" value="<s:property value='tel'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('installemployee_wholescore')}"/>
				</td>
				<td>
					<input type="text" name="wholescore" value="<s:property value='wholescore'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('installemployee_cerno')}"/>
				</td>
				<td>
					<input type="text" name="cerno" value="<s:property value='cerno'/>"/>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>