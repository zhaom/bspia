package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.InstallEmployee;
import com.meidusa.demo.dal.model.InstallEmployeeExample;
import com.meidusa.toolkit.dal.ibator.AbstractDAO;
import java.util.List;

public interface InstallEmployeeDAO extends AbstractDAO<InstallEmployee, InstallEmployeeExample> {
    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    int countByExample(InstallEmployeeExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    int deleteByExample(InstallEmployeeExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    void insert(InstallEmployee record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    void insertSelective(InstallEmployee record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    List<InstallEmployee> selectByExample(InstallEmployeeExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    InstallEmployee selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    int updateByExampleSelective(InstallEmployee record, InstallEmployeeExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    int updateByExample(InstallEmployee record, InstallEmployeeExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    int updateByPrimaryKeySelective(InstallEmployee record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    int updateByPrimaryKey(InstallEmployee record);
}