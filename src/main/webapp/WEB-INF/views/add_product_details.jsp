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
<header><h2 align="center">Add Product</h2></header>
<body>
<form:form method="post" action="addProduct" modelAttribute="product" >
<table >
<tr>
<td><form:label path="productName">productName</form:label></td>
<td><form:input path="productName" id="productName"/></td>
<td><form:errors path="productName" cssClass="error"/>
</tr>
<tr>
<td><form:label path="price">price</form:label></td>
<td><form:input path="price" id="price"/>
<td><form:errors path="price" cssClass="error"/>
</tr>
<tr>
<td><form:label path="status">Status</form:label></td>
<td><form:input path="status" id="status"/></td>
<td><form:errors path="status" cssClass="error"/>
</tr>
</table>
<table>
<tr>
<td><form:label path="categoryId">Category</form:label></td>
<td>
<form:select path="categoryId" id="category">
    <c:forEach items="${p1list}" var="category">
        <form:option value="${category.categoryId}">${category.categoryName}</form:option>
        </c:forEach>
        
                        
</form:select>
</td>
    <td><form:errors path="categoryId" cssClass="error"/></td>
 
 </tr>
<tr>
<td><form:label path="vendorId">UserId</form:label></td>
<td><form:input path="vendorId" id="vendorId"  value="${vendorId}" readonly="true"/></td>
<td><form:errors path="vendorId" cssClass="error"/>
</tr>

<tr>
<td colspan="2"><input type="submit" value="submit"/></td>
</tr>
</table>
</form:form>

<h4><a href="vendorlogoff">Log off</a></h4><br>
<h4><a href="/getCategory">back</a></h4>

</body>
</html>