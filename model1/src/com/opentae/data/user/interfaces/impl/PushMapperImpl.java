package com.opentae.data.user.interfaces.impl;

import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

import com.opentae.data.user.interfaces.PushMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 *
 *@author 自动生成
 *@see com.opentae.data.user.beans.Push
 *@docRoot com.opentae.data.user.interfaces.impl.Push
 *@remark 自动生成
 *生成日期：2016-05-14 09:17:03
 *完成日期：
 *内容摘要：
 *
 */
@Repository("tae_mall_pushMapperImpl")
@Scope("singleton")
@Lazy(true)
public class PushMapperImpl{
    @Resource(name="tae_mall_pushMapper")
    PushMapper mapper;
}
