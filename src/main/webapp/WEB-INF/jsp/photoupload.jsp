<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
	contentType="text/html; charset=utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<script typet="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/photoupload.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/userpage.css">
<!-- tou  -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/fileupPage.css">
    <script src="${pageContext.request.contextPath }/js/picupload.js"></script>
	<script src="${pageContext.request.contextPath}/js/ajaxfileupload.js"></script>
<title>Title</title>
</head>
<body>
	<%@ include file="nav.jsp"%>
	<article>

		<div class="artleft">
			
			<div class="files">
				<div id="showphoto">

				</div>

				<form class="file" id="uploadForm"  method="post"  enctype="multipart/form-data">
					<div class="file-box">
						<img src="img/fileupPage/crossXX.png">
						<div>
							最大支持20MB的JPEG格式照片<br>不建议加画框和水印签名
						</div>
						<input type="file" name="file" class="file-btn"  id="file1" onchange="upLoadFile()">
					</div>
				</form>1
			</div>
		</div>
		<aside class="artright">
		<div class="artrightUp">




			<div class="photoTitle">标题</div>
			<label> <input class="title" type="text" name="title" id = "picTitle">
			</label>
			<div class="phtotDes">作品描述</div>
			<label> <textarea class="describe" name="describle" id = "picDescribe"></textarea>
			</label>
			<div class="photoLabel">
				标签（<a>输入标签内容回车即可添加标签</a>） <a>0</a>/10
			</div>
			<label> <input class="labelA" type="text" name="label"
				value="" id = "picLabel">
			</label>
			<div class="PhotoUsual">常用标签</div>
			<div class="labelsA" id = "showLabel">

			</div>
			<div class="PhotoAppro">推荐标签</div>
			<div class="labels">

			</div>
		</div>
		<div class="submit" id = "publishPic">发布</div>
		</aside>
	
	</article>
</body>
</html>
