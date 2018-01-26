//stefpicsjs.js
$(document).ready(function(e){
	/*PICTURES******************************************************************************************************************************************************/
	/*********auto shows********************************************************************************************************************************************/
	/*2016*/ var autoshow16pics = ["autoshows/2016/DSC00395R.JPG", "autoshows/2016/DSC00522R.JPG", "autoshows/2016/DSC00582R.JPG", "autoshows/2016/DSC00593R.JPG", "autoshows/2016/DSC01590R.JPG", "autoshows/2016/DSC01652R.JPG", "autoshows/2016/DSC02178R.JPG", "autoshows/2016/DSC02274R.JPG", "autoshows/2016/DSC02295R.JPG", "autoshows/2016/DSC02355R.JPG", "autoshows/2016/DSC02688R.JPG"];
	/*2017*/ var autoshow17pics = ["autoshows/2017/DSC06725R-1.JPG", "autoshows/2017/DSC06762R-8.JPG", "autoshows/2017/DSC06779R-14.JPG", "autoshows/2017/DSC06790R-18.JPG", "autoshows/2017/DSC06801R-22.JPG", "autoshows/2017/DSC06852R-30.JPG", "autoshows/2017/DSC06864R-33.JPG", "autoshows/2017/DSC06872R-34.JPG", "autoshows/2017/DSC06900R-42.JPG", "autoshows/2017/DSC06998R-64.JPG", "autoshows/2017/DSC07009R-65.JPG", "autoshows/2017/DSC07015R-67.JPG", "autoshows/2017/DSC07151R-83.JPG", "autoshows/2017/DSC07188R-88.JPG", "autoshows/2017/DSC07241R-100.JPG", "autoshows/2017/DSC07244R-101.JPG", "autoshows/2017/DSC07284R-108.JPG", "autoshows/2017/DSC07287R-109.JPG", "autoshows/2017/DSC07290R-110.JPG", "autoshows/2017/DSC07292R-112.JPG", "autoshows/2017/DSC07294R-113.JPG", "autoshows/2017/DSC07476R-144.JPG", "autoshows/2017/DSC07516R-150.JPG", "autoshows/2017/DSC08427R-1.JPG", "autoshows/2017/DSC08464R-4.JPG", "autoshows/2017/DSC08470R-7.JPG", "autoshows/2017/DSC08489R-11.JPG", "autoshows/2017/DSC08493R-1.JPG", "autoshows/2017/DSC08952R-4.JPG", "autoshows/2017/DSC08968R-11.JPG", "autoshows/2017/DSC08989R-19.JPG", "autoshows/2017/DSC08995R-23.JPG", "autoshows/2017/DSC08996R-24.JPG", "autoshows/2017/DSC09005R-29.JPG"];
	/*****auto show picture descriptions*****/
	var autoshow16desc = ["Corvette Z06", "Genesis Vision G Concept", "Super cars at the 2016 Chicago Auto Show", "Rolls-Royce Ghost", "Lexus LC500", "Porsche Panamera Wheel", "Row of Maseratis at the 2016 Milwaukee Auto Show", "Close-up of Lamborghini emblem", "Close-up of Rolls-Royce hood ornament and emblem", "Lamborghini Aventador with doors open", "Down the aisle at the 2016 Milwaukee Auto Show"];
	var autoshow17desc = ["The iconic Chicago Auto Show globe", "Close-up of Chevy emblem", "Chevy Lego Batmobile", "Chevy Bolt tail light", "Close-up of Corvette Stingray emblem", "Lamborghini Aventador Roadster", "Lamborghini Huracan", "Lamborghini Aventador in green", "Lamborghini Huracan Roadster", "Kia Stinger GT front right 3/4 in blue", "Kia Stinger GT front in red", "Kia Stinger GT side", "Close-up of Fiat Abarth emblem", "2018 Ford Mustang", "Maserati GranTurismo", "Maserati Ghibli", "Porsche emblem", "Porsche wheel with red brake", "Porsche wheel with red brake close-up", "Porsche Panamera E-Hybrid", "Porsche wheel with green brake", "BMW i8", "Alfa Romeo Stelvio", "Audi R8 front 3/4", "Maserati GranTurismo front", "Maserati emblem on grill close-up", "Close-up of Maserati emblem", "Maserati Levante front", "Bentley headlights", "Bentley Continental GT", "Ferrari California interior", "Close-up of Ferrari emblem", "Ferrari California front 3/4", "Ferrari emblem on grill"];
	/***************************************************************************************************************************************************************/
	/*********cool cars*********************************************************************************************************************************************/
	var coolcarspics = ["cars/DSC00070R.JPG", "cars/DSC00074R.JPG", "cars/DSC00075R.JPG", "cars/DSC00171R.JPG", "cars/DSC00205R.JPG", "cars/DSC03791R.JPG", "cars/DSC03793R.JPG", "cars/DSC03816R.JPG", "cars/DSC03836R.JPG", "cars/DSC03844R.JPG", "cars/DSC03845R.JPG", "cars/DSC03852R.JPG", "cars/DSC03864R.JPG", "cars/DSC03866R.JPG", "cars/DSC03941R.JPG", "cars/DSC03942R.JPG", "cars/DSC03956R.JPG", "cars/DSC03986R.JPG", "cars/DSC03995R.JPG", "cars/DSC04128R.JPG", "cars/DSC04131R.JPG", "cars/DSC04135R.JPG", "cars/DSC04163R.JPG", "cars/DSC04172R.JPG", "cars/DSC04174R.JPG", "cars/DSC04186R.JPG", "cars/DSC04200R.JPG", "cars/DSC04239R.JPG", "cars/DSC04322R.JPG", "cars/DSC04330R.JPG", "cars/DSC05553R.JPG", "cars/DSC05584R.JPG", "cars/DSC05586R.JPG", "cars/DSC06259R.JPG", "cars/DSC06397R_2.JPG", "cars/DSC09607R_3-5.JPG", "cars/DSC09635R-14.JPG", "cars/DSC09636R_1-17.JPG", "cars/DSC09637R_1-20.JPG", "cars/DSC09707R.JPG", "cars/DSC09729R.JPG", "cars/DSC09880R.JPG", "cars/DSC09913R.JPG", "cars/DSC09931R.JPG", "cars/DSC09957R.JPG", "cars/DSC09960R.JPG"];
	/*****cool car descriptions*****/
	var coolcarsdesc = ["Chrysler New Yorker", "AMC Ambassador", "AMC Ambassador hood ornament", "Old Chevy truck grill", "Kaiser hood ornament", "Classy Duesenberg", "Duesenberg Coupe", "Duesenberg hood ornament", "1973 Opel GT side 3/4", "1973 Opel GT rear", "1973 Opel GT interior", "1973 Opel GT gauge cluster", "1973 Opel GT", "1973 Opel GT front", "Blues Brothers Bluesmobile", "Ecto 1", "Aston Martin wheel close-up", "James Bond's Aston Martin Vanquish", "Back to the Future DeLorean", "Lamborghini Diablo interior", "Lamborghini Diablo", "Michael Jordan's Bentley Continental GT", "Aston Martin DB7 Interior", "Aston Martin DB7", "Close-up of Aston Martin emblem", "Lamborghini Countach and Shelby Cobra", "Down the aisle at the Volo Auto Museum", "Porsche on the freeway", "1950s Corvette", "Packard hood ornament", "Mercedes SLS AMG", "Ferrari 458 in Greendale", "Ferrari 458 blows past Wal-Mart", "Maserati Ghibli rear 3/4", "Tesla Model S rear 3/4", "Blue Maserati Levante", "Porsche 911 driver side motion", "Porsche 911 driver side angle motion", "Porsche 911 side selected color", "Kissel Kar interior", "Kissel Kar hood ornament", "Looking over the first floor of the Wisconsin Auto Museum", "Jensen Interceptor front", "Oldsmobile Toronado", "Cadillac Fleetwood", "Cadillac grill"];
	/***************************************************************************************************************************************************************/
	/*********food**************************************************************************************************************************************************/
	var foodpics = ["food/DSC03537R.JPG", "food/DSC03944R.JPG", "food/DSC03945R.JPG", "food/DSC06208R.JPG"];
	/*****food descriptions*****/
	var fooddesc = ["Shrimp and Rice", "Raspberry truffles", "Giant cashew turtles", "Chicago style popcorn"];
	/***************************************************************************************************************************************************************/
	/*********out and about*****************************************************************************************************************************************/
	var outandaboutpics = ["out-and-about/DSC03772R.JPG", "out-and-about/DSC03927R.JPG", "out-and-about/DSC05607R.JPG", "out-and-about/DSC06239R.JPG", "out-and-about/DSC06239R_1.JPG", "out-and-about/DSC09474R.JPG", "out-and-about/DSC09533R.JPG", "out-and-about/DSC09533R_2.JPG", "out-and-about/DSC09544R.JPG"];
	/*****out and about picture descriptions*****/
	var outandaboutdesc = ["Historic Downtown Geneva, IL street signs", "Third Street in Historic Downtown Geneva, IL", "Can light at Georgie Porgie's restaurant", "Freeway interchange signs", "Freeway interchange signs B&W", "Exit for I-43", "Coffee Trader in Hartford, WI", "Coffee Trader in Hartford, WI B&W", "Downtown Hartford, WI"];
	/***************************************************************************************************************************************************************/
	/*********outdoors**********************************************************************************************************************************************/
	var outdoorspics = ["outdoors/DSC01296R.JPG", "outdoors/DSC01314R.JPG", "outdoors/DSC01329R.JPG", "outdoors/DSC03737R.JPG", "outdoors/DSC04511R.JPG", "outdoors/DSC04547R.JPG", "outdoors/DSC05047R.JPG", "outdoors/DSC05055R.JPG", "outdoors/DSC05065R.JPG", "outdoors/DSC05164R.JPG", "outdoors/DSC05225R.JPG", "outdoors/DSC05486R.JPG", "outdoors/DSC08114R-14.JPG", "outdoors/DSC08115R-15.JPG", "outdoors/DSC08147R-38.JPG", "outdoors/DSC08182R-73.JPG", "outdoors/DSC08209R-100.JPG", "outdoors/DSC08270R-153.JPG", "outdoors/DSC08961R.JPG"];
	/*****outdoors picture descriptions*****/
	var outdoorsdesc = ["Fancy fungus", "In the forest", "A view above Black River Falls", "Green and gold in Illinois", "Green field, blue sky", "Golden field", "Looks like fall", "Orange leaves", "Looking up at fall colors", "Fall railroad", "Willow tree", "Red leaves on the deck", "Top of the Wind Point Lighthouse", "Wind Point Lighthouse", "Along the lake", "Pebbles", "Rocks and waves", "Looking up at the Wind Point Lighthouse", "Aurora, IL pond"];
	/***************************************************************************************************************************************************************/
	/*********city**************************************************************************************************************************************************/
	var citypics = ["city/20170104_121454R.JPG", "city/DSC00166R.JPG", "city/DSC00243R.JPG", "city/DSC00455R.JPG", "city/DSC00455R_1.JPG", "city/DSC01795R.JPG", "city/DSC01795R_BW.JPG", "city/DSC05524R.JPG", "city/DSC09234R_1.JPG"];
	/*****city picture descriptions*****/
	var citydesc = ["Downtown Milwaukee office building", "O'Hare at golden hour", "Chicago skyline", "Drexel Town Square", "Drexel Town Square B&W", "Chicago", "Chicago B&W", "Naperville office building", "Allstate office building"];
	/***************************************************************************************************************************************************************/
	
	/*SET PICTURES ON PHOTO PAGES***********************************************************************************************************************************/
	populate("16autoshowgallery", autoshow16pics, autoshow16desc, "autoshow16");
	populate("17autoshowgallery", autoshow17pics, autoshow17desc, "autoshow17");
	populate("coolcarsgallery", coolcarspics, coolcarsdesc, "coolcars");
	populate("foodgallery", foodpics, fooddesc, "food");
	populate("outgallery", outandaboutpics, outandaboutdesc, "out");
	populate("outdoorsgallery", outdoorspics, outdoorsdesc, "outdoors");
	populate("citygallery", citypics, citydesc, "city");
	/***************************************************************************************************************************************************************/
	
	/*LOGIC*********************************************************************************************************************************************************/
	function populate(divName, pics, descriptions, item){
		for(var i=0; i<pics.length; i++){
			$("#" + divName).append('<div class="photocontainer"><img src="images/' + pics[i] + '" alt="' + descriptions[i] + '"><p class="title">' + descriptions[i] + '</p><div class="overlay"></div><form name="cartInput" id="cartInput" method="get" action="stefanski-pics-cart.html"><input type="hidden" name="photocat" id="photocat" value="' + item + '"><input type="hidden" name="photonum" id="photonum" value="' + i + '"><input class="cartbutton" id="add' + "|" + item + "|" + i + '" type="submit" value="ADD TO CART"></form></div>');
		}
	}
	
	var cartItems = [];
	var cookies = [];
	
	$(".cartbutton").click(function(e){
		var photoID = ($(this).attr('id'));
		Cookie.setCookie("addphoto", photoID);
		cookies.push(Cookie.getCookie("addphoto"));
		var temp = photoID.split("|");
		var photo = {
			category: temp[1],
			number: temp[2]
		};
		cartItems.push(photo);
		$(this).css("backgroundColor", "green");
		$(this).val("IN CART");
		return false;
	});
	
	function getNumCartItems(){
		return cartItems.length;
	}
	
	function cartItem(item){
		var temp = item.split("|");
		var category = temp[1];
		var num = temp[2];
		var description = "";
		
		if(category == "autoshow16"){
			description = autoshow16desc[num];
		} else if(category === "autoshow17"){
			description = autoshow17desc[num];
		} else if(category === "coolcars"){
			description = coolcarsdesc[num];
		} else if(category === "food"){
			description = fooddesc[num];
		} else if(category === "out"){
			description = outandaboutdesc[num];
		} else if(category === "outdoors"){
			description = outdoorsdesc[num];
		} else if(category === "city"){
			description = citydesc[num];
		}
		return category.toUpperCase() + " #" + num + " | " + description;
	}
	
	function preview(item){
		var temp = item.split("|");
		var category = temp[1];
		var num = temp[2];
		var previewimg = "";
		
		if(category == "autoshow16"){
			previewimg = autoshow16pics[num];
		} else if(category == "autoshow17"){
			previewimg = autoshow17pics[num];
		} else if(category == "coolcars"){
			previewimg = coolcarspics[num];
		} else if(category == "food"){
			previewimg = foodpics[num];
		} else if(category == "out"){
			previewimg = outandaboutpics[num];
		} else if(category == "outdoors"){
			previewimg = outdoorspics[num];
		} else if(category == "city"){
			previewimg = citypics[num];
		}
		return previewimg;
	}
	/***************************************************************************************************************************************************************/
	
	/*CART**********************************************************************************************************************************************************/
	$("#goToCart").hide();
	
	$("#commit").click(function(e){
		Cookie.setCookie("theCart", cartItems);
		Cookie.setCookie("theCookies", cookies);
		$("#goToCart").show();
	});
	
	var cartfromcookie = Cookie.getCookie("theCookies").split(",");
	var cartArray = [];
	for(var i=0; i<cartfromcookie.length; i++){
		cartArray.push(cartfromcookie[i]);
	}
	
	for(var i=0; i<cartArray.length; i++){
		$("#cartItems").append('<tr><td>' + cartItem(cartArray[i]) + '</td><td><a href="images/' + preview(cartArray[i]) + '"><img src="images/' + preview(cartArray[i]) + '" alt="preview" height=50px width=auto></a></td><td><form id="size' + i + '"><label><input type="radio" name="options' + i + '" value="4x6"> 4" x 6"</label><br><label><input type="radio" name="options' + i + '" value="5x7"> 5" x 7"</label><br><label><input type="radio" name="options' + i + '" value="11x14"> 11" x 14"</label><br><label><input type="radio" name="options' + i + '" value="20x30"> 20" x 30"</label><br></form></td><td><form id="framing' + i + '"><label><input type="radio" name="framing' + i + '" value="frame"> Frame</label><br><label><input type="radio" name="framing' + i + '" value="noframe"> No Frame</label><br><label><input type="radio" name="framing' + i + '" value="glass"> Print on Glass</label><br></form></td><td><form><label><input type="number" min=1 max=500 name="qty' + i + '"></label></form></td></tr>');
	}
	
	var checkoutItems = [];
	var proceed = true;
	
	$("#checkoutBtn").click(function(e){
		
		if($("#name").val() != null || $("#name").val().length > 0){
			Cookie.setCookie("name", $("#name").val());
			proceed = true;
		} else {
			proceed = false;
			alert("Must enter valid name");
		}
		
		if($("#email").val() != null || $("#email").val().length > 0){
			Cookie.setCookie("email", $("#email").val());
			proceed = true;
		} else {
			proceed = false;
			alert("Must enter valid email");
		}
		
		if($("#address").val() != null || $("#address").val().length > 0){
			Cookie.setCookie("address", $("#address").val());
			proceed = true;
		} else {
			proceed = false;
			alert("Must enter valid address");
		}
		
		if($("#city").val() != null || $("#city").val().length > 0){
			Cookie.setCookie("city", $("#city").val());
			proceed = true;
		} else {
			proceed = false;
			alert("Must enter valid city");
		}
		
		if($("#state").val() != null && $("#state").val().length == 2){
			Cookie.setCookie("state", $("#state").val());
			proceed = true;
		} else {
			proceed = false;
			alert("Must enter valid state abbreviation (2 letters)");
		}
		
		if($("#zip").val() != null && $("#zip").val().length == 5){
			Cookie.setCookie("zip", $("#zip").val());
			proceed = true;
		} else {
			proceed = false;
			alert("Must enter valid 5-digit zip code");
		}
		
		if($("#card").val() != null && ($("#card").val().length >= 5 && $("#card").val().length <= 19)){
			Cookie.setCookie("card", $("#card").val());
			proceed = true;
		} else {
			proceed = false;
			alert("Must enter valid card number (usually 16 digits, must be at least 8 but no more than 19)");
		}
		
		if($("#cvv").val() != null && $("#cvv").val().length == 3){
			Cookie.setCookie("cvv", $("#cvv").val());
			proceed = true;
		} else {
			proceed = false;
			alert("Must enter valid 3-digit cvv (security code on back of card)");
		}
		
		for(var i=0; i<cartArray.length; i++){
			var checkoutString =  $("input[name='options" + i + "']:checked").val() + "|" + $("input[name='framing" + i + "']:checked").val() + "|" + $("input[type=number][name=qty" + i + "]").val();
			checkoutItems.push(checkoutString);
			calcPrices();
		}
		
		continueOrder();
	});
	
	function continueOrder(){
		if(proceed){			
			reviewOrder();
			clearCookies();
		}
	}
	
	var prices = [];
	var price = 5.79;
	
	function calcPrices(){
		for(var i=0; i<checkoutItems.length; i++){
			var details = checkoutItems[i].split("|");
			
			price = 5.79;
			sizePrices(details);
			framePrices(details);			
			
			var q = details[2];
			price = price * q;
		}
		prices.push(price);
		console.log(prices);
	}
	
	function sizePrices(details){
		if(details[0] == "4x6"){
			price += 0;
		}
		else if(details[0] == "5x7"){
			price += .75;
		}
		else if(details[0] == "11x14"){
			price += 1.79;
		}
		else if(details[0] == "20x30"){
			price += 3.85;
		}
	}
	
	function framePrices(details){
		if(details[1] == "frame"){
			price += 1.15;
		}
		else if (details[1] == "glass"){
			price += 5.97;
		}
	}
	
	function reviewOrder(){
		$("#orderdiv").html("<div id='ordercontent'></div>");
		$("#ordercontent").append("<h2>Order for " + Cookie.getCookie("name") + "</h2>");
		$("#ordercontent").append("<h2>" + Cookie.getCookie("email") + "</h2>");
		$("#ordercontent").append("<br>");
		for(var i=0; i<checkoutItems.length; i++){
			var details = checkoutItems[i].split("|");
			$("#ordercontent").append("<p>" + cartItem(cartArray[i]) + "| Size: " + details[0] + " Frame Choice: " + details[1] + " Quantity: " + details[2] + " Price: $" + prices[i].toFixed(2) + "</p>");
		}
		
		var total = 0.00;
		for(var i=0; i<prices.length; i++){
			total += prices[i];
		}
		
		$("#ordercontent").append("<h2>TOTAL: $" + total.toFixed(2));
		$("#ordercontent").append("<hr>");
		$("#ordercontent").append("<p>" + Cookie.getCookie("address") + "</p>")
		$("#ordercontent").append("<p>" + Cookie.getCookie("city") + ", " + Cookie.getCookie("state") + "  " + Cookie.getCookie("zip"));
		$("#ordercontent").append("<br>");
		$("#ordercontent").append("<h2> Order Number: " + Math.floor((Math.random() * 1000000) + 1) + "</h2>");
		$("#ordercontent").append("<br>");
		$("#ordercontent").append("<h2>Paid with card ending in: " + Cookie.getCookie("card").substring(Cookie.getCookie("card").length-4, Cookie.getCookie("card").length) + "</h2>");
	}
	
	function clearCookies(){
		Cookie.setCookie("theCart", null);
		Cookie.setCookie("theCookies", null);
	}
	/***************************************************************************************************************************************************************/
});