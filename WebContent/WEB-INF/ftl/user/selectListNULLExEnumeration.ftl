<#if (list.size()>0)> 
	<select name="${selectName?if_exists}">
		<option value="">----</option>
        <#list list as enumeration>
        <option value="${enumeration.enumid?if_exists}">${enumeration.description?if_exists}</option> 
        </#list>
	</select>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>