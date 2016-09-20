package com.opentae.data.user.interfaces;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.opentae.data.user.beans.Massage;
import com.opentae.core.mybatis.mapper.Mapper;
import com.opentae.core.mybatis.config.MyBatisRepository;
/**
 *
 *@author 自动生成
 *@see Massage
 *@docRoot com.opentae.data.user.interfaces.Massage
 *@remark 自动生成
 *生成日期： 2016-05-14 09:16:44
 *完成日期：
 *内容摘要：
 */
@MyBatisRepository("tae_mall_massageMapper")
@Scope("singleton")
@Lazy(true)
public interface MassageMapper extends Mapper<Massage>{

}
