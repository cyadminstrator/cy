package com.opentae.data.user.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.opentae.data.user.beans.Push;
import com.opentae.data.user.interfaces.PushMapper;

/**
 *
 *@author 自动生成
 *@see Push
 *@docRoot com.opentae.data.user.services.Push
 *@remark 自动生成
 *生成日期：2016-05-14 09:17:03
 *完成日期：
 *内容摘要：
 */
@Service("tae_pushService")
public class PushService {
	@Resource(name="tae_mall_pushMapper")
	private PushMapper pushMapper;
	
	
	public PushMapper getpushMapper() {
		return pushMapper;
	}
	public void setpushMapper(PushMapper pushMapper) {
		this.pushMapper = pushMapper;
	}
}
