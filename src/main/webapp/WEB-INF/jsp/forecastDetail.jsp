<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<h2>Your 5 day forecast!!!</h2>

<div class="forecast">

	
<table class="table">
	<tr class="row">
		<td></td>
		<td class="bottomborder"><strong>Day</strong></td>
		<td class="bottomborder"><strong>Low</strong></td>
		<td class="bottomborder"><strong>High</strong></td>
		<td class="bottomborder"><strong>Forecast</strong></td>
		<td class="bottomborder"><strong>Recommendations</strong></td>
	</tr>
<c:forEach var="forecast" items="${forecastList}">
<tr>
	
	<c:choose>
		<c:when test="${forecast.forecast == 'partly cloudy'}">
			<c:url var="weatherPicture" value="img/weather/partlyCloudy.png" />
		</c:when>
		<c:otherwise>
			<c:url var="weatherPicture" value="img/weather/${forecast.forecast}.png" />
		</c:otherwise>
	</c:choose>
	<td><img class="weatherpictures" src="${weatherPicture}"/></td>
	<td class= "leftborder"><span id="dayNum"><c:out value="${forecast.fiveDayForecastValue}" /></span></td>
	<c:choose>
		<c:when test = "${tempUnit=='farenheit'}">
			<td><span id="low"><c:out value="${forecast.low}" /></span></td>
			<td><span id="high"> <c:out value="${forecast.high}" /></span></td>
		</c:when>
		<c:otherwise>
			<td><span id="clow"><fmt:formatNumber type="number" 
            maxFractionDigits="2" value="${(forecast.low-32)*5/9}" /></span></td>
			<td><span id="chigh"><fmt:formatNumber type="number" 
            maxFractionDigits="2" value="${(forecast.high-32)*5/9}" /></span></td>
		</c:otherwise>
	
	</c:choose>
	<ul>
	<td><span id="forecast"><c:out value="${forecast.forecast}" /></span></td>
	<td><c:if test="${forecast.high>75}">
		<li>-Bring an extra gallon of water</li>
	</c:if>
	<c:if test="${forecast.high-forecast.low > 20}">
		<li id="rec1">-Wear breathable layers</li>
	</c:if>
	<c:if test="${forecast.low<20}">
		<li>-Don't freeze!!!!</li>
	</c:if>
	<c:if test="${forecast.forecast=='snow'}">
		<li>-Pack snowshoes</li>
	</c:if>
	<c:if test="${forecast.forecast=='rain'}">
		<li id="rec2">-Pack rain gear and wear waterproof shoes</li>
	</c:if>
	<c:if test="${forecast.forecast=='thunderstorms'}">
		<li>-Seek shelter and avoid hiking on exposed ridges</li>
	</c:if>
	<c:if test="${forecast.forecast=='sun'}">
		<li>-Pack sunblock</li>
	</c:if>
	</ul>
	</td>
</tr>
</c:forEach>
</table>

<form method="GET" action="${formAction}" id="forecastSubmit">
	<div class = "formInputGroup">

		<c:choose>
			<c:when test="${tempUnit=='farenheit'}">
				<input type = "hidden" name="tempUnit" value="celsius"/>
				<input class = "buttoncolors" type="submit" value="Change to Celsius" id = "button"/>
			</c:when>
			<c:otherwise>
				<input type = "hidden" name="tempUnit" value="farenheit"/>
				<input class = "buttoncolors" type="submit" value="Change to Farenheit"/>
			</c:otherwise>
		</c:choose>
	<input type = "hidden" name="parkCode" value="${param.parkCode}"/>
	</div>
</form>
</div>