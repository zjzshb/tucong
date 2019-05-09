<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
         contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8">
    <title>用户信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all"> <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
    <script typet="text/javascript"
            src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/userInfo.js"></script>
    <!-- tou  -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/fileupPage.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/photoupload.css">
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/userpage.css">



</head>
<body>
<%@ include file="nav.jsp"%>
<div class="layui-container" id ="userHead" style="height: 373px;width: 100%;padding: 255px 100px 0">
    <div class="layui-row" style="bottom: 20px;">
        <div class="layui-col-md8" id="userInfo" style=" color: #fff;">
            <%--<div class="personName" style=" font-size: 25px; margin-bottom: 10px;" >梓泽丘墟</div>--%>
            <%--<div class="personButton" style=" margin-bottom: 7px;">湖南-株洲 / 关注 1 / 粉丝 2</div>--%>
            <%--<div class="personProfile" style=" font-size: 10px;">他注定是个低调的大侠，所以什都没写</div>--%>
        </div>
        <div class="layui-col-md2" style=" height: 100px;">
            <div style="bottom: 10px;line-height: 140px;float: right;">编辑封面&gt;</div>
        </div>
    </div> <!--常规布局（以中型屏幕桌面为例）：-->
</div>
<div id="selectphoto">
    <%--<a class="photolabel" id="allphoto">全部</a>--%>
</div>
<div id="showphoto">

    <%--<div class="photo" id="1">--%>
    <%--<img src="http://119.23.191.210:8888/group1/M00/00/00/rBA6VVywBv-AF58_AAUTZ_gYT6I217.jpg" alt=\"失败\"/>--%>
    <%--<div class="photomes" id="2">--%>
    <%--<span class="photoUserName"> userName</span>--%>
    <%--<span> 时间：time</span>--%>
    <%--<span>赞：1</span>--%>
    <%--<span>评论:1</span>--%>
    <%--</div>--%>
    <%--</div>--%>
</div>
<%--<div class="layui-container" style=" position: relative; width: 25%; margin: 30px 0 0 30px;">--%>
    <%--<div style=" position: relative;height: 100px;width: 100%;   background: url('../img/pic-4.jpg') 300px 520px;"></div>--%>
    <%--<div style=" position: relative; top: -50px; margin-bottom: 11px; padding-left: 10px;">--%>
        <%--<span style=" font-size: 15px;">少吃点儿15688</span>--%>
        <%--<button class="layui-btn layui-btn-primary"--%>
                <%--style=" padding: 0px 20px; height: 28px; line-height: 28px; color: #c99a05; border: solid 1px #c99a05; margin-left: 16px;">--%>
            <%--关注--%>
        <%--</button>--%>
    <%--</div>--%>
    <%--<div style=" color: #85888a; position: absolute; top: 157px; padding-left: 15px;">关注 120 / 粉丝 29 / 河南-郑州</div>--%>
    <%--<div style=" top: 185px; position: absolute; color: #85888a; padding-left: 15px;">自由随性 热情执着</div>--%>
<%--</div>--%>


<script src="${pageContext.request.contextPath}/layui/layui.js" charset="utf-8"></script>
<script>

</script>

</body>
</html>
