 <#if (list.size()>0)> 
    <div> 
        <table class="basic-table-sh">
            <thead>
        	    <tr>
      				<th><@s.text name="user_name"/></th>
      				<th><@s.text name="user_depart"/></th>
      				<th><@s.text name="user_userId"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
          <tbody>
            <#list list as user>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/system/viewUser.action?requestId=${user.id}">${user.name}</a></li></ul></div></td>
              <td>${user.departname}</td>
              <td>${user.loginid}</td>
              <td>
              <div class="buttonUl">
	              <ul>
		              <li><a class="submitButton"  href="/system/user!edit.action?requestId=${user.id}"><@s.text name="common_edit"/> </a></li>
		              <li><a class="submitButton"  href="/system/user!remove.action?requestId=${user.id}"><@s.text name="common_delete"/></a></li>
		              <li><a class="submitButton"  href="/system/user2!initPassword.action?requestId=${user.id}"><@s.text name="user_resetPassword"/></a></li>
		              <li><a class="submitButton"  href="/system/browseUserPermission.action?requestId=${user.loginid}"><@s.text name="user_viewPermission"/></a></li>
	              </ul>
              </div>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
<@s.text name="error_noRecord"/>
</#if>