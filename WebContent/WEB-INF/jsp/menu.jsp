<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="m" uri="/meidusa-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>	
		<s:i18n name="bspia">  
	    	<s:property value="%{getText('common_title')}"/>  
		</s:i18n>
	</title>
	<link type="text/css" href="/css/menu.css" rel="stylesheet" />
	<link type="text/css" href="/css/main.css" rel="stylesheet" />
	<link type="text/css" href="/css/themes/base/ui.all.css" rel="stylesheet" />
	
	<script type="text/javascript" src="/JQuery/jquery-1.3.2.min.js"></script>
	<script type="text/javascript" src="/JQuery/jquery.form.js"></script>
	<script type="text/javascript" src="/JQuery/jquery.tablesorter.min.js"></script>
	<script type="text/javascript" src="/JQuery/ui/ui.core.js"></script>
	<script type="text/javascript" src="/JQuery/ui/ui.datepicker.js"></script>
	<script type="text/javascript" src="/JQuery/menu.js"></script>
	<script type="text/javascript" src="/JQuery/bspia.js"></script>
</head>

<body>

<table width=1000 border=0 cellspacing=0 cellpadding=0 align=center background="/images/top_bg1.jpg" height=54>
<tr>
<td width=215 align=center><img src="/images/logo.gif" border=0></td>
<td width=385> </td>
<td width=400 align=right nowrap>
	<table border=0>
		<tr> 
			<td>
	<s:property value="%{getText('common_welcome')}"/>&nbsp;
	<s:property  value='#session.loginUser.name'/>&nbsp;
			</td>
			<td>
	<a href="/demo/logout.action" target="_parent"><div class="quit01" id="quit" onMouseOver="exitover()" onMouseOut="exitout()">
	</div></a></td>
		</tr>
	</table>
</td>
</tr>
</table>
<div class="menu_tab">
	<div class="menu outer">
		<div class="inner" >
			<ul >
				<li><a href="#"><s:property value="%{getText('menu_homepage')}"/></a></li>
				<%if(session.getAttribute("PERM_ENTERP_ADMIN")!=null){ %>
				<li><a href="#"><s:property value="%{getText('menu_memberManegement')}"/></a></li>
				<%} %>
				<%if(session.getAttribute("PERM_EXPERT_ADMIN")!=null){ %>
				<li><a href="#"><s:property value="%{getText('menu_expertManagement')}"/></a></li>
				<%} %>
				<%if(session.getAttribute("PERM_QULITY_ADMIN")!=null){ %>
				<li><a href="#"><s:property value="%{getText('menu_qualificationManagement')}"/></a></li>
				<%} %>
				<%if(session.getAttribute("PERM_LITIGA_ADMIN")!=null){ %>
				<li><a href="#"><s:property value="%{getText('menu_LigitationManagement')}"/></a></li>
				<%} %>
				<%if(session.getAttribute("PERM_TRAIN_ADMIN")!=null){ %>
				<li><a href="#"><s:property value="%{getText('menu_examAndTrainManagement')}"/></a></li>
				<%} %>
				<%if(session.getAttribute("PERM_CORRES_ADMIN")!=null){ %>
				<li><a href="#"><s:property value="%{getText('menu_correspondentManagement')}"/></a></li>
				<%} %>
				<%if(session.getAttribute("PERM_PRODUCT_ADMIN")!=null){ %>
				<li><a href="#"><s:property value="%{getText('menu_product')}"/></a></li>
				<%} %>
				<%if(session.getAttribute("PERM_PROJECT_ADMIN")!=null){ %>
				<li><a href="#"><s:property value="%{getText('menu_Project')}"/></a></li>
				<%} %>
				<%if(session.getAttribute("PERM_SYSTEM_ADMIN")!=null){ %>
				<%-- <li><a href="#"><s:property value="%{getText('menu_report')}"/></a></li> --%>
				<li><a href="#"><s:property value="%{getText('menu_systemManagement')}"/></a></li>
				<%} %>
			</ul>
		</div>
	</div>
	<div class="menu_content">
		<ul>
			<li><a href="/system/browseNotification.action"><s:property value="%{getText('menu_homepage')}"/></a></li>
			<li><a href="/system/resetUserPassword.action"><s:property value="%{getText('user_resetPassword')}"/></a></li>
		</ul>
		<%if(session.getAttribute("PERM_ENTERP_ADMIN")!=null){ %>
		<ul>
			<li><a href="/enterprise/browse.action"><s:property value="%{getText('menu_mem_basemanage')}"/></a></li>
			<li><a href="/enterprise/browsebusiness.action"><s:property value="%{getText('menu_mem_businessmanage')}"/></a></li>
			<li><a href="/enterprise/browsefinance.action"><s:property value="%{getText('menu_mem_financemanage')}"/></a></li>
			<li><a href="/enterprise/browselitigation.action"><s:property value="%{getText('menu_mem_litigationmanage')}"/></a></li>
			<li><a href="/enterprise/browseQualification.action"><s:property value="%{getText('menu_mem_Qualificationmanage')}"/></a></li>
			<li><a href="/enterprise/browseIntegrityInfo.action"><s:property value="%{getText('menu_mem_IntegrityInfomanage')}"/></a></li>
			<li><a href="/enterprise/findEnterprise.action"><s:property value="%{getText('menu_mem_find')}"/></a></li>
			<li><a href="/enterprise/statisticEnterprise.action"><s:property value="%{getText('menu_mem_statistic')}"/></a></li>
		</ul>
				<%} %>
				<%if(session.getAttribute("PERM_EXPERT_ADMIN")!=null){ %>
		<ul>
			<li><a href="/expert/browse.action"><s:property value="%{getText('menu_expert_list')}"/></a></li>
			<li><a href="/expert/expert!add.action"><s:property value="%{getText('menu_expert_input')}"/></a></li>
			<li><a href="/expert/uploadExpertByExcel.action"><s:property value="%{getText('menu_expert_import')}"/></a></li>
			<li><a href="/expert/findExpert.action"><s:property value="%{getText('menu_expert_find')}"/></a></li>
			<li><a href="/enterprise/browseEnterpriseExpertProject.action"><s:property value="%{getText('menu_proj_memmanage')}"/></a></li>
			<li><a href="/expert/browseExpertProject.action"><s:property value="%{getText('menu_proj_list')}"/></a></li>
		</ul>
				<%} %>
				<%if(session.getAttribute("PERM_QULITY_ADMIN")!=null){ %>
		<ul>
			<li><a href="/self/browseEnterprise.action"><s:property value="%{getText('menu_self_enterprise_info')}"/></a></li>
			<li><a href="/self/browseTechPerson.action?enterprisename=&personname="><s:property value="%{getText('menu_self_tech_person')}"/></a></li>
			<li><a href="/self/browseCostEngineer.action?enterprisename=&personname="><s:property value="%{getText('menu_self_engineer_price')}"/></a></li>
			<li><a href="/self/browseCompleteProject.action?enterprisename=&projectname="><s:property value="%{getText('menu_self_ended_proj')}"/></a></li>
			<%-- 
			<li><a href="/self/findSelfEnterprise.action"><s:property value="%{getText('menu_self_mem_find')}"/></a></li>
			--%>
		</ul>
				<%} %>
				<%if(session.getAttribute("PERM_LITIGA_ADMIN")!=null){ %>
		<ul>
			<li><a href="/enterprise/browseIntegrityInfo.action"><s:property value="%{getText('menu_mem_IntegrityInfomanage')}"/></a></li>
		</ul>
				<%} %>
				<%if(session.getAttribute("PERM_TRAIN_ADMIN")!=null){ %>
		<ul>
			<li><a href="/train/browseTrain.action"><s:property value="%{getText('menu_train_list')}"/></a></li>
			<li><a href="/train/uploadTrainByExcel.action"><s:property value="%{getText('menu_train_import')}"/></a></li>
			<li><a href="/train/browseExamination.action"><s:property value="%{getText('menu_exam_list')}"/></a></li>
			<li><a href="/train/uploadExamByExcel.action"><s:property value="%{getText('menu_exam_import')}"/></a></li>
			<li><a href="/train/browseCandidates.action"><s:property value="%{getText('menu_candidate_list')}"/></a></li>
			<li><a href="/train/findCandidates.action"><s:property value="%{getText('menu_candidate_find')}"/></a></li>
			<li><a href="/train/statisticTrain.action"><s:property value="%{getText('menu_train_statistic')}"/></a></li>
			<li><a href="/train/statisticExamination.action"><s:property value="%{getText('menu_exam_statistic')}"/></a></li>
			<li><a href="/train/browseInstallEmployee.action"><s:property value="%{getText('installemployee')}"/></a></li>
		</ul>
				<%} %>
				<%if(session.getAttribute("PERM_CORRES_ADMIN")!=null){ %>
		<ul>
			<li><a href="/correspondent/browseCorrespondent.action"><s:property value="%{getText('menu_correspondent_list')}"/></a></li>
			<li><a href="/correspondent/uploadCorrespondentByExcel.action"><s:property value="%{getText('menu_correspondent_import')}"/></a></li>
			<li><a href="/correspondent/findCorrespondent.action"><s:property value="%{getText('menu_correspondent_find')}"/></a></li>
			<li><a href="/correspondent/browseExcellentSelect.action"><s:property value="%{getText('menu_excellentselect_list')}"/></a></li>
			<li><a href="/correspondent/uploadExcellentSelectByExcel.action"><s:property value="%{getText('menu_excellentselect_import')}"/></a></li>
			<li><a href="/correspondent/findExcellentSelect.action"><s:property value="%{getText('menu_excellentselect_find')}"/></a></li>
		</ul>
				<%} %>
				<%if(session.getAttribute("PERM_PRODUCT_ADMIN")!=null){ %>
		<ul>
			<li><a href="/enterprise/browseProduct.action"><s:property value="%{getText('menu_prod_memmanage')}"/></a></li>
			<li><a href="/product/browseProduct.action"><s:property value="%{getText('menu_prod_list')}"/></a></li>
			<%--
			<li><a href="/product/uploadProductByExcel.action"><s:property value="%{getText('menu_proj_import')}"/></a></li>
			 --%>
		</ul>
				<%} %>
				<%if(session.getAttribute("PERM_PROJECT_ADMIN")!=null){ %>
		<ul>

			<li><a href="/product/browseProjectStand.action?enterprisename=&projectname="><s:property value="%{getText('projectstand_manage')}"/></a></li>
			<li><a href="/product/browseHighQualityProject.action?enterprisename=&projectname="><s:property value="%{getText('menu_proj_highquality')}"/></a></li>
			<%--
			<li><a href="/enterprise/browseProject.action"><s:property value="%{getText('menu_proj_memmanage')}"/></a></li>
			<li><a href="/product/browseProject.action"><s:property value="%{getText('menu_proj_list')}"/></a></li>			
			<li><a href="/product/uploadProjectByExcel.action"><s:property value="%{getText('menu_proj_import')}"/></a></li>
			 --%>
		</ul>
		<%} %>
				<%if(session.getAttribute("PERM_SYSTEM_ADMIN")!=null){ %>
		<ul>
			<li><a href="/system/browse.action"><s:property value="%{getText('menu_sys_userPermission')}"/></a></li>
			<li><a href="/system/notification!add.action"><s:property value="%{getText('menu_sys_addNotification')}"/></a></li>
			<li><a href="/system/uploadEnumeration.action"><s:property value="%{getText('enumeration_import')}"/></a></li>
		</ul>
		<%} %>
	</div>
</div>
<div>
<table width=1000 border=0 cellspacing=0 cellpadding=0 align=center>
<tr>
<td>
<div id="menuBody">