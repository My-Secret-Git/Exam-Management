<%-- 
    Document   : listStudents
    Created on : 2010-9-20, 11:28:38
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
        <script>
             function zhuanlitoexcel(courseID){
            	 window.location="<%=request.getContextPath()%>/score/importExcel1?courseID="+courseID;
            }     
        </script>
    </head>
    <body>
         <h3>显示所有用户信息</h3>
        
             <input type="button" value="导出到excel" onclick="zhuanlitoexcel('${courseID}')">
          <table border="1" class="table table-striped">
              <tr>
                   <th width="100">编号</th>
                  <th width="100">用户ID</th>
                  <th width="100">考试成绩</th>
                  <th width="100">平时成绩</th>
              </tr>
    <form action="${pageContext.request.contextPath}/score/updatescoredo">         
     
	<c:forEach items="${scores}" var="s">
        <tr>
            <td width="100"> <input type="text" name="id"  value="${s.id}" readonly></td>
            <td width="100"> <input type="text" name="userID"  value="${s.userID}" readonly></td>
                   <td width="100"> <input type="text" name="kscj" value="${s.kscj}" readonly></td>
                    <td width="100"> <input type="text" name="pscj"  value="${s.pscj}"></td>
            </tr>
            </c:forEach>
          </table>
          <td><input type="submit" value="修改"></td>
           </form>
    </body>
</html>
