<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원정보</title>
</head>
<body>
	
		<fieldset>
			<legend>회원 가입</legend>
			<table>
				<tr>
					<td>이름</td>
					<td>${name}</td>
				</tr>
				<tr>
					<td>id
					</td>
					<td>${id}</td>
				</tr>
				<tr>
					<td>나이
					</td>
					<td>${age}</td>
				</tr>
				<tr>
					<td>주소
					</td>
					<td>${address}</td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="전 송" /></td>
				</tr>
			</table>
		</fieldset>
	
	
</body>
</html>