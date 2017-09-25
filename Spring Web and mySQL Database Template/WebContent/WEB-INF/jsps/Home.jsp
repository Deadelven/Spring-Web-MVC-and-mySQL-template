<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<link href="<c:url value="/static/css/main.css" />" rel="stylesheet">
	Hiya There!


	<p>
		<a href="${pageContext.request.contextPath}/people">Show Current
			People</a>
	</p>
	<p>
		<a href="${pageContext.request.contextPath}/addperson">Add a
			Person</a>
	</p>

	<p>
		<a href="${pageContext.request.contextPath}/adduser">Add a User</a>
	</p>

	<p>
		<a href="${pageContext.request.contextPath}/showusers">Show
			Current Users</a>
	</p>

	<p>
		<a href="${pageContext.request.contextPath}/login">Login</a>
	</p>

	<p>
		<a href="${pageContext.request.contextPath}/deleteuserpage">Delete
			User</a>
	</p>


</body>
</html>