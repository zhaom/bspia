 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="enterprise_name"/></th>
      				<th><@s.text name="enterprise_legalRepresentative"/></th>
      				<th><@s.text name="enterprise_legalRepresentativeMobile"/></th>
      				<th><@s.text name="enterprise_linkman"/></th>
      				<th><@s.text name="enterprise_mobilePhone"/></th>
      				<th><@s.text name="enterprise_spQualifacationLevelDescripton"/></th>
      				<th><@s.text name="enterprise_zip"/></th>
    			</tr>
        	</thead>
          <tbody>
            <#list list as enterprise>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/enterprise/viewEnterpriseInfo.action?requestId=${enterprise.id}">${enterprise.name}</a></li></ul></div></td>
              <td>${enterprise.legalrepresentative?if_exists}</td>
              <td>${enterprise.legalrepresentativemobile?if_exists}</td>
              <td>${enterprise.linkman?if_exists}</td>
              <td>${enterprise.mobilephone?if_exists}</td>
              <td>${enterprise.spQualifacationLevelDescripton?if_exists}</td>
              <td>${enterprise.zip?if_exists}</td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>