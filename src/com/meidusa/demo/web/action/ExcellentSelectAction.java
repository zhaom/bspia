package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.ExcellentSelectionWithBLOBs;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class ExcellentSelectAction extends
		BaseUploadAction<ExcellentSelectionWithBLOBs, Cookie> implements
		Preparable, ModelDriven<ExcellentSelectionWithBLOBs> {

	private ExcellentSelectionWithBLOBs model;

	public void prepare() throws Exception {
		if (this.requestId == null || this.requestId.isEmpty()) {
			model = new ExcellentSelectionWithBLOBs();
		} else {
			Result r = this.ao.doGet(this.getRequestId());
			model = (ExcellentSelectionWithBLOBs) r.getDefaultModel();
		}
	}

	@Override
	public ExcellentSelectionWithBLOBs getModel() {
		return model;
	}
	
	protected String getForeignKey() {
		if (model != null && model.getForeignKey() != null
				&& !model.getForeignKey().isEmpty()) {
			return model.getForeignKey();
		}
		return this.cookie.getLoginId();
	}
}
