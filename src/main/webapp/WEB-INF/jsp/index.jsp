<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
	contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<title>图虫</title>
<!--引入CSS -->
<link rel="stylesheet" type="text/css" href="css/index.css">
<!--引入js -->
<script typet="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/index.js"></script>
</head>
<body>
<%@ include file="nav.jsp"%>
	
	<div id="main">
		<div id="middle">
			<div>
				<h1>子豪创意 正版图片平台</h1>
				<button>立即删除</button>
			</div>
			<div></div>
			<div></div>
		</div>
		<div id="select">
			<div>
				<label><input id='search' type="search" autocomplete="off"></label><input
					id='submit' type="submit" value="搜索">
			</div>
		</div>
	</div>
	<div id="selectphoto">
		<a class="photolabel" id="allphoto">全部</a>

	</div>
	<div id="showphoto"></div>
	<div id="last">
		<div id="getmorephoto">查看更多</div>
	</div>



</body>

</html>
