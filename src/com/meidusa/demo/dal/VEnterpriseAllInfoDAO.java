package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.VEnterpriseAllInfo;
import com.meidusa.demo.dal.model.VEnterpriseAllInfoExample;
import com.meidusa.toolkit.dal.ibator.AbstractDAO;
import java.util.List;

public interface VEnterpriseAllInfoDAO extends AbstractDAO<VEnterpriseAllInfo, VEnterpriseAllInfoExample> {
    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    int countByExample(VEnterpriseAllInfoExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    int deleteByExample(VEnterpriseAllInfoExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    void insert(VEnterpriseAllInfo record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    void insertSelective(VEnterpriseAllInfo record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    List<VEnterpriseAllInfo> selectByExample(VEnterpriseAllInfoExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    int updateByExampleSelective(VEnterpriseAllInfo record, VEnterpriseAllInfoExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    int updateByExample(VEnterpriseAllInfo record, VEnterpriseAllInfoExample example);
}