package com.opentae.data.user.actions;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opentae.data.user.beans.User;
import com.opentae.data.user.beans.UserExample;
import com.opentae.data.user.services.UserService;

/**
 *
 *@author 自动生成
 *@see User
 *@docRoot com.opentae.data.user.actions.User
 *@remark 自动生成
 *生成日期 2016-05-11 06:20:39
 *完成日期
 *内容摘要
 *
 */
public class UserAction extends BaseAction{
	@Resource(name="tae_userService")
	private UserService userService;
	private String userName;
	private String password;
	private String code;
	private User record;
	private String phone;
	
	public String loginInit(){
		
		return "init";
	}
	/**
	 * 登录
	 * @return
	 */
	public String login(){
		HttpServletRequest request = ServletActionContext.getRequest();
	    HttpSession session = request.getSession();
	    Object object = session.getAttribute("login_code");
	    if(object != null) {
	    	 String validate_code = (String)object;
	    	 if(!validate_code.equals(code)){
	    		 obj = JSONObject.fromObject("{'result':'验证码错误,请重新输入'}");
	    		 return "obj";
	    	 }
	    }
	    Map<String,Object> map = userService.selectAccount(userName, password);
	    boolean falg = (Boolean) map.get("falg");
	    if(falg){
	    	session.setAttribute("SessionUser", (User)map.get("user"));
	    	session.removeAttribute("login_code");
	    	obj = JSONObject.fromObject("{'result':'success'}");
	    }else{
	    	obj = JSONObject.fromObject("{'result':'error'}");
	    }
		return "obj";
	}
	
	/**
	 * 注册
	 * @return
	 */
	public String registerInit(){
		return "init";
	}
	
	/**
	 * 注册提交
	 * @return
	 * 备忘：需加验证是否从注册页面过来，且一个IP只能注册一个用户名
	 */
	public String registerCommit(){
		HttpServletRequest request = ServletActionContext.getRequest();
	    HttpSession session = request.getSession();
	    Object object = session.getAttribute("register_code");
	    if(object != null) {
	    	 String validate_code = (String)object;
	    	 if(!validate_code.equals(code)){
	    		 obj = JSONObject.fromObject("{'result':'验证码错误,请重新输入'}");
	    		 return "obj";
	    	 }
	    }
	    //验证用户是否存在
	    if(!userService.isExist(userName)){
	    	obj = JSONObject.fromObject("{'result':'该用户已存在'}");
	    	return "obj";
	    }
	    if(!phone.matches("\\d{11}")){
	    	 obj = JSONObject.fromObject("{'result':'手机号码有误'}");
    		 return "obj";
	    }
	    User user = new User();
	    user.setUserName(userName);
	    user.setPassword(password);
	    user.setPhone(phone);
	    userService.insertUser(user);
	    session.setAttribute("SessionUser", user);
	    session.removeAttribute("register_code");
	    obj = JSONObject.fromObject("{'result':'success'}");
		return "obj";
	}
	/**
	 * 首页
	 * @return
	 */
	public String indexInit(){
		
		return "init";
	}
	/**
	 * 登出
	 * @return
	 */
	public String loginOut(){
		HttpServletRequest request = ServletActionContext.getRequest();
	    HttpSession session = request.getSession();
	    session.removeAttribute("SessionUser");
	    obj = JSONObject.fromObject("{'result':'success'}");
		return "obj";
	}
	
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public User getRecord() {
		return record;
	}
	public void setRecord(User record) {
		this.record = record;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
