package com.meidusa.demo.web.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.struts2.interceptor.validation.SkipValidation;

import com.meidusa.demo.biz.SelfCompleteProjectAO;
import com.meidusa.demo.biz.SelfCostEngineerAO;
import com.meidusa.demo.biz.SelfTechPersonAO;
import com.meidusa.demo.dal.model.SelfCompleteProject;
import com.meidusa.demo.dal.model.SelfCostEngineer;
import com.meidusa.demo.dal.model.SelfEnterprise;
import com.meidusa.demo.dal.model.SelfTechPerson;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class SelfEnterpriseAction extends BaseUploadAction<SelfEnterprise, Cookie> implements Preparable, ModelDriven<SelfEnterprise> {
	
	private static final long serialVersionUID = 1L;
	
	
	private SelfEnterprise model;

	@Override
	public SelfEnterprise getModel() {
		return model;
	}

	@Override
	public void prepare() throws Exception {
		if (this.getRequestId() == null || this.getRequestId().isEmpty()) {
			model = new SelfEnterprise();
		} else {
			Result r = ao.doGet(this.getRequestId());
			model = (SelfEnterprise) r.getDefaultModel();
		}	
		
	}
	
	private SelfCompleteProjectAO selfCompleteProjectAO;
	
	public void setSelfCompleteProjectAO(SelfCompleteProjectAO selfCompleteProjectAO) {
		this.selfCompleteProjectAO = selfCompleteProjectAO;
	}

	@SkipValidation
	public String viewProj() throws UnsupportedEncodingException {
		log.debug("#################selfenterprise.action viewproj");
		if (getModel() == null) {
		      return "error";
		}
		SelfCompleteProject scp = new SelfCompleteProject();
		scp.setEnterprisename(getModel().getName());
		Result result = selfCompleteProjectAO.doQuery(scp, this.paging);
		if (result.isSuccess()) {
			log.debug("#################selfenterprise.action viewproj,result success");
		    this.list = ((List)result.getDefaultModel());
		    return "viewProj";
		}
	    ResultCode resultCode = result.getResultCode();
	    addActionError(resultCode.getMessage().getMessage());
	    return "error";

	}
	
	private SelfCostEngineerAO selfCostEngineerAO;

	public void setSelfCostEngineerAO(SelfCostEngineerAO selfCostEngineerAO) {
		this.selfCostEngineerAO = selfCostEngineerAO;
	}
	
	@SkipValidation
	public String viewCost() throws UnsupportedEncodingException {
		log.debug("#################selfenterprise.action viewCost");
		if (getModel() == null) {
		      return "error";
		}
		SelfCostEngineer sce = new SelfCostEngineer();
		sce.setEnterprisename(getModel().getName());
		Result result = selfCostEngineerAO.doQuery(sce, this.paging);
		if (result.isSuccess()) {
			log.debug("#################selfenterprise.action viewCost,result success");
		    this.list = ((List)result.getDefaultModel());
		    return "viewCost";
		}
	    ResultCode resultCode = result.getResultCode();
	    addActionError(resultCode.getMessage().getMessage());
	    return "error";
	}
	
	private SelfTechPersonAO selfTechPersonAO;

	public void setSelfTechPersonAO(SelfTechPersonAO selfTechPersonAO) {
		this.selfTechPersonAO = selfTechPersonAO;
	}
	
	@SkipValidation
	public String viewTech() throws UnsupportedEncodingException {
		log.debug("#################selfenterprise.action viewTech");
		if (getModel() == null) {
		      return "error";
		}
		SelfTechPerson stp = new SelfTechPerson();
		stp.setEnterprisename(getModel().getName());
		Result result = selfTechPersonAO.doQuery(stp, this.paging);
		if (result.isSuccess()) {
			log.debug("#################selfenterprise.action viewTech,result success");
		    this.list = ((List)result.getDefaultModel());
		    return "viewTech";
		}
	    ResultCode resultCode = result.getResultCode();
	    addActionError(resultCode.getMessage().getMessage());
	    return "error";
	}

}
