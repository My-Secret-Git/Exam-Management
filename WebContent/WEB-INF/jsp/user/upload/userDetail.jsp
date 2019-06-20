<%-- 
    Document   : userDetail
    Created on : 2010-9-30, 13:50:52
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
    <body align="center">
       

        <table align="center" class="table table-bordered" width="800" border="1" style="background-color:#FCFCFC">
      
            <tr>
                <td align="center"><font size="4" color="#CD2626">姓名:</font></td>
                <td align="center">${user.userName}</td>
                <td rowspan="4" width="200"><img src="${user.photo}" width="195" height="200"> </td>

            </tr>
           
           
            <tr>
                <td align="center"><font size="4" color="#CD2626">邮件:</font></td>
                <td align="center">${user.email}</td>

            </tr>
             
            <tr>
                <td align="center"><font size="4" color="#CD2626">权限:</font></td>
                <td align="center">${user.userType}</td>

            </tr>
                 <tr>
                <td align="center"><font size="4" color="#CD2626">班级代号:</font></td>
                <td align="center">${user.bjdh}</td>

            </tr>
           

        </table>
       
    </body>
</html>
