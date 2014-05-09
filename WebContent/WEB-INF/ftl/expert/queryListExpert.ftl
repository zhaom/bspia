 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="expert_name"/></th>
      				<th><@s.text name="expert_educationEnumId"/></th>
      				<th><@s.text name="expert_major"/></th>
      				<th><@s.text name="expert_position"/></th>
      				<th><@s.text name="expert_title"/></th>
      				<th><@s.text name="expert_mobilePhone"/></th>
      				<th><@s.text name="expert_cardNo"/></th>
      				<th><@s.text name="expert_retirementEnumId"/></th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as expert>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/expert/viewExpert.action?requestId=${expert.id}">${expert.name}</a></li></ul></div></td>
              <td>${expert.educationdesc?if_exists}</td>
              <td>${expert.major?if_exists}</td>
              <td>${expert.position?if_exists}</td>
              <td>${expert.title?if_exists}</td>
              <td>${expert.mobilephone?if_exists}</td>
              <td>${expert.cardno?if_exists}</td>
              <td>${expert.retirementdesc?if_exists}</td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>