<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>
                开始测试
        </title>
    </head>
<BODY bgcolor="#F8F8FF">

<c:if test="${mes != null }"> ${mes} </c:if>
<h2>${shijuanmingcheng}</h2>

 <FORM action="${pageContext.request.contextPath}/exam/score" method="get" name="testform">   
   
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


<input type="hidden" name="shijuantimu" value="${shijuantimu}">
<input type="hidden" name="courseID" value="${courseID}">
       
    <INPUT TYPE="submit" value="交卷" name="submit">
    </FORM> 
    
</BODY>
</HTML>