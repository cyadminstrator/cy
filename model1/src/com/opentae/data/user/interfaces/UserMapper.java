package com.opentae.data.user.interfaces;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.opentae.data.user.beans.User;
import com.opentae.core.mybatis.mapper.Mapper;
import com.opentae.core.mybatis.config.MyBatisRepository;
/**
 *
 *@author 自动生成
 *@see User
 *@docRoot com.opentae.data.user.interfaces.User
 *@remark 自动生成
 *生成日期： 2016-05-11 06:20:27
 *完成日期：
 *内容摘要：
 */
@MyBatisRepository("tae_mall_userMapper")
@Scope("singleton")
@Lazy(true)
public interface UserMapper extends Mapper<User>{
	
}
