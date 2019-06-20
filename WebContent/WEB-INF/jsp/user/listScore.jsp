<%-- 
    Document   : listScore
    Created on : 2010-10-20, 11:41:34
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

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
    
          <table class="table table-striped">
              <tr>
                  <th>课程号</th>
                  <th>课程名</th>
                  <th>平时成绩</th>
                  <th>考试成绩</th>
                  <th>总成绩</th>
                  
              </tr>
              
              
            <c:forEach items="${list }" var="s">
              <tr>
                   <td>${s.courseID}</td>
                  <td>${s.courseName}</td>
                  <td>${s.pscj}</td>
                  <td>${s.kscj }</td>
                  <td>${s.cj }</td>

            </tr>
      
       </c:forEach>
          </table>
    </body>
</html>
