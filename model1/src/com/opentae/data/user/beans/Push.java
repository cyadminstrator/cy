package com.opentae.data.user.beans;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
/**
 *@author 自动生成
 *@see Push
 *@docRoot com.opentae.data.user.beans.Push
 *@remark 自动生成
 *生成日期：2016-05-14 09:17:03
 *完成日期：
 *内容摘要：
 *
 */
public class Push {

	/***/
	@Id
@GeneratedValue(generator="JDBC")
	private java.lang.Long pid;
	/**留言ID*/
	private java.lang.Long mid;
	/**收到信息的条数*/
	private java.lang.Long count;
	/***/
	private java.lang.Long fromUserId;
	/**发的人*/
	private java.lang.String fromUserName;

	/**
  	* 
	*get方法
  	*
 	*自动生成
  	*/
    public java.lang.Long getPid() {
        return pid;
    }

    /**
  	* 
  	*set方法
	*
 	*自动生成
  	*/
    public void setPid(java.lang.Long pid) {
        this.pid = pid;
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
  	*收到信息的条数
 	*自动生成
  	*/
    public java.lang.Long getCount() {
        return count;
    }

    /**
  	* 
  	*set方法
	*收到信息的条数
 	*自动生成
  	*/
    public void setCount(java.lang.Long count) {
        this.count = count;
    }
	/**
  	* 
	*get方法
  	*
 	*自动生成
  	*/
    public java.lang.Long getFromUserId() {
        return fromUserId;
    }

    /**
  	* 
  	*set方法
	*
 	*自动生成
  	*/
    public void setFromUserId(java.lang.Long fromUserId) {
        this.fromUserId = fromUserId;
    }
	/**
  	* 
	*get方法
  	*发的人
 	*自动生成
  	*/
    public java.lang.String getFromUserName() {
        return fromUserName;
    }

    /**
  	* 
  	*set方法
	*发的人
 	*自动生成
  	*/
    public void setFromUserName(java.lang.String fromUserName) {
        this.fromUserName = fromUserName;
    }
}
