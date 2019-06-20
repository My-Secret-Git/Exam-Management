<%-- 
    Document   : importQuestionFromXML
    Created on : 2013-4-16, 8:48:51
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="form1"  method="post" enctype="multipart/form-data"
action="uploadSingleFile.jsp">
        <table width="500">
      
        <tr>
            <td>
                 <input name="file1" type="file">
            </td>
            
            <td>
                <input type="submit" name="Submit" value="上传">
            </td>
        </tr>
        </table>
        </form>
    </body>
</html>
