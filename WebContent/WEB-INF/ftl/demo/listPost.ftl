 <#if (list.size()>0)> 
    <div> 
        <table>
          <tbody>
            <#list list as post>
            <tr>
              <td><a href="/demo/viewPost.action?requestId=${post.id}">${post.title}</a></td>
              <td><a href="/demo/post!edit.action?requestId=${post.id}">编辑</a></td>
              <td><a href="/demo/post!remove.action?requestId=${post.id}">删除</a></td>
            </tr>
            </#list>
           </tbody>
        </table>
    </div>
<#else>
您还没有发表过博客文章
</#if>