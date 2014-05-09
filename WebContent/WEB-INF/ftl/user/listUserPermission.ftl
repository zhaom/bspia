 <#if (list.size()>0)> 
    <div> 
        <table  class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="user_permissionDescription"/></th>
      				<th><@s.text name="user_permissionRemark"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
          <tbody>
            <#list list as userPermission>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/system/viewUserPermission.action?requestId=${userPermission.id}">${userPermission.permissionDescription}</a></td>
              <td>${userPermission.remark}</td>
              <td><div class="buttonUl"><ul><li><a class="submitButton" href="/system/userPermission!edit.action?requestId=${userPermission.id}&userId=${requestId?if_exists}"><@s.text name="common_edit"/> </a></li>
              	<li><a class="submitButton" href="/system/userPermission!remove.action?requestId=${userPermission.id}"><@s.text name="common_delete"/></a></li></ul></div></td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>