package com.opentae.data.user.interfaces.impl;

import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

import com.opentae.data.user.interfaces.MassageMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 *
 *@author 自动生成
 *@see com.opentae.data.user.beans.Massage
 *@docRoot com.opentae.data.user.interfaces.impl.Massage
 *@remark 自动生成
 *生成日期：2016-05-14 09:16:44
 *完成日期：
 *内容摘要：
 *
 */
@Repository("tae_mall_massageMapperImpl")
@Scope("singleton")
@Lazy(true)
public class MassageMapperImpl{
    @Resource(name="tae_mall_massageMapper")
    MassageMapper mapper;
}
