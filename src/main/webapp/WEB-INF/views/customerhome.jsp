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
<h2 align="center">Customer product Home</h2>
	<table border="1">
		<tr>
		    
			<th>Product Name</th>
			<th>Price</th>
			<th>Category</th>
			<th>Status</th>
			<th>VendorId</th>
		</tr>
		<c:forEach items="${p2list}" var="product">
			<tr>
				
				<td>${product.productName}</td>
				<td>${product.price}</td>
				<td>${product.categoryId}</td>
				<td>${product.status}</td>
				<td>${product.vendorId} </td>
				</tr>
				</c:forEach>
				</table>
			<h4><a href="/viewProduct"> View Products</a></h4>
			<h4><a href="/searchPage"> Search Product by category</a></h4>
			<h4> Category based Product List</h4>
			<table border="1">
		<tr>
		    
			<th>Product Name</th>
			<th>Price</th>
			<th>Category</th>
			<th>category name</th>
			<th>Status</th>
			<th>VendorId</th>
		</tr>
		<c:forEach items="${productList}" var="product">
			<tr>
				
				<td>${product.productName}</td>
				<td>${product.price}</td>
				<td>${product.categoryId}</td>
				<td>${product.categoryName}</td>
				<td>${product.status}</td>
				<td>${product.vendorId} </td>
				<td><a href="addToCart?productId=${product.productId}">Add to Cart</a></td>
				</tr>
				</c:forEach>
				</table>
				<h2>Vendor service Details</h2>
	<table border="1">
		<tr>
		    
			<th>Service Name</th>
			<th>Price</th>
			<th>Category</th>
			<th>Status</th>
			<th>VendorId</th>
			<th>Contact Number</th>
			<th>Zip</th>
		</tr>
		<c:forEach items="${s2list}" var="service">
			<tr>
				
				<td>${service.serviceName}</td>
				<td>${service.price}</td>
				<td>${service.servicecategoryId}</td>
				<td>${service.status}</td>
				<td>${service.vendorId} </td>
					<td>${service.contactNumber} </td>
						<td>${service.zip} </td>
				</tr>
				</c:forEach>
				</table>
			<h4><a href="/viewService"> View Services</a></h4>
			<h4><a href="/searchServicePage"> Search Services by category</a></h4>
			<h4> Category based Service List</h4>
			<table border="1">
		<tr>
		    
			<th>Service Name</th>
			<th>Price</th>
			<th>Category</th>
			<th>Status</th>
			<th>VendorId</th>
			<th>Contact Number</th>
			<th>Zip</th>
		</tr>
		<c:forEach items="${serviceList}" var="service">
			<tr>
					<td>${service.serviceName}</td>
				<td>${service.price}</td>
				<td>${service.servicecategoryId}</td>
				<td>${service.status}</td>
				<td>${service.vendorId} </td>
					<td>${service.contactNumber} </td>
						<td>${service.zip} </td>
				
				
				<td><a href="bookservice?serviceId=${service.serviceId}">Add to Cart</a></td>
				</tr></c:forEach>
				</table>
<h4><a href="customerlogoff">Log off</a></h4><br>

</body>
</html>