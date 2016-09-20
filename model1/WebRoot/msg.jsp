<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>  
<html>  
<head>
<script src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">  
var clientId =Math.random()*100;  
var url = 'ws://104.251.232.4:80/webSocket?clientId='+clientId;  
document.write("Current ClientId:"+clientId);  
var CallCenter = {  
        init:function(url){  
            var _websocket = new WebSocket(url);  
            _websocket.onopen = function(evt) {  
            };  
            _websocket.onclose = function(evt) {  
            };  
            _websocket.onmessage = function(evt) {  
                var msg = eval(evt); 
                alert(msg.data);
                
            };  
            _websocket.onerror = function(evt) {  
            };  
        }  
};  
CallCenter.init(url);  
  
$(document).ready(function(){  
    $("#send").bind("click",function(){  
        $.post("api/send.htm",{clientId:$("#clientId").val(),message:$("#message").val()},function(msg){
        	  console.log(msg);
        });
    });  
});  
</script>  
</head>  
<body>  
<br/>  
To ClientId:  
    <input type="text" id="clientId" />  
    <br /> Message:  
    <input type="text" id="message" />  
    <input type="button" id="send" value="send">  
</body>  
</html> 