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
<form:form method="post" action="/fetchServicess" modelAttribute="sro">
<form:label path="servicecategoryName">Service category Name</form:label>
 <form:input path="servicecategoryName" />
 <input type="submit" value="Search"/>
</form:form>

<h4><a href="/viewProduct">back home</a></h4>
</body>
</html>