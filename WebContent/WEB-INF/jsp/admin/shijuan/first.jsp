<%-- 
    Document   : first
    Created on : 2016-4-1, 14:36:04
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

  <div class="alert alert-warning">
  <p align="center">  <a href="${pageContext.request.contextPath}/shijuan/selectBanjiAndKemu" class="alert-link">建立试卷</a></p>
  </div>
  <div class="alert alert-danger">
    <p align="center"><a href="${pageContext.request.contextPath}/shijuan/listALL"class="alert-link">考试安排</a></p>
  </div>
  </div>
     
      <!--  <h1><a href="selectBanjiAndKemu.jsp">建立试卷</a></h1>
        <h1><a href="listALL.jsp">考试安排</a></h1>
         --> 
        
    </body>
</html>
