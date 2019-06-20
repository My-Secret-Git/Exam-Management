<%@page language = "java" contentType = "text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
  
    <script>

    
    function mytest(){
    	var bjdh = $("#bjdh").val();
    	 $("#bjdh").find("option").remove();
    	    var xydh = $("#xydh").val();

    	    $.post("<%=request.getContextPath()%>/shijuan/changebj", {xydh:xydh}, function (result) {
    	        var html = '';
    	        html += '<option value="">请选择班级</option>';
    	        for (var i = 0; i < result.length; i++) {
    	            var bean = result[i];
    	            if(bjdh==bean.bjdh){
    	            	html += '<option selected value="' + bean.bjdh + '">' + bean.bjmc + '</option>';
    	            }else{
    	            	html += '<option  value="' + bean.bjdh + '">' + bean.bjmc + '</option>';
    	            }
    	            
    	        }
    	        $("#bjdh").html(html)
    	    })
    	
    }
</script>

 <script>
          
            function checkAll() {
                var selectFlag = document.getElementsByName("selectFlag");
                for (var i = 0; i < selectFlag.length; i++) {
                    selectFlag[i].checked = document.getElementById("ifAll").checked;
                }
            }
            
             function selectQuestion() {
                var selectFlag = document.getElementsByName("selectFlag");
                var flag = false;
                for (var i = 0; i < selectFlag.length; i++) {
                    if (selectFlag[i].checked) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    alert("请选择需要添加的题目！");
                    return;
                }
                if (window.confirm("确认添加吗？")) {
                   
                        document.form1.submit();
                   
                }
            }
            
        </script>
        
          <style type="text/css">
 .style1{
                width: 1000px;
                margin: 0px;
                margin-bottom:20px;
                border:1px solid #96C2F1;
                background-color: #EFF7FF;
                border-collapse:collapse
            }
            
            .style1 td{
                border:1px solid #000000;
                /*border-collapse:collapse ;*/
            }
            .style1 th {
                border:1px solid #000000;
                background-color: #0099CC;
            }


</style>   
    </HEAD>
    <BODY  >
        <form name="form1"  method="post" action="${pageContext.request.contextPath}/shijuan/insert">
        <table width="500">
        <tr>
            <td width="100" height="25" align="right" valign="middle">所在院系：</td>
            <td> <select size="1" name="xydh" id="xydh" style="width:200px" onchange="mytest()">
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
                    </select></td>
        </tr>
        <tr></tr>
        <tr>
            <td width="78" height="25" align="right" valign="middle">班级</td>
            <td><select name="bjdh" id="bjdh" style="width:200px" size="1">
                    <option value="" >请选择班级：</option>
                    <c:forEach items="${banjis}" var="b">
                    <option value="${b.bjdh}"> ${b.bjmc} </option>
                    </c:forEach>
            </select></td>
        </tr>
        <tr></tr>
        <tr>
            <td width="100" height="25" align="right" valign="middle">课程：</td>
                <td><select name="courseID" style="width:200px">
                       <c:forEach items="${courses}" var="c">
                        <option value="${c.courseid}" >  ${c.courseName } </option>
                  
                        </c:forEach>
                    </select>
   
                </td>
                </tr>
                 <tr></tr>
                <tr>
                <td width="100" height="25" align="right" valign="middle">
                    试卷名：</td><td><input type="text" name="shijuanmingcheng" style="width:200px">
                </td>
            </tr>
            <tr><td><input type="text"  name="status" value="end" hidden="true"/></td></tr> 
        </table>
        <br/><br/>
        <table border="1" class="style1" >
            <tr>
                 <th width="10" class="rd6" align="center">
                            <input type="checkbox" name="ifAll" id="ifAll"
                                   onClick="checkAll()">
                        </th>
                <th>题目</th>
                <th>选项1</th>
                <th>选项2</th>
                <th>选项3</th>
                <th>选项4</th>
                <th>答案</th>
                
            </tr>
            <c:forEach items="${q}" var="question">
            <tr>
                <td>
                            <input type="checkbox" name="selectFlag" class="checkbox1"
                                   value="${question.questionID}">
                        </td>
                  <td>${question.subject}</td>
                   <td>${question.choiceA}</td>
                    <td>${question.choiceB}</td>
                    <td>${question.choiceC}</td>
                    <td>${question.choiceD}</td>
                    <td>${question.answer}</td>
               
            </tr>     

            </c:forEach>
        
          
</table>
         <input name="btnselect"  type="button" id="selectDelete" value="添加试卷" onClick="selectQuestion()">
        </form>
    </BODY>
</HTML>