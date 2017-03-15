<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />



<div class="park">
		<div>
			<c:url var="parkPicture" value="img/parks/${park.parkCode}.jpg"/>
		 	<img src="${parkPicture}" />
		</div>
	<h4>
		<c:out value="${park.parkName} - " /><c:out value="${park.state}" />
	</h4>

	<h6>Description: <c:out value="${park.parkDescription}" /></h6><br>
	<h6>Acreage: <c:out value="${park.acreage}" /></h6><br>
	<h6>Annual Visitors: <c:out value="${park.annualVisitorCount}" /></h6><br>
	<h6>Climate: <c:out value="${park.climate}" /></h6><br>
	<h6>Elevation: <c:out value="${park.elevationInFeet}" /></h6><br>
	<h6>Entry Fee: <c:out value="${park.entryFee}" /></h6><br>
	<h6>Inspirational Quote by <c:out value="${park.inspirationalQuoteSource}" />: <c:out value="${park.inspirationalQuote}" /></h6><br>
	<h6>Miles of trail: <c:out value="${park.milesOfTrail}" /></h6><br>
	<h6>Animal Species: <c:out value="${park.numberOfAnimalSpecies}" /></h6><br>
	<h6>Campsite Count: <c:out value="${park.numberOfCampsites}" /></h6><br>
	<h6>Year Founded: <c:out value="${park.yearFounded}" /></h6><br>
	
	<c:url var="forecast" value="/forecastDetail">
		<c:param name="parkCode" value="${park.parkCode}" />
	
	</c:url>
	<c:url var="formAction" value="/forecastDetail"></c:url>
	
	
	<h6><a href="${forecast}">Click Here</a></h6><h6>For <c:out value="${park.parkName} - " /> 5 Day forecast!!!!!! </h6>
	
</div>
