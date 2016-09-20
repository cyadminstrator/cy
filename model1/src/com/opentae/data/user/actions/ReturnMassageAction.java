package com.opentae.data.user.actions;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opentae.data.user.beans.ReturnMassage;
import com.opentae.data.user.beans.User;
import com.opentae.data.user.services.ReturnMassageService;

/**
 *
 *@author 自动生成
 *@see ReturnMassage
 *@docRoot com.opentae.data.user.actions.ReturnMassage
 *@remark 自动生成
 *生成日期 2016-05-14 09:16:54
 *完成日期
 *内容摘要
 *
 */
public class ReturnMassageAction extends BaseAction{
	@Resource(name="tae_returnMassageService")
	private ReturnMassageService returnMassageService;
	private ReturnMassage record;

	public String addReturnMassage(){
		if(record==null){
			obj = JSONObject.fromObject("{'result':'参数错误'}");
			return "obj";
		}
		HttpServletRequest request = ServletActionContext.getRequest();
	    HttpSession session = request.getSession();
	    Object object = session.getAttribute("SessionUser");
	    if(object==null){
	    	obj = JSONObject.fromObject("{'result':'login'}");
	    	return "obj";
	    }
	    	User user = (User)object;
	    	record.setCreateTime(new Date());
	    	record.setUserId(user.getUserId());
	    	record.setUserName(user.getUserName());
	    	returnMassageService.insertReturnMassgae(record);
	    	obj = JSONObject.fromObject("{'result':'success'}");
		return "obj";
	}
	
	public ReturnMassageService getReturnMassageService() {
		return returnMassageService;
	}
	public void setReturnMassageService(ReturnMassageService returnMassageService) {
		this.returnMassageService = returnMassageService;
	}
	public ReturnMassage getRecord() {
		return record;
	}
	public void setRecord(ReturnMassage record) {
		this.record = record;
	}
}
