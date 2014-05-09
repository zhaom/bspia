 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="project_name"/></th>
      				<th><@s.text name="enterprise_name"/></th>
      				<th><@s.text name="project_categoryId"/></th>
      				<th><@s.text name="project_industry"/></th>
      				<th><@s.text name="project_amount"/></th>
      				<th><@s.text name="project_beginTime"/></th>
      				<th><@s.text name="project_endTime"/></th>
      				<th><@s.text name="project_constructionProvince"/></th>
      				<th><@s.text name="project_acceptanceTime"/></th>
      				<th><@s.text name="project_acceptanceExpert"/></th>
      				<th><@s.text name="project_acceptanceFee"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as project>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/product/viewProject.action?requestId=${project.id}">${project.name}</a></li></ul></div></td>
              <td>${project.enterprisename?if_exists}</td>
              <td>${project.categorydescription?if_exists}</td>
              <td>${project.industry?if_exists}</td>
              <td>${project.amount?if_exists}</td>
              <td><#if project.begintime?exists>${project.begintime?datetime}</#if>&nbsp;</td>
              <td><#if project.endtime?exists>${project.endtime?datetime}</#if>&nbsp;</td>
              <td>${project.constructionprovince?if_exists}</td>
              <td><#if project.acceptancerime?exists>${project.acceptancerime?datetime}</#if>&nbsp;</td>
              <td>${project.acceptanceexpert?if_exists}</td>
              <td>${project.acceptancefee?if_exists}</td>
              <td><div class="buttonUl"><ul><li><a class="submitButton"  href="/product/project!edit.action?requestId=${project.id}"><@s.text name="common_edit"/> </a></li>
              <li><a class="submitButton"  href="/product/project!remove.action?requestId=${project.id}"><@s.text name="common_delete"/></a></li></ul></div></td></td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>