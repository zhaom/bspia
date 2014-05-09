 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="excellentselect_enterpriseName"/></th>
      				<th><@s.text name="excellentselect_legalRepresentative"/></th>
      				<th><@s.text name="excellentselect_address"/></th>
      				<th><@s.text name="excellentselect_selectYear"/></th>
      				<th><@s.text name="excellentselect_requestTypeId"/></th>
      				<th><@s.text name="excellentselect_requestName"/></th>
      				<th><@s.text name="excellentselect_requestOld"/></th>
      				<th><@s.text name="excellentselect_position"/></th>
      				<th><@s.text name="excellentselect_spWorkDuring"/></th>
      				<th><@s.text name="excellentselect_majorTitle"/></th>
      				<th><@s.text name="excellentselect_educationEnumId"/></th>
      				<th><@s.text name="excellentselect_mobilePhone"/></th>
      				<th><@s.text name="excellentselect_tele"/></th>
      				<th><@s.text name="excellentselect_requestLitigation"/></th>
      				<th><@s.text name="excellentselect_introduction"/></th>
      				<th><@s.text name="excellentselect_requestPublish"/></th>
      				<th><@s.text name="excellentselect_workIntroduction"/></th>
      				<th><@s.text name="excellentselect_enterpriseRemark"/></th>
      				<th><@s.text name="excellentselect_otherRemark"/></th>
      				<th><@s.text name="excellentselect_checkReport"/></th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as excellentselect>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/correspondent/viewExcellentSelect.action?requestId=${excellentselect.id}">${excellentselect.enterprisename?if_exists}</a></li></ul></div></td>
              <td>${excellentselect.legalrepresentative?if_exists}</td>
              <td>${excellentselect.address?if_exists}</td>
              <td>${excellentselect.selectyear?if_exists}</td>
              <td>${excellentselect.requesttypedesc?if_exists}</td>
              <td>${excellentselect.requestname?if_exists}</td>
              <td>${excellentselect.requestold?if_exists}</td>
              <td>${excellentselect.position?if_exists}</td>
              <td>${excellentselect.spworkduring?if_exists}</td>
              <td>${excellentselect.majortitle?if_exists}</td>
              <td>${excellentselect.educationdesc?if_exists}</td>
              <td>${excellentselect.mobilephone?if_exists}</td>
              <td>${excellentselect.tele?if_exists}</td>
              <td>${excellentselect.requestlitigation?if_exists}</td>
              <td>${excellentselect.introduction?if_exists}</td>
              <td>${excellentselect.requestpublish?if_exists}</td>
              <td>${excellentselect.workintroduction?if_exists}</td>
              <td>${excellentselect.enterpriseremark?if_exists}</td>
              <td>${excellentselect.otherremark?if_exists}</td>
              <td>${excellentselect.checkreport?if_exists}</td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>