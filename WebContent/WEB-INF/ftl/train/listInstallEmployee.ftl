 <#if (list?exists) && (list.size()>0)> 
    <div>
		<div class="screenlet">
			<div class="screenlet-header widget">
				<div class="item-box">
					<h3 class="screenlet-title">
					<@s.text name="installemployee_list"/>
					</h3>
				</div>
			</div>
		</div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
        	    	<th><@s.text name="installemployee_techtitle"/></th>
      				<th><@s.text name="installemployee_techtitlelevel"/></th>
      				<th><@s.text name="installemployee_personname"/></th>
      				<th><@s.text name="installemployee_personsex"/></th>
      				<th><@s.text name="installemployee_personnation"/></th>
      				<th><@s.text name="installemployee_persondegree"/></th>
      				<th><@s.text name="installemployee_politice"/></th>
      				<th><@s.text name="installemployee_idcardno"/></th>
      				<th><@s.text name="installemployee_enterprisename"/></th>
      				<th><@s.text name="installemployee_tel"/></th>
      				<th><@s.text name="installemployee_wholescore"/></th>
      				<th><@s.text name="installemployee_cerno"/></th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as installemployee>
            <tr>
              <td>${installemployee.techtitle?if_exists}</td>
              <td>${installemployee.techtitlelevel?if_exists}</td>
              <td>${installemployee.personname?if_exists}</td>
              <td>${installemployee.personsex?if_exists}</td>
              <td>${installemployee.personnation?if_exists}</td>
              <td>${installemployee.persondegree?if_exists}</td>
              <td>${installemployee.politice?if_exists}</td>
              <td>${installemployee.idcardno?if_exists}</td>
              <td>${installemployee.enterprisename?if_exists}</td>
              <td>${installemployee.tel?if_exists}</td>
              <td>${installemployee.wholescore?if_exists}</td>
              <td>${installemployee.cerno?if_exists}</td>
            </tr>
            </#list>
           </tbody>
        </table>

    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>