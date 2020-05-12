<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="/resources/css/style.css" rel="stylesheet" type="text/css" />
<style>
header{
	padding: 20px;
  text-align: center;
  font-size: 25px;
  color: black;
}
</style>

</head>
<header> Admin Login<h4 align="right"><a href="adminlogoff">Log off</a></h4>
</header><br>
<body>
<a href="addCategorya">add category</a><br><br>
 <h3><a href="/getCategorya">get category list</a><br></h3>
    <a href="addServiceCategorya">add service  category</a><br><br>
 <h3><a href="/getServiceCategorya">get service category list</a><br></h3>
 <h2 align="center">category details</h2>
	<table border="1" align="center">
		<tr>
		    <th>category</th>
	
		</tr>
		<c:forEach items="${p1list}" var="category">
			<tr>
				<td>${category.categoryId}</td>
				<td>${category.categoryName}</td></tr></c:forEach>
				</table>
				
				<h2 align="center">service category details</h2>
					<table border="1" align="center">
		<tr>
		   <th> service category</th> 
	
		</tr>
		<c:forEach items="${s1list}" var="servicecategory">
			<tr>
				<td>${servicecategory.serviceCategoryId}</td></tr></c:forEach>
				<td>${servicecategory.serviceCategoryName}</td>
				</table>
				


</body>
</html>