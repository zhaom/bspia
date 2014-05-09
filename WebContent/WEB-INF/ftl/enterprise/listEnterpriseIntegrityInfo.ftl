 <#if (list.size()>0)> 
    <div>
		<div class="screenlet">
			<div class="screenlet-header widget">
				<div class="item-box">
					<h3 class="screenlet-title">
					<@s.text name="menu_mem_list"/>
					</h3>
				</div>
			</div>
		</div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="enterprise_name"/></th>
      				<th><@s.text name="enterprise_nature"/></th>
      				<th><@s.text name="enterprise_legalRepresentative"/></th>
      				<th><@s.text name="enterprise_phone"/></th>
      				<th><@s.text name="enterprise_address"/></th>
      				<th><@s.text name="enterprise_feePayment"/></th>
      				<th><@s.text name="enterprise_lastUpdateLogin"/></th>
      				<th><@s.text name="enterprise_createdLogin"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as enterprise>
            <tr>
              <td>${enterprise.name?if_exists}</td>
              <td>${enterprise.natureDescription?if_exists}</td>
              <td>${enterprise.legalrepresentative?if_exists}</td>
              <td>${enterprise.phone?if_exists}</td>
              <td>${enterprise.address?if_exists}</td>
              <td>${enterprise.feePaymentDescription?if_exists}</td>
              <td>${enterprise.lastUpdateUserName?if_exists}</td>
              <td>${enterprise.createdUserName?if_exists}</td>
              <td>
              	<div class="buttonUl">
              		<ul>
              			<li>
	              			<a class="submitButton"  href="/enterprise/enterprise!editIntegrityinfo.action?requestId=${enterprise.id}">
	              				<@s.text name="enterprise_IntegrityInfoadmin"/> 
	              			</a>
              			</li>
              			<li>
	              			<a class="submitButton"  href="/enterprise/enterprise!checkIntegrityReport.action?requestId=${enterprise.id}">
	              				<@s.text name="enterprise_checkIntegrityReport"/> 
	              			</a>
              			</li>
              		</ul>
              	</div>
              </td>
            </tr>
            </#list>
           </tbody>
        </table>

    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>