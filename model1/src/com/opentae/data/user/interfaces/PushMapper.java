package com.opentae.data.user.interfaces;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.opentae.data.user.beans.Push;
import com.opentae.core.mybatis.mapper.Mapper;
import com.opentae.core.mybatis.config.MyBatisRepository;
/**
 *
 *@author 自动生成
 *@see Push
 *@docRoot com.opentae.data.user.interfaces.Push
 *@remark 自动生成
 *生成日期： 2016-05-14 09:17:03
 *完成日期：
 *内容摘要：
 */
@MyBatisRepository("tae_mall_pushMapper")
@Scope("singleton")
@Lazy(true)
public interface PushMapper extends Mapper<Push>{

}
