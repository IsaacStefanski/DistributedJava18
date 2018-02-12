<%-- 
    Document   : photoDetail
    Created on : Feb 11, 2018, 5:00:27 PM
    Author     : Isaac
--%>

<%@page import="model.Photo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%Photo photo = (Photo)request.getAttribute("photo");%>
        
        <h1><%=photo.getName()%></h1>
        <img src="images/<%=photo.getFile()%>" style="width:500px; height:auto;">
    </body>
</html>