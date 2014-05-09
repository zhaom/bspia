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
        	    	<th><@s.text name="self_businesstype"/></th>
      				<th><@s.text name="self_enterprisename"/></th>
      				<th><@s.text name="self_province"/></th>
      				<th><@s.text name="self_city"/></th>
      				<th><@s.text name="self_lagelperson"/></th>
      				<th><@s.text name="self_linkperson"/></th>
      				<th><@s.text name="self_linktel"/></th>
      				<th><@s.text name="self_replylevel"/></th>
      				<th><@s.text name="self_replyno"/></th>
      				<th><@s.text name="self_replytime"/></th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as enterprise>
            <tr>
              <td>${enterprise.businesstype?if_exists}</td>
              <td><div class="buttonUl"><ul><li><a href="/self/viewEnterprise.action?requestId=${enterprise.id}&enterprisename=${enterprise.name}">${enterprise.name}</a></li></ul></div></td>
              <td>${enterprise.province?if_exists}</td>
              <td>${enterprise.city?if_exists}</td>
              <td>${enterprise.legalperson?if_exists}</td>
              <td>${enterprise.contact?if_exists}</td>
              <td>${enterprise.linktel?if_exists}</td>
              <td>${enterprise.requestlevel?if_exists}</td>
              <td>${enterprise.requestcode?if_exists}</td>
              <td>${enterprise.requesttime?if_exists}</td>
            </tr>
            </#list>
           </tbody>
        </table>

    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>