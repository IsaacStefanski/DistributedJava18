<%-- 
    Document   : customerAccount
    Created on : Feb 15, 2018, 8:16:33 AM
    Author     : Isaac
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stefanski Pics | Gallery</title>
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

        <!--CUSTOMER ACCOUNT INFO-->
        
    </body>
</html>
