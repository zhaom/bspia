<#--显示总记录数,只有同时设置了总记录数和显示总记录数时才有效-->   
<#if (parameters.totalRecord?exists) && (parameters.showTotalRecord?exists) && (parameters.showTotalRecord == true)>   
    <li><span>${parameters.totalRecord}</span></li><#rt/>   
</#if>   

<#--打印选择页的面板 -->   
<#--首先,当parameters.pageLimit为空时将其设定为total-->   
<#if (parameters.pageLimit?exists)>   
    <#assign limit = parameters.pageLimit?number />   
<#else>   
    <#assign limit = parameters.totalPage?number />   
</#if>
<#assign cur = (parameters.curPage!1)?number />
<#assign total = parameters.totalPage?number />   
<@pagePanel cur=cur total=total url=parameters.url limit=limit />   
<#--打印选择页的面板结束-->   
   
<#--显示总页数-->   
<#if parameters.showTotalPage?exists && (parameters.showTotalPage == true)>   
    <li><span><a>共${parameters.totalPage}页</a></span><li><#rt/>   
</#if>   
   
<#--打印翻页面板的宏,配合printPage,printButton-->   
<#macro pagePanel cur total limit url curCssClass = "cur_page"><#--curCssClass默认值为cur_page-->   
    <#--limit的中间数-->   
    <#assign l_mid = (limit/2)?int + 1 />   
        
    <#--total的中间数-->   
    <#assign t_mid = (total/2)?int />   
        
    <#--情况一：总页数小于等于限制显示页数，这时显示所有页-->   
    <#if total ==0>
    <#elseif total ==1>
    <#elseif (cur ==1) && (total <= limit)>
    	<@printPage left = 1 right = total cur = cur url = url curCssClass = curCssClass />
    	<@printNext/>
    <#elseif (cur ==total) && (total <= limit)>
    	<@printPrev/>
    	<@printPage left = 1 right = total cur = cur url = url curCssClass = curCssClass />
    <#elseif (cur > 1) && (cur < total) && (total <= limit)>
    	<@printPrev/>
    	<@printPage left = 1 right = total cur = cur url = url curCssClass = curCssClass />
    	<@printNext/>	
    <#else>   
    <#--情况二：总页数大于限制显示页数，这时又分三种情况-->   
        <#--情况1:显示的limit个页号在total个页面中偏向左端,1作为最左边的页号,当前页没能显示在中间,偏左,例:    
            total = 20,cur = 2,limit = 5.显示的页面为:1 [2] 3 4 5    
            这种情况 cur <= l_mid     
        -->   
        <#if cur <= l_mid>   
			<#if cur !=1>            
  				<@printPrev/>
  			</#if>
            <@printPage left = 1 right = limit cur = cur url = url curCssClass = curCssClass />   
            <@printNext/>
            <@printEnd/> 
                
        <#--情况2:显示的limit个页号在total个页面中偏向右端,total作为最右边的页号,当前页没能显示在中间,偏右,例:    
            total = 20,cur = 19,limit = 5.显示的页面为:16 17 18 [19] 20    
            这种情况 cur > total - l_mid    
        -->   
        <#elseif (cur > (total - l_mid))>   
            <@printStart/>
            <@printPrev/>   
            <@printPage left = (total - limit + 1) right = total cur = cur url = url curCssClass = curCssClass />   
			<#if cur !=total>
				<@printNext/>
			</#if>       
                
        <#--在中间的情况-->   
        <#else>   
            <@printStart/>
            <@printPrev/>   
            <@printPage left = (cur - l_mid + 1) right = (cur + l_mid -1) cur = cur url = url curCssClass = curCssClass />   
            <@printNext/>
            <@printEnd/>   
        </#if>   
    </#if>   
        
</#macro>   
   
<#--根据最左与最右的页号来打印所显示的页面，当前页为的cssStyle为curCssClass-->   
<#macro printPage left right cur url curCssClass>   
    <#list left..right as p>   
        <#if p == cur>   
            <li><span class = "${curCssClass}" >${p}</span></li><#rt/>   
        <#else>   
            <li><a href = "<@makeURL text=url page=p />">${p}</a></li><#rt/>   
        </#if>          
    </#list>        
</#macro>   
   
<#macro printStart>  
	<li><a href="<@makeURL text=parameters.url page=1 />"> 首页 </a></li><#rt/>
</#macro>
<#macro printEnd>  
	<li><a href="<@makeURL text=parameters.url page=total />"> 末页 </a></li><#rt/>
</#macro>
<#macro printNext>
	<li><a href="<@makeURL text=parameters.url page=cur+1 />"> 下一页 </a></li><#rt/>
</#macro>
<#macro printPrev>
	<li><a href="<@makeURL text=parameters.url page=cur-1 />"> 上一页 </a></li><#rt/> 
</#macro>

<#--产生动态URL的宏-->   
<#macro makeURL text page>   
    <#if text?last_index_of("{page}") < 0>   
        ${text}?page=${page}    
    <#else>   
        ${text?replace("{page}",page)}    
    </#if>      
</#macro>