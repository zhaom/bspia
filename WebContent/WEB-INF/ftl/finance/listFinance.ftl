 <#if (list?exists && list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="finance_financeTime"/></th>
      				<th><@s.text name="finance_assets"/></th>
      				<th><@s.text name="finance_income"/></th>
      				<th><@s.text name="finance_netProfit"/></th>
      				<th><@s.text name="finance_netChainRatio"/></th>
      				<th><@s.text name="finance_netYearRatio"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as finance>
            <tr>
              <td><#if finance.financetime?exists>${finance.financetime?date}</#if>&nbsp;</td>
              <td>${finance.assets?if_exists}</td>
              <td>${finance.income?if_exists}</td>
              <td>${finance.netprofit?if_exists}</td>
              <td>${finance.netchainratio?if_exists}</td>
              <td>${finance.netyearratio?if_exists}</td>
              <td><div class="buttonUl"><ul><li><a class="submitButton"  href="/finance/finance!edit.action?requestId=${finance.id?if_exists}&enterpriseid=${finance.enterpriseid?if_exists}"><@s.text name="common_edit"/> </a></li>
              <li><a class="submitButton"  href="/finance/finance!remove.action?requestId=${finance.id?if_exists}&enterpriseid=${finance.enterpriseid?if_exists}"><@s.text name="common_delete"/></a></li></ul></div></td></td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>