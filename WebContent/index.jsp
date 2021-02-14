<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>  
	<head>  
		<meta charset="ISO-8859-1">  
		<title>Home page / Login</title>  
	</head>  
	<body>  
	  
	<form action="Login" method = "post">  
		<label>Name </label><input type="text" name="uname">
		<label>Password </label><input type="text" name="pwd">
		<p style = "color:red"><%= request.getAttribute("error") == null ? "" : request.getAttribute("error") %></p>   
		<input type="submit" value="Send">  
	</form>  
	</body>  
</html> 