 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="examenrolls_candidate_name"/></th>
      				<th><@s.text name="candidates_cardNo"/></th>
      				<th><@s.text name="candidates_tele"/></th>
      				<th><@s.text name="candidates_mobilePhone"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as examenroll>
            <tr>
              <td>${examenroll.name?if_exists}</td>
              <td>${examenroll.cardno?if_exists}</td>
              <td>${examenroll.tele?if_exists}</td>
              <td>${examenroll.mobilephone?if_exists}</td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>