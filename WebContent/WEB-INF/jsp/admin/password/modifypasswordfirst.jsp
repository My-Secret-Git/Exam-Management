<%-- 
    Document   : modifypasswordfirst
    Created on : 2010-10-20, 8:37:33
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function test(){
                if(passform.password1.value!=passform.password2.value){
                    alert("密码不一致");
                    return;
                }
                passform.submit();
            }
        </script>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/exam/password1" name="passform">
              输入原密码:<input type="password" name="pw"><br>
            输入新密码:<input type="password" name="password1"><br>
            重复输入密码:<input type="password" name="password2"><br>
           <input type="button" value="确定" onclick="test()">
<!--<input type="submit" value="确定">-->
            
        </form>
    </body>
</html>
