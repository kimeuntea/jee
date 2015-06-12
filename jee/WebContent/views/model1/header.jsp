<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
@IMPORT url("<%=request.getContextPath()%>/css/header.css");
</style>


		<!-- warp, wrapper 의미로 주어지는 클래스나 아이디는 body바로 및
	최상위 div 에게 보통 주어진다. 문법적 의미는 없다. -->
		<header id="top">
			<div id="login">
				<a href="#">login</a>| <a href="#">join</a>
			</div>
			<div class="clear"></div>
			<div id="logo">
				<a href="#"><img src="<%=request.getContextPath()%>/images/motion.gif" alt=""
					width="250px" height="60px" /></a>
			</div>
			<nav id="topMenu">
				<ul>
					<li><a href="#">Home</a></li>
					<li><a href="#">Company</a></li>
					<li><a href="#">Solution</a></li>
					<li><a href="#">Customer Center</a></li>
					<li><a href="#">Contact Us</a></li>
				</ul>
			</nav>
		</header>
		<br />
		
	
	<div class="clear"></div>
	
