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
<h4 align="center"><b><a href="/getCategory">back home</a></b></h4>
<h2>Vendor product Details</h2>
	<table border="1">
		<tr>
		    
			<th>Product Name</th>
			<th>Price</th>
			<th>Category</th>
			<th>Status</th>
		</tr>
		<c:forEach items="${plist}" var="product">
			<tr>
				
				<td>${product.productName}</td>
				<td>${product.price}</td>
				<td>${product.categoryId}</td>
				<td>${product.status}</td>
				
				
			<td><a href="/editproduct/${product.productId}">edit product details</a></td>
				
			</tr>
			</c:forEach>
	</table>
<a href="/showProductPage">Add Product</a>
<a href="/getProduct">Product list</a>
<h2>product added successfully</h2>
<h4><a href="vendorlogoff">Log off</a></h4><br>


</body>
</html>