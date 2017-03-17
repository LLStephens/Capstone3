<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />



<div class="park">
		<div>
			<c:url var="parkPicture" value="img/parks/${park.parkCode}.jpg"/>
		 	<img src="${parkPicture}" />
		</div>
	<p>
		<strong><span id="name"><c:out value="${park.parkName} - " /></span><span id="state"><c:out value="${park.state}" /></span> </strong>
	</p>

	<div class="centered" >
	
		<p id="descriptionJustified"><span id="description" ><c:out value="${park.parkDescription}" /></span></p><br>
		
		<hr id="spannerDetails"></hr>
		
		<p class="paragraphstuff">By <span id="source"><c:out value="${park.inspirationalQuoteSource}" /></span></p>
		<p id= "descriptionJustified"> <span id="quote"><c:out value="${park.inspirationalQuote}" /></span></p><br>
		
		<hr id="spannerDetails"></hr>
		
		<p class="paragraphstuff">Acreage: <span id="acreage"><c:out value="${park.acreage}" /></span></p><br>
		<p class="paragraphstuff">Annual Visitors: <span id = "visitors"><c:out value="${park.annualVisitorCount}" /></span></p><br>
		<p class="paragraphstuff">Climate: <span id="climate"><c:out value="${park.climate}" /></span></p><br>
		<p class="paragraphstuff">Elevation: <span id="elevation"><c:out value="${park.elevationInFeet}" /></span></p><br>
		<p class="paragraphstuff">Entry Fee: <span id="fee" ><c:out value="${park.entryFee}" /></span></p><br>
		<p class="paragraphstuff">Miles of trail: <span id = "miles"><c:out value="${park.milesOfTrail}" /></span></p><br>
		<p class="paragraphstuff">Animal Species: <span id= "species"><c:out value="${park.numberOfAnimalSpecies}" /></span></p><br>
		<p class="paragraphstuff">Campsite Count: <span id="campsites"><c:out value="${park.numberOfCampsites}" /></span></p><br>
		<p class="paragraphstuff">Year Founded: <span id="year"><c:out value="${park.yearFounded}" /></span></p><br>
		
		<hr id="spannerDetails"></hr>
		
	</div>
	
	
	
	<c:url var="forecast" value="/forecastDetail">
		<c:param name="parkCode" value="${park.parkCode}" />
	
	</c:url>
	<c:url var="formAction" value="/forecastDetail"></c:url>
	
	<p ><a href="${forecast}" id="clock" class="submitBox"><span id="forecastLink">Click here for the 5 day forecast!</span></a></p>
	
</div>
