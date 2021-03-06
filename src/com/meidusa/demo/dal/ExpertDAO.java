package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.Expert;
import com.meidusa.demo.dal.model.ExpertExample;
import com.meidusa.toolkit.dal.ibator.AbstractDAO;
import java.util.List;

public interface ExpertDAO extends AbstractDAO<Expert, ExpertExample> {
    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    int countByExample(ExpertExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    int deleteByExample(ExpertExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    void insert(Expert record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    void insertSelective(Expert record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    List<Expert> selectByExampleWithBLOBs(ExpertExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    List<Expert> selectByExampleWithoutBLOBs(ExpertExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    Expert selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    int updateByExampleSelective(Expert record, ExpertExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    int updateByExampleWithBLOBs(Expert record, ExpertExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    int updateByExampleWithoutBLOBs(Expert record, ExpertExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    int updateByPrimaryKeySelective(Expert record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    int updateByPrimaryKeyWithBLOBs(Expert record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    int updateByPrimaryKeyWithoutBLOBs(Expert record);
}