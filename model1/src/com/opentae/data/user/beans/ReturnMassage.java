package com.opentae.data.user.beans;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
/**
 *@author 自动生成
 *@see ReturnMassage
 *@docRoot com.opentae.data.user.beans.ReturnMassage
 *@remark 自动生成
 *生成日期：2016-05-14 09:16:54
 *完成日期：
 *内容摘要：
 *
 */
public class ReturnMassage {

	/***/
	@Id
@GeneratedValue(generator="JDBC")
	private java.lang.Long rmid;
	/**留言ID*/
	private java.lang.Long mid;
	/**用户ID*/
	private java.lang.Long userId;
	/**用户名*/
	private java.lang.String userName;
	/**回复内容*/
	private java.lang.String content;
	/**回复时间*/
	private java.util.Date createTime;

	/**
  	* 
	*get方法
  	*
 	*自动生成
  	*/
    public java.lang.Long getRmid() {
        return rmid;
    }

    /**
  	* 
  	*set方法
	*
 	*自动生成
  	*/
    public void setRmid(java.lang.Long rmid) {
        this.rmid = rmid;
    }
	/**
  	* 
	*get方法
  	*留言ID
 	*自动生成
  	*/
    public java.lang.Long getMid() {
        return mid;
    }

    /**
  	* 
  	*set方法
	*留言ID
 	*自动生成
  	*/
    public void setMid(java.lang.Long mid) {
        this.mid = mid;
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
  	*回复内容
 	*自动生成
  	*/
    public java.lang.String getContent() {
        return content;
    }

    /**
  	* 
  	*set方法
	*回复内容
 	*自动生成
  	*/
    public void setContent(java.lang.String content) {
        this.content = content;
    }
	/**
  	* 
	*get方法
  	*回复时间
 	*自动生成
  	*/
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
  	* 
  	*set方法
	*回复时间
 	*自动生成
  	*/
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }
}
