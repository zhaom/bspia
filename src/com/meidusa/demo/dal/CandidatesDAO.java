package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.Candidates;
import com.meidusa.demo.dal.model.CandidatesExample;
import com.meidusa.demo.dal.model.CandidatesWithBLOBs;
import com.meidusa.toolkit.dal.ibator.AbstractDAO;
import java.util.List;

public interface CandidatesDAO extends AbstractDAO<CandidatesWithBLOBs, CandidatesExample> {
    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table candidates
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int countByExample(CandidatesExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table candidates
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int deleteByExample(CandidatesExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table candidates
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table candidates
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    void insert(CandidatesWithBLOBs record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table candidates
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    void insertSelective(CandidatesWithBLOBs record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table candidates
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    List<CandidatesWithBLOBs> selectByExampleWithBLOBs(CandidatesExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table candidates
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    List<CandidatesWithBLOBs> selectByExampleWithoutBLOBs(CandidatesExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table candidates
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    CandidatesWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table candidates
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int updateByExampleSelective(CandidatesWithBLOBs record, CandidatesExample example);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table candidates
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int updateByExample(CandidatesWithBLOBs record, CandidatesExample example);



    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table candidates
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int updateByPrimaryKeySelective(CandidatesWithBLOBs record);

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table candidates
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    int updateByPrimaryKey(CandidatesWithBLOBs record);


}