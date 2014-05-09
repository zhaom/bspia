package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.Finance;
import com.meidusa.demo.dal.model.FinanceExample;
import com.meidusa.toolkit.dal.ibator.AbstractDAO;
import java.util.List;

public interface FinanceDAO extends AbstractDAO<Finance, FinanceExample> {
    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table finance
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int countByExample(FinanceExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table finance
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int deleteByExample(FinanceExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table finance
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table finance
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    void insert(Finance record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table finance
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    void insertSelective(Finance record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table finance
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    List<Finance> selectByExample(FinanceExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table finance
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    Finance selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table finance
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int updateByExampleSelective(Finance record, FinanceExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table finance
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int updateByExample(Finance record, FinanceExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table finance
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int updateByPrimaryKeySelective(Finance record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table finance
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int updateByPrimaryKey(Finance record);
}