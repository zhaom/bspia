package com.meidusa.demo.dal;

import com.meidusa.demo.dal.model.Project;
import com.meidusa.demo.dal.model.ProjectExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class ProjectDAOImpl extends SqlMapClientDaoSupport implements ProjectDAO {

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public ProjectDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public int countByExample(ProjectExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("project.countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public int deleteByExample(ProjectExample example) {
        int rows = getSqlMapClientTemplate().delete("project.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public int deleteByPrimaryKey(String id) {
        Project key = new Project();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("project.deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public void insert(Project record) {
        getSqlMapClientTemplate().insert("project.insert", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public void insertSelective(Project record) {
        getSqlMapClientTemplate().insert("project.insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    @SuppressWarnings("unchecked")
    public List<Project> selectByExampleWithBLOBs(ProjectExample example) {
        List<Project> list = getSqlMapClientTemplate().queryForList("project.selectByExampleWithBLOBs", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    @SuppressWarnings("unchecked")
    public List<Project> selectByExampleWithoutBLOBs(ProjectExample example) {
        List<Project> list = getSqlMapClientTemplate().queryForList("project.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public Project selectByPrimaryKey(String id) {
        Project key = new Project();
        key.setId(id);
        Project record = (Project) getSqlMapClientTemplate().queryForObject("project.selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public int updateByExampleSelective(Project record, ProjectExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("project.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public int updateByExampleWithBLOBs(Project record, ProjectExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("project.updateByExampleWithBLOBs", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public int updateByExampleWithoutBLOBs(Project record, ProjectExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("project.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public int updateByPrimaryKeySelective(Project record) {
        int rows = getSqlMapClientTemplate().update("project.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public int updateByPrimaryKeyWithBLOBs(Project record) {
        int rows = getSqlMapClientTemplate().update("project.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public int updateByPrimaryKeyWithoutBLOBs(Project record) {
        int rows = getSqlMapClientTemplate().update("project.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS Ibator.
     * This class corresponds to the database table project
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    protected static class UpdateByExampleParms extends ProjectExample {
        private Object record;

        public UpdateByExampleParms(Object record, ProjectExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}