package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.SelfTechPerson;
import com.meidusa.demo.dal.model.SelfTechPersonExample;
import com.meidusa.toolkit.dal.ibator.AbstractDAO;
import java.util.List;

public interface SelfTechPersonDAO extends AbstractDAO<SelfTechPerson, SelfTechPersonExample> {
    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selftechperson
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    int countByExample(SelfTechPersonExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selftechperson
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    int deleteByExample(SelfTechPersonExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selftechperson
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selftechperson
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    void insert(SelfTechPerson record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selftechperson
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    void insertSelective(SelfTechPerson record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selftechperson
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    List<SelfTechPerson> selectByExample(SelfTechPersonExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selftechperson
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    SelfTechPerson selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selftechperson
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    int updateByExampleSelective(SelfTechPerson record, SelfTechPersonExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selftechperson
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    int updateByExample(SelfTechPerson record, SelfTechPersonExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selftechperson
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    int updateByPrimaryKeySelective(SelfTechPerson record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selftechperson
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    int updateByPrimaryKey(SelfTechPerson record);
}