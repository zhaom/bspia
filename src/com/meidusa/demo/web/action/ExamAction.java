package com.meidusa.demo.web.action;

import java.util.List;

import com.meidusa.demo.dal.model.Examination;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.web.page.Paging;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class ExamAction extends BaseUploadAction<Examination, Cookie> implements
		Preparable, ModelDriven<Examination> {

	private Examination model;

	private String selectName;

	private String selectedKey;

	public String getSelectName() {
		return selectName;
	}

	public void setSelectName(String selectName) {
		this.selectName = selectName;
	}

	public String getSelectedKey() {
		return selectedKey;
	}

	public void setSelectedKey(String selectedKey) {
		this.selectedKey = selectedKey;
	}

	@Override
	public Examination getModel() {
		return model;
	}

	public void prepare() throws Exception {
		if (this.requestId == null || this.requestId.isEmpty()) {
			model = new Examination();
		} else {
			Result r = ao.doGet(getRequestId());
			model = (Examination) r.getDefaultModel();
		}
	}

	public String selectList() {
		Paging p = new Paging();
		p.setRows(100);
		Result result = this.ao.doList(this.requestId, new Paging());
		if (result.isSuccess()) {
			this.list = (List) result.getDefaultModel();
			return "selectList";
		}
		ResultCode resultCode = result.getResultCode();
		addActionError(resultCode.getMessage().getMessage());
		return "error";
	}

	protected String getForeignKey() {
		if (model != null && model.getForeignKey() != null
				&& !model.getForeignKey().isEmpty()) {
			return model.getForeignKey();
		}
		return this.cookie.getLoginId();
	}
}
