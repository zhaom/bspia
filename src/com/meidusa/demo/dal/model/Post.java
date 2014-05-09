package com.meidusa.demo.dal.model;

import com.meidusa.toolkit.dal.ibator.AbstractModel;

public class Post extends AbstractModel {
    /**
	 * This field was generated by Apache iBATIS Ibator. This field corresponds to the database column post.id
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	private String id;
	/**
	 * This field was generated by Apache iBATIS Ibator. This field corresponds to the database column post.title
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	private String title;
	/**
	 * This field was generated by Apache iBATIS Ibator. This field corresponds to the database column post.loginId
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	private String loginid;
	/**
	 * This field was generated by Apache iBATIS Ibator. This field corresponds to the database column post.content
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	private String content;

	/**
	 * This method was generated by Apache iBATIS Ibator. This method returns the value of the database column post.id
	 * @return  the value of post.id
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by Apache iBATIS Ibator. This method sets the value of the database column post.id
	 * @param id  the value for post.id
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by Apache iBATIS Ibator. This method returns the value of the database column post.title
	 * @return  the value of post.title
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by Apache iBATIS Ibator. This method sets the value of the database column post.title
	 * @param title  the value for post.title
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by Apache iBATIS Ibator. This method returns the value of the database column post.loginId
	 * @return  the value of post.loginId
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	public String getLoginid() {
		return loginid;
	}

	/**
	 * This method was generated by Apache iBATIS Ibator. This method sets the value of the database column post.loginId
	 * @param loginid  the value for post.loginId
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	/**
	 * This method was generated by Apache iBATIS Ibator. This method returns the value of the database column post.content
	 * @return  the value of post.content
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by Apache iBATIS Ibator. This method sets the value of the database column post.content
	 * @param content  the value for post.content
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String getForeignKey() {
		return loginid;
	}

	@Override
	public String getPrimaryKey() {
		return id;
	}

	@Override
	public void setForeignKey(String foreignKey) {
		this.loginid = foreignKey;
		
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		this.id = primaryKey;
		
	}
}