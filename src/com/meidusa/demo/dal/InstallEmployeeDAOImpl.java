package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.InstallEmployee;
import com.meidusa.demo.dal.model.InstallEmployeeExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class InstallEmployeeDAOImpl extends SqlMapClientDaoSupport implements InstallEmployeeDAO {

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    public InstallEmployeeDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    public int countByExample(InstallEmployeeExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("installemployee.countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    public int deleteByExample(InstallEmployeeExample example) {
        int rows = getSqlMapClientTemplate().delete("installemployee.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    public int deleteByPrimaryKey(String id) {
        InstallEmployee key = new InstallEmployee();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("installemployee.deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    public void insert(InstallEmployee record) {
        getSqlMapClientTemplate().insert("installemployee.insert", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    public void insertSelective(InstallEmployee record) {
        getSqlMapClientTemplate().insert("installemployee.insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    @SuppressWarnings("unchecked")
    public List<InstallEmployee> selectByExample(InstallEmployeeExample example) {
        List<InstallEmployee> list = getSqlMapClientTemplate().queryForList("installemployee.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    public InstallEmployee selectByPrimaryKey(String id) {
        InstallEmployee key = new InstallEmployee();
        key.setId(id);
        InstallEmployee record = (InstallEmployee) getSqlMapClientTemplate().queryForObject("installemployee.selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    public int updateByExampleSelective(InstallEmployee record, InstallEmployeeExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("installemployee.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    public int updateByExample(InstallEmployee record, InstallEmployeeExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("installemployee.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    public int updateByPrimaryKeySelective(InstallEmployee record) {
        int rows = getSqlMapClientTemplate().update("installemployee.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    public int updateByPrimaryKey(InstallEmployee record) {
        int rows = getSqlMapClientTemplate().update("installemployee.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS Ibator.
     * This class corresponds to the database table installemployee
     *
     * @ibatorgenerated Sat Jun 29 09:11:28 CST 2013
     */
    protected static class UpdateByExampleParms extends InstallEmployeeExample {
        private Object record;

        public UpdateByExampleParms(Object record, InstallEmployeeExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

	@Override
	public List<InstallEmployee> selectByExampleWithBLOBs(
			InstallEmployeeExample example) {
        List<InstallEmployee> list = getSqlMapClientTemplate().queryForList("installemployee.selectByExample", example);
        return list;
	}

	@Override
	public List<InstallEmployee> selectByExampleWithoutBLOBs(
			InstallEmployeeExample example) {
        List<InstallEmployee> list = getSqlMapClientTemplate().queryForList("installemployee.selectByExample", example);
        return list;
	}

	@Override
	public int updateByExampleWithBLOBs(InstallEmployee arg0,
			InstallEmployeeExample arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExampleWithoutBLOBs(InstallEmployee arg0,
			InstallEmployeeExample arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(InstallEmployee arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeyWithoutBLOBs(InstallEmployee arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}