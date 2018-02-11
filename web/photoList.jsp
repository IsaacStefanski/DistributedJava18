<%-- 
    Document   : photoList
    Created on : Feb 11, 2018, 5:01:01 PM
    Author     : Isaac
--%>

<%@page import="java.util.List"%>
<%@page import="model.Photo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <%
                List<Photo> photoList = (List<Photo>)request.getAttribute("photoList");
                for (Photo p : photoList){
            %>
            <tr>
                <td><img src="images/<%=p.getFile()%>" style="width:auto; height:70px;"></td>
                <td><a href="?id=<%=p.getId()%>"><%=p.getName()%></a></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>