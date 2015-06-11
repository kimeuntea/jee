<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>테이블 태그 2</title>
<style>
@IMPORT url("<%=request.getContextPath()%>/css/tableTag2.css");
</style>
</head>
<body>
	<table>
		<tr>
			<th>이름</th>
			<th>나이</th>
			<th>성별</th>
			<th>국적</th>
		</tr>
		<tr>
			<td>홍</td>
			<td>20</td>
			<td>남</td>
			<td>kor</td>
		</tr>
		<tr>
			<td>김</td>
			<td>20</td>
			<td>남</td>
			<td>china</td>
		</tr>
		<tr>
			<td>유</td>
			<td>50</td>
			<td>여</td>
			<td>잉글랜드</td>
		</tr>
		<tr>
			<td>부</td>
			<td>35</td>
			<td>여</td>
			<td>japan</td>
		</tr>
		<tr>
			<td>이</td>
			<td>7</td>
			<td>남</td>
			<td>USA</td>
		</tr>
	</table>
</body>
</html>