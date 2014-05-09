 <#if (list.size()>0)> 
    <div>
        <table id="tableExcel" class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th nowrap><@s.text name="correspondent_name"/></th>
      				<th nowrap><@s.text name="correspondent_genderEnumId"/></th>
      				<th nowrap><@s.text name="correspondent_educationEnumId"/></th>
        			<th nowrap><@s.text name="correspondent_workplace"/></th>
      				<th nowrap><@s.text name="correspondent_title"/></th>
      				<th nowrap><@s.text name="correspondent_mobilePhone"/></th>
      				<th nowrap><@s.text name="correspondent_tele"/></th>
      				<th nowrap><@s.text name="correspondent_address"/></th>
      				<th nowrap><@s.text name="correspondent_zipCode"/></th>
    			</tr>
        	</thead>
          <tbody>
            <#list list as correspondent>
            <tr>
              <td nowrap><div class="buttonUl"><ul><li><a href="/correspondent/viewCorrespondent.action?requestId=${correspondent.id}">${correspondent.name}</a></li></ul></div></td>
              <td nowrap>${correspondent.genderdesc?if_exists}</td>
              <td nowrap>${correspondent.educationdesc?if_exists}</td>
              <td nowrap>${correspondent.workplace?if_exists}</td>
              <td nowrap>${correspondent.title?if_exists}</td>
              <td nowrap>${correspondent.mobilephone?if_exists}</td>
              <td nowrap>${correspondent.tele?if_exists}</td>
              <td nowrap>${correspondent.address?if_exists}</td>
              <td nowrap>${correspondent.zipcode?if_exists}</td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>