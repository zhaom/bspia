<#if (list.size()>0)> 

	<select name="${selectName?if_exists}">
            <#list list as enumeration>
            	<#if enumeration.enumid?if_exists == selectedKey?if_exists>
            <option value="${enumeration.enumid?if_exists}" selected>${enumeration.description?if_exists}</option> 
            	<#else>
            <option value="${enumeration.enumid?if_exists}">${enumeration.description?if_exists}</option> 
            	</#if>

            </#list>
	</select>
<#else>
		<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>