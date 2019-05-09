<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
         contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <link href="${pageContext.request.contextPath }/css/style.css" rel='stylesheet' type='text/css' />
    <title>注册</title>
    <script typet="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/register.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/util.js"></script>

    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</head>
            <body>
            <h1>App Location Form</h1>
    <div class="app-location">
            <h2>Welcome to Locaticus</h2>
    <div class="line"><span></span></div>
            <div class="location"><img src="images/location.png" class="img-responsive" alt="" /></div>
            <form>
            <input type="text" id="userPhone" class="text" value="请输入电话号码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入电话号码';}" >
            <h3  ><a href="#"  id="sendmessege" style="color:#78797C">发送验证码</a></h3>
            <input type="text"  id="checkInfo" class="text" value="请输入验证码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入验证码';}" >
            <input  name="pw1" id="pw1" type="password" id ="pw1" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
            <input name="pw2" id="pw2" type="password" id = "pw2" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
            <div class="submit"><input type="submit"  id="register" value="注册" ></div>
            <div class="clear"></div>
            <div class="new">
            <h3><a href="#">Forgot password ?</a></h3>
    <h4><a href="#">New here ? Sign Up</a></h4>
    <div class="clear"></div>
            </div>
            </form>
            </div>

            </body>
            </html>
