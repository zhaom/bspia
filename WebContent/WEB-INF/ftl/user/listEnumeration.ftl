<#if (list.size()>0)> 
    <div> 
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="enumeration_enumid"/></th>
      				<th><@s.text name="enumeration_enumtypeid"/></th>
      				<th><@s.text name="enumeration_enumcode"/></th>
      				<th><@s.text name="enumeration_desc"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as enumeration>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/system/viewEnumeration.action?requestId=${enumeration.enumid?if_exists}">${enumeration.enumid?if_exists}</a></li></ul></div></td>
              <td>${enumeration.enumtypeid?if_exists}</td>
              <td>${enumeration.enumcode?if_exists}</td>
              <td>${enumeration.description?if_exists}</td>
              
              <td><div class="buttonUl"><ul><li><a class="submitButton" href="/system/enumeration!edit.action?requestId=${enumeration.enumid?if_exists}"><@s.text name="common_edit"/> </a></li>
              <li><a class="submitButton" href="/system/enumeration!remove.action?requestId=${enumeration.enumid?if_exists}"><@s.text name="common_delete"/></a></li></ul></div></td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
    
<#else>
		<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>