<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create User</title>
</head>
<body>


	<form method="post"
		action="${pageContext.request.contextPath}/doadduser">
		<table class="formtable">
			<tr>
				<td>UserName:</td>
				<td><input name="Username" type="text" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input name="Password" type="text" /></td>
			</tr>
			<tr>
				<td>DisplayName:</td>
				<td><input name="DisplayName" type="text"></td>
			</tr>
			<tr>
				<td></td>
				<td><input value="CreateUser" type="submit" /></td>
			</tr>
		</table>
	</form>






</body>
</html>