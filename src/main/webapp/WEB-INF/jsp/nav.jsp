<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
	<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/nav.js"></script>
<nav id="nav">
	<a class="nai_a" href="/">首页</a> <a class="nai_a" href="">活动</a>
	<a class="nai_a_1" href="">短视频</a> <a class="nai_a" href="">发现</a>
	<a class="nai_a" href="">交流</a> <a class="nai_a"
href="">更多</a> <c:choose>
		<c:when test="${userId==null}">
			<div id="login">
				<a href="/goLogin">登录</a> <a href="goRegister">注册</a>
			</div>
		</c:when>
		<c:otherwise>
			<div id="login" >
				<a id="username2">${userNickName}</a><a href="gophotoupload" id='upload' style="line-height:2.2em">发布</a> <a href="quitLogin" style="background-color:transparent">退出登录</a>
			</div>
		</c:otherwise>
		</c:choose>
</nav>

