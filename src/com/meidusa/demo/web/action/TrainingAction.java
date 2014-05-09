package com.meidusa.demo.web.action;

import java.util.List;

import com.meidusa.demo.dal.model.Training;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.web.common.action.BaseAction;
import com.meidusa.toolkit.web.page.Paging;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class TrainingAction extends BaseAction<Training, Cookie> implements
		Preparable, ModelDriven<Training> {

	private Training model;
	
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
	public Training getModel() {
		return model;
	}

	public void prepare() throws Exception {
		if (this.requestId == null || this.requestId.isEmpty()) {
			model = new Training();
		} else {
			Result r = this.ao.doGet(this.getRequestId());
			model = (Training) r.getDefaultModel();
		}
	}
	
	protected String getForeignKey() {
		if (model != null && model.getForeignKey() != null
				&& !model.getForeignKey().isEmpty()) {
			return model.getForeignKey();
		}
		return this.cookie.getLoginId();
	}
	
	public String selectList() {
		Paging p = new Paging();
		p.setRows(20);
		Result result = this.ao.doList(this.requestId, new Paging());
		if (result.isSuccess()) {
			this.list = (List)result.getDefaultModel();
			return "selectList";
		}
		ResultCode resultCode = result.getResultCode();
		addActionError(resultCode.getMessage().getMessage());
		return "error";
	}
}
