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
	//留言提交
	function commit1(){
		$.post("jsonMessage_addMassage.action",{"record.content":$("#content").val(),"record.isOpen":$("#isopen").val()},function(data){
			if(data.result=='success'){
				alert("回复成功");
				location.reload();
			}else if(data.result=='login'){
				if(confirm("您还没有登陆还不能留言，您需要登陆吗？")){
					location.href="login.htm";
				} 
			}else{
				alert(data.result);
			}
		});
	}
	//回复
	function returnMSG(mid){
		$("#pingbi").css("display","block");
		$("#orderbz").css("display","block");
		$("#jjj_oid").val(mid);
	}
	//回复确定
	function od_qd(){
		var content = $("#j_bz").val();
		var mid = $("#jjj_oid").val();
		$.post("jsonReturnMessage_addReturnMassage.action",{"record.content":content,"record.mid":mid},function(data){
			if(data.result=='success'){
				alert("留言成功");
				location.reload();
			}else if(data.result=='login'){
				if(confirm("您还没有登陆还不能回复，您需要登陆吗？")){
					location.href="login.htm";
				} 
			}else{
				alert(data.result);
			}
		});
	}
	//回复取消
	function od_qx(){
		$("#pingbi").css("display","none");
		$("#orderbz").css("display","none");
	}	
</script>
    <body>
    	<s:iterator value="msgs" var="l">
    		<div>
    			${l.content}&nbsp;&nbsp;&nbsp;${l.userName}&nbsp;&nbsp;<s:date  format="yyyy-MM-dd HH:mm:ss" name="#l.createTime"></s:date><a href="javascript:;" onclick="returnMSG(${l.mid})">回复</a>
    			<s:iterator value="#l.rmsgs" var="rl">
    				${rl.content}&nbsp;&nbsp;&nbsp;${rl.userName}&nbsp;&nbsp;<s:date  format="yyyy-MM-dd HH:mm:ss" name="#rl.createTime"></s:date>
    			</s:iterator>
    		</div>
    	</s:iterator>
	    <div>
	    	<textarea rows="4" cols="20" placeholder="请输入您要留言的内容" id="content">
	    	
	    	</textarea>
	    	<div>
				<select id="isopen"><option value="1">公开</option><option value="2">仅cy可见</option></select>
				<button onclick="commit1()">提交</button>	    	
	    	</div>
	    </div>
    </body>
	
	
	<div id="pingbi" style="display:none;">
    	<div style="position: fixed;right: 0;top: 0;left: 0;bottom: 0;background-color: gray;opacity: 0.5;"></div>
	</div>
	
	<div id="orderbz" style="display:none;">
    <div style="position: fixed;right: 0;top: 0;left: 0;bottom: 0;background-color: gray;opacity: 0.5;"></div>
    <div style="position: fixed;top: 150px;left: 50%;width: 200px;height: 150px;background-color: #fff;padding: 10px 20px;z-index: 100">
        <textarea id="j_bz" cols="23" rows="4" placeholder="请输入回复" ></textarea><br>
        <div style="width: 80px;margin: 20px auto 0;">
            <input type="button" value="确定" style="margin-right:10px;" onclick="od_qd()">
            <input type="button" value="取消" onclick="od_qx()">
            <input type="hidden" id="jjj_oid">
        </div>
    </div>
</div>
</html>


