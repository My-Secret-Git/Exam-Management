<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
  
</head>
<body bgcolor="F2FDDB" >
<table   class="table table-hover"  width=120 border=3 align="left">
   </tr>
  <tr align=center>
    <td height="42"><a href="${pageContext.request.contextPath}/exam/plan" target="main">考试专区</a></td>
  </tr>
  
  <tr align=center>
    <td height="42"><a href="${pageContext.request.contextPath}/exam/selectExcecise" target="main">练习专区</a></td>
  </tr>
  <tr align=center>
    <td height="42"><a href="${pageContext.request.contextPath}/exam/listScore" target="main">我的成绩</a></td>

  </tr>
  
  <tr align=center>
    <td height="42"><a href="${pageContext.request.contextPath}/exam/userDetail" target="main">我的资料</a></td>

  </tr>
  <tr align=center>
    <td height="42"><a href="${pageContext.request.contextPath}/exam/uploadpre" target="main">修改头像</a></td>

   <tr align=center>
    <td height="42"><a href="${pageContext.request.contextPath}/exam/passwordpre" target="main">修改密码</a></td>
    
  </tr>
   <tr align=center>
      <td height="42"  ><a href="${pageContext.request.contextPath}/user/loginout"  onclick="javascript:window.parent.close()" target="_blank">退出系统</a></td>
   
  </tr>
 
</table>
</body>
</html>
