<%-- 
    Document   : update
    Created on : 2012-9-21, 14:12:03
    Author     : Administrator
--%>


<%@page contentType="text/html" pageEncoding="utf-8"%>

<%--
<%@page  import="dao.CourseDAO" %>
<%@page  import="vo.Course"%>


<%@page import="test.vo.Course"%>
<%@page import="test.dao.CourseDAO"%>


<%@page  import="java.util.*" %>

--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>修改科目</h1>
     

        <form action="${pageContext.request.contextPath}/course/update" method="post">
           <table border="0">
         
            <tr>
                <td>课程号</td>
                <td><input type="text" name="courseid" value="${c.courseid}"></td>
            </tr>
            
            <tr>
                <td>课程名称</td>
                <td><input type="text" name="courseName" value="${c.courseName}"></td>
            </tr>
           <%--   <tr>
                    <td>代号</td>
                    <td>
                        <SELECT  name="kcxz" style="width: 130px;">
                            <%
                                String kcxz=s.getKcxz();
                                ClassesDAO classesDAO = new ClassesDAO();
                                ArrayList<Classes> classesList = classesDAO.list();
                                for (Classes c : classesList) {
                            %>
                            <option value="<%=c.getKcxz()%>"  <%=kcxz.equals(c.getKcxz())?"selected":""%>> 
                                <%=c.getKcdh()%> </option>
                            <%
                                }
                            %>
                        </SELECT>
            --%>
                <tr>
                    <td><input type="submit" value="更新"></td>
                </tr>
           
         
            </table>

        </form>



    </body>
</html>
