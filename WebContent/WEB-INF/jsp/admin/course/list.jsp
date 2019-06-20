<%-- 
    Document   : list_Questions
    Created on : 2012-9-17, 19:06:01
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
     <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>JSP Page</title>
            <script>
            function del(courseID) {
                if (confirm("你确定要删除吗")) {
                    window.location = "<%=request.getContextPath()%>/course/del/" + courseID;
                }
            }
        </script>
    </head>
    <body>
<a href="${pageContext.request.contextPath}/course/insertpre">添加科目</a> 
        <h1>科目数据</h1>
        <table class="table table-dark table-striped">
        
            <tr>
               <th>课程号</th>
            
               <th>课程名</th>
                
                
                 
                <th colspan="2">操作</th>
            </tr>
           <c:forEach items="${list }" var ="s">

            <tr>
                <td>
                    ${s.courseid}
                </td>
                <td>
                    ${s.courseName}
                </td>
            

                <td>
                    <a href="${pageContext.request.contextPath}/course/updatepre/${s.courseid}">更新</a>  
                </td>
                <td>
                    <a href="javascript:del('${s.courseid}')">删除</a>
                </td>
           </tr>
           </c:forEach>
        </table>
    </body>
</html>
