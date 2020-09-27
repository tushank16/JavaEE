<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>
</head>
<body>
<!-- Searching th! -->
<h1>Search By location</h1>
<form action="dept.do" method="post">
	<h1>Enter Location : <input type="text" name="loc"><br></h1>
	<h1><input type="submit" value="Search"></h1>
	</form>

<h1>Following is the list</h1>
	<table border="1">
	<tr>
		<th align="left">Dept No.</th>
		<th align="left">Name</th>
		<th align="left">Location</th>
	</tr>
	<c:forEach var="dept"  items="${mylist}">
		<tr>
			<td> ${dept.deptno}</td>
			<td> ${dept.dname}</td>
			<td> ${dept.loc}</td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>