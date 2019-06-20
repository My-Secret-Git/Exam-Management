<%-- 
    Document   : first
    Created on : 2014-11-6, 14:38:25
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <div class="container">
  <h2>处理方式</h2>
  <p>下面是两种成绩管理的方式，请选择 其中一种：</p>
  <div class="alert alert-success">
    <a href="${pageContext.request.contextPath}/score/selectkemu" class="alert-link">处理方式一</a>
  </div>
  <div class="alert alert-info">
    <a href="${pageContext.request.contextPath}/score/selectkemu1" class="alert-link">处理方式二</a>
  </div>
  </div>
      <!--    <a href="selectkemu.jsp">处理方式一</a>
        <a href="selectkemu_1.jsp">处理方式二</a>
        -->
    </body>
</html>
