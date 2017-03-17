<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="Survey Results" />
</c:import>

<div class="surveyResults">
	<div class="surveyResult">
	<c:url var="parkPicture" value="img/parks/${result.parkCode}.jpg"/>
		 <img src="${parkPicture}" />
		 <p id="surveyResult"><c:out value="${park.parkName}" /><br>
		 Voted best national park with <c:out value="${result.votes}" /> votes!!!!!!!</p>
		 
	 </div>

</div>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />