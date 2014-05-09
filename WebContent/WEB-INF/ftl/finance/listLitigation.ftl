 <#if (list?exists && list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="litigation_litigationDuring"/></th>
      				<th><@s.text name="litigation_litigationContent"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as litigation>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/finance/viewLitigation.action?requestId=${litigation.id?if_exists}&enterpriseid=${litigation.enterpriseid?if_exists}">${litigation.litigationduring?if_exists}</a></li></ul></div></td>
              <td>${litigation.litigationcontent?if_exists}</td>
              <td><div class="buttonUl"><ul><li><a class="submitButton"  href="/finance/litigation!edit.action?requestId=${litigation.id?if_exists}&enterpriseid=${litigation.enterpriseid?if_exists}"><@s.text name="common_edit"/> </a></li>
              <li><a class="submitButton"  href="/finance/litigation!remove.action?requestId=${litigation.id?if_exists}&enterpriseid=${litigation.enterpriseid?if_exists}"><@s.text name="common_delete"/></a></li></ul></div></td></td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>