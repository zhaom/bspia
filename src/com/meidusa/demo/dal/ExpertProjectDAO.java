package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.ExpertProject;
import com.meidusa.demo.dal.model.ExpertProjectExample;
import com.meidusa.demo.dal.model.ExpertProjectWithBLOBs;
import com.meidusa.toolkit.dal.ibator.AbstractDAO;
import java.util.List;

public interface ExpertProjectDAO extends AbstractDAO<ExpertProjectWithBLOBs, ExpertProjectExample> {
    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expertproject
     *
     * @ibatorgenerated Sat Jul 10 10:55:45 CST 2010
     */
    int countByExample(ExpertProjectExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expertproject
     *
     * @ibatorgenerated Sat Jul 10 10:55:45 CST 2010
     */
    int deleteByExample(ExpertProjectExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expertproject
     *
     * @ibatorgenerated Sat Jul 10 10:55:45 CST 2010
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expertproject
     *
     * @ibatorgenerated Sat Jul 10 10:55:45 CST 2010
     */
    void insert(ExpertProjectWithBLOBs record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expertproject
     *
     * @ibatorgenerated Sat Jul 10 10:55:45 CST 2010
     */
    void insertSelective(ExpertProjectWithBLOBs record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expertproject
     *
     * @ibatorgenerated Sat Jul 10 10:55:45 CST 2010
     */
    List<ExpertProjectWithBLOBs> selectByExampleWithBLOBs(ExpertProjectExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expertproject
     *
     * @ibatorgenerated Sat Jul 10 10:55:45 CST 2010
     */
    List<ExpertProjectWithBLOBs> selectByExampleWithoutBLOBs(ExpertProjectExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expertproject
     *
     * @ibatorgenerated Sat Jul 10 10:55:45 CST 2010
     */
    ExpertProjectWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expertproject
     *
     * @ibatorgenerated Sat Jul 10 10:55:45 CST 2010
     */
    int updateByExampleSelective(ExpertProjectWithBLOBs record, ExpertProjectExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expertproject
     *
     * @ibatorgenerated Sat Jul 10 10:55:45 CST 2010
     */
    int updateByExample(ExpertProjectWithBLOBs record, ExpertProjectExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expertproject
     *
     * @ibatorgenerated Sat Jul 10 10:55:45 CST 2010
     */
    int updateByExample(ExpertProject record, ExpertProjectExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expertproject
     *
     * @ibatorgenerated Sat Jul 10 10:55:45 CST 2010
     */
    int updateByPrimaryKeySelective(ExpertProjectWithBLOBs record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expertproject
     *
     * @ibatorgenerated Sat Jul 10 10:55:45 CST 2010
     */
    int updateByPrimaryKey(ExpertProjectWithBLOBs record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expertproject
     *
     * @ibatorgenerated Sat Jul 10 10:55:45 CST 2010
     */
    int updateByPrimaryKey(ExpertProject record);
}