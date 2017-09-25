<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DeleteUser</title>
</head>
<body>

	<form method="post"
		action="${pageContext.request.contextPath}/dodeleteuser">
		<table class="formtable">
			<tr>
				<td>id</td>
				<td><input name="id" type="integer" /></td>
			</tr>
			<td><input value="Delete" type="submit" /></td>
			</tr>
		</table>
	</form>


</body>
</html>