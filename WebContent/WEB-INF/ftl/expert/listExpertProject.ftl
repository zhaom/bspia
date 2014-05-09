 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="expertproject_name"/></th>
      				<th><@s.text name="expertproject_category"/></th>
      				<th><@s.text name="expertproject_industry"/></th>
      				<th><@s.text name="expertproject_level"/></th>
      				<th><@s.text name="expertproject_amount"/></th>
      				<th><@s.text name="expertproject_buildCorpName"/></th>
      				<th><@s.text name="expertproject_serviceType"/></th>
      				<th><@s.text name="expertproject_acceptanceTime"/></th>
      				<th><@s.text name="expertproject_serviceExpert"/></th>
      				<th><@s.text name="expertproject_serviceFee"/></th>
      				<th><@s.text name="expertproject_serviceResult"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as expertproject>
            <tr>
              <td>${expertproject.name?if_exists}</td>
              <td>${expertproject.categorydesc?if_exists}</td>
              <td>${expertproject.industrydesc?if_exists}</td>
              <td>${expertproject.leveldesc?if_exists}</td>
              <td>${expertproject.amount?if_exists}</td>
              <td>${expertproject.buildcorpname?if_exists}</td>
              <td>${expertproject.servicetypedesc?if_exists}</td>
              <#if expertproject.acceptancetime?exists>
              	<td>${expertproject.acceptancetime?datetime}</td>
              <#else>
              	<td>&nbsp;</td>
              </#if>
              <td>${expertproject.serviceexpert?if_exists}</td>
              <td>${expertproject.servicefee?if_exists}</td>
              <td>${expertproject.serviceresultdesc?if_exists}</td>
              <td><div class="buttonUl"><ul><li><a class="submitButton"  href="/expert/expertproject!edit.action?requestId=${expertproject.id?if_exists}&enterpriseid=${expertproject.enterpriseid?if_exists}"><@s.text name="common_edit"/> </a></li>
              <li><a class="submitButton"  href="/expert/expertproject!remove.action?requestId=${expertproject.id?if_exists}&enterpriseid=${expertproject.enterpriseid?if_exists}"><@s.text name="common_delete"/></a></li></ul></div></td></td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>