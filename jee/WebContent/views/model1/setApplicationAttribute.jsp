<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	String value = request.getParameter("value");

	if (name != null && value != null) {
		request.setAttribute(name, value);

	}
%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Document</title>
</head>
<body>
	<%
		if (name != null && value != null) {
	%>
	request 기본 객체의 속성설정
	<%
		} else {
	%>
	request 기본 객체의 속성설정안함
	<%=name%>
	<br /><%=value%>
	<%
		}
	%>
</body>
</html>