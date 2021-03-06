package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.Expert;
import com.meidusa.demo.dal.model.ExpertExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class ExpertDAOImpl extends SqlMapClientDaoSupport implements ExpertDAO {

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    public ExpertDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    public int countByExample(ExpertExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("expert.countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    public int deleteByExample(ExpertExample example) {
        int rows = getSqlMapClientTemplate().delete("expert.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    public int deleteByPrimaryKey(String id) {
        Expert key = new Expert();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("expert.deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    public void insert(Expert record) {
        getSqlMapClientTemplate().insert("expert.insert", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    public void insertSelective(Expert record) {
        getSqlMapClientTemplate().insert("expert.insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    @SuppressWarnings("unchecked")
    public List<Expert> selectByExampleWithBLOBs(ExpertExample example) {
    	logger.debug("select expert with blobs-----------------");
        List<Expert> list = getSqlMapClientTemplate().queryForList("expert.selectByExampleWithBLOBs", example);
        if(list != null){
        	logger.debug("select expert with blobs,size---->"+list.size());
        }
        return list;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    @SuppressWarnings("unchecked")
    public List<Expert> selectByExampleWithoutBLOBs(ExpertExample example) {
    	logger.debug("select expert without blobs-----------------");
        List<Expert> list = getSqlMapClientTemplate().queryForList("expert.selectByExample", example);
        if(list != null){
        	logger.debug("select expert without blobs,size---->"+list.size());
        }
        return list;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    public Expert selectByPrimaryKey(String id) {
        Expert key = new Expert();
        key.setId(id);
        Expert record = (Expert) getSqlMapClientTemplate().queryForObject("expert.selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    public int updateByExampleSelective(Expert record, ExpertExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("expert.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    public int updateByExampleWithBLOBs(Expert record, ExpertExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("expert.updateByExampleWithBLOBs", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    public int updateByExampleWithoutBLOBs(Expert record, ExpertExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("expert.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    public int updateByPrimaryKeySelective(Expert record) {
        int rows = getSqlMapClientTemplate().update("expert.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    public int updateByPrimaryKeyWithBLOBs(Expert record) {
        int rows = getSqlMapClientTemplate().update("expert.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    public int updateByPrimaryKeyWithoutBLOBs(Expert record) {
        int rows = getSqlMapClientTemplate().update("expert.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS Ibator.
     * This class corresponds to the database table expert
     *
     * @ibatorgenerated Fri Jun 25 23:01:21 CST 2010
     */
    protected static class UpdateByExampleParms extends ExpertExample {
        private Object record;

        public UpdateByExampleParms(Object record, ExpertExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}