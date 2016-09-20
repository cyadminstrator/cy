package com.opentae.data.user.services;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.opentae.data.user.beans.BlackList;
import com.opentae.data.user.interfaces.BlackListMapper;

/**
 *
 *@author 自动生成
 *@see BlackList
 *@docRoot com.opentae.data.user.services.BlackList
 *@remark 自动生成
 *生成日期：2016-05-14 09:17:11
 *完成日期：
 *内容摘要：
 */
@Service("tae_blackListService")
public class BlackListService {
	@Resource(name="tae_mall_blackListMapper")
	private BlackListMapper blackListMapper;
	
	
	
	public BlackListMapper getblackListMapper() {
		return blackListMapper;
	}
	public void setblackListMapper(BlackListMapper blackListMapper) {
		this.blackListMapper = blackListMapper;
	}
}
