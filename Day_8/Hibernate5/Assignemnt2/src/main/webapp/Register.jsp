<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<!--  name,address,email,login,password	-->
 <form action="RegisterServ" method="post">
 <fieldset>
 	<label for="name">Name:</label>
 	<input type="text" id="name" name="name"><br>
 	<label for="address">Address:</label>
 	<input type="text" id="address" name="address"><br>
 	<label for="email">Email-id :</label>
 	<input type="text" id="email" name="email"><br>
 	<label for="login">login Name:</label>
 	<input type="text" id="login" name="login"><br>
 	<label for="password">Password :</label>
 	<input type="text" id="password" name="password"><br>
 	<input type="submit">
</fieldset>
 </form> 
</body>
</html>