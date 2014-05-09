<#if (list.size()>0)> 
    <div> 
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="notification_title"/></th>
      				<th><@s.text name="notification_date"/></th>
      				<th><@s.text name="notification_user"/></th>
      				<#--
      				<th>&nbsp;</th>
      				-->
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as notification>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/system/viewNotification.action?requestId=${notification.id?if_exists}">${notification.title?if_exists}</a></li></ul></div></td>
              <td><#if notification.createdate?exists>${notification.createdate?datetime}</#if>&nbsp;</td>
              <td>${notification.username?if_exists}</td>
              <#-- 
              <td><div class="buttonUl"><ul><li><a class="submitButton" href="/system/notification!edit.action?requestId=${notification.id?if_exists}"><@s.text name="common_edit"/> </a></li>
              <li><a class="submitButton" href="/system/notification!remove.action?requestId=${notification.id?if_exists}"><@s.text name="common_delete"/></a></li></ul></div></td>
              -->
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
    
<#else>
		<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>