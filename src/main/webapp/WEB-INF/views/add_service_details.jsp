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
</head>
<header><h2 align="center">Add Service</h2>
<h4><a href="/getCategory">back</a></h4></header>
<body>
<body>
<form:form method="post" action="addService" modelAttribute="service" >
<table >
<tr>
<td><form:label path="serviceName">serviceName</form:label></td>
<td><form:input path="serviceName" id="serviceName"/></td>
<td><form:errors path="serviceName" cssClass="error"/>
</tr>
<tr>
<td><form:label path="price">price</form:label></td>
<td><form:input path="price" id="price"/>
<td><form:errors path="price" cssClass="error"/>
</tr>
</table><table>
<tr>
<td><form:label path="servicecategoryId">Category</form:label></td>
<td>
<form:select path="servicecategoryId" id="servicecategory">
    <c:forEach items="${s1list}" var="servicecategory">
        <form:option value="${servicecategory.serviceCategoryId}">${servicecategory.servicecategoryName}</form:option>
        </c:forEach>
        
                        
</form:select>
</td>
    <td><form:errors path="servicecategoryId" cssClass="error"/></td>
 
 </tr>
<tr>
<td><form:label path="vendorId">UserId</form:label></td>
<td><form:input path="vendorId" id="vendorId"  value="${vendorId}" readonly="true"/></td>
<td><form:errors path="vendorId" cssClass="error"/>
</tr>

<tr>
<td><form:label path="status">Status</form:label></td>
<td><form:input path="status" id="status"/></td>
<td><form:errors path="status" cssClass="error"/>
</tr>
<tr>
<td><form:label path="contactNumber">contactNumber</form:label></td>
<td><form:input path="contactNumber" id="contactNumber"/></td>
<td><form:errors path="contactNumber" cssClass="error"/>
</tr>
<tr>
<td><form:label path="zip">zip</form:label></td>
<td><form:input path="zip" id="zip"/></td>
<td><form:errors path="zip" cssClass="error"/>
</tr>

<tr>
<td colspan="2"><input type="submit" value="submit"/></td>
</tr>
</table>
</form:form>
<h4><a href="vendorlogoff">Log off</a></h4><br>

</body>
</html>