<%-- 
    Document   : list
    Created on : 2014-10-30, 11:12:27
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
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function go(questionID){
                if(confirm("你确定要删除吗")){
                    window.location="<%=request.getContextPath()%>/question/del/"+questionID;
                }
            }
            
            
        </script>
    </head>
    <body>
        <a href="${pageContext.request.contextPath}/question/insertpre">添加试题</a> 
        <h1>试题数据</h1>
        <table border="1" 
class="table table-striped">
            <tr>
                <th>编号</th>
                <th>题目</th>
                <th>选项1</th>
                <th>选项2</th>
                <th>选项3</th>
                <th>选项4</th>
                <th>答案</th>
                <th colspan="2">操作</th>
            </tr>
           <c:forEach items="${list}" var="s">

            <tr>
                <td>
                  ${s.questionID } 
                <td>
                  ${s.subject }  
                </td>
                <td>
                   ${s.choiceA } 
                </td>

                <td>
                    ${s.choiceB } 
                </td>
                <td>
                 ${s.choiceC }
                </td>
                <td>
                 ${s.choiceD }
                </td>
                  <td>
                 ${s.answer }
                </td>
                <td>
                    
                    <a href="${pageContext.request.contextPath}/question/updatepre/${s.questionID } ">更新</a>  
                </td>
                <td>
                    <a href="javascript:go(${s.questionID } )">删除</a>
                </td>
            </tr>
          </c:forEach>
        </table>
    </body>
</html>
