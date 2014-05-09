 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="enterprise_statistic_cate"/></th>
      				<th><@s.text name="enterprise_statistic_count"/></th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as enterprise>
            <tr>
              <td>${enterprise.productbound?if_exists}</td>
              <td>${enterprise.employeetotal?if_exists}</td>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>