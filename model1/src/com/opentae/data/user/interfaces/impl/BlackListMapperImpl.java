package com.opentae.data.user.interfaces.impl;

import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

import com.opentae.data.user.interfaces.BlackListMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 *
 *@author 自动生成
 *@see com.opentae.data.user.beans.BlackList
 *@docRoot com.opentae.data.user.interfaces.impl.BlackList
 *@remark 自动生成
 *生成日期：2016-05-14 09:17:11
 *完成日期：
 *内容摘要：
 *
 */
@Repository("tae_mall_blackListMapperImpl")
@Scope("singleton")
@Lazy(true)
public class BlackListMapperImpl{
    @Resource(name="tae_mall_blackListMapper")
    BlackListMapper mapper;
}
