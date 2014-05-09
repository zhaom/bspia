package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.ProjectStand;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class ProjectStandAction extends BaseUploadAction<ProjectStand, Cookie> implements
Preparable, ModelDriven<ProjectStand> {

	private static final long serialVersionUID = 1L;
	
	private ProjectStand model;

	@Override
	public void prepare() throws Exception {
		if(this.getRequestId() == null || this.getRequestId().isEmpty()){
			model = new ProjectStand(); 
		}else {
			Result result = ao.doGet(this.getRequestId());
			model = (ProjectStand)result.getDefaultModel();
		}	
	}

	@Override
	public ProjectStand getModel() {
		return this.model;
	}

}
