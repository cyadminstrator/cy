package com.opentae.data.user.interfaces.impl;

import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

import com.opentae.data.user.interfaces.UserMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 *
 *@author 自动生成
 *@see com.opentae.data.user.beans.User
 *@docRoot com.opentae.data.user.interfaces.impl.User
 *@remark 自动生成
 *生成日期：2016-05-11 06:20:27
 *完成日期：
 *内容摘要：
 *
 */
@Repository("tae_mall_userMapperImpl")
@Scope("singleton")
@Lazy(true)
public class UserMapperImpl{
    @Resource(name="tae_mall_userMapper")
    UserMapper mapper;
}
