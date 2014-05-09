 <#if (list.size()>0)> 
    <div>
		<div class="screenlet">
			<div class="screenlet-header widget">
				<div class="item-box">
					<h3 class="screenlet-title">
					<@s.text name="self_costengineer"/>
					</h3>
				</div>
			</div>
		</div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
        	    	<th><@s.text name="self_costengineer_enterprisename"/></th>
      				<th><@s.text name="self_costengineer_businesstype"/></th>
      				<th><@s.text name="self_costengineer_personname"/></th>
      				<th><@s.text name="self_costengineer_personsex"/></th>
      				<th><@s.text name="self_costengineer_position"/></th>
      				<th><@s.text name="self_costengineer_technicaltitle"/></th>
      				<th><@s.text name="self_costengineer_birthdate"/></th>
      				<th><@s.text name="self_costengineer_costengineercer"/></th>
      				<th><@s.text name="self_costengineer_idcardno"/></th>
      				<th><@s.text name="self_costengineer_securityno"/></th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as costengineer>
            <tr>
              <td>${costengineer.enterprisename?if_exists}</td>
              <td>${costengineer.businesstype?if_exists}</td>
              <td>${costengineer.personname?if_exists}</td>
              <td>${costengineer.personsex?if_exists}</td>
              <td>${costengineer.position?if_exists}</td>
              <td>${costengineer.technicaltitle?if_exists}</td>
              <td>${costengineer.birthdate?if_exists}</td>
              <td>${costengineer.costengineercer?if_exists}</td>
              <td>${costengineer.idcardno?if_exists}</td>
              <td>${costengineer.securityno?if_exists}</td>
            </tr>
            </#list>
           </tbody>
        </table>

    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>