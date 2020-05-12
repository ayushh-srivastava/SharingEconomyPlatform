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
<header><h2 align="center">Search By Category</h2></header>
<body><br>
<form:form method="post" action="/fetchProducts" modelAttribute="pro">
<form:label path="categoryName">category Name</form:label>
 <form:input path="categoryName" />
 <input type="submit" value="Search"/>
</form:form><br>
<h4><a href="/fetchProducts">back</a></h4>

</body>
</html>