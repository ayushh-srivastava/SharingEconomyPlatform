<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <style type="text/css">
{
.body{
background-image:url("/resources/images/1.jpg")
}
}
</style> -->
<style>
header{
	padding: 30px;
  text-align: center;
  font-size: 35px;
  color: black;
}
a{
float :right;
}
.error{
	border: 1px solid red;
}
</style>

</head>
<body style="background-color:pink">
<header>SHARING ECONOMY PLATFORM</header>
<form:form method="post"  action="vendorregister" modelAttribute="vendor">
<table align="center">
<tr>
<td><form:label path="firstName">FirstName</form:label></td>
<td><form:input path="firstName"/></td>
<td><form:errors path="firstName" cssClass="error"/>
</tr>
<tr>
<td><form:label path="lastName">LastName</form:label></td>
<td><form:input path="lastName"/>
<td><form:errors path="lastName" cssClass="error"/>
</tr>
<tr>
<td><form:label path="dob">Dob</form:label></td>
<td><form:input path="dob"/></td>
<td><form:errors path="dob" cssClass="error"/>
</tr>
<tr>
<td><form:label path="gender">Gender</form:label></td>
<td><form:input path="gender"/></td>
<td><form:errors path="gender" cssClass="error"/>

</tr>
<tr>
<td><form:label path="contactNumber">Contact Number</form:label></td>
<td><form:input path="contactNumber"/></td>
<td><form:errors path="contactNumber" cssClass="error"/>
</tr>
<tr>
<td><form:label path="address">Address</form:label></td>
<td><form:input path="address"/></td>
<td><form:errors path="address" cssClass="error"/>
</tr>
<tr>
<td><form:label path="city">City</form:label></td>
<td><form:input path="city"/></td>
<td><form:errors path="city" cssClass="error"/>
</tr>
<tr>
<td><form:label path="state">State</form:label></td>
<td><form:input path="state"/></td>
<td><form:errors path="state" cssClass="error"/>
</tr>
<tr>
<td><form:label path="zip">Zip</form:label></td>
<td><form:input path="zip"/></td>
<td><form:errors path="zip" cssClass="error"/>
</tr>
<tr>
<td><form:label path="email">Email</form:label></td>
<td><form:input path="email"/></td>
<td><form:errors path="email" cssClass="error"/>
</tr>
<tr>
<td><form:label path="vendorId">Vendor Id</form:label></td>
<td><form:input path="vendorId"/></td>
<td><form:errors path="vendorId" cssClass="error"/>
</tr>
<tr>
<td><form:label path="password">Password</form:label></td>
<td><form:input path="password"/></td>
<td><form:errors path="password" cssClass="error"/>
</tr>
<tr>
<td colspan="2"><input type="submit" value="submit"/></td>
</tr>
</table>
</form:form><br>
<br>

<a href="vendorlogin">back</a>
<!-- <a href="">Index Page</a> -->
</body>
</html>