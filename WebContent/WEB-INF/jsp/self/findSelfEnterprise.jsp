<%@ include file="/WEB-INF/jsp/header.jsp" %>

<%
String name = request.getParameter("name");
if(name!=null && !name.isEmpty()){
	name = java.net.URLEncoder.encode(name, "UTF-8");
	request.setAttribute("encodename",name);
}
String businesstype = request.getParameter("businesstype");
if(businesstype!=null && !businesstype.isEmpty()){
	businesstype = java.net.URLEncoder.encode(businesstype, "UTF-8");
	request.setAttribute("encodebusinesstype",businesstype);
}
String province = request.getParameter("province");
if(province!=null && !province.isEmpty()){
	province = java.net.URLEncoder.encode(province, "UTF-8");
	request.setAttribute("encodeprovince",province);
}
String city = request.getParameter("city");
if(city!=null && !city.isEmpty()){
	city = java.net.URLEncoder.encode(city, "UTF-8");
	request.setAttribute("encodecity",city);
}
String legalperson = request.getParameter("legalperson");
if(legalperson!=null && !legalperson.isEmpty()){
	legalperson = java.net.URLEncoder.encode(legalperson, "UTF-8");
	request.setAttribute("encodelegalperson",legalperson);
}
String contact = request.getParameter("contact");
if(contact!=null && !contact.isEmpty()){
	contact = java.net.URLEncoder.encode(contact, "UTF-8");
	request.setAttribute("encodecontact",contact);
}
String requestlevel = request.getParameter("requestlevel");
if(requestlevel!=null && !requestlevel.isEmpty()){
	requestlevel = java.net.URLEncoder.encode(requestlevel, "UTF-8");
	request.setAttribute("encoderequestlevel",requestlevel);
}
String requestcode = request.getParameter("requestcode");
if(requestcode!=null && !requestcode.isEmpty()){
	requestcode = java.net.URLEncoder.encode(requestcode, "UTF-8");
	request.setAttribute("encoderequestcode",requestcode);
}
%>

<div> 
	<table class="basic-table-sh">
		<tr>
			<td width="20%">
				<div class="screenlet">
					<div class="screenlet-header widget">
						<div class="item-box">
							<h3 class="screenlet-title">
							<s:property value="%{getText('common_find')}"/><s:property value="%{getText('enterprise')}"/>
							</h3>
						</div>
					</div>
				</div>
			</td>
			<td width="50%">&nbsp;</td>
			<td align="right">
				&nbsp;
			</td>
		</tr>
		<tr>
			<td colspan="3">
				<form id="editForm" class="submitForm" action="/self/findSelfEnterprise.action" method="post">
					<input type="hidden" name="defaultSearch" value="N" />
					<table>
						<tr>
							<td class="label"><s:property value="%{getText('enterprise_name')}"/> </td>
							<td><input type="text" name="name" value="<s:property  value='#parameters.name'/>"/> </td>
							
							<td class="label"><s:property value="%{getText('self_businesstype')}"/> </td>					
							<td>								
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'BUSINESS_TYPE'}" />
								    <s:param name="selectName" value="%{'businesstype'}"/>
								    <s:param name="selectedKey" value="%{businesstype}"/>
							  	</s:action>
							</td>
							
							<td class="label"><s:property value="%{getText('self_province')}"/> </td>
							<td>
								<input type="text" name="province" value="<s:property  value='#parameters.province'/>"/>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('self_city')}"/> </td>
							<td>
								<input type="text" name="city" value="<s:property  value='#parameters.city'/>"/>					
							</td>
							
							<td class="label"><s:property value="%{getText('self_lagelperson')}"/> </td>
							<td>
								<input type="text" name="lagelperson" value="<s:property  value='#parameters.lagelperson'/>"/>
							</td>
							<td class="label"><s:property value="%{getText('self_linkperson')}"/> </td>
							<td>
								<input type="text" name="contact" value="<s:property  value='#parameters.contact'/>"/>
							</td>
						</tr>
						<tr>
							<td class="label"><s:property value="%{getText('self_replylevel')}"/> </td>
							<td>
								<s:action name="enumeration!selectListNULLEx" namespace="/system" executeResult="true" >
								  	<s:param name="requestId" value="%{'BUSINESS_TYPE'}" />
								    <s:param name="selectName" value="%{'requestlevel'}"/>
								    <s:param name="selectedKey" value="%{requestlevel}"/>
							  	</s:action>
							</td>
							<td class="label"><s:property value="%{getText('self_replyno')}"/> </td>
							<td>
								<input type="text" name="requestcode" value="<s:property  value='#parameters.requestcode'/>"/>					
							</td>
							<td class="label">&nbsp;</td>
							<td>
								&nbsp;						
							</td>
						</tr>
						
						<tr>
							<td align="left"><input type="submit" class="submitButton" value="<s:property value="%{getText('common_find')}"/>" /> </td>
							<%if(request.getParameter("defaultSearch")!=null && "N".equals(request.getParameter("defaultSearch"))){ %>
							<td><a class="submitButton" target="blank" href="/self/exportSelfEnterprise.action?name=<s:property  value='#request.name'/>&businesstype=<s:property  value='#request.businesstype'/>&province=<s:property  value='#parameters.province'/>&city=<s:property  value='#parameters.city'/>&lagelperson=<s:property  value='#parameters.lagelperson'/>&contact=<s:property  value='#parameters.contact'/>&requestlevel=<s:property  value='#parameters.requestlevel'/>&requestcode=<s:property  value='#parameters.requestcode'/>"><s:property value="%{getText('enterprise_exporttoexcel')}"/></a></td>
							<%} %>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</div>
  <s:action name="vEnterpriseAllInfoPaging" id="paging" namespace="/enterprise" executeResult="false">
      <s:param name="rows" value="100"/>
  </s:action>
  <s:action name="vEnterpriseAllInfo!query" namespace="/self" executeResult="true" >
  	<s:param name="pno" value="#parameters.pno"/>
    <s:param name="rows" value="100"/>
    <s:param name="name" value="#parameters.name"/>
    <s:param name="businesstype" value="#parameters.businesstype"/>
    <s:param name="province" value="#parameters.province"/>
    <s:param name="city" value="#parameters.city"/>
    <s:param name="lagelperson" value="#parameters.lagelperson"/>
    <s:param name="contact" value="#parameters.contacte"/>
    <s:param name="requestlevel" value="#parameters.requestlevel"/>
    <s:param name="requestcode" value="#parameters.requestcode"/>
  </s:action>
  <div class="buttonUl">
  	<ul>
  	<m:pager curPage="%{#parameters.pno[0]}" totalPage="%{#paging.totalPage}" theme="simple" url="/self/findSelfEnterprise.action?pno={page}&name=%{#request.encodename}&businesstype=%{#request.encodebusinesstype}&province=%{#parameters.encodeprovince}&city=%{#parameters.encodecity}&legalperson=%{#parameters.encodelegalperson}&contact=%{#parameters.encodecontact}&requestlevel=%{#parameters.encoderequestlevel}&requestcode=%{#parameters.encoderequestcode}" pageLimit="10" showTotalPage="false" totalRecord="%{#paging.totalRecord}" showTotalRecord="false" />
  	</ul>
  </div>