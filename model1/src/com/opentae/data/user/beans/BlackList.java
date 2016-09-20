package com.opentae.data.user.beans;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
/**
 *@author 自动生成
 *@see BlackList
 *@docRoot com.opentae.data.user.beans.BlackList
 *@remark 自动生成
 *生成日期：2016-05-14 09:17:11
 *完成日期：
 *内容摘要：
 *
 */
public class BlackList {

	/***/
	@Id
@GeneratedValue(generator="JDBC")
	private java.lang.Long bid;
	/**ip地址*/
	private java.lang.String ip;
	/**用户名*/
	private java.lang.String userName;
	/***/
	private java.lang.Long userId;

	/**
  	* 
	*get方法
  	*
 	*自动生成
  	*/
    public java.lang.Long getBid() {
        return bid;
    }

    /**
  	* 
  	*set方法
	*
 	*自动生成
  	*/
    public void setBid(java.lang.Long bid) {
        this.bid = bid;
    }
	/**
  	* 
	*get方法
  	*ip地址
 	*自动生成
  	*/
    public java.lang.String getIp() {
        return ip;
    }

    /**
  	* 
  	*set方法
	*ip地址
 	*自动生成
  	*/
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }
	/**
  	* 
	*get方法
  	*用户名
 	*自动生成
  	*/
    public java.lang.String getUserName() {
        return userName;
    }

    /**
  	* 
  	*set方法
	*用户名
 	*自动生成
  	*/
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }
	/**
  	* 
	*get方法
  	*
 	*自动生成
  	*/
    public java.lang.Long getUserId() {
        return userId;
    }

    /**
  	* 
  	*set方法
	*
 	*自动生成
  	*/
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }
}
