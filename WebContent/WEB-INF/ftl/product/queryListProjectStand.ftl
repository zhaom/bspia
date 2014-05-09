 <#if (list?exists) && (list.size()>0)> 
    <div>
		<div class="screenlet">
			<div class="screenlet-header widget">
				<div class="item-box">
					<h3 class="screenlet-title">
					<@s.text name="projectstand_enterprisenamelist"/>
					</h3>
				</div>
			</div>
		</div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
        	    	<th><@s.text name="projectstand_enterprisename"/></th>
      				<th><@s.text name="projectstand_projectname"/></th>
      				<th><@s.text name="projectstand_projectsize"/></th>
      				<th><@s.text name="projectstand_completetime"/></th>
      				<th><@s.text name="projectstand_contractamount"/></th>
      				<th><@s.text name="projectstand_spamount"/></th>
      				<th><@s.text name="projectstand_systemos"/></th>
      				<th><@s.text name="projectstand_applydomain"/></th>
      				<th><@s.text name="projectstand_sppercent"/></th>
      				<th><@s.text name="projectstand_cameracount"/></th>
      				<th><@s.text name="projectstand_remark"/></th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as projectstand>
            <tr>
              <td>${projectstand.enterprisename?if_exists}</td>
              <td>${projectstand.projectname?if_exists}</td>
              <td>${projectstand.projectsize?if_exists}</td>
              <td>${projectstand.completetime?if_exists}</td>
              <td>${projectstand.contractamount?if_exists}</td>
              <td>${projectstand.spamount?if_exists}</td>
              <td>${projectstand.systemos?if_exists}</td>
              <td>${projectstand.applydomain?if_exists}</td>
              <td>${projectstand.sppercent?if_exists}</td>
              <td>${projectstand.cameracount?if_exists}</td>
              <td>${projectstand.remark?if_exists}</td>
            </tr>
            </#list>
           </tbody>
        </table>

    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>