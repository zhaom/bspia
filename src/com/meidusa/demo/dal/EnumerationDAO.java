package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.Enumeration;
import com.meidusa.demo.dal.model.EnumerationExample;
import com.meidusa.toolkit.dal.ibator.AbstractDAO;
import java.util.List;

public interface EnumerationDAO extends AbstractDAO<Enumeration, EnumerationExample> {

	/**
	 * This method was generated by Apache iBATIS Ibator. This method corresponds to the database table enumeration
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	int countByExample(EnumerationExample example);

	/**
	 * This method was generated by Apache iBATIS Ibator. This method corresponds to the database table enumeration
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	int deleteByExample(EnumerationExample example);

	/**
	 * This method was generated by Apache iBATIS Ibator. This method corresponds to the database table enumeration
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	int deleteByPrimaryKey(String enumid);

	/**
	 * This method was generated by Apache iBATIS Ibator. This method corresponds to the database table enumeration
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	void insert(Enumeration record);

	/**
	 * This method was generated by Apache iBATIS Ibator. This method corresponds to the database table enumeration
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	void insertSelective(Enumeration record);

	/**
	 * This method was generated by Apache iBATIS Ibator. This method corresponds to the database table enumeration
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	List<Enumeration> selectByExample(EnumerationExample example);

	/**
	 * This method was generated by Apache iBATIS Ibator. This method corresponds to the database table enumeration
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	Enumeration selectByPrimaryKey(String enumid);

	/**
	 * This method was generated by Apache iBATIS Ibator. This method corresponds to the database table enumeration
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	int updateByExampleSelective(Enumeration record, EnumerationExample example);

	/**
	 * This method was generated by Apache iBATIS Ibator. This method corresponds to the database table enumeration
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	int updateByExample(Enumeration record, EnumerationExample example);

	/**
	 * This method was generated by Apache iBATIS Ibator. This method corresponds to the database table enumeration
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	int updateByPrimaryKeySelective(Enumeration record);

	/**
	 * This method was generated by Apache iBATIS Ibator. This method corresponds to the database table enumeration
	 * @ibatorgenerated  Sat Apr 24 14:06:07 CST 2010
	 */
	int updateByPrimaryKey(Enumeration record);
}