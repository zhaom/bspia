 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="integrityinfo_integrityTitle"/></th>
      				<th><@s.text name="integrityinfo_captureTime"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as integrity>
            <tr>
              <td>${integrity.integritytitle?if_exists}</td>
              <td><#if integrity.capturetime?exists>${integrity.capturetime?datetime}</#if>&nbsp;</td>
              <td><div class="buttonUl"><ul><li><a class="submitButton"  href="/qualification/integrity!edit.action?requestId=${integrity.id?if_exists}&enterpriseid=${integrity.enterpriseid?if_exists}"><@s.text name="common_edit"/> </a></li>
              <li><a class="submitButton"  href="/qualification/integrity!remove.action?requestId=${integrity.id?if_exists}&enterpriseid=${integrity.enterpriseid?if_exists}"><@s.text name="common_delete"/></a></li></ul></div></td></td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>