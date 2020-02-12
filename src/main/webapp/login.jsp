<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="login">

	<h4>Enter Your ID:-<input type="text" name="id"><br></h4>
	<form:errors path="username" cssClass="text-danger"/>
	<input type="submit"><br>
	<br>
	<br>
	NewUser?<a href="Register.jsp">Register here</a>
</form>
</body>
</html>