<%-- 
    Document   : insert
    Created on : 2012-9-17, 19:28:57
    Author     : Administrator
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>添加试题</h1>
        <form action="${pageContext.request.contextPath}/question/insert" method="post">
        <table border="0">
            <tr>
                <td>题目</td>
                <td><input type="text" name="subject"></td>
                
                
            </tr>
               <tr>
                <td>选项一</td>
                <td><input type="text" name="choiceA"></td>

            </tr>
          <tr>
                <td>选项二</td>
                <td><input type="text" name="choiceB"></td>

            </tr>
            <tr>
                <td>选项三</td>
                <td><input type="text" name="choiceC"></td>

            </tr>
            <tr>
                <td>选项四</td>
                <td><input type="text" name="choiceD"></td>

            </tr>
             <tr>
                <td>答案</td>
                <td><select name="answer">
                        <option value="a">a</option>
                        <option value="b" >b</option>
                        <option value="c">c</option>
                       <option value="d">d</option>
                    </select>
                </td>

            </tr>
            <tr>
                <td>试题类型</td>
                <td><select name="typeID">
                         <option value="01">单选题</option>
                        <option value="02" >多选题</option>
                        
                    </select>
                </td>

            </tr>
            
            <tr>
                <td>课程</td>
                <td><select name="courseID">
                    <c:forEach items="${categores }" var="c">
							<option value="${c.courseid}"  > ${c.courseName}  </option>
                
                        </c:forEach>
                        
                    </select>
                        
                   
                </td>

            </tr>
             <tr>
                 <td><input type="submit" value="添加"></td>
              

            </tr>
        </table>
            
        </form>
    </body>
</html>
