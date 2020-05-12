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
 <h2 align="center"><b>Update service</b>></h2>
    <br/>
    <form:form method="post" action="/updateService">
        <table>
           <tr>
                <td><form:label path="serviceId">ServiceId</form:label></td>
                <td><form:input path="serviceId"   value="${service.serviceId}" readonly="true"/></td>
            </tr>
            <tr>
                <td><form:label path="serviceName">Service name</form:label></td>
                <td><form:input path="serviceName"  value="${service.serviceName}"/></td>
            </tr>
             <tr>
                <td><form:label path="price">Price</form:label></td>
                <td><form:input path="price" value="${product.price}"/></td>
            </tr>
            <tr>
                <td><form:label path="status">Status</form:label></td>
                <td><form:input path="status"  value="${product.status}"/></td>
            </tr>
            <tr>
             <tr>
<td><form:label path="contactNumber">Status</form:label></td>
<td><form:input path="contactNumber" id="contactNumber"/></td>
<td><form:errors path="contactNumber" cssClass="error"/>
</tr>

<tr>
<tr>
<td><form:label path="zip">Status</form:label></td>
<td><form:input path="zip" id="zip"/></td>
<td><form:errors path="zip" cssClass="error"/>
</tr>

<tr>  
              </table>
            	 <table>
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
                <td colspan="2"><input type="submit" value="Update"/></td>
            </tr>
        </table>
    </form:form><br><br>
    <a href="/showServicePage">Add Service</a><br><br>
    <a href="/getServiceCategory">Back to Vendor Home Page</a>
            
</body>
</html>