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
<h2>Vendor service Details</h2>
	<table border="1">
		<tr>
		    
			<th>Service Name</th>
			<th>Price</th>
			<th>Category</th>
			<th>Status</th>
			<th>ContactNumber</th>
			<th>Zip</th>
		</tr>
		<c:forEach items="${slist}" var="service">
			<tr>
				
				<td>${service.serviceName}</td>
				<td>${service.price}</td>
				<td>${service.servicecategoryId}</td>
				<td>${service.status}</td>
				<td>${service.contactNumber}</td>
				<td>${service.zip}</td>
				</tr>
				</c:forEach>
				</table>
</body>
</html>