 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="examination_examName"/></th>
      				<th><@s.text name="train_statistic_enrollexamcount"/></th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as enterprise>
            <tr>
              <td>${enterprise.examname?if_exists}</td>
              <td>${enterprise.score?if_exists}</td>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>