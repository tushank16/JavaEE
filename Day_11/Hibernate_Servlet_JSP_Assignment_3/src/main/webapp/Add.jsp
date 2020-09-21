<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
<h2>Enter Details</h2>
<form action="AddServlet">
<fieldset>
<legend align="top">
Student</legend>
Enter student name:<input type="text" name="name" placeholder="Enter Name" required><br><br><br>
Enter student address:<input type="text" name="address" placeholder="Enter Address" required><br><br><br>
Select persistence store:<select name="persistence" >
  <option value="file">File</option>
  <option value="database">Database</option>
  </select><br><br><br>
<input type="submit">
</fieldset>

</form>

</body>
</html>