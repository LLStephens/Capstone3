<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<meta name="viewport" content="width=device-width" />
<title>National Parks</title>
<link rel="stylesheet" href="site.css" />
</head>
<body>
	<header>
		<h1>National Parks</h1>
	</header>
	<nav>
		<ul>
			<c:url var="homeHref" value="/" />
			<li><a href="${homeHref}">Home</a></li>
			<c:url var="surveyInputHref" value="/surveyInput" />
			<li><a href="${surveyInputHref}">Take Survey</a></li>

		</ul>

	</nav>
	<section id="main-content">

