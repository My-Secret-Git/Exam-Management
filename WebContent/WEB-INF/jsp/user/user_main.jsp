<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%> 
 <html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
          <title>JSP page</title>
    </head>
    <frameset rows="15%,85%"   border="5">
	<frame src="${pageContext.request.contextPath}/user/userindex/frame_a">
	<frameset cols="16%,88%"   border="5">
		<frame src="${pageContext.request.contextPath}/user/userindex/frame_b" name="left"  >
		<frame src="${pageContext.request.contextPath}/user/userindex/frame_c" name="main">
	</frameset>
</frameset>
</html>
