<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>注册</title>
    <script typet="text/javascript"
	src="https://code.jquery.com/jquery-3.3.1.js"></script>
   <script type="text/javascript" src="${pageContext.request.contextPath }/js/register.js"></script>
   <script type="text/javascript" src="${pageContext.request.contextPath }/js/util.js"></script>
	

  </head>
  
  <body>
   	phone:<input name="userPhone" id="userPhone"><span id="messege01"></span><br>
  <button id="sendmessege">发送验证短信</button><br> <span id="messege04"></span><br>
  	验证码:<input id="checkInfo" ><br>
   	pw1:<input name="pw1" id="pw1" type="password" id ="pw1"> <span id="messege03"></span><br>
   	pw2:<input name="pw2" id="pw2" type="password" id = "pw2"><span id="messege02"> </span>
   	<br>
   	<button id="register">注册</button><br>
  </body>
</html>
