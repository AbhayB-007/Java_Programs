<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h3 {
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
	<h3>Submission Form</h3>
	<!-- action attribuite consists the mapping phrase on which we redirect after submit -->
	<form method="post" action="details">
		Customer Id : <input type="text" name="cid"><br> Customer
		Name : <input type="text" name="cname"><br> Customer
		Email ID : <input type="text" name="cemail"><br> <input
			type="submit" value="Submit"><br>
	</form>
</body>
</html>