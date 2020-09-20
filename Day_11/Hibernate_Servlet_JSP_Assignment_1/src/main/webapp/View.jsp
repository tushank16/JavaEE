<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Products</title>
</head>
<body>
<%@ page isELIgnored = "false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h2> Records in the Database</h2>
<table>
<tr>
	<th>Product Id </th>
    <th>Name</th>
    <th>Quantity</th>
    <th>Price</th>
 </tr> 
 </table>
<table>
<c:forEach var="str" items="${record}">


<tr>  
<td>${str.pid}</td>
<td>${str.pname}</td>
<td>${str.qty}</td>
<td>${str.price}</td>
</tr>

</c:forEach>
</table>
<br> <br>
<a href="Home.jsp">Home</a>

</body>
</html>