package com.opentae.data.user.actions;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONObject;

import com.opentae.data.user.beans.Massage;
import com.opentae.data.user.beans.MassageExample;
import com.opentae.data.user.beans.Push;
import com.opentae.data.user.beans.User;
import com.opentae.data.user.services.MassageService;

/**
 *
 *@author 自动生成
 *@see Massage
 *@docRoot com.opentae.data.user.actions.Massage
 *@remark 自动生成
 *生成日期 2016-05-14 09:16:44
 *完成日期
 *内容摘要
 *
 */
public class MassageAction extends BaseAction{
	@Resource(name="tae_massageService")
	private MassageService massageService;
	private Massage record;
	private List<Massage> msgs;
	private String size;

	/**
	 * 留言板页
	 * @return
	 */
	public String massageInit(){
		if(page==null||"".equals(page)){
			page = "1";
		}
		if(size==null||"".equals(size)){
			size="10";
		}
		int start = (Integer.valueOf(page)-1)*Integer.valueOf(size);
		int s = Integer.valueOf(size);
		MassageExample example = new MassageExample();
		example.setOrderByClause("create_time desc");
		msgs = massageService.selectByConditionList(example, start, s);
		massageService.selectByReturnMassage(msgs);
		return "init";
	}
	/**
	 * 提交留言
	 * @return
	 */
	public String addMassage(){
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
	    	//插入留言
	    	Date d = new Date();
	    	record.setCreateTime(d);
	    	record.setUserId(user.getUserId());
	    	record.setUserName(user.getUserName());
	    	massageService.insertMassage(record);
	    	MassageExample example = new MassageExample();
	    	example.setOrderByClause("create_time desc");
	    	example.createCriteria().andUserIdEqualTo(user.getUserId());
	    	List<Massage> msgs = massageService.selectByConditionList(example,0,10);
	    	//插入推送
			Push push = new Push();
			push.setCount(1l);
			push.setFromUserId(user.getUserId());
			push.setFromUserName(user.getUserName());
			push.setMid(msgs.get(0).getMid());
			massageService.insertPush(push);
			obj = JSONObject.fromObject("{'result':'success'}");
		return "obj";
	}
	
	public MassageService getMassageService() {
		return massageService;
	}
	public void setMassageService(MassageService massageService) {
		this.massageService = massageService;
	}
	public Massage getRecord() {
		return record;
	}
	public void setRecord(Massage record) {
		this.record = record;
	}
	public List<Massage> getMsgs() {
		return msgs;
	}
	public void setMsgs(List<Massage> msgs) {
		this.msgs = msgs;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
}
