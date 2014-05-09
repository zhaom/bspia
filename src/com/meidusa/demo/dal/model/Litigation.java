package com.meidusa.demo.dal.model;

import com.meidusa.toolkit.dal.ibator.AbstractModel;

public class Litigation extends AbstractModel {
    /**
     * This field was generated by Apache iBATIS Ibator.
     * This field corresponds to the database column litigation.id
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    private String id;

    /**
     * This field was generated by Apache iBATIS Ibator.
     * This field corresponds to the database column litigation.litigationDuring
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    private String litigationduring;

    /**
     * This field was generated by Apache iBATIS Ibator.
     * This field corresponds to the database column litigation.enterpriseid
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    private String enterpriseid;

    /**
     * This field was generated by Apache iBATIS Ibator.
     * This field corresponds to the database column litigation.litigationContent
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    private String litigationcontent;

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method returns the value of the database column litigation.id
     *
     * @return the value of litigation.id
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method sets the value of the database column litigation.id
     *
     * @param id the value for litigation.id
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method returns the value of the database column litigation.litigationDuring
     *
     * @return the value of litigation.litigationDuring
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public String getLitigationduring() {
        return litigationduring;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method sets the value of the database column litigation.litigationDuring
     *
     * @param litigationduring the value for litigation.litigationDuring
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public void setLitigationduring(String litigationduring) {
        this.litigationduring = litigationduring;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method returns the value of the database column litigation.enterpriseid
     *
     * @return the value of litigation.enterpriseid
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public String getEnterpriseid() {
        return enterpriseid;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method sets the value of the database column litigation.enterpriseid
     *
     * @param enterpriseid the value for litigation.enterpriseid
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public void setEnterpriseid(String enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method returns the value of the database column litigation.litigationContent
     *
     * @return the value of litigation.litigationContent
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public String getLitigationcontent() {
        return litigationcontent;
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method sets the value of the database column litigation.litigationContent
     *
     * @param litigationcontent the value for litigation.litigationContent
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public void setLitigationcontent(String litigationcontent) {
        this.litigationcontent = litigationcontent;
    }

	@Override
	public String getForeignKey() {
		return enterpriseid;
	}

	@Override
	public String getPrimaryKey() {
		return id;
	}

	@Override
	public void setForeignKey(String arg0) {
		enterpriseid = arg0;
	}

	@Override
	public void setPrimaryKey(String arg0) {
		id = arg0;
	}
}