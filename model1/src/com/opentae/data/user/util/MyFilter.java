package com.opentae.data.user.util;


import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyFilter extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		/**
		 * 备忘：获取访问者的IP和用户名，设置白名单和黑名单，
		 * 原理：第一次来的时候，先查数据库，如果不在黑名单里，就在他本地cookie里写个白名单标记。
		 * 如果他试图攻击，那么在他本地cookie写个黑名单标记，若累积3次，记录用户名，IP，写入黑名单表。
		 */
		@Override
		public String intercept(ActionInvocation aInvocation) throws Exception {
			 HttpServletRequest request = ServletActionContext.getRequest();
	         HttpServletResponse response = ServletActionContext.getResponse();
	         HttpSession session = request.getSession();
	         //获取cookie
	         Cookie[] cookie = request.getCookies();
	         if(cookie!=null){
	        	  int count =0;
	 	         for(int i=0;i<cookie.length;i++){
	 	        	 if ("LastTime".equals(cookie[i].getValue())) {
	 	        		 count++;
	 	             }
	 	         }
	 	         if(count>=5){
	 	        	 session.setMaxInactiveInterval(60*20);
	 	        	 session.setAttribute("over", "over");
	 	         }
	         }
	         Cookie c = new Cookie(getSysUUID(),"LastTime");
	         c.setMaxAge(2);
	         response.addCookie(c);
			return aInvocation.invoke();
		}
	
		
		public static String getSysUUID(){
	        return UUID.randomUUID().toString();
	    }
}
