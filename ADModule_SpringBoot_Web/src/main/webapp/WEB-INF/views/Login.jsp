<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<h1>Login Page</h1>
	<form action="${pageContext.request.contextPath}/loginUser"
		method="post">
		<div>
			<label>Email:</label> <input type="text" name="email" />
		</div>
		<div>
			<label>Password:</label> <input type="text" name="password" />
		</div>
		<div>
			<input type="submit" value="Login" />
		</div>
	</form>
	<a href="${pageContext.request.contextPath}/newUserForm">Register Here</a>
</body>
</html>