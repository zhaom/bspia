package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.ExamEnrolls;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.web.common.action.Constants;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class ExamEnrollsAction extends BaseUploadAction<ExamEnrolls, Cookie>
		implements Preparable, ModelDriven<ExamEnrolls> {

	private ExamEnrolls model;

	@Override
	public ExamEnrolls getModel() {
		return model;
	}

	public void prepare() throws Exception {
		if (this.requestId == null || this.requestId.isEmpty()) {
			model = new ExamEnrolls();
		} else {
			Result r = this.ao.doGet(this.getRequestId());
			model = (ExamEnrolls) r.getDefaultModel();
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
