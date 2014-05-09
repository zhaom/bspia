 <#if (list.size()>0)> 
    <div>
        <table class="basic-table-sh">
        	<thead>
        	    <tr>
      				<th><@s.text name="train_trainName"/></th>
      				<th><@s.text name="train_trainAddr"/></th>
      				<th><@s.text name="train_trainDuring"/></th>
      				<th><@s.text name="train_trainTypeEnumId"/></th>
      				<th><@s.text name="train_fee"/></th>
      				<th><@s.text name="train_contact"/></th>
      				<th><@s.text name="train_tel"/></th>
      				<th><@s.text name="train_email"/></th>
      				<th>&nbsp;</th>
    			</tr>
        	</thead>
        
          <tbody>
            <#list list as train>
            <tr>
              <td><div class="buttonUl"><ul><li><a href="/train/viewTrain.action?requestId=${train.id}">${train.trainname?if_exists}</a></li></ul></div></td>
              <td>${train.trainaddr?if_exists}</td>
              <td>${train.trainduring?if_exists}</td>
              <td>${train.traintypedesc?if_exists}</td>
              <td>${train.fee?if_exists}</td>
              <td>${train.contact?if_exists}</td>
              <td>${train.tel?if_exists}</td>
              <td>${train.email?if_exists}</td>
              <td><div class="buttonUl"><ul><li><a class="submitButton"  href="/train/train!edit.action?requestId=${train.id}"><@s.text name="common_edit"/> </a></li>
              <li><a class="submitButton"  href="/train/train!remove.action?requestId=${train.id}"><@s.text name="common_delete"/></a></li></ul></div></td></td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
	<div class="errorMessage"><@s.text name="error_noRecord"/></div>
</#if>