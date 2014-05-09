 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="qualification_qualificationTypeId"/></th>
      				<th><@s.text name="qualification_qualificationLevel"/></th>
      				<th><@s.text name="qualification_qualificationTime"/></th>
      				<th><@s.text name="qualification_qualificationNo"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as qualification>
            <tr>
              <td>${qualification.qualificationtypedescription?if_exists}</td>
              <td>${qualification.qualificationleveldescription?if_exists}</td>
              <td><#if qualification.qualificationtime?exists>${qualification.qualificationtime?date}</#if>&nbsp;</td>
              <td>${qualification.qualificationno?if_exists}</td>
              <td><div class="buttonUl"><ul><li><a class="submitButton"  href="/qualification/qualification!edit.action?requestId=${qualification.id?if_exists}&enterpriseid=${qualification.enterpriseid?if_exists}"><@s.text name="common_edit"/> </a></li>
              <li><a class="submitButton"  href="/qualification/qualification!remove.action?requestId=${qualification.id?if_exists}&enterpriseid=${qualification.enterpriseid?if_exists}"><@s.text name="common_delete"/></a></li></ul></div></td></td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>