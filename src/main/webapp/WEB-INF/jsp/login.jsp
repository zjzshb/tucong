<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
	contentType="text/html; charset=utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<meta charset="UTF-8">
<title>记忆</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/login.css">
<script typet="text/javascript"
	src="https://code.jquery.com/jquery-3.3.1.js"></script>

<style>
</style>
</head>
<body>
	<div id="top">
		<span>图虫</span>
		<div>
			<a href="#">关于我们</a><a href="#">友情链接</a><a href="#">微博</a>
		</div>
	</div>


	<div id="mid_all">
		<div id="left"></div>
		<div id="mid">
			<p>记忆</p>
			<div id="log_p">
				<form action="/doLogin" method="post">
					<label>账户：<input name="userName"><span></span></label><br>
					<label>密码：<input type="password" name="userPwd"><span></span></label>
					<input type="submit" value=" 登录 ">
				</form>
				<a href="#">注册</a>
				<span>${messege}</span>
				
			</div>
		</div>
	</div>



	<footer> <span></span> </footer>
</body>
<script src="${pageContext.request.contextPath }/js/login.js"></script>

<script>
	$(document).ready(function() {
		$('#top').slideDown(800);
	});
	$(document).ready(function() {
		$('#mid,footer').fadeIn(800);
	});
</script>
</html>
