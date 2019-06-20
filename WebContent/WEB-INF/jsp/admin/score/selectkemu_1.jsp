<%-- 
    Document   : selectExam
    Created on : 2010-10-13, 9:03:29
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>请选择科目</h1>
        <form action="${pageContext.request.contextPath}/score/listScore1" method="post">
            <select name="courseID">
                <option value="01">java</option>
                <option value="02">linux试题<option>
            </select>
            <input type="submit" value="处理成绩">
        </form>
    </body>
</html>
