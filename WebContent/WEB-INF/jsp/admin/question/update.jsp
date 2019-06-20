<%-- 
    Document   : update
    Created on : 2012-9-21, 14:12:03
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
     <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>修改试题</h1>
       
       
        <form action="${pageContext.request.contextPath}/question/update" method="post">
        <table border="0" class="table table-striped">
            
            <tr>
                
                <td>编号</td>
                <td><input type="text" name="questionID" value="${q.questionID}" readonly></td>
                
                
            </tr>
            <tr>
                
                <td>题目</td>
                <td><input type="text" name="subject" value="${q.subject}"></td>
                
                
            </tr>
               <tr>
                <td>选项一</td>
                <td><input type="text" name="choiceA" value="${q.choiceA}"></td>

            </tr>
          <tr>
                <td>选项二</td>
                <td><input type="text" name="choiceB" value="${q.choiceB}"></td>

            </tr>
            <tr>
                <td>选项三</td>
                <td><input type="text" name="choiceC" value="${q.choiceC}"></td>

            </tr>
            <tr>
                <td>选项四</td>
                <td><input type="text" name="choiceD" value="${q.choiceD}"></td>

            </tr>
        
             <tr>
                <td>答案</td>
                <td><select name="answer">
                        <option value="a">a</option>
                        <option value="b">b</option>
                        <option value="c">c</option>
                       <option value="d">d</option>
                    </select>
                </td>

            </tr>
              <tr>
                <td>试题类型</td>
                <td><select name="typeID">
                                        <option value="01">单选</option>
                                        <option value="02">复选</option>
                                    </select>
                </td>

            </tr>
            
            <tr>
                <td>科目</td>
                <td><select name="courseID">
                       <c:forEach items="${categores }" var="c">
<option value="${c.courseid}" <c:if test="${c.courseid==q.courseID}">selected</c:if> > ${c.courseName}  </option>
                
                        </c:forEach>
                    </select>
                        
                   
                </td>

            </tr>
            
                </td>

            
             <tr>
                 <td><input type="submit" value="更新"></td>
              

            </tr>
        </table>
                  
        </form>
 
        
       
    </body>
</html>
