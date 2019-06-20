<%-- 
    Document   : selectExam
    Created on : 2010-10-13, 9:03:29
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
       
       <h4> 欢迎${username}来参加练习</h4>
        
        
        <h3 align="center">请选择练习</h3>
        <form action="${pageContext.request.contextPath}/exam/excecise" method="post">
            <select name="courseID">
                        
                <c:forEach items="${categores}" var="c">
                   <option value="${c.courseid}" > ${c.courseName } </option>
                    
                 </c:forEach>
   
                    </select>
            <input class="btn btn-success" type="submit" value="开始">
        </form>
    </body>
</html>
