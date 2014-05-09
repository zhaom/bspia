package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.ExcellentSelection;
import com.meidusa.demo.dal.model.ExcellentSelectionExample;
import com.meidusa.demo.dal.model.ExcellentSelectionWithBLOBs;
import com.meidusa.toolkit.dal.ibator.AbstractDAO;
import java.util.List;

public interface ExcellentSelectionDAO extends AbstractDAO<ExcellentSelectionWithBLOBs, ExcellentSelectionExample> {
    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table excellentselection
     *
     * @ibatorgenerated Sun Jun 27 08:14:47 CST 2010
     */
    int countByExample(ExcellentSelectionExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table excellentselection
     *
     * @ibatorgenerated Sun Jun 27 08:14:47 CST 2010
     */
    int deleteByExample(ExcellentSelectionExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table excellentselection
     *
     * @ibatorgenerated Sun Jun 27 08:14:47 CST 2010
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table excellentselection
     *
     * @ibatorgenerated Sun Jun 27 08:14:47 CST 2010
     */
    void insert(ExcellentSelectionWithBLOBs record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table excellentselection
     *
     * @ibatorgenerated Sun Jun 27 08:14:47 CST 2010
     */
    void insertSelective(ExcellentSelectionWithBLOBs record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table excellentselection
     *
     * @ibatorgenerated Sun Jun 27 08:14:47 CST 2010
     */
    List<ExcellentSelectionWithBLOBs> selectByExampleWithBLOBs(ExcellentSelectionExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table excellentselection
     *
     * @ibatorgenerated Sun Jun 27 08:14:47 CST 2010
     */
    List<ExcellentSelectionWithBLOBs> selectByExampleWithoutBLOBs(ExcellentSelectionExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table excellentselection
     *
     * @ibatorgenerated Sun Jun 27 08:14:47 CST 2010
     */
    ExcellentSelectionWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table excellentselection
     *
     * @ibatorgenerated Sun Jun 27 08:14:47 CST 2010
     */
    int updateByExampleSelective(ExcellentSelectionWithBLOBs record, ExcellentSelectionExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table excellentselection
     *
     * @ibatorgenerated Sun Jun 27 08:14:47 CST 2010
     */
    int updateByExample(ExcellentSelectionWithBLOBs record, ExcellentSelectionExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table excellentselection
     *
     * @ibatorgenerated Sun Jun 27 08:14:47 CST 2010
     */
    int updateByExample(ExcellentSelection record, ExcellentSelectionExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table excellentselection
     *
     * @ibatorgenerated Sun Jun 27 08:14:47 CST 2010
     */
    int updateByPrimaryKeySelective(ExcellentSelectionWithBLOBs record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table excellentselection
     *
     * @ibatorgenerated Sun Jun 27 08:14:47 CST 2010
     */
    int updateByPrimaryKey(ExcellentSelectionWithBLOBs record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table excellentselection
     *
     * @ibatorgenerated Sun Jun 27 08:14:47 CST 2010
     */
    int updateByPrimaryKey(ExcellentSelection record);
}