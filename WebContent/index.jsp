<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>My Page</title>
		<script src="https://code.jquery.com/jquery-1.10.2.js" type="text/javascript"></script>
		<script src="PostDataToServlet.js" type="text/javascript"></script>
	</head>
	
	<body>
	<form name="userInput" id="userInputForm">
		<table>
			<tr>
				<td>First Name</td><td><input type="text" name="firstName"/></td>
			</tr>
			<tr>
				<td>Last Name</td><td><input type="text" name="lastName"/></td>
			</tr>
			<tr>
				<td></td><td><input id = "submitButton" type="submit" value="Submit"/></td>
			</tr>
			<tr>
				<td>Result</td><td><div id ="AjaxServletResponse">  </div> </td>
			</tr>
		</table>
	</form>
</html>



