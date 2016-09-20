package com.opentae.data.user.services;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.opentae.data.user.beans.User;
import com.opentae.data.user.beans.UserExample;
import com.opentae.data.user.interfaces.UserMapper;

/**
 *
 *@author 自动生成
 *@see User
 *@docRoot com.opentae.data.user.services.User
 *@remark 自动生成
 *生成日期：2016-05-11 06:20:39
 *完成日期：
 *内容摘要：
 */
@Service("tae_userService")
public class UserService {
	@Resource(name="tae_mall_userMapper")
	private UserMapper userMapper;
	
	/**
	 * 查询用户是否存在
	 * @param userName
	 * @param password
	 * @return
	 */
	public Map<String,Object> selectAccount(String userName,String password){
		Map<String,Object> map = new HashMap<String,Object>();
		boolean falg = false;
		UserExample example = new UserExample();
		example.createCriteria().andUserNameEqualTo(userName).andPasswordEqualTo(password);
		List<User> users = userMapper.selectByExample(example);
		if(users!=null&&!users.isEmpty()){
			if(userName.equals(users.get(0).getUserName())&&password.equals(users.get(0).getPassword())){
				map.put("user", users.get(0));
				falg = true;
			}
		}
		map.put("falg", falg);
		return map;
	}
	/**
	 * 用户注册信息插入数据库
	 * @param user
	 */
	public void insertUser(User user){
		userMapper.insertSelective(user);
	}
	/**
	 * 验证用户是否存在
	 * @param userName
	 * @return
	 */
	public boolean isExist(String userName){
		UserExample example = new UserExample();
		example.createCriteria().andUserNameEqualTo(userName);
		List<User> list = userMapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			return true;
		}
		return false;
	}
}
