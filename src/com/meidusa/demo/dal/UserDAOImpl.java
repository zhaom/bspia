package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.User;
import com.meidusa.demo.dal.model.UserExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class UserDAOImpl extends SqlMapClientDaoSupport implements UserDAO {

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table user
     *
     * @ibatorgenerated Wed May 05 22:09:20 CST 2010
     */
    public UserDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table user
     *
     * @ibatorgenerated Wed May 05 22:09:20 CST 2010
     */
    public int countByExample(UserExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("user.countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table user
     *
     * @ibatorgenerated Wed May 05 22:09:20 CST 2010
     */
    public int deleteByExample(UserExample example) {
        int rows = getSqlMapClientTemplate().delete("user.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table user
     *
     * @ibatorgenerated Wed May 05 22:09:20 CST 2010
     */
    public int deleteByPrimaryKey(String id) {
        User key = new User();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("user.deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table user
     *
     * @ibatorgenerated Wed May 05 22:09:20 CST 2010
     */
    public void insert(User record) {
        getSqlMapClientTemplate().insert("user.insert", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table user
     *
     * @ibatorgenerated Wed May 05 22:09:20 CST 2010
     */
    public void insertSelective(User record) {
        getSqlMapClientTemplate().insert("user.insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table user
     *
     * @ibatorgenerated Wed May 05 22:09:20 CST 2010
     */
    @SuppressWarnings("unchecked")
    public List<User> selectByExample(UserExample example) {
        List<User> list = getSqlMapClientTemplate().queryForList("user.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table user
     *
     * @ibatorgenerated Wed May 05 22:09:20 CST 2010
     */
    public User selectByPrimaryKey(String id) {
        User key = new User();
        key.setId(id);
        User record = (User) getSqlMapClientTemplate().queryForObject("user.selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table user
     *
     * @ibatorgenerated Wed May 05 22:09:20 CST 2010
     */
    public int updateByExampleSelective(User record, UserExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("user.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table user
     *
     * @ibatorgenerated Wed May 05 22:09:20 CST 2010
     */
    public int updateByExample(User record, UserExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("user.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table user
     *
     * @ibatorgenerated Wed May 05 22:09:20 CST 2010
     */
    public int updateByPrimaryKeySelective(User record) {
        int rows = getSqlMapClientTemplate().update("user.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table user
     *
     * @ibatorgenerated Wed May 05 22:09:20 CST 2010
     */
    public int updateByPrimaryKey(User record) {
        int rows = getSqlMapClientTemplate().update("user.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS Ibator.
     * This class corresponds to the database table user
     *
     * @ibatorgenerated Wed May 05 22:09:20 CST 2010
     */
    protected static class UpdateByExampleParms extends UserExample {
        private Object record;

        public UpdateByExampleParms(Object record, UserExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

	@SuppressWarnings("unchecked")
	public List<User> selectByExampleWithBLOBs(UserExample arg0) {
        List<User> list = getSqlMapClientTemplate().queryForList("user.selectByExample", arg0);
        return list;
	}

	@SuppressWarnings("unchecked")
	public List<User> selectByExampleWithoutBLOBs(UserExample arg0) {
        List<User> list = getSqlMapClientTemplate().queryForList("user.selectByExample", arg0);
        return list;
	}

	public int updateByExampleWithBLOBs(User arg0, UserExample arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByExampleWithoutBLOBs(User arg0, UserExample arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeyWithBLOBs(User arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeyWithoutBLOBs(User arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}