package com.opentae.data.user.actions;

import javax.annotation.Resource;

import com.opentae.data.user.beans.BlackList;
import com.opentae.data.user.services.BlackListService;

/**
 *
 *@author 自动生成
 *@see BlackList
 *@docRoot com.opentae.data.user.actions.BlackList
 *@remark 自动生成
 *生成日期 2016-05-14 09:17:11
 *完成日期
 *内容摘要
 *
 */
public class BlackListAction extends BaseAction{
	@Resource(name="tae_blackListService")
	private BlackListService blackListService;
	private BlackList record;

	
	
	public BlackListService getBlackListService() {
		return blackListService;
	}
	public void setBlackListService(BlackListService blackListService) {
		this.blackListService = blackListService;
	}
	public BlackList getRecord() {
		return record;
	}
	public void setRecord(BlackList record) {
		this.record = record;
	}
}
