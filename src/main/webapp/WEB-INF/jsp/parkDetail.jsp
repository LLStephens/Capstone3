<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />



<div class="park">
		<div>
			<c:url var="parkPicture" value="img/parks/${park.parkCode}.jpg"/>
		 	<img src="${parkPicture}" />
		</div>
	<h4>
		<span id="name"><c:out value="${park.parkName} - " /></span><span id="state"><c:out value="${park.state}" /></span>
	</h4>

	<h6>Description: <span id="description"><c:out value="${park.parkDescription}" /></span></h6><br>
	<h6>Acreage: <span id="acreage"><c:out value="${park.acreage}" /></span></h6><br>
	<h6>Annual Visitors: <span id = "visitors"><c:out value="${park.annualVisitorCount}" /></span></h6><br>
	<h6>Climate: <span id="climate"><c:out value="${park.climate}" /></span></h6><br>
	<h6>Elevation: <span id="elevation"><c:out value="${park.elevationInFeet}" /></span></h6><br>
	<h6>Entry Fee: <span id="fee" ><c:out value="${park.entryFee}" /></span></h6><br>
	<h6>Inspirational Quote by <span id="source"><c:out value="${park.inspirationalQuoteSource}" /></span>: <span id="quote"><c:out value="${park.inspirationalQuote}" /></span></h6><br>
	<h6>Miles of trail: <span id = "miles"><c:out value="${park.milesOfTrail}" /></span></h6><br>
	<h6>Animal Species: <span id= "species"><c:out value="${park.numberOfAnimalSpecies}" /></span></h6><br>
	<h6>Campsite Count: <span id="campsites"><c:out value="${park.numberOfCampsites}" /></span></h6><br>
	<h6>Year Founded: <span id="year"><c:out value="${park.yearFounded}" /></span></h6><br>
	
	<c:url var="forecast" value="/forecastDetail">
		<c:param name="parkCode" value="${park.parkCode}" />
	
	</c:url>
	<c:url var="formAction" value="/forecastDetail"></c:url>
	
	<h6><a href="${forecast}"><span id="forecastLink">Click Here</span></a></h6><h6>For <c:out value="${park.parkName} - " /> 5 Day forecast!!!!!! </h6>
	
</div>
