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
		    
			<th>Product Name</th>
			<th>Price</th>
			<th>Category</th>
			<th>category name</th>
			<th>Status</th>
			<th>vendorId</th>
			
		</tr>
		<c:forEach items="${p2list}" var="product">
			<tr>
				
				<td>${product.productName}</td>
				<td>${product.price}</td>
				<td>${product.categoryId}</td>
				<td>${product.categoryName}</td>
				<td>${product.status}</td>
				<td>${product.vendorId}</td>
				</tr>
				</c:forEach>
				</table>

</body>
</html>