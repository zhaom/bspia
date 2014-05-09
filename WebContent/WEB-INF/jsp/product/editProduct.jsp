<%@ include file="/WEB-INF/jsp/header.jsp" %>

	<form id="editForm" class="submitForm" action="/product/product!save.action" method="post">
	
		<input type="hidden" name="requestId" value="<s:property value='requestId'/>"/>
		
		<table class="basic-form">
			<tr>
				<td class="label">
					<s:property value="%{getText('product_name')}"/>
				</td>
				<td colspan="3">
					<input type="text" name="name" size="100" value="<s:property value='name'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('product_model')}"/>
				</td>
				<td>
					<input type="text" name="model" value="<s:property value='model'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('product_categoryId')}"/>
				</td>
				<td>
					<s:action name="enumeration!selectList" namespace="/system" executeResult="true" >
					  	<s:param name="requestId" value="%{'PROD_CATE'}" />
					    <s:param name="selectName" value="%{'categoryid'}"/>
					    <s:param name="selectedKey" value="%{categoryid}"/>
				  	</s:action>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('product_function')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="function" ><s:property value='function'/></textarea>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('product_parameter')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="parameter" ><s:property value='parameter'/></textarea>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('product_case')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="case" ><s:property value='case'/></textarea>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('product_manufacturer')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="manufacturer" value="<s:property value='manufacturer'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('product_manufacturerContact')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="manufacturercontact" value="<s:property value='manufacturercontact'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('product_vendor')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="vendor" value="<s:property value='vendor'/>"/>
				</td>
			</tr>			
			<tr>
				<td class="label">
					<s:property value="%{getText('product_vendorContact')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="vendorcontact" value="<s:property value='vendorcontact'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('product_vendorChanel')}"/>
				</td>
				<td colspan="3">
					<input type="text" size="100" name="vendorchanel" value="<s:property value='vendorchanel'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('product_checkTime')}"/>
				</td>
				<td>
					<input type="text" name="checktime"  class="inputDatetime" value="<s:property value='checktime'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('product_price')}"/>
				</td>
				<td>
					<input type="text" name="price" value="<s:property value='price'/>"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('product_checkReport')}"/>
				</td>
				<td colspan="3">
					<textarea cols="80" rows="3" name="checkreport" ><s:property value='checkreport'/></textarea>
				</td>
			</tr>
			<tr>
				<td class="label">
					<s:property value="%{getText('product_certificationRime')}"/>
				</td>
				<td>
					<input type="text" name="certificationrime"  class="inputDatetime" value="<s:property value='certificationrime'/>"/>
				</td>
				<td class="label">
					<s:property value="%{getText('product_certificationRalidity')}"/>
				</td>
				<td>
					<input type="text" name="certificationralidity" value="<s:property value='certificationralidity'/>"/>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" class="submitButton"  value=<s:property value="%{getText('common_submit')}"/> />
				</td>
			</tr>
		</table>
	</form>