package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.ExpertProjectWithBLOBs;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.web.common.action.Constants;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class ExpertProjectAction extends
		BaseUploadAction<ExpertProjectWithBLOBs, Cookie> implements
		ModelDriven<ExpertProjectWithBLOBs>, Preparable {

	private ExpertProjectWithBLOBs model;

	public void prepare() throws Exception {
		if (this.requestId == null || this.requestId.isEmpty()) {
			model = new ExpertProjectWithBLOBs();
		} else {
			Result r = this.ao.doGet(this.requestId);
			model = (ExpertProjectWithBLOBs) r.getDefaultModel();
		}
	}

	public String save() {
		String enterpriseid = null;
		String superReturn = "error";
		if (model != null) {
			enterpriseid = model.getEnterpriseid();
		}
		superReturn = super.save();
		if (Constants.VIEW.equals(superReturn)) {
			if (enterpriseid == null || enterpriseid.isEmpty()) {
				superReturn = Constants.VIEW;
			} else {
				this.setRequestId(enterpriseid);
				superReturn = Constants.BROWSE;
			}
		}
		return superReturn;
	}

	@Override
	public ExpertProjectWithBLOBs getModel() {
		return model;
	}

	public String getForeignKey() {
		if (model != null && model.getForeignKey() != null)
			return model.getForeignKey();
		return this.cookie.getLoginId();
	}
}
