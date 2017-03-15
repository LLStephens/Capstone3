<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="Survey Results" />
</c:import>

<h2>The most popular park is:</h2>

<div class="surveyResults">

	<div class="surveyResult">
		 <p><c:out value="${result.parkCode}" /></p>
		 <p>With a total of <c:out value="${result.votes}" /> votes!!!!!!!</p>
		 <c:url var="parkPicture" value="img/parks/${result.parkCode}.jpg"/>
		 <img src="${parkPicture}" />
	 </div>

</div>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />