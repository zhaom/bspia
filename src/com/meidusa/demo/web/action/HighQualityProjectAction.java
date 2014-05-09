package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.HighQualityProject;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class HighQualityProjectAction extends BaseUploadAction<HighQualityProject, Cookie> implements
Preparable, ModelDriven<HighQualityProject>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HighQualityProject model;

	@Override
	public void prepare() throws Exception {
		if(this.getRequestId() == null || this.getRequestId().isEmpty()){
			model = new HighQualityProject(); 
		}else {
			Result result = ao.doGet(this.getRequestId());
			model = (HighQualityProject)result.getDefaultModel();
		}			
	}

	@Override
	public HighQualityProject getModel() {
		return model;
	}

}
