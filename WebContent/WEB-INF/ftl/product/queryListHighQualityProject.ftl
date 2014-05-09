 <#if (list?exists) && (list.size()>0)> 
    <div>
		<div class="screenlet">
			<div class="screenlet-header widget">
				<div class="item-box">
					<h3 class="screenlet-title">
					<@s.text name="highqualityproject_list"/>
					</h3>
				</div>
			</div>
		</div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
        	    	<th><@s.text name="highqualityproject_enterprisename"/></th>
      				<th><@s.text name="highqualityproject_linkman"/></th>
      				<th><@s.text name="highqualityproject_linktel"/></th>
      				<th><@s.text name="highqualityproject_gettitleyear"/></th>
      				<th><@s.text name="highqualityproject_projectname"/></th>
      				<th><@s.text name="highqualityproject_constructorg"/></th>
      				<th><@s.text name="highqualityproject_projectamount"/></th>
      				<th><@s.text name="highqualityproject_risklevel"/></th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as highqualityproject>
            <tr>
              <td>${highqualityproject.enterprisename?if_exists}</td>
              <td>${highqualityproject.linkman?if_exists}</td>
              <td>${highqualityproject.linktel?if_exists}</td>
              <td>${highqualityproject.gettitleyear?if_exists}</td>
              <td>${highqualityproject.projectname?if_exists}</td>
              <td>${highqualityproject.constructorg?if_exists}</td>
              <td>${highqualityproject.projectamount?if_exists}</td>
              <td>${highqualityproject.risklevel?if_exists}</td>
            </tr>
            </#list>
           </tbody>
        </table>

    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>