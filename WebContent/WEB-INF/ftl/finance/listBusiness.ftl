 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="business_financeDuring"/></th>
      				<th><@s.text name="business_netAssetsYield"/></th>
      				<th><@s.text name="business_ruturnRate"/></th>
      				<th><@s.text name="business_debtRate"/></th>
      				<th><@s.text name="business_assetsRurnover"/></th>
      				<th><@s.text name="business_liquidityTurnover"/></th>
      				<th><@s.text name="business_receivablesTurnover"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as business>
            <tr>
              <td>${business.financeduring?if_exists}</td>
              <td>${business.netassetsyield?if_exists}</td>
              <td>${business.ruturnrate?if_exists}</td>
              <td>${business.debtrate?if_exists}</td>
              <td>${business.assetsrurnover?if_exists}</td>
              <td>${business.liquidityturnover?if_exists}</td>
              <td>${business.receivablesturnover?if_exists}</td>
              <td><div class="buttonUl"><ul><li><a class="submitButton"  href="/finance/business!edit.action?requestId=${business.id?if_exists}&enterpriseid=${business.enterpriseid?if_exists}"><@s.text name="common_edit"/> </a></li>
              <li><a class="submitButton"  href="/finance/business!remove.action?requestId=${business.id?if_exists}&enterpriseid=${business.enterpriseid?if_exists}"><@s.text name="common_delete"/></a></li></ul></div></td></td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>