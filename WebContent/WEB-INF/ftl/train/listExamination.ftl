 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="examination_examName"/></th>
      				<th><@s.text name="examination_examAddr"/></th>
      				<th><@s.text name="examination_examTypeEnumId"/></th>
      				<th><@s.text name="examination_examDuring"/></th>
      				<th><@s.text name="examination_contact"/></th>
      				<th><@s.text name="examination_tel"/></th>
      				<th><@s.text name="examination_email"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as exam>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/train/viewExamination.action?requestId=${exam.id}">${exam.examname}</a></li></ul></div></td>
              <td>${exam.examaddr?if_exists}</td>
              <td>${exam.examtypedesc?if_exists}</td>
              <td>${exam.examduring?if_exists}</td>
              <td>${exam.contact?if_exists}</td>
              <td>${exam.tel?if_exists}</td>
              <td>${exam.email?if_exists}</td>
              <td><div class="buttonUl"><ul><li><a class="submitButton"  href="/train/exam!edit.action?requestId=${exam.id}"><@s.text name="common_edit"/> </a></li>
              <li><a class="submitButton"  href="/train/exam!remove.action?requestId=${exam.id}"><@s.text name="common_delete"/></a></li></ul></div></td></td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>