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
<body>
<h4 align="center"><b><a href="/getServiceCategory">back home</a></b></h4>
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
				
				
			<td><a href="/editservice/${service.serviceId}">edit service details</a></td>
				
			</tr>
			</c:forEach>
	</table>
<a href="/showServicePage">Add Service</a>
<a href="/getService">Service list</a>
<h2>service added successfully</h2>
<h4><a href="vendorlogoff">Log off</a></h4><br>

</body>
</html>