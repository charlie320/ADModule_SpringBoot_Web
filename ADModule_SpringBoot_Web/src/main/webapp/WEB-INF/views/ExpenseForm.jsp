<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expense Form</title>
</head>
<body>
	<h1>Expense Form</h1>
	<%@ include file="Navigation.jsp" %>
	<form:form action="${pageContext.request.contextPath }/createExpense"
		method="post" modelAttribute="newExpense">
		<fieldset>
			<legend>Create Expense</legend>
			<div>
				<label for="title">Title</label>
				<div>
					<form:input path="title" />
					<p>
						<form:errors path="title" class="error" />
					</p>
				</div>
			</div>

			<div>
				<label for="date">Date</label>
				<div>
					<form:input path="date" type="date" />
					<p>
						<form:errors path="date" class="error" />
					</p>
				</div>
			</div>
			<div>
				<label for="amount">Amount</label>
				<div>
					<form:input path="amount" type="number" />
					<p>
						<form:errors path="amount" class="error" />
					</p>
				</div>
			</div>
 			<div>
				<label for="expenseCategory">Expense Category</label>
				<div>
					<form:select path="expenseCategory.expenseCategoryId" items="${expenseCategories}"
						itemLabel="expenseCategoryName" itemValue="expenseCategoryId" />
					<p>
						<form:errors path="expenseCategory" class="error" />
					</p>
				</div>
			</div>
			<input type="submit" value="Create Expense">
		</fieldset>
	</form:form>
</body>
</html>