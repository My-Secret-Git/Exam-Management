<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="form1"  method="post" 
      enctype="multipart/form-data" 
      action="${pageContext.request.contextPath}/user/upload">

    <p>
  <input name="file" type="file">
</p>

<p>
  <input type="submit" name="Submit" value="上传">
</p>
</form >
</body>
</html>