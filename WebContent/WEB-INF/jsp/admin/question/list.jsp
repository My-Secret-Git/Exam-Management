<%-- 
    Document   : list
    Created on : 2014-11-10, 14:30:41
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
     <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=GBK">
        <title>JSP Page</title>
    </head>
    
    <body>
      <div align="center">
  
  <table width="300" class="table table-hover">
  
   <!--  <tr>
  
   <td align="center"> <a href="importQuestionFromXML.jsp"><font size="4" color="#00868B">导入试题</font></a> </td>
  </tr> 
  
   -->
   <tr>
  
   <td align="center"> <a href="${pageContext.request.contextPath}/question/batchDelete"><font size="4" color="#00868B">批量删除</font></a> </td>
  </tr> 
  <tr>
  
    <td align="center"><a href="${pageContext.request.contextPath}/question/list"><font size="4" color="#00868B">显示全部记录</font></a> </td>
  </tr>  
   <tr>
  
<!--    <td align="center"> <a href=list_Chaxun.jsp><font size="4" color="#00868B">按查询显示记录</font></a> </td> -->
<!--   </tr>  -->
 
<!--   <tr> -->
  
<!--    <td align="center"> <a href="list_Fenye.jsp"><font size="4" color="#00868B">按分页显示记录</font></a> </td> -->
<!--   </tr>  -->
<!--   <tr> -->
  
<!--    <td align="center"> <a href="list_FenyeChaxun.jsp"><font size="4" color="#00868B">按查询和分页显示记录</font></a> </td> -->
  </tr> 
 

  </table>
  </div>
  
  <!--  
        <h1><a href="listALL.jsp"> 显示全部记录</a> </h1>
        <h1><a href=list_Chaxun.jsp>按查询显示记录</a> </h1>
        <h1><a href="list_Fenye.jsp"> 按分页显示记录</a> </h1>
        <h1><a href="list_FenyeChaxun.jsp">按查询和分页显示记录</a> </h1>
        <h1><a href="batchDelete/list_Questions.jsp">批量删除</a> </h1>
        <h1><a href="importQuestionFromXML.jsp">导入试题</a> </h1>
   -->
        
        
    </body>
</html>
