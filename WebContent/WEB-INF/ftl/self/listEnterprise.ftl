 <#if (list.size()>0)> 
    <div>
		<div class="screenlet">
			<div class="screenlet-header widget">
				<div class="item-box">
					<h3 class="screenlet-title">
					<@s.text name="selfinfo"/>
					</h3>
				</div>
			</div>
		</div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
        	    	<th><@s.text name="self_enterprisename"/></th>
      				<th><@s.text name="self_businesstype"/></th>
      				<th><@s.text name="self_province"/></th>
      				<th><@s.text name="self_city"/></th>
      				<th><@s.text name="self_lagelperson"/></th>
      				<th><@s.text name="self_linkperson"/></th>
      				<th><@s.text name="self_linkcardno"/></th>
      				<th><@s.text name="self_linkposition"/></th>
      				<th><@s.text name="self_linktel"/></th>
      				<th><@s.text name="self_linkfax"/></th>
      				<th><@s.text name="self_replylevel"/></th>
      				<th><@s.text name="self_replyno"/></th>
      				<th><@s.text name="self_replytime"/></th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as self>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/self/viewEnterprise.action?requestId=${self.id}">${self.name?if_exists}</a></li></ul></div></td>
              <td>${self.businesstype?if_exists}</td>
              <td>${self.province?if_exists}</td>
              <td>${self.city?if_exists}</td>
              <td>${self.legalperson?if_exists}</td>
              <td>${self.contact?if_exists}</td>
              <td>${self.contactcardno?if_exists}</td>
              <td>${self.contactposition?if_exists}</td>
              <td>${self.linktel?if_exists}</td>
              <td>${self.linkfax?if_exists}</td>
              <td>${self.requestlevel?if_exists}</td>
              <td>${self.requestcode?if_exists}</td>
              <td>${self.requesttime?if_exists}</td>
            </tr>
            </#list>
           </tbody>
        </table>

    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>