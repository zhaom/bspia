<#if (list.size()>0)> 
    <div>
		<div class="screenlet">
			<div class="screenlet-header widget">
				<div class="item-box">
					<h3 class="screenlet-title">
					<@s.text name="self_techperson"/>
					</h3>
				</div>
			</div>
		</div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
        	    	<th><@s.text name="self_techperson_enterprisename"/></th>
      				<th><@s.text name="self_techperson_businesstype"/></th>
      				<th><@s.text name="self_techperson_personname"/></th>
      				<th><@s.text name="self_techperson_personsex"/></th>
      				<th><@s.text name="self_techperson_position"/></th>
      				<th><@s.text name="self_techperson_technicaltitle"/></th>
      				<th><@s.text name="self_techperson_birthdate"/></th>
      				<th><@s.text name="self_techperson_idcardno"/></th>
      				<th><@s.text name="self_techperson_securityno"/></th>
      				<th><@s.text name="self_techperson_techexamcer"/></th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as techperson>
            <tr>
              <td>${techperson.enterprisename?if_exists}</td>
              <td>${techperson.businesstype?if_exists}</td>
              <td>${techperson.personname?if_exists}</td>
              <td>${techperson.personsex?if_exists}</td>
              <td>${techperson.position?if_exists}</td>
              <td>${techperson.technicaltitle?if_exists}</td>
              <td>${techperson.birthdate?if_exists}</td>
              <td>${techperson.idcardno?if_exists}</td>
              <td>${techperson.securityno?if_exists}</td>
              <td>${techperson.techexamcer?if_exists}</td>
            </tr>
            </#list>
           </tbody>
        </table>

    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>