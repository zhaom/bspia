<div> 
	<table class="basic-table-sh">
			<tr>
				<td class="label">
					<@s.text name="product_name"/>
				</td>
				<td colspan="3">
					${name?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="product_model"/>
				</td>
				<td>
					${model?if_exists}
				</td>
				<td class="label">
					<@s.text name="product_categoryId"/>
				</td>
				<td>
					${categoryid?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="product_function"/>
				</td>
				<td colspan="3">
					${function?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="product_parameter"/>
				</td>
				<td colspan="3">
					${parameter?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="product_case"/>
				</td>
				<td colspan="3">
					${case?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="product_manufacturer"/>
				</td>
				<td colspan="3">
					${manufacturer?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="product_manufacturerContact"/>
				</td>
				<td colspan="3">
					${manufacturercontact?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="product_vendor"/>
				</td>
				<td colspan="3">
					${vendor?if_exists}
				</td>
			</tr>			
			<tr>
				<td class="label">
					<@s.text name="product_vendorContact"/>
				</td>
				<td colspan="3">
					${vendorcontact?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="product_vendorChanel"/>
				</td>
				<td colspan="3">
					${vendorchanel?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="product_checkTime"/>
				</td>
				<td>
					<#if checktime?exists>
					${checktime?datetime}
					</#if>&nbsp;
				</td>
				<td class="label">
					<@s.text name="product_price"/>
				</td>
				<td>
					${price?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="product_checkReport"/>
				</td>
				<td colspan="3">
					${checkreport?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="product_certificationRime"/>
				</td>
				<td>
					${certificationrime?if_exists}
				</td>
				<td class="label">
					<@s.text name="product_certificationRalidity"/>
				</td>
				<td>
					${certificationralidity?if_exists}
				</td>
			</tr>

	</table>
</div>