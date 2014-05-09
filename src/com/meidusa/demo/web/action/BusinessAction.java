package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.Business;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.web.common.action.Constants;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class BusinessAction extends BaseUploadAction<Business, Cookie>
		implements Preparable, ModelDriven<Business> {

	private Business model;

	@Override
	public Business getModel() {
		return model;
	}

	public void prepare() throws Exception {
		if (this.requestId == null || this.requestId.isEmpty()) {
			model = new Business();
		} else {
			Result r = ao.doGet(this.getRequestId());
			model = (Business) r.getDefaultModel();
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
