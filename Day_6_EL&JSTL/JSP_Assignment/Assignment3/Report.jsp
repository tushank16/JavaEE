<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Report</title>
</head>
<body>
<h2>Roll no of students</h2>
<%@page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored = "false" %>

<% 	ArrayList<Integer> arr=(ArrayList)request.getAttribute("record"); %>
	<c:forEach var="x" items="<%=arr%>">
	${x} <br> 
	</c:forEach>
</body>
</html>