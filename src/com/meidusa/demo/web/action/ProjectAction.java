package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.Project;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.web.common.action.Constants;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class ProjectAction extends BaseUploadAction<Project, Cookie> implements
		Preparable, ModelDriven<Project> {

	private Project model;


	public void prepare() throws Exception {
		if (this.requestId == null || this.requestId.isEmpty()) {
			model = new Project();
		} else {
			Result r = ao.doGet(getRequestId());
			model = (Project) r.getDefaultModel();
		}

	}


	@Override
	public Project getModel() {
		return model;
	}
	
	public String save() {
		String enterpriseid = null;
		String superReturn = "error";
		if (model != null) {
			enterpriseid = model.getEnterpriseid();
		}
		superReturn = super.save();
		if (Constants.VIEW.equals(superReturn)) {
			this.setRequestId(enterpriseid);
			superReturn = Constants.BROWSE;
		}
		return superReturn;
	}

	public String getForeignKey() {
		if (model != null && model.getForeignKey() != null)
			return model.getForeignKey();
		return this.cookie.getLoginId();
	}
}
