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
${msg}
<form:form method="post"  action="adminvalidate" modelAttribute="admin">
        <table>
            <tr>
                <td><form:label path="adminId"> Admin Id</form:label></td>
                <td><form:input path="adminId" /></td>
                <td><form:errors path="adminId" cssClass="error"/>
            </tr>
            <tr>
                <td><form:label path="password">Password</form:label></td>
                <td><form:password path="password" /></td>
                <td><form:errors path="password" cssClass="error"/>
            </tr>
          
            <tr>
                <td colspan="2"><input type="submit" value="Login"/></td>
            </tr>
        </table>
    </form:form>

</body>

</html>