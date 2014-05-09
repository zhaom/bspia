 <#if (list.size()>0)> 
    <div>
		<div class="screenlet">
			<div class="screenlet-header widget">
				<div class="item-box">
					<h3 class="screenlet-title">
					<@s.text name="menu_correspondent_list"/>
					</h3>
				</div>
			</div>
		</div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="correspondent_name"/></th>
      				<th><@s.text name="correspondent_genderEnumId"/></th>
      				<th><@s.text name="correspondent_educationEnumId"/></th>
      				<th><@s.text name="correspondent_title"/></th>
      				<th><@s.text name="correspondent_workplace"/></th>
      				<th><@s.text name="correspondent_mobilePhone"/></th>
      				<th><@s.text name="correspondent_tele"/></th>
      				<th><@s.text name="correspondent_contact"/></th>
      				<th><@s.text name="correspondent_address"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as correspondent>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/correspondent/viewCorrespondent.action?requestId=${correspondent.id}">${correspondent.name}</a></li></ul></div></td>
              <td>${correspondent.genderdesc?if_exists}</td>
              <td>${correspondent.educationdesc?if_exists}</td>
              <td>${correspondent.title?if_exists}</td>
              <td>${correspondent.workplace?if_exists}</td>
              <td>${correspondent.mobilephone?if_exists}</td>
              <td>${correspondent.tele?if_exists}</td>
              <td>${correspondent.contact?if_exists}</td>
              <td>${correspondent.address?if_exists}</td>
              <td>
              	<div class="buttonUl">
              		<ul>
              			<li>
              				<a class="submitButton"  href="/correspondent/correspondent!edit.action?requestId=${correspondent.id?if_exists}"><@s.text name="common_edit"/> </a>
              			</li>
              			<li>
              				<a class="submitButton"  href="/correspondent/correspondent!remove.action?requestId=${correspondent.id?if_exists}"><@s.text name="common_delete"/></a>
              			</li>
              			<#if correspondent.picture?has_content>
              			<#else>
							<li>
								<a  class="submitButton" href="/correspondent/uploadPicture.action?id=${correspondent.id?if_exists}"><@s.text name="correspondent_upload_picture"/></a>
							</li>
              			</#if>
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