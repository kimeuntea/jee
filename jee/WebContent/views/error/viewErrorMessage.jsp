<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isErrorPage="true" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<%=exception.getMessage() %>
<%= %>
에러 타입 : <img src="<%=request.getContextPath() %>/images/error1.jpg" alt="" width="30%" height="30%" />
</body>
</html>