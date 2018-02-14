<%-- 
    Document   : nameDetail
    Created on : Feb 13, 2018, 6:41:04 PM
    Author     : Isaac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Name Detail</h1>
        <table>
            <tr>
                <td>FIRST:</td>
                <td><c:out value="${name.first}"></c:out></td>
            </tr>
            <tr>
                <td>LAST:</td>
                <td><c:out value="${name.last}"></c:out></td>
            </tr>
            <tr>
                <td>STREET:</td>
                <td><c:out value="${name.address.street}"></c:out></td>
            </tr>
            <tr>
                <td>CITY:</td>
                <td><c:out value="${name.address.city}"></c:out></td>
            </tr><tr>
                <td>STATE:</td>
                <td><c:out value="${name.address.state}"></c:out></td>
            </tr>
            <tr>
                <td>ZIP:</td>
                <td><c:out value="${name.address.zip}"></c:out></td>
            </tr>
        </table>
    </body>
</html>