<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New User Form</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<h1>New User Form</h1>
	<form:form action="${pageContext.request.contextPath }/createUser" 
		method="post" modelAttribute="newUser">
		<fieldset>
			<legend>Register</legend>
			<div>
				<label for="name">Name</label>
				<div>
					<form:input path="name"/>
					<p><form:errors path="name" class="error"/></p>
				</div>
			</div>

			<div>
				<label for="email">Email</label>
				<div>
					<form:input path="email"/>
					<p><form:errors path="email" class="error" /></p>
				</div>
			</div>
			<div>
				<label for="password">Password</label>
				<div>
					<form:input path="password"/>
					<p><form:errors path="password" class="error" /></p>
				</div>
			</div>
			<input type="submit" value="Register">
		</fieldset>
	</form:form>
	<a href="${pageContext.request.contextPath}/">Cancel</a>
</body>
</html>