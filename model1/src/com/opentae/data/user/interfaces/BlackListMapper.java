package com.opentae.data.user.interfaces;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.opentae.data.user.beans.BlackList;
import com.opentae.core.mybatis.mapper.Mapper;
import com.opentae.core.mybatis.config.MyBatisRepository;
/**
 *
 *@author 自动生成
 *@see BlackList
 *@docRoot com.opentae.data.user.interfaces.BlackList
 *@remark 自动生成
 *生成日期： 2016-05-14 09:17:11
 *完成日期：
 *内容摘要：
 */
@MyBatisRepository("tae_mall_blackListMapper")
@Scope("singleton")
@Lazy(true)
public interface BlackListMapper extends Mapper<BlackList>{

}
