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
<form:form method="post" action="addCategorya" modelAttribute="category" >
<table >
<tr>
<td><form:label path="categoryName">categoryName</form:label></td>
<td><form:input path="categoryName" id="category"/></td>
<td><form:errors path="categoryName" cssClass="error"/>
</tr>
<tr>
<td colspan="2"><input type="submit" value="submit"/></td>
</tr>
</table>
<h3><a href="/getCategorya">back</a><br></h3>
</form:form>
</body>
</html>