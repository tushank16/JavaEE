<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddServlet">
<fieldset>
<legend align="center">Add Product</legend>
Product Name  		:<input type="text" name="pname" placeholder="Product Name" required><br><br>
Product Quantity	:<input type="number" name="qty" placeholder="Product Quantity" required><br><br>
Product Price		:<input type="number" name="price" placeholder="Product Price" required><br><br>

<input type="submit" value="Add Product">
</fieldset>
</form>
</body>
</html>