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
<form:form method="post" action="" modelAttribute="" >
<table>
<tr>
<td><form:label path="servicecategory">Category</form:label></td>
<td>
<form:select path="servicecategory" id="servicecategory">
    <c:forEach items="${s1list}" var="servicecategory">
        <form:option value="${servicecategory.servicecategoryId}">${servicecategory.servicecategory}</form:option>
        </c:forEach>
        
                        
</form:select>
</td>    
<td><form:errors path="servicecategory" cssClass="error"/></td></tr>

  <tr><td>  <input type="submit" value="Search"/></td></tr>
  </table>
  </form:form>
  <a href="/getProduct">back home</a>
  
</body>
</html>