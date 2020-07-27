<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="color: red">${errorMessage }</div>
<form:from modelAttribute="info">
	<!--  메일주소: <input type="text" name="email" value="${info.email }"><br> -->
	메일주소: <form:input type="text" path="email" value="${info.email}" ></form:input><br>
	<form:errors path="email"></form:errors>
	
	비밀번호: <input type="password" name="pass" value="${info.pass }"><br>
	<form:errors path="pass"></form:errors>
	비밀번호확인: <input type="password" name="passConfirm" value="${info.passConfirm }"><br>
	<form:errors path="passConfirm"></form:errors>
	회원이름: <input type="text" name="nick" value="${info.nick }"><br>
	<form:errors path="nick"></form:errors>
	<button>등록하기</button>
</form:from>
</body>
</html>