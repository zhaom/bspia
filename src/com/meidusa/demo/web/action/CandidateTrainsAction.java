package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.CandidateTrains;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.web.common.action.Constants;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class CandidateTrainsAction extends
		BaseUploadAction<CandidateTrains, Cookie> implements Preparable,
		ModelDriven<CandidateTrains> {

	private CandidateTrains model;

	@Override
	public CandidateTrains getModel() {
		return model;
	}

	public void prepare() throws Exception {
		if (this.requestId == null || this.requestId.isEmpty()) {
			model = new CandidateTrains();
		} else {
			Result r = this.ao.doGet(this.getRequestId());
			model = (CandidateTrains) r.getDefaultModel();
		}
	}

	public String save() {
		String candidateid = null;
		String superReturn = "error";
		if (model != null) {
			candidateid = model.getCandidateid();
		}
		superReturn = super.save();
		if (Constants.VIEW.equals(superReturn)) {
			this.setRequestId(candidateid);
			superReturn = Constants.BROWSE;
		}
		return superReturn;
	}

	protected String getForeignKey() {
		if (model != null && model.getForeignKey() != null
				&& !model.getForeignKey().isEmpty()) {
			return model.getForeignKey();
		}
		return this.cookie.getLoginId();
	}
}
