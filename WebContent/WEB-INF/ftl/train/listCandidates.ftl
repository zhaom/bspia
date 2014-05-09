 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="candidates_name"/></th>
      				<th><@s.text name="candidates_genderEnumId"/></th>
      				<th><@s.text name="candidates_position"/></th>
      				<th><@s.text name="candidates_tele"/></th>
      				<th><@s.text name="candidates_mobilePhone"/></th>
      				<th><@s.text name="candidates_workplace"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as candidate>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/train/viewCandidates.action?requestId=${candidate.id}">${candidate.name}</a></li></ul></div></td>
              <td>${candidate.genderenumdesc?if_exists}</td>
              <td>${candidate.position?if_exists}</td>
              <td>${candidate.tele?if_exists}</td>
              <td>${candidate.mobilephone?if_exists}</td>
              <td>${candidate.workplace?if_exists}</td>
              <td><div class="buttonUl"><ul>
	              <li><a class="submitButton"  href="/train/candidate!edit.action?requestId=${candidate.id}"><@s.text name="common_edit"/> </a></li>
	              <li><a class="submitButton"  href="/train/candidate!remove.action?requestId=${candidate.id}"><@s.text name="common_delete"/></a></li>
	              <li><a class="submitButton"  href="/train/browseCandidateTrains.action?requestId=${candidate.id}"><@s.text name="candidates_related_trains"/></a></li>
	              <li><a class="submitButton"  href="/train/browseExamEnrolls.action?requestId=${candidate.id}"><@s.text name="candidates_related_examinations"/></a></li>
              </ul></div></td></td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>