package com.opentae.data.user.beans;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Transient;
/**
 *@author 自动生成
 *@see Massage
 *@docRoot com.opentae.data.user.beans.Massage
 *@remark 自动生成
 *生成日期：2016-05-14 09:16:43
 *完成日期：
 *内容摘要：
 *
 */
public class Massage {

	/***/
	@Id
@GeneratedValue(generator="JDBC")
	private java.lang.Long mid;
	/** 用户名*/
	private java.lang.String userName;
	/**用户ID*/
	private java.lang.Long userId;
	/**留言内容*/
	private java.lang.String content;
	/**留言时间*/
	private java.util.Date createTime;
	/**是否公开*/
	private java.lang.Integer isOpen;
	@Transient
	private List<ReturnMassage> rmsgs;
	/**
  	* 
	*get方法
  	*
 	*自动生成
  	*/
    public java.lang.Long getMid() {
        return mid;
    }

    /**
  	* 
  	*set方法
	*
 	*自动生成
  	*/
    public void setMid(java.lang.Long mid) {
        this.mid = mid;
    }
	/**
  	* 
	*get方法
  	* 用户名
 	*自动生成
  	*/
    public java.lang.String getUserName() {
        return userName;
    }

    /**
  	* 
  	*set方法
	* 用户名
 	*自动生成
  	*/
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }
	/**
  	* 
	*get方法
  	*用户ID
 	*自动生成
  	*/
    public java.lang.Long getUserId() {
        return userId;
    }

    /**
  	* 
  	*set方法
	*用户ID
 	*自动生成
  	*/
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }
	/**
  	* 
	*get方法
  	*留言内容
 	*自动生成
  	*/
    public java.lang.String getContent() {
        return content;
    }

    /**
  	* 
  	*set方法
	*留言内容
 	*自动生成
  	*/
    public void setContent(java.lang.String content) {
        this.content = content;
    }
	/**
  	* 
	*get方法
  	*留言时间
 	*自动生成
  	*/
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
  	* 
  	*set方法
	*留言时间
 	*自动生成
  	*/
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }
	/**
  	* 
	*get方法
  	*是否公开
 	*自动生成
  	*/
    public java.lang.Integer getIsOpen() {
        return isOpen;
    }

    /**
  	* 
  	*set方法
	*是否公开
 	*自动生成
  	*/
    public void setIsOpen(java.lang.Integer isOpen) {
        this.isOpen = isOpen;
    }

	public List<ReturnMassage> getRmsgs() {
		return rmsgs;
	}

	public void setRmsgs(List<ReturnMassage> rmsgs) {
		this.rmsgs = rmsgs;
	}
    
}
