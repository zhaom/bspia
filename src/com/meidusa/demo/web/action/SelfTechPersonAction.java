package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.SelfTechPerson;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class SelfTechPersonAction extends BaseUploadAction<SelfTechPerson, Cookie> implements Preparable, ModelDriven<SelfTechPerson>{

	private static final long serialVersionUID = 1L;
	
	private SelfTechPerson model;

	@Override
	public void prepare() throws Exception {
		if(this.getRequestId() == null || this.getRequestId().isEmpty()){
			model = new SelfTechPerson(); 
		}else {
			Result result = ao.doGet(this.getRequestId());
			model = (SelfTechPerson)result.getDefaultModel();
		}	
	}

	@Override
	public SelfTechPerson getModel() {
		return this.model;
	}

}
