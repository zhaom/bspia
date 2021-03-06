package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.Correspondent;
import com.meidusa.demo.dal.model.CorrespondentExample;
import com.meidusa.toolkit.dal.ibator.AbstractDAO;
import java.util.List;

public interface CorrespondentDAO extends AbstractDAO<Correspondent, CorrespondentExample> {
    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table correspondent
     *
     * @ibatorgenerated Sat Jul 10 12:07:53 CST 2010
     */
    int countByExample(CorrespondentExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table correspondent
     *
     * @ibatorgenerated Sat Jul 10 12:07:53 CST 2010
     */
    int deleteByExample(CorrespondentExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table correspondent
     *
     * @ibatorgenerated Sat Jul 10 12:07:53 CST 2010
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table correspondent
     *
     * @ibatorgenerated Sat Jul 10 12:07:53 CST 2010
     */
    void insert(Correspondent record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table correspondent
     *
     * @ibatorgenerated Sat Jul 10 12:07:53 CST 2010
     */
    void insertSelective(Correspondent record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table correspondent
     *
     * @ibatorgenerated Sat Jul 10 12:07:53 CST 2010
     */
    List<Correspondent> selectByExampleWithBLOBs(CorrespondentExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table correspondent
     *
     * @ibatorgenerated Sat Jul 10 12:07:53 CST 2010
     */
    List<Correspondent> selectByExampleWithoutBLOBs(CorrespondentExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table correspondent
     *
     * @ibatorgenerated Sat Jul 10 12:07:53 CST 2010
     */
    Correspondent selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table correspondent
     *
     * @ibatorgenerated Sat Jul 10 12:07:53 CST 2010
     */
    int updateByExampleSelective(Correspondent record, CorrespondentExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table correspondent
     *
     * @ibatorgenerated Sat Jul 10 12:07:53 CST 2010
     */
    int updateByExampleWithBLOBs(Correspondent record, CorrespondentExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table correspondent
     *
     * @ibatorgenerated Sat Jul 10 12:07:53 CST 2010
     */
    int updateByExampleWithoutBLOBs(Correspondent record, CorrespondentExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table correspondent
     *
     * @ibatorgenerated Sat Jul 10 12:07:53 CST 2010
     */
    int updateByPrimaryKeySelective(Correspondent record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table correspondent
     *
     * @ibatorgenerated Sat Jul 10 12:07:53 CST 2010
     */
    int updateByPrimaryKeyWithBLOBs(Correspondent record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table correspondent
     *
     * @ibatorgenerated Sat Jul 10 12:07:53 CST 2010
     */
    int updateByPrimaryKeyWithoutBLOBs(Correspondent record);
}