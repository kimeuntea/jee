<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.logging.SimpleFormatter"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%!
	public int multiply(int a,int b){		
		int c = a * b;
		return c;
	}
	%>
<!doctype html>
<html lang="en">
<head>
<%
	Date now = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss ");
%>
<meta charset="UTF-8" />
<title>chap 02</title>
</head>
<body>
	현재시간 :
	<%=formatter.format(now)%>
	<br />
	<%=multiply(10,20)%>
	<!-- JSP 에서 제공하는 것들,
1.디렉티브 : 설정정보를 지정 , 
2.스크립트 
(1) 스크립트릿 :  자바 코드를 실행한다. 
(2) 표현식 : 값을 출력한다.
(3) 선언부  : 자바메소드 만든다. 
3. EL 
4. 기본객체
5. JSTL
  -->

</body>
</html>

