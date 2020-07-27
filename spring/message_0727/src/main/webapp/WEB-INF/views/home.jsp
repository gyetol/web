<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<meta charset="utf-8">
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<spring:message code="title"></spring:message><hr>
<spring:message code="label.email"></spring:message> <input type="text">
<button><spring:message code="label.send"></spring:message></button>
</body>
</html>
