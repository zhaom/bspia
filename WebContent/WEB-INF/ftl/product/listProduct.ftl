 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="product_name"/></th>
      				<th><@s.text name="product_model"/></th>
      				<th><@s.text name="product_categoryId"/></th>
      				<th><@s.text name="product_manufacturer"/></th>
      				<th><@s.text name="product_manufacturerContact"/></th>
      				<th><@s.text name="product_vendor"/></th>
      				<th><@s.text name="product_vendorContact"/></th>
      				<th><@s.text name="product_price"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as product>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/product/viewProduct.action?requestId=${product.id}">${product.name}</a></li></ul></div></td>
              <td>${product.model?if_exists}</td>
              <td>${product.categoryid?if_exists}</td>
              <td>${product.manufacturer?if_exists}</td>
              <td>${product.manufacturercontact?if_exists}</td>
              <td>${product.vendor?if_exists}</td>
              <td>${product.vendorContact?if_exists}</td>
              <td>${product.price?if_exists}</td>
              <td><div class="buttonUl"><ul><li><a class="submitButton"  href="/product/product!edit.action?requestId=${product.id}"><@s.text name="common_edit"/> </a></li>
              <li><a class="submitButton"  href="/product/product!remove.action?requestId=${product.id}"><@s.text name="common_delete"/></a></li></ul></div></td></td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>