<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="/resources/css/style.css" rel="stylesheet" type="text/css" />

<meta charset="ISO-8859-1">
<title>Sharing Economy Platform</title>
<style>
header{
	padding: 20px;
  text-align: center;
  font-size: 25px;
  color: black;
}
.y{
float :center;
}
</style>
</head>
<h4 align="right"><a href="vendorlogin"> back </a></h4>
<header><marquee>SHARING ECONOMY PLATFORM</marquee> </header>

<body><br>

<h3 align="center">Vendor Personal Details</h3><br><br>
	<table border="1" align="center">
		<tr>
		    <th>Vendor Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Dob</th>
			<th>Contact Number</th>
			<th>Address</th>
			<th>City</th>
			<th>State</th>
			<th>Zip</th>
			<th>Email</th>
			
		</tr>
			<tr>
				<td>${vendor.vendorId}</td>
				<td>${vendor.firstName}</td>
				<td>${vendor.lastName}</td>
				<td>${vendor.dob}</td>
				
				<td>${vendor.contactNumber}</td>
				<td>${vendor.address}</td>
				<td>${vendor.city}</td>
				<td>${vendor.state}</td>
				<td>${vendor.zip}</td>
				<td>${vendor.email}</td>
				<td><a href="vendordetails/${vendor.vendorId}">Edit Details</a></td>
				
			</tr>
	</table>
	<h2> Add product details</h2><br>
  <a href="/showProductPage">Add Product</a><br>
  <a href="/getProduct">Product list</a><br>
  <a href="addCategory">add category</a><br><br>
 <h3><a href="/getCategory">get category list</a><br></h3>
 <h2> Add service details</h2><br>
 <a href="/showServicePage">Add Service</a><br>
  <a href="/getService">Service list</a><br>
   <a href="addServiceCategory">add service  category</a><br><br>
 <h3><a href="/getServiceCategory">get category list</a><br></h3>
<h4><a href="vendorlogoff">Log off</a></h4><br>
<h2 align="center">category details</h2>
	<table border="1" align="center">
		<tr>
		    <th>category</th>
		    <th>Category name</th>
	
		</tr>
		<c:forEach items="${p1list}" var="category">
			<tr>
				<td>${category.categoryId}</td>
				<td>${category.categoryName}</td></tr></c:forEach>
				</table>
				<h2>service category details</h2>
	<table border="1" align="center">
		<tr>
		    <th>service category</th>
		    <th>Service Category name</th>
	
		</tr>
		<c:forEach items="${s1list}" var="servicecategory">
			<tr>
				<td>${servicecategory.serviceCategoryId}</td>
				<td>${servicecategory.servicecategoryName}</td></tr></c:forEach>
				</table>

</body>
</html>