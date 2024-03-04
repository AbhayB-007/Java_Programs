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

div {
	padding: 10px;
	border: 2px solid black;
	border-radius: 10px;
	margin: auto;
}

p {
	margin: 10px;
}
</style>
</head>
<body>
	<h3>View Customer Details</h3>
	<div>
		<p>Details as submitted as follows:</p>
		<p>${ customers }</p>
		<p>Customer Id : ${ customers.cid }</p>
		<p>Customer Name : ${ customers.cname }</p>
		<p>Customer Email Id : ${ customers.cemail }</p>
	</div>
</body>
</html>