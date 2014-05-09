<#if (list.size()>0)> 

	<select name="${selectName?if_exists}">
            <#list list as exam>
            	<#if exam.id?if_exists == selectedKey?if_exists>
            <option value="${exam.id?if_exists}" selected>${exam.examname?if_exists}</option> 
            	<#else>
            <option value="${exam.id?if_exists}">${exam.examname?if_exists}</option> 
            	</#if>

            </#list>
	</select>
<#else>
		<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>