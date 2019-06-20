<%-- 
    Document   : list_Questions
    Created on : 2012-9-17, 19:06:01
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>JSP Page</title>
<script>

            function checkAll() {
                //selectFlag是一个数组
            	var a = document.getElementsByName("selectFlag");
            	var all=document.getElementById("ifAll");
                for (var i = 0; i < a.length; i++) {
                	
                	
                    a[i].checked = all.checked;
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
                    alert("请选择需要删除的试题！");
                    return;
                }
                if (window.confirm("确认删除吗")) {
                    //with (document.getElementById("StudentForm")) {
                    //action="/BatchDelete.do";
                    // method="post";
                    document.Studentform.submit();
                    //}
                }
            }

        </script>

<style type="text/css">
.style1 {
	width: 1000px;
	margin: 0px;
	margin-bottom: 20px;
	border: 1px solid #96C2F1;
	background-color: #EFF7FF;
	border-collapse: collapse
}

.style1 td {
	border: 1px solid #000000;
	/*border-collapse:collapse ;*/
}

.style1 th {
	border: 1px solid #000000;
	background-color: #0099CC;
}
</style>
</head>
<body>


	
	<form name="Studentform" id="Studentform" action="${pageContext.request.contextPath}/question/batchdel"
		method="post">
		
		<table border="1" class="table table-striped">
			<tr>
				<th width="10" class="rd6" align="center"><input
					type="checkbox" name="ifAll" id="ifAll" onClick="checkAll()">
				</th>
				<th>题目</th>
				<th>选项1</th>
				<th>选项2</th>
				<th>选项3</th>
				<th>选项4</th>
				<th>答案</th>
				
			</tr>
			
                <c:forEach items="${questions}" var="question">
			<tr>
				<td><input type="checkbox" name="selectFlag"
					value="${question.questionID}"></td>
				<td>${question.subject}</td>
				<td>${question.choiceA}</td>
				<td>${question.choiceB}</td>
				<td>${question.choiceC}</td>
				<td>${question.choiceD}</td>
				<td>${question.answer}</td>

			</tr>
			</c:forEach>
			<tr>
				<td colspan="5"><input name="btnselect" type="button"
					id="selectDelete" value="删除" onClick="selectQuestion()"></td>
			</tr>
		</table>
	</form>
</body>
</html>
