package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.SelfCostEngineer;
import com.meidusa.demo.dal.model.SelfCostEngineerExample;
import com.meidusa.toolkit.dal.ibator.AbstractDAO;
import java.util.List;

public interface SelfCostEngineerDAO extends AbstractDAO<SelfCostEngineer, SelfCostEngineerExample> {
    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfcostengineer
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    int countByExample(SelfCostEngineerExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfcostengineer
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    int deleteByExample(SelfCostEngineerExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfcostengineer
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfcostengineer
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    void insert(SelfCostEngineer record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfcostengineer
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    void insertSelective(SelfCostEngineer record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfcostengineer
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    List<SelfCostEngineer> selectByExample(SelfCostEngineerExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfcostengineer
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    SelfCostEngineer selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfcostengineer
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    int updateByExampleSelective(SelfCostEngineer record, SelfCostEngineerExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfcostengineer
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    int updateByExample(SelfCostEngineer record, SelfCostEngineerExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfcostengineer
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    int updateByPrimaryKeySelective(SelfCostEngineer record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfcostengineer
     *
     * @ibatorgenerated Sun Jun 23 10:43:08 CST 2013
     */
    int updateByPrimaryKey(SelfCostEngineer record);
}