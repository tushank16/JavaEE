<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Entry</title>
<style>
	.error
	{
		color:red;
	}
</style>
</head>
<body>
<h1>Add New Student</h1> 
<form:form method="post" modelAttribute="mylogin">
Student Name:<form:errors path="uname" cssClass="error"/><br>
<form:input path="uname"/> <br><br>
Age:<form:errors path="password" cssClass="error"/><br><br>
<form:input path="password"/><br><br>
<br><br>
<input type=submit value="Login"/>
</form:form>	
</body>
</html>
