package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.SelfCostEngineer;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class SelfCostEngineerAction extends BaseUploadAction<SelfCostEngineer, Cookie> implements Preparable, ModelDriven<SelfCostEngineer>{

	private static final long serialVersionUID = 1L;
	
	private SelfCostEngineer model;

	@Override
	public void prepare() throws Exception {
		if(this.getRequestId() == null || this.getRequestId().isEmpty()){
			model = new SelfCostEngineer(); 
		}else {
			Result result = ao.doGet(this.getRequestId());
			model = (SelfCostEngineer)result.getDefaultModel();
		}		
	}

	@Override
	public SelfCostEngineer getModel() {
		return this.model;
	}

}
