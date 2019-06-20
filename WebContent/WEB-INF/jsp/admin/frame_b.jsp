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




<style type="text/css">

a:link {
 text-decoration: none;
}
a:visited {
 text-decoration: none;
}
a:hover {
 text-decoration: none;
}
a:active {
 text-decoration: none;
}

</style>
</head>
<body bgcolor="#FFFAF0">
<table align="center"  class="table table-dark table-hover" style="BORDER-COLLAPSE: collapse"  width=150 border=3 align="left">

  
  
    <tr align=center>
    <td height="42" ><a href="${pageContext.request.contextPath}/question/listALL" target="main">试题管理</a></td> 
  </tr>
  
  <tr align=center>
    <td height="42"   ><a href="${pageContext.request.contextPath}/course/list" target="main">科目管理</a></td>
  </tr>

  <tr align=center>
    <td height="42" ><a href="${pageContext.request.contextPath}/score/first" target="main">成绩管理</a></td> 
  </tr>
  
  <tr align=center>
      <td height="42" ><a href="${pageContext.request.contextPath}/shijuan/first" target="main">试卷管理</a></td>
    
  </tr>
      <tr align="center">
    <td height="42"   ><a href="${pageContext.request.contextPath}/user/list" target="main">用户管理</a></td>
    
  </tr>
 
  <tr align=center>
      <td height="42" ><a href="${pageContext.request.contextPath}/exam/passwordpre1" target="main"  >修改密码</a></td>
   
  </tr>
  <tr align=center>
      <td height="42" ><a href="${pageContext.request.contextPath}/user/loginout"  onclick="javascript:window.parent.close()" target="_blank">退出登陆</a></td>
   
  </tr>
</table>
</body>
</html>
