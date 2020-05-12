<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="/resources/css/style.css" rel="stylesheet" type="text/css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4 align="right"><a href="customerlogoff">Log off</a></h4><br>
	<table border="1">
		<tr>
			<th>Product Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Amount</th>
			
		</tr>
		<c:forEach items="${cartList}" var="product">
			<tr>
				<td>${product.productName}</td>
				<td>${product.price}</td>
				<td>${product.quantity}</td>
				<td>${product.amount}</td>
				</tr>
				</c:forEach>
				</table>
		Total amount : ${amount}
		<h4><a href="/viewProduct"> home </a></h4><br>
		
</body>
</html>