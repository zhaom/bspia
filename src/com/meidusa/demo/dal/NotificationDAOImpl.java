package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.Notification;
import com.meidusa.demo.dal.model.NotificationExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class NotificationDAOImpl extends SqlMapClientDaoSupport implements NotificationDAO {

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    public NotificationDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    public int countByExample(NotificationExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("notification.countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    public int deleteByExample(NotificationExample example) {
        int rows = getSqlMapClientTemplate().delete("notification.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    public int deleteByPrimaryKey(String id) {
        Notification key = new Notification();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("notification.deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    public void insert(Notification record) {
        getSqlMapClientTemplate().insert("notification.insert", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    public void insertSelective(Notification record) {
        getSqlMapClientTemplate().insert("notification.insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    @SuppressWarnings("unchecked")
    public List<Notification> selectByExampleWithBLOBs(NotificationExample example) {
        List<Notification> list = getSqlMapClientTemplate().queryForList("notification.selectByExampleWithBLOBs", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    @SuppressWarnings("unchecked")
    public List<Notification> selectByExampleWithoutBLOBs(NotificationExample example) {
        List<Notification> list = getSqlMapClientTemplate().queryForList("notification.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    public Notification selectByPrimaryKey(String id) {
        Notification key = new Notification();
        key.setId(id);
        Notification record = (Notification) getSqlMapClientTemplate().queryForObject("notification.selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    public int updateByExampleSelective(Notification record, NotificationExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("notification.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    public int updateByExampleWithBLOBs(Notification record, NotificationExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("notification.updateByExampleWithBLOBs", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    public int updateByExampleWithoutBLOBs(Notification record, NotificationExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("notification.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    public int updateByPrimaryKeySelective(Notification record) {
        int rows = getSqlMapClientTemplate().update("notification.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    public int updateByPrimaryKeyWithBLOBs(Notification record) {
        int rows = getSqlMapClientTemplate().update("notification.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    public int updateByPrimaryKeyWithoutBLOBs(Notification record) {
        int rows = getSqlMapClientTemplate().update("notification.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS Ibator.
     * This class corresponds to the database table notification
     *
     * @ibatorgenerated Sun Apr 25 12:40:10 CST 2010
     */
    protected static class UpdateByExampleParms extends NotificationExample {
        private Object record;

        public UpdateByExampleParms(Object record, NotificationExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}