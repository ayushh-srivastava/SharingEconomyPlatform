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
 <h2>Update Vendor</h2>
    <br/>
    <form:form method="post" action="/update">
        <table>
        
         <tr>
                <td><form:label path="address">Address</form:label></td>
                <td><form:input path="address" value="${vendor.address}"/></td>
            </tr>
             <tr>
                <td><form:label path="state">State </form:label></td>
                <td><form:input path="state" value="${vendor.state}"/></td>
            </tr>
             <tr>
                <td><form:label path="city">City</form:label></td>
                <td><form:input path="city" value="${vendor.city}"/></td>
            </tr>
           <tr>
                <td><form:label path="zip">Zip</form:label></td>
                <td><form:input path="zip"   value="${vendor.zip}"/></td>
            </tr>
            <tr>
                <td><form:label path="contactNumber">Contact Number</form:label></td>
                <td><form:input path="contactNumber"  value="${vendor.contactNumber}"/></td>
            </tr>
            <tr>
                <td><form:label path="email">Email</form:label></td>
                <td><form:input path="email"  value="${vendor.email}"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Update"/></td>
            </tr>
        </table>
    </form:form>
    <a href="/getCategory">back home</a>
</body>
</html>