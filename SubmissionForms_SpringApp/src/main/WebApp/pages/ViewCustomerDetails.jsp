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
		<%--<p>Details are submitted as follows:</p>
		<p>Customer ID : ${cid}</p>
		<p>Customer Name : ${cname}</p>
		<p>Customer Email ID : ${cemail}</p> --%>

		<p>Details as submitted as follows:</p>
		<form method="post" action="getdetails"> 
			Enter Customer ID : <input type="number" name="cid"> <input
				type="submit" value="Submit">
		</form>
	</div>
</body>
</html>