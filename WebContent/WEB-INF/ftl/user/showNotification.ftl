<div> 
	<table class="basic-form">
		<tr>
			<td class="label"><@s.text name="notification_title"/></td>
			<td>${title?if_exists}</td>
		</tr>
		<tr>
			<td class="label"><@s.text name="notification_date"/></td>
			<td><#if createdate?exists>${createdate?datetime}</#if>&nbsp;</td>
		</tr>
		<tr>
			<td class="label"><@s.text name="notification_user"/></td>
			<td>${userid?if_exists}</td>
		</tr>
		<tr>
			<td class="label"><@s.text name="notificaiton_comment"/></td>
			<td>${comment?if_exists}</td>
		</tr>
	</table>
</div>