package com.opentae.data.user.interfaces.impl;

import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

import com.opentae.data.user.interfaces.ReturnMassageMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 *
 *@author 自动生成
 *@see com.opentae.data.user.beans.ReturnMassage
 *@docRoot com.opentae.data.user.interfaces.impl.ReturnMassage
 *@remark 自动生成
 *生成日期：2016-05-14 09:16:54
 *完成日期：
 *内容摘要：
 *
 */
@Repository("tae_mall_returnMassageMapperImpl")
@Scope("singleton")
@Lazy(true)
public class ReturnMassageMapperImpl{
    @Resource(name="tae_mall_returnMassageMapper")
    ReturnMassageMapper mapper;
}
