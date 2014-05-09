 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="enterprise_statistic_allsum"/></th>
      				<th><@s.text name="enterprise_statistic_techsum"/></th>
      				<th><@s.text name="enterprise_statistic_seniorsum"/></th>
      				<th><@s.text name="enterprise_statistic_prosum"/></th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as enterprise>
            <tr>
              <td>${enterprise.employeetotal?if_exists}</td>
              <td>${enterprise.technicianstotal?if_exists}</td>
              <td>${enterprise.seniortotal?if_exists}</td>
              <td>${enterprise.professionaltotal?if_exists}</td>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>