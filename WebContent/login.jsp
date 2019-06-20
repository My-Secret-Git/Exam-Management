<%@page isELIgnored="false"%>
<%@page import="java.net.URLDecoder"%>
<%@page contentType="text/html;charset=utf-8"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
 
        <title>在线考试系统</title>
        <Script language="javascript">
            function check() {
                if(myform.userID.value == "") {
                    alert("请输入用户名!");
                    myform.userID.focus();
                    return;
                }
                if(myform.password.value == "") {
                    alert("请输入密码");
                    myform.password.focus();
                    return;
                }
                myform.submit();
            }
//更换验证码
  function changeVerifyCode(){

    //1、如果用<iframe>实现，则重新加载<iframe>的内容
  	//verifyCodeFrame.location.reload();

  	//2、如果用<img>实现，则修改<img src=url>的url
  	//这里有一个小技巧，如果给url赋相同的值，浏览器不会重新发出请求，因此用js生成一个即时毫秒数做url中的参数
  	t=new Date().getTime();
  	document.myform.verifyCodeImg.src="<%=request.getContextPath()%>/user/ImageServlet?t="+t;
  }

        </Script>
    </head>

    <body onload="javascript:myform.userID.focus()"  background="">

管理员  ： admin  1
学生   1   1
        <form action="${pageContext.request.contextPath}/user/login" method="post" name="myform">
            <div align="center">
                <table width="800" height="500" border="0" cellpadding="0" cellspacing="0"
                       bgcolor="#FFFFE0" style="border: 2px solid #008000; padding: 0px">
                    <tr>
                        <td  colspan="3" height="162" align="justify" valign="bottom"
                             background="${pageContext.request.contextPath}/images/bg.jpg"
                             style="border-bottom: 1px solid #008000; padding: 0">
                        </td>
                    </tr>
                    <tr>
                        <td height="50">

                        </td>
                    </tr>

         
                    <tr>
                        <td align="center">用户名：</td>
                        <td><input class="form-control" type="text" name="userID" value="" placeholder="请输入用户名"></td>
                    </tr>

                    <tr>
                        <td align="center">	密码:</td>
                        <td><input class="form-control" type="password" name="password" value="" placeholder="请输入密码"></td>
                    </tr>
                   <tr><td align="center">验证码：</td><td><input name="verifyCode" style="height:29px;width:70px;font-size:25px"/>
  



  <!-- 采用<img>实现 -->

  <img name="verifyCodeImg" src="${pageContext.request.contextPath}/user/ImageServlet">
  <a href="javascript:changeVerifyCode()">看不清？</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                       </td>
                   </tr>
                <tr align="right">
                       <td>
                            <input type="button" class="btn btn-success" name="sub" value="登陆" onclick="check()">
                             <input type="reset" class="btn btn-warning" value="重置"/>
                        </td>
                    </tr>
                   <tr>
                        <td>
                          <c:if test="${param.VadalitionError != null }">
                          	<font color="red">验证码错误</font>
                          </c:if>
                          <c:if test="${param.userNamePasswordLevelError != null }">
                          	<font color="red">用户名密码错误</font>
                          </c:if>
                        </td>
                    </tr>
                </table>


        <table width="800" border="0" cellpadding="0" cellspacing="0"
                       bgcolor="#FFFFFF" style="border: 2px solid #008000; padding: 0px">

            <tr bgcolor="#F7F7F7">
					<td height="52">
						<div align="center" style="font: 9pt">
							All Rights Reserved.
							<br>
							版权 Copyright&2017-2018
							<BR>

							
							<BR>
							建议您使用1024*768分辨率，IE8.0以上版本浏览本站!
						</div>
					</td>
				</tr>
			</table>
			管理员  ： admin  1
学生   1   1
            </div>
 </form>






       



    </body>

</html>