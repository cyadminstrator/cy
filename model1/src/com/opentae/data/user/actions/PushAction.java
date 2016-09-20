package com.opentae.data.user.actions;

import javax.annotation.Resource;

import com.opentae.data.user.beans.Push;
import com.opentae.data.user.beans.PushExample;
import com.opentae.data.user.beans.PushExample.Criteria;
import com.opentae.data.user.services.PushService;

/**
 *
 *@author 自动生成
 *@see Push
 *@docRoot com.opentae.data.user.actions.Push
 *@remark 自动生成
 *生成日期 2016-05-14 09:17:03
 *完成日期
 *内容摘要
 *
 */
public class PushAction extends BaseAction{
	@Resource(name="tae_pushService")
	private PushService pushService;
	private Push record;

	
	public PushService getPushService() {
		return pushService;
	}
	public void setPushService(PushService pushService) {
		this.pushService = pushService;
	}
	public Push getRecord() {
		return record;
	}
	public void setRecord(Push record) {
		this.record = record;
	}
}
