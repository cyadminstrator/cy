package com.opentae.data.user.services;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.opentae.data.user.beans.Massage;
import com.opentae.data.user.beans.MassageExample;
import com.opentae.data.user.beans.Push;
import com.opentae.data.user.beans.ReturnMassage;
import com.opentae.data.user.beans.ReturnMassageExample;
import com.opentae.data.user.interfaces.MassageMapper;
import com.opentae.data.user.interfaces.PushMapper;
import com.opentae.data.user.interfaces.ReturnMassageMapper;

/**
 *
 *@author 自动生成
 *@see Massage
 *@docRoot com.opentae.data.user.services.Massage
 *@remark 自动生成
 *生成日期：2016-05-14 09:16:44
 *完成日期：
 *内容摘要：
 */
@Service("tae_massageService")
public class MassageService {
	@Resource(name="tae_mall_massageMapper")
	private MassageMapper massageMapper;
	@Resource(name="tae_mall_pushMapper")
	private PushMapper pushMapper;
	@Resource(name="tae_mall_returnMassageMapper")
	private ReturnMassageMapper returnMassageMapper;
	
	/**
	 * 增加留言
	 * @param msg
	 */
	public void insertMassage(Massage msg){
		massageMapper.insertSelective(msg);
	}
	
	/**
	 * 插入推送表
	 */
	public void insertPush(Push push){
		pushMapper.insertSelective(push);
		
	}
	
	public void selectByReturnMassage(List<Massage> msgs){
		for(Massage m : msgs){
			ReturnMassageExample example = new ReturnMassageExample();
			example.setStartIndex(0);
			example.setEndIndex(3);
			example.setOrderByClause("create_time asc");
			example.createCriteria().andMidEqualTo(m.getMid());
			List<ReturnMassage> rms = returnMassageMapper.selectByConditionList(example);	
			m.setRmsgs(rms);
		}
		
	}
	
	
	public List<Massage> selectByEx(MassageExample example){
		return massageMapper.selectByExample(example);
	}
	
	public List<Massage> selectByConditionList(MassageExample example,int start,int size){
		example.setStartIndex(start);
		example.setEndIndex(size);
		return massageMapper.selectByConditionList(example);
	}
	
	
	public MassageMapper getmassageMapper() {
		return massageMapper;
	}
	public void setmassageMapper(MassageMapper massageMapper) {
		this.massageMapper = massageMapper;
	}
}
