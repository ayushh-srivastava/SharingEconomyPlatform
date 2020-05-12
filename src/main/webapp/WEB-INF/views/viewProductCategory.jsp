<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="/resources/css/style.css" rel="stylesheet" type="text/css" />

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Vendor product Details</h2>
	<table border="1">
		<tr>

			<th>Product id</th>
			<th>Product Name</th>
			<th>Vendor id</th>
			<th>status</th>

			<th>Price</th>
			<th>Category</th>
		</tr>
		<c:forEach items="${productList}" var="product">
			<tr>

				<td>${product.productId}</td>
				<td>${product.productName}</td>
				<td>${product.vendorId}</td>
				<td>${product.status}</td>
				<td>${product.price}</td>
				<td>${product.categoryId}</td>

				<td>${product.categoryName }</td>

			</tr>
		</c:forEach>
	</table>
	<h4>
		<a href="customerlogoff">Log off</a>
	</h4>
	<br>


</body>
</html>