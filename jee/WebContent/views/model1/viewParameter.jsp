<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Map"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!-- 
request.getParameter() 는 날개 파라미터 키값과 밸류값을 리턴 
request.getParameterValues() 는 키값 없이 벨류값만 리턴 (체크박스)
request.getParameterNames() 는 키값만 리턴(쓸모없음)
request.getParamterMap() 는 파리미터 밸류가 복수인 경우(로그인)

 -->
 <!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>폼 값을 받는 페이지</title>
</head>
<body>
	<div>
		이름 :
		<%=request.getParameter("name")%>
		<br /> 주소 :
		<%=request.getParameter("address")%>
		<p></p>
		<p>request.getPameterValue()메소드 사용</p>
		<br /> 좋아하는 동물 :
		<%
			String[] values = request.getParameterValues("pet");
			if (values != null) {
				for (int i = 0; i < values.length; i++) {
		%>
		넘어온 벨류 :
		<%=values[i]%>
		<%
			}
			}
		%>
		<br />
		<%
			Enumeration enumeration = request.getParameterNames();
			while (enumeration.hasMoreElements()) {
				String name = (String) enumeration.nextElement();
		%>
		<%=name%>
		<%
			}
		%>
		<br />
		<%
		Map map =request.getParameterMap();
		String[] nameParam = (String[])map.get("name");
		
		for(int i=0 ; i<nameParam.length ; i++){
			%>
			<%=nameParam[i]%>
			<%
		}
		%>
     
	</div>
</body>
</html>