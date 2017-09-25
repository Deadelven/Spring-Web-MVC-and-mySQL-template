<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client list</title>
</head>
<body>
<link href="<c:url value="/static/css/main.css" />" rel="stylesheet">
	<table class="people">
		<tr>
			<td>Name</td>
			<td>Cash</td>
			<td>Description</td>
		</tr>
		<c:forEach var="person" items="${people}">
			<tr>
				<td><c:out value="${ person.name}"></c:out></td>
				<td><c:out value="${ person.money}"></c:out></td>
				<td><c:out value="${ person.description}"></c:out></td>
				<c:out value="${row}"></c:out>
			</tr>
		</c:forEach>
	</table>

</body>
</html>