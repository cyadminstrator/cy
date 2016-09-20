package com.opentae.data.user.actions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/api") 
public class MessageAPI {
	
	 /** 
     * 向客户端推送消息 
     * */  
    @ResponseBody  
    @RequestMapping(value = "/send.htm")  
    public String send(@RequestParam String clientId,  
            @RequestParam String message,ModelMap map) {  
        Map<String, String> result = new HashMap<String, String>();  
        try {  
            CallCenterMessageInBound.send(clientId, message);
            result.put("message", "success");  
        } catch (IOException e) {  
            result.put("message", e.getLocalizedMessage());  
            e.printStackTrace();  
        }  
        JSONObject aa  = JSONObject.fromObject(result);
        System.out.println(aa);
        return aa.toString();  
    }  

}
