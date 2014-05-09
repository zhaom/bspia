 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="candidates_name"/></th>
      				<th><@s.text name="candidates_cardNo"/></th>
      				<th><@s.text name="candidates_tele"/></th>
      				<th><@s.text name="candidates_mobilePhone"/></th>
      				<th><@s.text name="candidates_workplace"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as candidatetrain>
            <tr>
              <td>${candidatetrain.name?if_exists}</td>
              <td>${candidatetrain.cardno?if_exists}</td>
              <td>${candidatetrain.tele?if_exists}</td>
              <td>${candidatetrain.mobilephone?if_exists}</td>
              <td>${candidatetrain.workplace?if_exists}</td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>