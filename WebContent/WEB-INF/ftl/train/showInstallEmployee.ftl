<div> 
	<table class="basic-table-sh">
			<tr>
				<td class="label">
					<@s.text name="installemployee_techtitle"/>
				</td>
				<td>
					${techtitle?if_exists}
				</td>

				<td colspan="2">
					<img src ='/UploadImages/${picture?if_exists}' width="160" height="200"/>
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="installemployee_techtitlelevel"/>
				</td>
				<td>
					${techtitlelevel?if_exists}
				</td>
				<td class="label">
					<@s.text name="installemployee_personname"/>
				</td>
				<td>
					${personname?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="installemployee_personsex"/>
				</td>
				<td>
					${personsex?if_exists}
				</td>
				<td class="label">
					<@s.text name="installemployee_personnation"/>
				</td>
				<td>
					${personnation?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="installemployee_persondegree"/>
				</td>
				<td>
					${persondegree?if_exists}
				</td>
				<td class="label">
					<@s.text name="installemployee_politice"/>
				</td>
				<td>
					${politice?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="installemployee_idcardno"/>
				</td>
				<td>
					${idcardno?if_exists}
				</td>				
				<td class="label">
					<@s.text name="installemployee_enterprisename"/>
				</td>
				<td>
					${enterprisename?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="installemployee_tel"/>
				</td>
				<td>
					${tel?if_exists}
				</td>
				<td class="label">
					<@s.text name="installemployee_wholescore"/>
				</td>
				<td>
					${wholescore?if_exists}
				</td>
			</tr>
			<tr>
				<td class="label">
					<@s.text name="installemployee_cerno"/>
				</td>
				<td>
					${cerno?if_exists}
				</td>
				
				<td class="label">
					
				</td>
				<td>
					
				</td>
			</tr>
	</table>
</div>