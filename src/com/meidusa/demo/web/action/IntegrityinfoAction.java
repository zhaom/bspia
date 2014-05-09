package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.IntegrityInfo;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.web.common.action.Constants;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class IntegrityinfoAction extends
		BaseUploadAction<IntegrityInfo, Cookie> implements Preparable,
		ModelDriven<IntegrityInfo> {

	private IntegrityInfo model;

	@Override
	public IntegrityInfo getModel() {
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
	
	public void prepare() throws Exception {
		if (this.requestId == null || this.requestId.isEmpty()) {
			model = new IntegrityInfo();
		} else {
			Result r = ao.doGet(this.getRequestId());
			model = (IntegrityInfo) r.getDefaultModel();
		}
	}

	public String getForeignKey() {
		if (model != null && model.getForeignKey() != null)
			return model.getForeignKey();
		return this.cookie.getLoginId();
	}
}
