<%--
  Created by IntelliJ IDEA.
  User: John
  Date: 2019/4/8
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script typet="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <script src="/js/vue.js"></script>
    <script src="/js/header.js"></script>
</head>
<body>
<div id="app">
    <p>{{ message }}</p>
    <input v-model="message">
    <div v-if = "falg === 'A'">
        <h1>A++++{{falg}}</h1>
    </div>
    <div v-else-if = "falg === 'B'">
        <h2>B++++{{falg}}</h2>
    </div>
</div>
</body>
<script>
    new Vue({
        el: '#app',
        data: {
            message: 'Hello Vue!',
            falg :'B'
        }
    })
</script>
</html>
