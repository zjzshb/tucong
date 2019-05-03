<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
	contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<title>用户主页</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/userpage.css">
<script typet="text/javascript"
	src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/userpage.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/util.js"></script>
</head>

<body>
	<%@ include file="nav.jsp"%>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div id="userroot" style="display: none">${userroot}</div>
	<div id="usershow" style="display: none">${userName}</div>
	<h1>这里是个人主页</h1>
	<div>头像 ${userMessege.userMessegeTouxiang}</div>
	<span>用户名：${userName }</span>
	<span>性别：${userMessege.userMessegeSex }</span>
	<span>用户生日：${userMessege.userMessegeBrithday}</span>
	<span>用户地址：${userMessege.userMessegeAddress}</span>
	<span>注册时间：${userMessege.userMessegeRegistertime}</span>
	<span>电话：${userMessege.userMessegeTele}</span>
	<span>qq：${userMessege.userMessegeQq}</span>


	<div id="showphoto">
		

	</div>
	<div id="last">
		<div id="getmorephoto">查看更多</div>
	</div>






</body>
</html>
