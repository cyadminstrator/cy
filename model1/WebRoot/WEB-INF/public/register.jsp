<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="en" class="no-js">
    <head>
        <meta charset="utf-8">
        <title>注册</title>
<!-- 		<meta name="keywords" content="网站模板,手机网站模板,手机登录页面,登录页面HTML,免费网站模板下载" />
		<meta name="description" content="JS代码网提供高质量手机网站模板下载" />
 -->        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/supersized.css">
        <link rel="stylesheet" href="css/style.css">


    </head>
<script>
	 function commit(){
		$.post("jsonUser_registerCommit.htm",{userName:$("#username").val(),password:$("#password").val(),code:$("#authCode").val(),phone:$("#phone").val()},function(data){
			var result=data.result;
			if(result!='success'){
				alert(result);
			}else{
				location.href="index.htm";
			}
		});
	} 
</script>
    <body>

        <div class="page-container">
            <h1>注册</h1>
            <form action="" method="post">
                <input type="text" name="username" class="username" placeholder="用户名" id="username">
                <input type="password" name="password" class="password" placeholder="密码" id="password">
                <input type="phone" name="phone" class="phone" placeholder="手机号码" id="phone">
                	 <div class="mobilephonehide">
                  <input type="text" class="mobileipt" id="authCode" name="authCode"  placeholder="请输入下方图案中的验证码">
                  <div class="yanzheng"><img id="checkCode" src="IMG.htm" width="128px;" height="39px;"></div>
               </div>
               <!--  <div class="error"><span>+</span></div> -->
            </form>
            <button onclick="commit()">提交</button>
        </div>
		
        <!-- Javascript -->
        <script src="js/jquery-1.8.2.min.js"></script>
        <script src="js/supersized.3.2.7.min.js"></script>
        <script src="js/supersized-init.js"></script>
        <script src="js/scripts.js"></script>

    </body>

</html>


