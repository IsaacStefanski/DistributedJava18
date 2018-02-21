<%-- 
    Document   : index
    Created on : Feb 11, 2018, 4:51:48 PM
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
		<a class="nav" href="/PicsApp/PhotoController?search=" style="padding-left:20px; padding-right:20px;"><i class="fa fa-camera" aria-hidden="true"></i> Photos</a></td>
		<a class="nav" href="viewCart.jsp" style="padding-left:20px; padding-right:20px;"><i class="fa fa-shopping-cart" aria-hidden="true"></i> Cart</a></td>
	</div>
	
	<!--CONTENT-->
	<div id="container">
            <!--SLIDESHOW-->
            <div class="slideshow-container">
                <div class="mySlides fade">
                    <img src="images/home/h1sm.jpg" style="width:auto; height:500px;" alt="1973 Opel GT">
  		</div>
                <div class="mySlides fade">
                    <img src="images/home/h2sm.jpg" style="width:auto; height:500px;" alt="1973 Opel GT Gauge Cluster">
                </div>
                <div class="mySlides fade">
                    <img src="images/home/h3sm.jpg" style="width:auto; height:500px;" alt="Fancy Fungus">
  		</div>
		<div class="mySlides fade">
                    <img src="images/home/h4sm.jpg" style="width:auto; height:500px;" alt="Green Field">
  		</div>
		<div class="mySlides fade">
                    <img src="images/home/h5sm.jpg" style="width:auto; height:500px;" alt="Fall Railroad">
                </div>
                <div class="mySlides fade">
                    <img src="images/home/h6sm.jpg" style="width:auto; height:500px;" alt="Ferrari 458">
                </div>
                <div class="mySlides fade">
                    <img src="images/home/h7sm.jpg" style="width:auto; height:500px;" alt="Aston Martin Emblem">
                </div>
            </div>
		
            <div id="contentLeft">
		<h3><i class="fa fa-camera-retro" aria-hidden="true"></i> This is Stefanski Pics...</h3>
		<p>"Stefanski Pics started a while ago but never had much of a presence online until 2016. I have definitely had my fair share of cameras over the years. My first digital camera was a 1.3 megapixel Sony Cyberhsot P30 back in 2002. After seven years, the P30 was replaced by a 5 megapixel Sony Webbie HD, one of the first pocket-size cameras capable of recording video in 1080p. The little orange Sony was succeeded by a little black Sony, a Cybershot WX9. The 16 megapixel shooter was sooned joined by a 21 megapixel superzoom, the Sony HX50V, Sony's most advanced Cybershot camera at the time with 30x optical zoom. The newest addition to the lineup, and the absolute best camera I'ver ever owned, is the Sony RX100 IV I got in the beginning of February 2016. The RX series is Sony's line of professional compact and fixed-lens cameras. The RX100 IV's mind-blowing-ness is what catapulted Stefanski Pics into actually being something. The pictures are amazing, and it's really portable, so it's easy to have fun with just about anywhere. That's the important part of photography, though, the fun. A picture may have stunning sharpness or vibrant colors, and that's great, but it's when you're having fun behind the camera that amazing shot actually means something."</p>
		<p>~ Isaac Stefanski</p>
		<br>
		<p>See more on <a href="https://www.flickr.com/gp/138557596@N06/o7617T">Flickr <img src="images/flickr-icon.png" style="width:auto; height:15px;"></a></p>
            </div>
	
            <div id="contentRight">
		<h3><i class="fa fa-newspaper-o" aria-hidden="true"></i> What's New</h3>
		<p>The New Year's Day super moon impressed, rather hard to miss in fact. It's not always easy to get good moon pictures.</p>
		<hr>
		<p>Auto show season is coming! There were some great surprises at the 2017 Chicago Auto Show and Greater Milwaukee Auto Show.
                    Remember the Kia Stinger and Lexus LC500h... and the hundreds of other awesome cars? Relive the automotive fun as the 2018 shows approach!</p>			
            </div>
	</div>
	
	<!--FOOTER-->
	<footer>
		<p>&copy; 2018  |  Isaac Stefanski  |  Stefanski Pics Photography</p>
		<img src="images/logo.png" style="width:auto; height:30px;">
	</footer>
	
	<script>	
		var slideIndex = 0;
		showSlides();
		
		function showSlides() {
			var i;
			var slides = $(".mySlides");
			for (i = 0; i < slides.length; i++) {
				slides[i].style.display = "none";  
			}
			slideIndex++;
			if (slideIndex> slides.length) {slideIndex = 1}
			slides[slideIndex-1].style.display = "block";
			setTimeout(showSlides, 3000); // Change image every 3 seconds
		}
	</script>
    </body>
</html>
