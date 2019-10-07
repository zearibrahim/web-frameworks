<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>My Page</title>
		<script src="https://code.jquery.com/jquery-1.10.2.js" type="text/javascript"></script>
		<script src="PostDataToServlet.js" type="text/javascript"></script>
		<link rel="stylesheet" type="text/css" href="style.css">
	</head>
	
	<body>

		
		<div class="login-wrap">
			<div class="login-html">
				<label class="tab" class = "sign-in">Sign In</label>
				
				<form id="userInputForm" class="login-form">
					<div class="sign-in-htm">
					
						<div class="group">
							<label class="label">Username</label>
							<input name = "username" type="text" class="input">
						</div>
						
						<div class="group">
							<label class="label">Password</label>
							<input name = "password" type="password" class="input" data-type="password">
						</div>
						
						<div class="group">
							<input id = "submitButton" type="submit" value="Sign In" class="button"/>
						</div>
						
						<div class="hr"></div>
						<div class="foot-lnk" id ="AjaxServletResponse"> </div>
					</div>
				</form>
			</div>
		</div>
	</body>
</html>



