<%-- 
    Document   : viewCart
    Created on : Feb 12, 2018, 7:23:05 PM
    Author     : Isaac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stefanski Pics | Home</title>
        <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script src="cookies.js"></script>
        <script src="stefpicsjs.js"></script>
        <link rel="stylesheet" type="text/css" href="stefpicsstyle.css">
        <link href="https://fonts.googleapis.com/css?family=Raleway|Roboto+Slab" rel="stylesheet">
        <link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <!--HEADER-->
	<header>
		<table>
			<tr>
                            <td>&nbsp;</td>
                            <td><a href="index.jsp"><img src="images/logo.png" style="width:auto; height:70px;"></a></td>
                            <td><a href="index.jsp"><h2>Stefanski Pics Photography</h2></a></td>
                            <td>&nbsp;</td>
                            <td>
                                <!--SEARCH FORM-->
                                <form method="get" action="PhotoController">
                                    <input type="text" name="search"/>
                                    <input type="submit" value="Search"/>
                                </form>
                            </td>
			</tr>
		</table>
	</header>
	
	<!--NAVIGATION-->
	<div id="navigation">
		<a class="nav" href="index.jsp" style="padding-left:20px; padding-right:20px;"><i class="fa fa-home" aria-hidden="true"></i> Home</a></td>
		<a class="nav" href="gallery.jsp" style="padding-left:20px; padding-right:20px;"><i class="fa fa-camera" aria-hidden="true"></i> Photos</a></td>
		<a class="nav" href="viewCart.jsp" style="padding-left:20px; padding-right:20px;"><i class="fa fa-shopping-cart" aria-hidden="true"></i> Cart</a></td>
	</div>
        
        <h1>Cart</h1>
        <br>
        <c:forEach var="photo" items="${photoList}">
                <div class="galleryItem">
                    <a target="_blank" href="?id=<c:out value="${photo.id}"/>">
                        <img src="images/<c:out value="${photo.file}"/>" alt="<c:out value="${photo.name}"/>" width="700" height="auto">
                    </a>
                        <div class="desc"><c:out value="${photo.name}"/></div>
                </div>
        </c:forEach>
    </body>
</html>