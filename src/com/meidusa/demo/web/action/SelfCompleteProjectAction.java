package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.SelfCompleteProject;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class SelfCompleteProjectAction extends BaseUploadAction<SelfCompleteProject, Cookie> implements Preparable, ModelDriven<SelfCompleteProject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private SelfCompleteProject model ;
	
	@Override
	public void prepare() throws Exception {
		if(this.getRequestId() == null || this.getRequestId().isEmpty()){
			model = new SelfCompleteProject(); 
		}else {
			Result result = ao.doGet(this.getRequestId());
			model = (SelfCompleteProject)result.getDefaultModel();
		}
		
	}

	@Override
	public SelfCompleteProject getModel() {
		return model;
	}

}
