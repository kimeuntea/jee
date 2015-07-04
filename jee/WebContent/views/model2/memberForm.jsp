<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>회원가입 및 로그인 폼</title>
<style>
@IMPORT url("<%=request.getContextPath()%>/css/model2/kaup.css");
</style>

</head>
<body>
	<form action="<%=request.getContextPath()%>/join.do" method="post"
		name="frm">
		<fieldset>
			<legend>회원 가입</legend>
			<table>
				<tr>
					<td>이름</td>
					<td><input type="text" id="name" name="name" value="김은태"
						placeholder="이름을 입력해주세요" /></td>
				</tr>
				<tr>
					<td>id</td>
					<td><input type="text" id="id" name="id" value="kkk"
						placeholder="id을 입력해주세요" /></td>
				</tr>
				<tr>
					<td>pass</td>
					<td><input type="text" id="pass" name="pass" value="123"
						placeholder="pass를 입력해주세요" /></td>
				</tr>
				<tr>
					<td>나이</td>
					<td><input type="text" id="age" name="age" value="25"
						placeholder="나이을 입력해주세요" /></td>
				</tr>
				<tr>
					<td>email</td>
					<td><input type="text" id="email" name="email" value="rjklef@naver.com"
						placeholder="주소을 입력해주세요" /></td>
				</tr>
				<tr>
					<td colspan="2"><img
						src="<%=request.getContextPath()%>/images/btnLogin.jpg"
						style="width: 50px; cursor: pointer;" onclick="return join()" /></td>
				</tr>
			</table>
		</fieldset>
	</form>


	<form action="<%=request.getContextPath()%>/login.do" method="post"
		name="frmLogin">
		<fieldset>
			<legend>로그인</legend>
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" id="id" name="id"
						placeholder="id을 입력해주세요" /></td>
				</tr>
				<tr>
					<td>pass</td>
					<td><input type="text" id="pass" name="pass" /></td>
				</tr>
				<tr>
					<td colspan="2"><img
						src="<%=request.getContextPath()%>/images/loginbtn.png"
						style="width: 50px; cursor: pointer;" onclick="return login()" /></td>
				</tr>
			</table>
		</fieldset>
	</form>
	<div>
		<span> 
		<a href="#" onclick="searchId('<%=request.getContextPath()%>/member/searchIdForm.do')">아이디찾기</a>
		</span>
		<span>
		<a href="#" onclick="searchPass('<%=request.getContextPath()%>/member/searchIdPass.do')">비번찾기</a>
		</span>
	</div>
	<script src="<%=request.getContextPath()%>/js/member.js" type="text/javascript" >

</script>
</body>
</html>