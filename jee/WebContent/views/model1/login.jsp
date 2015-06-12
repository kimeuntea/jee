<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("memberId");
if(id.equals("amin")){
	response.sendRedirect("now.jsp");
}else{
%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>로그인</title>
</head>
<body>
잘못된아이디

<%
}

%>    
</body>
</html>

    
