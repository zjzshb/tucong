<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
	contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>showphoto</title>
<script typet="text/javascript"
	src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/showphoto.js"></script>
<script src="${pageContext.request.contextPath }/js/showpic.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/showpic.css">

</head>

<body>
	<div id="photoId" style="display: none">${photoId}</div>
	<div id="left">
		<header>
		<div class="nav">
			<span class="page"></span>
			<div class="navbtn">
				<a href="" class="nav_log ilike"></a> <a href=""
					class="nav_log download"></a> <a href="" class="nav_log iexit"></a>
			</div>
		</div>
		</header>
		<div class="content">
			<div class="showpic">
				<div class="container">
					<!--背景图片-->
				</div>
			</div>

			<div class="pre" title="上一张"></div>
			<div class="next" title="下一张"></div>

		</div>
		<footer>
		<div class="scroll">
			<div class="cell"
				style="background: url('${pageContext.request.contextPath}/${photoAddress }') center/cover;"></div>

		</div>
		<div class="jumppre" title="上一组"></div>
		<div class="jumpnext" title="下一组"></div>
		</footer>
	</div>
	<div id="right">
		<div id="right_nav">
			<a href="#" class="olike">${photoLike }</a> <a href="#" class="info">${commentCount }</a>
			<a href="#" class="wechat"></a> <a href="#" class="sina"></a> <a
				href="#">cd</a>
		</div>
		<div id="information">
			<div id="master">
				<a href=""><img src="./pic/user_tou/tou-2.jpg" alt="xx"></a>
				<div id="master_other">
					<a href="">${PhotoUsername }</a><br>
					<span>5月12日 </span><span> 浏览量: 2885</span>
				</div>
				<div class="btn">
					<a href="#">关注</a>
				</div>
			</div>
			<div id="label">
				<h3>${photoTitle }</h3>
				<p>${photoDes}</p>
				<div id="labels">
				<c:forEach var="item" items="${labelList}">
					<a href="#">${item.labelName }</a>
					
				</c:forEach>
					
				</div>
			</div>
			<div id="money">
				您的打赏，是最大的鼓励
				<div class="btn">
					<a href="">打赏</a>
				</div>
			</div>
			<div id="people-say">
				<textarea placeholder="喜欢？摸着我胸说两句？" id="commentText"></textarea>
				<div id="yourword" class="addComment">
					<a >评论</a>
				</div>
				<c:forEach var="item" items="${commentList	}">
					<div class="other">
						<a href=""><img src="./pic/user_tou/tou-3.jpg" alt="dd"></a>
						<div class="the-list">
							<a href="">${item.userName}</a><br> <span>${ item.commentText}</span><br>
							<!--  <div class="pinglun">
                            <a href="">Yx :</a><span>谢谢你的评论！</span><br>-->
						</div>
					</div>
				</c:forEach>
			</div>

		</div>

	</div>
	</div>
</body>
</html>
