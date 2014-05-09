package com.meidusa.demo.web.action;

import java.util.List;

import com.meidusa.demo.dal.model.Enumeration;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.web.page.Paging;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class EnumerationAction extends BaseUploadAction<Enumeration, Cookie>
implements Preparable, ModelDriven<Enumeration> {

	private static final long serialVersionUID = 1591338250320110852L;

	private Enumeration model;

	private String selectName;
	
	private String selectedKey;
	

	@Override
	public Enumeration getModel() {
		return model;
	}

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
	
	public void prepare() throws Exception {
		if(this.getRequestId()==null || this.getRequestId().isEmpty()){
			model = new Enumeration();
		}else{
			Result r = ao.doGet(this.getRequestId());
			model = (Enumeration)r.getDefaultModel();
		}
	}
	
	public String selectList() {
		Result result = this.ao.doList(this.requestId, new Paging());
		if (result.isSuccess()) {
			this.list = (List)result.getDefaultModel();
			return "selectList";
		}
		ResultCode resultCode = result.getResultCode();
		addActionError(resultCode.getMessage().getMessage());
		return "error";
	}
	
	public String selectListNULLEx() {
		Result result = this.ao.doList(this.requestId, new Paging());
		if (result.isSuccess()) {
			this.list = (List)result.getDefaultModel();
			return "selectListNULLEx";
		}
		ResultCode resultCode = result.getResultCode();
		addActionError(resultCode.getMessage().getMessage());
		return "error";
	}

}
