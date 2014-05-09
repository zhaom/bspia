 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="train_trainName"/></th>
      				<th><@s.text name="train_statistic_enrolltraincount"/></th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as enterprise>
            <tr>
              <td>${enterprise.trainname?if_exists}</td>
              <td>${enterprise.attendcertno?if_exists}</td>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>