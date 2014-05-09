 <#if (list.size()>0)> 
    <div>
		<div class="screenlet">
			<div class="screenlet-header widget">
				<div class="item-box">
					<h3 class="screenlet-title">
					<@s.text name="menu_excellentselect_list"/>
					</h3>
				</div>
			</div>
		</div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="excellentselect_enterpriseName"/></th>
      				<th><@s.text name="excellentselect_legalRepresentative"/></th>
      				<th><@s.text name="excellentselect_requestName"/></th>
      				<th><@s.text name="excellentselect_requestOld"/></th>
      				<th><@s.text name="excellentselect_position"/></th>
      				<th><@s.text name="excellentselect_mobilePhone"/></th>
      				<th><@s.text name="excellentselect_tele"/></th>
      				<th><@s.text name="excellentselect_requestTypeId"/></th>
      				<th><@s.text name="excellentselect_selectYear"/></th>
      				<th><@s.text name="excellentselect_selectResultEnumId"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as excellentselect>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/correspondent/viewExcellentSelect.action?requestId=${excellentselect.id}">${excellentselect.enterprisename?if_exists}</a></li></ul></div></td>
              <td>${excellentselect.legalrepresentative?if_exists}</td>
              <td>${excellentselect.requestname?if_exists}</td>
              <td>${excellentselect.requestold?if_exists}</td>
              <td>${excellentselect.position?if_exists}</td>
              <td>${excellentselect.mobilephone?if_exists}</td>
              <td>${excellentselect.tele?if_exists}</td>
              <td>${excellentselect.requesttypedesc?if_exists}</td>
              <td>${excellentselect.selectyear?if_exists}</td>
              <td>${excellentselect.selectresultdesc?if_exists}</td>
              <td><div class="buttonUl"><ul><li><a class="submitButton"  href="/correspondent/excellentselect!edit.action?requestId=${excellentselect.id}"><@s.text name="common_edit"/> </a></li>
              <li><a class="submitButton"  href="/correspondent/excellentselect!remove.action?requestId=${excellentselect.id}"><@s.text name="common_delete"/></a></li></ul></div></td></td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>