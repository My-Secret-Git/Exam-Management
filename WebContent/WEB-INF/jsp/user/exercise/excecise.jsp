<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
        <title>
            开始考试
        </title>
    </head>
<BODY bgcolor="#F8F8FF">
    
 <FORM action="${pageContext.request.contextPath}/exam/getscore" method=get name=testform>  
 
 <c:set var="i" value="1"/>
    <c:forEach items="${all}" var="q">
        ${i}.${q.subject}<br/>
        <INPUT type="radio" name="${i}" value="a">A.${q.choiceA}<br> 
        <INPUT type="radio" name="${i}" value="b">B.${q.choiceB}<br>
        <INPUT type="radio" name="${i}" value="c">C.${q.choiceC} <br>
        <INPUT type="radio" name="${i}" value="d" >D.${q.choiceD}<br>
        <BR> 
        <c:set var = "i" value="${i+1}"/>           
    </c:forEach> 

    <input type="hidden" name="courseID" value="${courseID}">
       <INPUT TYPE="submit" class="btn btn-info" value="交卷" name="submit">
    </FORM> 
    
</BODY>
</HTML>