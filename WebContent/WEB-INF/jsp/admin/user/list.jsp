<%-- 
    Document   : list_Questions
    Created on : 2012-9-17, 19:06:01
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
     <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery-1.4.2.js"></script> 
         <script>
            function del(userID) {
                if (confirm("你确定要删除吗")) {
                	 $.ajax({
                		  url:'<%=request.getContextPath()%>/user/del',
                		  type:'post',
                		  data:{userID:userID},
                		  success:function(result){
                			  if(result != null){
                				  alert("删除成功!");
                				  $("#mytable").html("");
                				  var html='';
                				  $.each(result,function(index,item){
                					  html+='<tr>';
                					  html+='<td>'+result[index].userID+'</td>';
                					  html+='<td>'+result[index].userName+'</td>';
                					  html+='<td>'+result[index].password+'</td>';
                					  html+='<td>'+result[index].email+'</td>';
                					  html+='<td>'+result[index].userType+'</td>';
                					  html+='<td><img src="'+result[index].photo+'" width="50" height="50"></td>';
                					  html+='<td>'+result[index].bjdh+'</td>';
                					  html+='<td><a href="${pageContext.request.contextPath}/user/updatepre/'+result[index].userID+'">更新</a></td>';
                					  html+='<td><a href="#" onclick="del('+result[index].userID+')">删除</a></td>';
                					  html+='</tr>';
                				  })
                				  
                				  $("#mytable").html(html);
                			  }else{
                				  alert("删除失败!");
                			  }
                		  }
                	 });
                }
            }
        </script>
    </head>
    <body>
    
        <a href="${pageContext.request.contextPath}/user/insertpre">添加用户</a> 
        <h1>用户数据</h1>
        <table class="table table-dark table-hover">
            <tr>
               <th>用户ID</th>
            
               <th>用户名</th>
                <th>密码</th>
            
               <th>邮箱</th>
                <th>权限</th>
            
               <th>头像</th>
                <th>班级代号</th>
            
             
                
                 
                <th colspan="2">操作</th>
            </tr>
            </table>
            <table class="table table-dark table-hover" id="mytable">
           <c:forEach items="${list}" var="s">

            <tr>
                <td>
                    ${s.userID}
                </td>
                <td>
                    ${s.userName}
                </td>
                <td>
                    ${s.password}
                </td>
                <td>
                    ${s.email}
                </td>
                <td>
                    ${s.userType}
                </td>
             <td>
                   <img src="${s.photo}" width="50" height="50">
                </td>
                <td>
                    ${s.bjdh}
                </td>
            

                <td>
                    <a href="${pageContext.request.contextPath}/user/updatepre/${s.userID}">更新</a>  
                </td>
                <td>
                    <a href="javascript:del('${s.userID}')">删除</a>
                </td>
           </tr>
           </c:forEach>
        </table>
        
    </body>
</html>
