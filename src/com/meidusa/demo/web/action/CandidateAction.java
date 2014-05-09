package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.CandidatesWithBLOBs;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class CandidateAction extends
		BaseUploadAction<CandidatesWithBLOBs, Cookie> implements Preparable,
		ModelDriven<CandidatesWithBLOBs> {

	private CandidatesWithBLOBs model;

	@Override
	public CandidatesWithBLOBs getModel() {

		return model;
	}

	public void prepare() throws Exception {
		if (this.requestId == null || this.requestId.isEmpty()) {
			model = new CandidatesWithBLOBs();
		} else {
			Result r = ao.doGet(getRequestId());
			model = (CandidatesWithBLOBs) r.getDefaultModel();
		}
	}

	protected String getForeignKey() {
		if (model != null && model.getForeignKey() != null
				&& !model.getForeignKey().isEmpty()) {
			return model.getForeignKey();
		}
		return this.cookie.getLoginId();
	}
}
