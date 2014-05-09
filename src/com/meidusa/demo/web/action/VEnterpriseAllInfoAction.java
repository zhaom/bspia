package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.VEnterpriseAllInfo;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class VEnterpriseAllInfoAction extends BaseUploadAction<VEnterpriseAllInfo, Cookie> implements Preparable, ModelDriven<VEnterpriseAllInfo> {

	private VEnterpriseAllInfo model;
	
	@Override
	public VEnterpriseAllInfo getModel() {
		return model;
	}

	@Override
	public void prepare() throws Exception {
		if(this.getRequestId() == null || this.getRequestId().isEmpty()){
			model = new VEnterpriseAllInfo();
		}else {
			Result result = ao.doGet(this.getRequestId());
			model = (VEnterpriseAllInfo)result.getDefaultModel();
		}
		
		
	}

}
