<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expense Report</title>
</head>
<body>
	<%@ include file="Navigation.jsp" %>
	<fieldset>
		<legend>Expense Report</legend>
		<c:forEach items="${allExpenses}" var="expense">
			<p><span><b>Title: </b>${expense.title}, </span><span><b>Expense Category: </b>${expense.expenseCategory.expenseCategoryName} </span></p>
		</c:forEach>
	</fieldset>
</body>
</html>