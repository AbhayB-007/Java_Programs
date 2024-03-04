<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
h1 {
	text-align: center;
}

form {
	padding: 10px;
	border: 2px solid black;
	border-radius: 10px;
	margin: auto;
}

input {
	margin: 10px;
}
</style>

</head>
<body>

	<h1>All Employee Details</h1>

	<table>
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Dept Id</th>
		</tr>
		<c:forEach items="${list}" var="i">
			<tr>
				<td><input type="text" name="name" value=${i.empId}></td>
				<td><input type="text" name="lastname" value=${i.empName}></td>
				<td><input type="text" name="password" value=${i.empDeptId}></td>
				<td><a href="">UPDATE</a></td>
				<td><a href="">DELETE</a></td>
			</tr>

		</c:forEach>
	</table>

</body>
</html>