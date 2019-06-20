<%-- 
    Document   : insert
    Created on : 2010-9-20, 10:21:47
    Author     : Administrator
--%>



<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=gbk">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>添加科目</h1>
        <form action="${pageContext.request.contextPath}/course/insert" method="post">
            <table border="0">
                <tr>
                    <td>科目号</td>
                    <td><input type="text" name="courseid" value=""></td>

                </tr>
                <tr>
                    <td>科目名</td>
                    <td><input type="text" name="courseName" value=""></td>

                </tr>
               
            </table>
            <input type="submit" value="添加">
        </form>

    </body>
</html>
