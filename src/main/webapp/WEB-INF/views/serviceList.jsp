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
<form:form method="post" action="addService" modelAttribute="service" >
${product.productName}
${product.price}
${product.status}
${product.productId
${product.servicecategoryId}
${product.contactNumber}
${product.zip}
}
</form:form>
<a href="/showServicePage">Add Service</a>

</body>
</html>