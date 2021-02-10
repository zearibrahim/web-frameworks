<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>My Page</title>
		<script src="https://code.jquery.com/jquery-1.10.2.js" type="text/javascript"></script>
		<script src="post.js" type="text/javascript"></script>
	</head>
	
	<body>	
		<form id="form1">
			<label>Username</label>
			<input name = "uname" type="text" class="input">
		
			<label>Password</label>
			<input name = "pwd" type="password" class="input" data-type="password">
			
			<input id = "submit_btn" type="submit" value="Sign In" class="button"/>
			<p id ="result"> </p>
		</form>
	</body>
</html>



