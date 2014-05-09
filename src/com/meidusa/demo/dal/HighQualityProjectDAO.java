package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.HighQualityProject;
import com.meidusa.demo.dal.model.HighQualityProjectExample;
import com.meidusa.toolkit.dal.ibator.AbstractDAO;
import java.util.List;

public interface HighQualityProjectDAO extends AbstractDAO<HighQualityProject, HighQualityProjectExample> {
    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table highqualityproject
     *
     * @ibatorgenerated Fri Jul 12 23:54:18 CST 2013
     */
    int countByExample(HighQualityProjectExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table highqualityproject
     *
     * @ibatorgenerated Fri Jul 12 23:54:18 CST 2013
     */
    int deleteByExample(HighQualityProjectExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table highqualityproject
     *
     * @ibatorgenerated Fri Jul 12 23:54:18 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table highqualityproject
     *
     * @ibatorgenerated Fri Jul 12 23:54:18 CST 2013
     */
    void insert(HighQualityProject record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table highqualityproject
     *
     * @ibatorgenerated Fri Jul 12 23:54:18 CST 2013
     */
    void insertSelective(HighQualityProject record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table highqualityproject
     *
     * @ibatorgenerated Fri Jul 12 23:54:18 CST 2013
     */
    List<HighQualityProject> selectByExample(HighQualityProjectExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table highqualityproject
     *
     * @ibatorgenerated Fri Jul 12 23:54:18 CST 2013
     */
    HighQualityProject selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table highqualityproject
     *
     * @ibatorgenerated Fri Jul 12 23:54:18 CST 2013
     */
    int updateByExampleSelective(HighQualityProject record, HighQualityProjectExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table highqualityproject
     *
     * @ibatorgenerated Fri Jul 12 23:54:18 CST 2013
     */
    int updateByExample(HighQualityProject record, HighQualityProjectExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table highqualityproject
     *
     * @ibatorgenerated Fri Jul 12 23:54:18 CST 2013
     */
    int updateByPrimaryKeySelective(HighQualityProject record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table highqualityproject
     *
     * @ibatorgenerated Fri Jul 12 23:54:18 CST 2013
     */
    int updateByPrimaryKey(HighQualityProject record);
}