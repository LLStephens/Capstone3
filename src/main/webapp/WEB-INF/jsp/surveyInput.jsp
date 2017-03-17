
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value = "Survey Input" />
</c:import>

<h2>Take the survey</h2>

<c:url var="formAction" value="/surveyInput"></c:url>
<form method="POST" action="${formAction}" id="entryForm">
	<div class = "formInputGroup">
		<label for="park">Please select your favorite park</label><br>
		
		<hr id="spannerSurvey"></hr>
		
		<select name="parkCode" id="park" class="inputMargin">
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
		<label for="email">Enter your email address</label><br>
		
		<hr id="spannerSurvey"></hr>
		
		<input type="text" name= "emailAddress" id="email" class="inputMargin"/>
	</div>
	<div class = "formInputGroup">
		<label for="state">Please enter your state of residence</label><br>
		
		<hr id="spannerSurvey"></hr>
		
		<input type="text" name= "state" id="state" class="inputMargin"/>
	</div>
	<div class = "formInputGroup">
		<label for="activity">How active are you? (be honest)</label><br>
		
		<hr id="spannerSurvey"></hr>
		
		<select name="activityLevel" id="activity" class="inputMargin">
			<option value ="inactive">Inactive</option>
			<option value ="sedentary">Sedentary</option>
			<option value ="active">Active</option>
			<option value ="extremelyActive">Extremely Active</option>
		</select>
	</div>
	<input class="formSubmitButton" type="submit" value="Submit and see results" id="submit" />
</form>
