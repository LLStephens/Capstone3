
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value = "Survey Input" />
</c:import>

<h2>Take the survey</h2>

<c:url var="formAction" value="/surveyInput"></c:url>
<form method="POST" action="${formAction}">
	<div class = "formInputGroup">
		<label for="park">Favorite park:</label>
		<select name="parkCode" id="park">
			<option value ="CVNP">Cuyahoga Valley National Park</option>
			<option value ="ENP">Everglades National Park</option>
			<option value ="GCNP">Grand Canyon National Park</option>
			<option value ="GNP">Glacier National Park</option>
			<option value ="GSMNP">Great Smokey Mountains National Park</option>
			<option value ="GTNP">Grand Teton National Park</option>
			<option value ="MRNP">Mount Rainier National Park</option>
			<option value ="RMNP">Rocky Mountain National Park</option>
			<option value ="YNP">Yellowstone National Park</option>
			<option value ="YNP2">Yosemite National Park</option>
		</select>
	</div>
	<div class = "formInputGroup">
		<label for="email">E-mail address:</label>
		<input type="text" name= "emailAddress" id="email"/>
	</div>
	<div class = "formInputGroup">
		<label for="state">State:</label>
		<input type="text" name= "state" id="state"/>
	</div>
	<div class = "formInputGroup">
		<label for="activity">Activity level:</label>
		<select name="activityLevel" id="activity">
			<option value ="inactive">Inactive</option>
			<option value ="sedentary">Sedentary</option>
			<option value ="active">Active</option>
			<option value ="extremelyActive">Extremely Active</option>
		</select>
	</div>
	<input class="formSubmitButton" type="submit" value="Submit" id="submit" />
</form>
