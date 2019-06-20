
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
         
        <script type="text/javascript" src="<%=request.getContextPath()%>/script/jquery-1.4.2.js"></script>  
        <script type="text/javascript">
         function ss(object){
                 $.post("<%=request.getContextPath()%>/shijuan/check", {status: object.value }, function (data) {
                        $('#divMsg').html("<h3><font color=red>"+data+"</font></h3>"); //接受服务器处理返回数据，填充在div中
                    });
  }  
        </script>    
    </head>
    <body>
       
        <h1>试卷数据</h1>
        <table border="1" class="table table-striped">
            <tr>
                <th>编号</th>
                <th>试卷名称</th>
                <th>班级</th>
                <th>科目</th>
                
                <th colspan="2">操作</th>
            </tr>
          <c:forEach items="${list }" var="s">

            <tr>
                <td>
                   ${s.id }  
                </td>
                <td>
                    ${s.shijuanmingcheng }
                </td>
                <td>
                    ${s.bjdh }
                </td>

                <td>
                     ${s.courseID }
                </td>
                
                <td>
                    
                  
                </td>
                <td>
                    <select size="1" name="status"  id="status" onchange="ss(this)" >          
             <option  value="start,${s.id}" <c:if test="${s.status=='start'}">selected</c:if> >开始</option>
              <option  value="end,${s.id}"  <c:if test="${s.status=='end'}">selected</c:if>>关闭</option>
             
                 </select>
                </td>
            </tr>
           </c:forEach>
        </table>
        <div id="divMsg"></div>
    </body>
</html>
