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
 <h2 align="center"><b>Update product</b></h2>
    <br/><br>
    <form:form method="post" action="/updateProduct">
        <table>
        <tr>
                <td><form:label path="productId">Product Id</form:label></td>
                <td><form:input path="productId"  value="${product.productId}" readonly="true"/></td>
            </tr>
        <tr>
                <td><form:label path="productName">Product name</form:label></td>
                <td><form:input path="productName"  value="${product.productName}"/></td>
            </tr>
        

             <tr>
                <td><form:label path="price">Price</form:label></td>
                <td><form:input path="price" value="${product.price}"/></td>
            </tr>
                        <tr>
                <td><form:label path="status">Status</form:label></td>
                <td><form:input path="status"  value="${product.status}"/></td>
            </tr></table>
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
                <td colspan="2"><input type="submit" value="Update"/></td>
            </tr>
        </table>
    </form:form><br><br>
    <a href="/showProductPage">Add Product</a><br><br>
    <a href="/getCategory">Back to Vendor Home Page</a>
</body>
</html>