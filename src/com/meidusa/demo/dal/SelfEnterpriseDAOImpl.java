package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.SelfEnterprise;
import com.meidusa.demo.dal.model.SelfEnterpriseExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class SelfEnterpriseDAOImpl extends SqlMapClientDaoSupport implements SelfEnterpriseDAO {

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    public SelfEnterpriseDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    public int countByExample(SelfEnterpriseExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("selfenterprise.countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    public int deleteByExample(SelfEnterpriseExample example) {
        int rows = getSqlMapClientTemplate().delete("selfenterprise.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    public int deleteByPrimaryKey(String id) {
        SelfEnterprise key = new SelfEnterprise();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("selfenterprise.deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    public void insert(SelfEnterprise record) {
        getSqlMapClientTemplate().insert("selfenterprise.insert", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    public void insertSelective(SelfEnterprise record) {
        getSqlMapClientTemplate().insert("selfenterprise.insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    @SuppressWarnings("unchecked")
    public List<SelfEnterprise> selectByExampleWithBLOBs(SelfEnterpriseExample example) {
        List<SelfEnterprise> list = getSqlMapClientTemplate().queryForList("selfenterprise.selectByExampleWithBLOBs", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    @SuppressWarnings("unchecked")
    public List<SelfEnterprise> selectByExampleWithoutBLOBs(SelfEnterpriseExample example) {
        List<SelfEnterprise> list = getSqlMapClientTemplate().queryForList("selfenterprise.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    public SelfEnterprise selectByPrimaryKey(String id) {
        SelfEnterprise key = new SelfEnterprise();
        key.setId(id);
        SelfEnterprise record = (SelfEnterprise) getSqlMapClientTemplate().queryForObject("selfenterprise.selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    public int updateByExampleSelective(SelfEnterprise record, SelfEnterpriseExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("selfenterprise.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    public int updateByExampleWithBLOBs(SelfEnterprise record, SelfEnterpriseExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("selfenterprise.updateByExampleWithBLOBs", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    public int updateByExampleWithoutBLOBs(SelfEnterprise record, SelfEnterpriseExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("selfenterprise.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    public int updateByPrimaryKeySelective(SelfEnterprise record) {
        int rows = getSqlMapClientTemplate().update("selfenterprise.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    public int updateByPrimaryKeyWithBLOBs(SelfEnterprise record) {
        int rows = getSqlMapClientTemplate().update("selfenterprise.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    public int updateByPrimaryKeyWithoutBLOBs(SelfEnterprise record) {
        int rows = getSqlMapClientTemplate().update("selfenterprise.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS Ibator.
     * This class corresponds to the database table selfenterprise
     *
     * @ibatorgenerated Thu Jun 13 22:12:42 CST 2013
     */
    protected static class UpdateByExampleParms extends SelfEnterpriseExample {
        private Object record;

        public UpdateByExampleParms(Object record, SelfEnterpriseExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}