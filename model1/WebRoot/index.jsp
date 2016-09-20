<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="en" class="no-js">
    <head>
        <meta charset="utf-8">
        <title>首页</title>
        <meta name="description" content="">
        <meta name="author" content="">
		<!-- Javascript -->
        <script src="js/jquery-1.8.2.min.js"></script>
		

    </head>
<script>
	//登出
	function loginout(){
		$.post("jsonUser_loginOut.action",function(data){
			if(data.result=='success'){
				alert("已安全退出");
				window.location.reload();
			}else{
				alert(data.result);
			}
		})
	}
</script>
    <body>
    	<div>
    		<div>
				<s:if test="#session.SessionUser!=null">
					<lable>欢迎${session.SessionUser.userName}</lable>&nbsp;<a href="javascript:;" onclick="loginout()">logout</a>
				</s:if>
				<s:else>
					<a href="login.htm">login</a>&nbsp;<a href="register.htm" target="_blank">register</a>
				</s:else>
			</div>
			<div align="center">欢迎</div>
			<div align="right">
				<iframe src="http://www.thinkpage.cn/weather/weather.aspx?uid=UF795E1C08&cid=CHZJ000000&l=&p=SMART&a=0&u=C&s=3&m=2&x=1&d=5&fc=&bgc=&bc=&ti=0&in=0&li="
				 frameborder="0" scrolling="no" width="500" height="110" allowTransparency="true"></iframe>
			 </div>
		 </div>
    </body>

</html>


