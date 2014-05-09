package com.meidusa.demo.web.action;

import java.util.Date;
import java.util.List;

import org.apache.struts2.interceptor.validation.SkipValidation;

import com.meidusa.demo.biz.support.BaseUploadAO;
import com.meidusa.demo.dal.model.EnterpriseInfo;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.web.common.action.Constants;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class EnterpriseAction extends BaseUploadAction<EnterpriseInfo, Cookie>
		implements Preparable, ModelDriven<EnterpriseInfo> {

	private static final long serialVersionUID = 6712580569936875547L;

	private EnterpriseInfo model;
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void prepare() throws Exception {
		if (this.getRequestId() == null || this.getRequestId().isEmpty()) {
			model = new EnterpriseInfo();
		} else {
			Result r = ao.doGet(this.getRequestId());
			model = (EnterpriseInfo) r.getDefaultModel();
		}
	}

	@Override
	public EnterpriseInfo getModel() {
		return model;
	}

	
	public String save() {
		
		if(model != null && model.getPrimaryKey() != null && model.getPrimaryKey().isEmpty()){
			model.setLastupdateloginid(this.cookie.getLoginId());
		}else
		{
			model.setLastupdateloginid(this.cookie.getLoginId());
			model.setCreateddatetime(new Date());
			model.setLastupdatedatetime(new Date());
		}
		System.out.println("enter action.save()");
		return super.save();
	}

	
	@SkipValidation
	public String editQualification() {
		return "editQualification";
	}
	
	@SkipValidation
	public String editIntegrityinfo() {
		return "editIntegrityinfo";
	}
	
	@SkipValidation
	public String checkIntegrityReport() {
		return "checkIntegrityReport";
	}
	
	public String listbusiness() {
		String listReturn = super.list();
		if (Constants.LIST.equals(listReturn))
			return "listbusiness";
		else
			return listReturn;
	}
	
	public String listfinance() {
		String listReturn = super.list();
		if (Constants.LIST.equals(listReturn))
			return "listfinance";
		else
			return listReturn;
	}

	public String listIntegrityInfo() {
		String listReturn = super.list();
		if (Constants.LIST.equals(listReturn))
			return "listIntegrityInfo";
		else
			return listReturn;
	}
	
	
	public String listlitigation() {
		String listReturn = super.list();
		if (Constants.LIST.equals(listReturn))
			return "listlitigation";
		else
			return listReturn;
	}
	
	public String listQualification() {
		String listReturn = super.list();
		if (Constants.LIST.equals(listReturn))
			return "listQualification";
		else
			return listReturn;
	}

	public String listProduct() {
		String listReturn = super.list();
		if (Constants.LIST.equals(listReturn))
			return "listProduct";
		else
			return listReturn;
	}

	public String listProject() {
		String listReturn = super.list();
		if (Constants.LIST.equals(listReturn))
			return "listProject";
		else
			return listReturn;
	}
	
	public String listExpertProject() {
		String listReturn = super.list();
		if (Constants.LIST.equals(listReturn))
			return "listExpertProject";
		else
			return listReturn;
	}

	
	protected String getForeignKey() {
		if(model != null && model.getPrimaryKey() != null && !model.getPrimaryKey().isEmpty()){
			return model.getCreatedloginid();
		}
		return this.cookie.getLoginId();
	}
	
	public String statistic() {
		log.info("enter EnterpriseAction.statistic()");
		model = new EnterpriseInfo();
		model.setName(name);
		
		return super.statistic();

	}

	
	
}
