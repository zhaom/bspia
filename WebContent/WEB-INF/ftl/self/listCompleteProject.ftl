 <#if (list.size()>0)> 
    <div>
		<div class="screenlet">
			<div class="screenlet-header widget">
				<div class="item-box">
					<h3 class="screenlet-title">
					<@s.text name="self_completeproj_list"/>
					</h3>
				</div>
			</div>
		</div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
        	    	<th><@s.text name="self_completeproj_enterprisename"/></th>
      				<th><@s.text name="self_completeproj_businesstype"/></th>
      				<th><@s.text name="self_completeproj_projectname"/></th>
      				<th><@s.text name="self_completeproj_contractno"/></th>
      				<th><@s.text name="self_completeproj_projectamount"/></th>
      				<th><@s.text name="self_completeproj_projectsize"/></th>
      				<th><@s.text name="self_completeproj_completetime"/></th>
      				<th><@s.text name="self_completeproj_acceptancecheckmethod"/></th>
      				<th><@s.text name="self_completeproj_projectdata"/></th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as completeproj>
            <tr>
              <td>${completeproj.enterprisename?if_exists}</td>
              <td>${completeproj.businesstype?if_exists}</td>
              <td>${completeproj.projectname?if_exists}</td>
              <td>${completeproj.contractno?if_exists}</td>
              <td>${completeproj.projectamount?if_exists}</td>
              <td>${completeproj.projectsize?if_exists}</td>
              <td>${completeproj.completetime?if_exists}</td>
              <td>${completeproj.acceptancecheckmethod?if_exists}</td>
              <td>${completeproj.projectdata?if_exists}</td>
            </tr>
            </#list>
           </tbody>
        </table>

    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>