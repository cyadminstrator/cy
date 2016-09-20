package com.opentae.data.user.actions;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.websocket.MessageInbound;
import org.apache.catalina.websocket.WsOutbound;

public class CallCenterMessageInBound extends MessageInbound {  
    private String clientId;  
    public static final Map<String, MessageInbound> socketList = new HashMap<String, MessageInbound>();  
  
    public static void send(String clientId, String message) throws IOException {  
        MessageInbound messageInbound = socketList.get(clientId);  
        messageInbound.getWsOutbound().writeTextMessage(  
                CharBuffer.wrap(message));  
        messageInbound.getWsOutbound().flush();  
    }  
  
    public CallCenterMessageInBound(String clientId) {  
        this.clientId = clientId;  
    }  
  
    @Override  
    protected void onBinaryMessage(ByteBuffer message) throws IOException {  
  
    }  
  
    @Override  
    protected void onTextMessage(CharBuffer message) throws IOException {  
  
    }  
  
    @Override  
    protected void onOpen(WsOutbound outbound) {  
        socketList.put(clientId, this);  
    }  
  
    @Override  
    protected void onClose(int status) {  
        socketList.remove(clientId);  
    }  
}

