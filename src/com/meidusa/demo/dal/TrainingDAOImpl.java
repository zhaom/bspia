package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.Training;
import com.meidusa.demo.dal.model.TrainingExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TrainingDAOImpl extends SqlMapClientDaoSupport implements TrainingDAO {

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    public TrainingDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    public int countByExample(TrainingExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("training.countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    public int deleteByExample(TrainingExample example) {
        int rows = getSqlMapClientTemplate().delete("training.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    public int deleteByPrimaryKey(String id) {
        Training key = new Training();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("training.deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    public void insert(Training record) {
        getSqlMapClientTemplate().insert("training.insert", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    public void insertSelective(Training record) {
        getSqlMapClientTemplate().insert("training.insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    @SuppressWarnings("unchecked")
    public List<Training> selectByExampleWithBLOBs(TrainingExample example) {
        List<Training> list = getSqlMapClientTemplate().queryForList("training.selectByExampleWithBLOBs", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    @SuppressWarnings("unchecked")
    public List<Training> selectByExampleWithoutBLOBs(TrainingExample example) {
        List<Training> list = getSqlMapClientTemplate().queryForList("training.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    public Training selectByPrimaryKey(String id) {
        Training key = new Training();
        key.setId(id);
        Training record = (Training) getSqlMapClientTemplate().queryForObject("training.selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    public int updateByExampleSelective(Training record, TrainingExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("training.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    public int updateByExampleWithBLOBs(Training record, TrainingExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("training.updateByExampleWithBLOBs", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    public int updateByExampleWithoutBLOBs(Training record, TrainingExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("training.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    public int updateByPrimaryKeySelective(Training record) {
        int rows = getSqlMapClientTemplate().update("training.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    public int updateByPrimaryKeyWithBLOBs(Training record) {
        int rows = getSqlMapClientTemplate().update("training.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    public int updateByPrimaryKeyWithoutBLOBs(Training record) {
        int rows = getSqlMapClientTemplate().update("training.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS Ibator.
     * This class corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    protected static class UpdateByExampleParms extends TrainingExample {
        private Object record;

        public UpdateByExampleParms(Object record, TrainingExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}