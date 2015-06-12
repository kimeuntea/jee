<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>LoginForm</title>
</head>
<body>
<form action="login.jsp">
<table border="1">
	<tr>
		<td>아이디</td>
		<td><input type="text" name="memberId" placeholder="아이디"></td>
			<td>비번</td>
		<td><input type="password" name="memberPass"></td>
	</tr>
	<tr>
		<td colspan="4"><input type="submit" value="전송"></td>
	</tr>
</table>
</form>
</body>
</html>