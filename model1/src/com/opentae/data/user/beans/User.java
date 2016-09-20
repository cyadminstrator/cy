package com.opentae.data.user.beans;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
/**
 *@author 自动生成
 *@see User
 *@docRoot com.opentae.data.user.beans.User
 *@remark 自动生成
 *生成日期：2016-05-13 11:24:34
 *完成日期：
 *内容摘要：
 *
 */
public class User {

	/***/
	@Id
@GeneratedValue(generator="JDBC")
	private java.lang.Long userId;
	/**账号*/
	private java.lang.String userName;
	/**密码*/
	private java.lang.String password;
	/**权限1为管理员默认为0*/
	private java.lang.Integer level;
	/**手机号码*/
	private java.lang.String phone;
	/**备注*/
	private java.lang.String remark;

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
	/**
  	* 
	*get方法
  	*账号
 	*自动生成
  	*/
    public java.lang.String getUserName() {
        return userName;
    }

    /**
  	* 
  	*set方法
	*账号
 	*自动生成
  	*/
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }
	/**
  	* 
	*get方法
  	*密码
 	*自动生成
  	*/
    public java.lang.String getPassword() {
        return password;
    }

    /**
  	* 
  	*set方法
	*密码
 	*自动生成
  	*/
    public void setPassword(java.lang.String password) {
        this.password = password;
    }
	/**
  	* 
	*get方法
  	*权限1为管理员默认为0
 	*自动生成
  	*/
    public java.lang.Integer getLevel() {
        return level;
    }

    /**
  	* 
  	*set方法
	*权限1为管理员默认为0
 	*自动生成
  	*/
    public void setLevel(java.lang.Integer level) {
        this.level = level;
    }
	/**
  	* 
	*get方法
  	*手机号码
 	*自动生成
  	*/
    public java.lang.String getPhone() {
        return phone;
    }

    /**
  	* 
  	*set方法
	*手机号码
 	*自动生成
  	*/
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }
	/**
  	* 
	*get方法
  	*备注
 	*自动生成
  	*/
    public java.lang.String getRemark() {
        return remark;
    }

    /**
  	* 
  	*set方法
	*备注
 	*自动生成
  	*/
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }
}
