package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.VEnterpriseAllInfo;
import com.meidusa.demo.dal.model.VEnterpriseAllInfoExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class VEnterpriseAllInfoDAOImpl extends SqlMapClientDaoSupport implements VEnterpriseAllInfoDAO {

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    public VEnterpriseAllInfoDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    public int countByExample(VEnterpriseAllInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("venterpriseallinfo.countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    public int deleteByExample(VEnterpriseAllInfoExample example) {
        int rows = getSqlMapClientTemplate().delete("venterpriseallinfo.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    public void insert(VEnterpriseAllInfo record) {
        getSqlMapClientTemplate().insert("venterpriseallinfo.insert", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    public void insertSelective(VEnterpriseAllInfo record) {
        getSqlMapClientTemplate().insert("venterpriseallinfo.insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    @SuppressWarnings("unchecked")
    public List<VEnterpriseAllInfo> selectByExample(VEnterpriseAllInfoExample example) {
        List<VEnterpriseAllInfo> list = getSqlMapClientTemplate().queryForList("venterpriseallinfo.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    public int updateByExampleSelective(VEnterpriseAllInfo record, VEnterpriseAllInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("venterpriseallinfo.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    public int updateByExample(VEnterpriseAllInfo record, VEnterpriseAllInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("venterpriseallinfo.updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS Ibator.
     * This class corresponds to the database table venterpriseallinfo
     *
     * @ibatorgenerated Tue Jun 18 15:42:45 CST 2013
     */
    protected static class UpdateByExampleParms extends VEnterpriseAllInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, VEnterpriseAllInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

	@Override
	public int deleteByPrimaryKey(String arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<VEnterpriseAllInfo> selectByExampleWithBLOBs(
			VEnterpriseAllInfoExample arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VEnterpriseAllInfo> selectByExampleWithoutBLOBs(
			VEnterpriseAllInfoExample arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VEnterpriseAllInfo selectByPrimaryKey(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleWithBLOBs(VEnterpriseAllInfo arg0,
			VEnterpriseAllInfoExample arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExampleWithoutBLOBs(VEnterpriseAllInfo arg0,
			VEnterpriseAllInfoExample arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(VEnterpriseAllInfo arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(VEnterpriseAllInfo arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeyWithoutBLOBs(VEnterpriseAllInfo arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}