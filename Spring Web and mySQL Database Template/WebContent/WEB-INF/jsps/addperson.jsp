<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form method="post"
		action="${pageContext.request.contextPath}/doaddperson">
		<table class="formtable">
			<tr>
				<td>Name:</td>tf
				<td><input name="name" type="text" /></td>
			</tr>
			<tr>
				<td>Cash:</td>
				<td><input name="money" type="integer" /></td>
			</tr>
			<tr>
				<td>Comment:</td>
				<td><textarea name="description" type="text"></textarea></td>
			</tr>
			<tr>
				<td></td>
				<td><input value="CreatePerson" type="submit" /></td>
			</tr>
		</table>
	</form>






</body>
</html>