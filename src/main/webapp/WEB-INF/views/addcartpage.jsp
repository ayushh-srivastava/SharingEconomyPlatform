<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Product added in cart....
<!--  	 <table border="1">
		<tr>
		    
			<th>Product Name</th>
			<th>Price</th>
			<th>Status</th>
			<th>VendorId</th>
			<th>quantity</th>
			
		</tr>
		<c:forEach items="${p2list}" var="product">
			<tr>
				
				<td>${product.productName}</td>
				<td>${product.price}</td>
				
				<td>${product.status}</td>
				<td>${product.vendorId} </td>
				<td>${product.quantity} </td>
				</tr>
				</c:forEach>
				</table>
			<h4><a href="/fetchCart"> View Products</a></h4>--><br><br>
			<h4><a href="/showCart"> View Cart</a></h4>
			<br><br>
			 
<h4><a href="/viewProduct">back home</a></h4>
</body>
</html>