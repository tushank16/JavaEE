<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Person</title>
</head>
<body>
welcome to View jsp <br>
<h2>Person Details</h2>

<%=request.getAttribute("Person") %>
<br>

<br><br>
<h2>Person Details</h2>

	<table border="1">
	<tr>
		<th align="left">Name</th>
		<th align="left">Address</th>
		<th align="left">Age</th>
		
	</tr>
		<tr>
			<td> ${Person.name}</td>
			<td> ${Person.address}</td>
			<td> ${Person.age}</td>	
		</tr>
	</table>
	<br><br><br>
	<a href="person.do">Add new person</a>
</body>
</html>
