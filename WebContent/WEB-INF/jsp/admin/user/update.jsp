<%-- 
    Document   : update
    Created on : 2012-9-21, 14:12:03
    Author     : Administrator
--%>


<%@page contentType="text/html" pageEncoding="utf-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery-1.4.2.js"></script> 
        <script type="text/javascript">
        	function mytest() {
        		var bjdh = $('#bjdh').val();
				var xydh = $('#xydh').val();
				$('#bjdh').html("");
				var html='<option value="">请选择班级</option>';
				$.post('<%=request.getContextPath()%>/shijuan/changebj',{xydh:xydh},function(data){
					
					for(var i=0;i<data.length;i++){
						var bean = data[i];
						if(bean.bjdh==bjdh){
							html+='<option selected value="'+bean.bjdh+'">'+bean.bjmc+'</option>';
						}else{
							html+='<option  value="'+bean.bjdh+'">'+bean.bjmc+'</option>';
						}
					}
					$('#bjdh').html(html);
				});
			}
        </script>
    </head>
    <body>
        <h1>修改</h1>
      

        <form action="${pageContext.request.contextPath}/user/update" method="post">
           <table border="0">
         
            <tr>
                <td>用户ID</td>
                <td><input type="text" name="userID" value="${s.userID}" readonly></td>
            </tr>
            
            <tr>
                <td>用户名</td>
                <td><input type="text" name="userName" value="${s.userName}"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="text" name="password" value="${s.password}"></td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td><input type="text" name="email" value="${s.email}"></td>
            </tr>
            <tr>
                <td>权限</td>
                <td><input type="text" name="userType" value="${s.userType}"></td>
            </tr>
           
           <tr>
                    <td>学院</td>
                    <td>
            			<select name="" id="xydh" style="width: 130px;" onchange="mytest()">
                            <option selected>请选择学院</option>
                            <option value="07">信息技术学院</option>
                            <option value="06">人文社会科学学院</option>
                            <option value="05">食品学院</option>
                            <option value="04">经济管理学院</option>
                            <option value="03">工程学院</option>
                            <option value="02">动物科技学院</option>
                            <option value="01">植物科技学院</option>
                            <option value="08">生命科学技术学院</option>
                            <option value="09">文理学院</option>
                            <option value="10">应用技术学院</option>
                    </select>
                <tr>
           
            <tr>
                    <td>班级</td>
                    <td>
                        <SELECT  name="bjdh" id="bjdh" style="width: 130px;">
                            <c:forEach items="${banjis }" var ="b">
                            <option value="${b.bjdh }"  <c:if test="${b.bjdh==s.bjdh}">selected</c:if>> 
                            ${b.bjmc}</option>
                            </c:forEach>
                        </SELECT>
            
                <tr>
                    <td><input type="submit" value="更新"></td>
                </tr>
           
         
            </table>

        </form>



    </body>
</html>
