<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
 @IMPORT url("<%=request.getContextPath()%>/css/template1.css");
</style>
</head>
<form action="result.jsp">
<body>
	<table class="testClass">
		<tr class="trClass">
			<td
			 class="td2Class">필드</td>
			<td class="td2Class">이름</td>
		</tr>
		<tr class="trClass">
			<td class="tdClass">이름</td>
			<td class="tdClass"><input type="text" style="width: 350px;"></td>

		</tr>

		<tr class="trClass">
			<td class="tdClass">나이</td>
			<td class="tdClass"><input type="text" style="width: 350px;"></td>
		</tr>
		<tr>
		<td><input type="submit" value="등록"></td>
		</tr>
	</table>
	</form>
</body>
</html>