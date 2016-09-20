package com.opentae.data.user.services;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.opentae.data.user.beans.ReturnMassage;
import com.opentae.data.user.interfaces.ReturnMassageMapper;

/**
 *
 *@author 自动生成
 *@see ReturnMassage
 *@docRoot com.opentae.data.user.services.ReturnMassage
 *@remark 自动生成
 *生成日期：2016-05-14 09:16:54
 *完成日期：
 *内容摘要：
 */
@Service("tae_returnMassageService")
public class ReturnMassageService {
	@Resource(name="tae_mall_returnMassageMapper")
	private ReturnMassageMapper returnMassageMapper;
	
	
	public void insertReturnMassgae(ReturnMassage rm){
		returnMassageMapper.insertSelective(rm);
	}
	
	
	public ReturnMassageMapper getreturnMassageMapper() {
		return returnMassageMapper;
	}
	public void setreturnMassageMapper(ReturnMassageMapper returnMassageMapper) {
		this.returnMassageMapper = returnMassageMapper;
	}
}
