<#if (list.size()>0)> 

	<select name="${selectName?if_exists}">
            <#list list as train>
            	<#if train.id?if_exists == selectedKey?if_exists>
            <option value="${train.id?if_exists}" selected>${train.trainname?if_exists}</option> 
            	<#else>
            <option value="${train.id?if_exists}">${train.trainname?if_exists}</option> 
            	</#if>

            </#list>
	</select>
<#else>
		<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>